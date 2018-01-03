<%@page import="java.util.*"%>
<%@page import="dto.*"%>
<jsp:useBean id="mb_orcamento" class="manager.ManagerOrcamento"></jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	if (request.getParameter("exercicio").equals("")
			|| request.getParameter("codigoUnidadeGestora").equals("")) {
		out.print("<div class=\"alert alert-danger\"> POR FAVOR VERIFIQUE O EXERCICIO/UNIDADE GESTORA</div>");
	} else {
		Integer exercicio = new Integer(request.getParameter("exercicio"));
		Integer codigoUnidadeGestora = new Integer(request.getParameter("codigoUnidadeGestora"));
		Integer nivelConta = new Integer(request.getParameter("nivelConta"));

		mb_orcamento.pesquisaOrcamentoReceita(exercicio, codigoUnidadeGestora);
		Integer exercicioEscolhida = 0;
		String unidaGestoraEscolhida = "Nenhum Resultado Localizado";
		if (mb_orcamento.getOrcamentoReceita() != null) {
			exercicioEscolhida = mb_orcamento.getOrcamentoReceita().getExercicioOrcamento();
			unidaGestoraEscolhida = mb_orcamento.getOrcamentoReceita().getUnidadeGestora()
					.getDescricaoUnidade();
		}
%>


<div class="col-sm-12 col-md-12 col-lg-12 ">
	<div class="panel panel-info">
		<div class="panel-heading">
			<div class="panel-title">Orçamento Receita</div>
		</div>
		<div class="panel-body text-left">
			<div style="overflow: auto; max-width: 100%;">
				<table id="example" class="table table-hover table-striped">
					<thead>
						<tr>
							<th colspan="1">EXERCICIO</th>
							<th colspan="2">
								<%
									out.print(exercicioEscolhida);
								%>
							</th>
						</tr>
						<tr>
							<th colspan="1">Unidade Gestora</th>
							<th colspan="2">
								<input type="hidden" id="id_descricao_unidade_gestora" value="<%
									out.print(unidaGestoraEscolhida);
								%>">
								<%
									out.print(unidaGestoraEscolhida);
								%>
							</th>
						</tr>
						<tr>
							<th>CODIGO</th>
							<th>DESCRIÇÃO CATEGORIA</th>
							<th>VALOR ORÇADO</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="Total" value="${0}" />
						<c:set var="NIVEL_CONTA_USUARIO" value="<%=nivelConta%>" />
						<c:set var="NIVEL_BASE_01" value="-1" />
						<c:set var="NIVEL_BASE_02" value="-1" />
						<c:set var="NIVEL_BASE_03" value="-1" />
						<c:set var="NIVEL_BASE_04" value="-1" />
						<c:set var="NIVEL_BASE_05" value="-1" />
						<c:set var="NIVEL_BASE_06" value="-1" />
						<c:set var="NIVEL_BASE_07" value="-1" />


						<c:forEach items="${mb_orcamento.getListaOrcamentoReceita()}"
							var="linha">
							<c:set var="NIVEL_01" value="${linha.listaNivel[0].codigo}" />
							<c:set var="NIVEL_02" value="${linha.listaNivel[1].codigo}" />
							<c:set var="NIVEL_03" value="${linha.listaNivel[2].codigo}" />
							<c:set var="NIVEL_04" value="${linha.listaNivel[3].codigo}" />
							<c:set var="NIVEL_05" value="${linha.listaNivel[4].codigo}" />
							<c:set var="NIVEL_06" value="${linha.listaNivel[5].codigo}" />
							<c:set var="NIVEL_07" value="${linha.listaNivel[6].codigo}" />

							<c:if test="${ NIVEL_CONTA_USUARIO >= 1 }">
								<c:if test="${ NIVEL_BASE_01 != NIVEL_01 }">
									<c:if
										test="${linha.listaNivel[0].codigo.substring(0,1) != '9' }">
										<c:set var="Total"
											value="${mb_orcamento.DeducaoFiscal(linha.listaNivel[0].codigo, linha.listaNivel[0].valorOrcado, Total)}" />

										<tr class="alert alert-success">
											<td>${linha.listaNivel[0].codigo}</td>
											<td>${linha.listaNivel[0].descricao}</td>
											<td>${linha.listaNivel[0].valorOrcado}</td>
											<c:set var="NIVEL_BASE_01"
												value="${linha.listaNivel[0].codigo}" />
										</tr>
									</c:if>
									<c:if
										test="${linha.listaNivel[0].codigo.substring(0,1) == '9' }">
										<tr class="alert alert-danger">
											<c:set var="Total"
												value="${mb_orcamento.DeducaoFiscal(linha.listaNivel[0].codigo, linha.listaNivel[0].valorOrcado, Total)}" />

											<td>${linha.listaNivel[0].codigo}</td>
											<td>${linha.listaNivel[0].descricao}</td>
											<td>- ${linha.listaNivel[0].valorOrcado}</td>
											<c:set var="NIVEL_BASE_01"
												value="${linha.listaNivel[0].codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
							<c:if test="${ NIVEL_CONTA_USUARIO >= 2 }">
								<c:if test="${ NIVEL_BASE_02 != NIVEL_02 }">
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) != '9' }">
										<tr class="alert alert-success">
											<td>${linha.listaNivel[1].codigo}</td>
											<td>&nbsp;&nbsp;${linha.listaNivel[1].descricao}</td>
											<td>${linha.listaNivel[1].valorOrcado}</td>
											<c:set var="NIVEL_BASE_02"
												value="${linha.listaNivel[1].codigo}" />
										</tr>
									</c:if>
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) == '9' }">
										<tr class="alert alert-danger">
											<td>${linha.listaNivel[1].codigo}</td>
											<td>&nbsp;&nbsp;${linha.listaNivel[1].descricao}</td>
											<td>- ${linha.listaNivel[1].valorOrcado}</td>
											<c:set var="NIVEL_BASE_02"
												value="${linha.listaNivel[1].codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
							<c:if test="${ NIVEL_CONTA_USUARIO >= 3 }">
								<c:if test="${ NIVEL_BASE_03 != NIVEL_03 }">
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) != '9' }">
										<tr class="alert alert-success">
											<td>${linha.listaNivel[2].codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;${linha.listaNivel[2].descricao}</td>
											<td>${linha.listaNivel[2].valorOrcado}</td>
											<c:set var="NIVEL_BASE_03"
												value="${linha.listaNivel[2].codigo}" />
										</tr>
									</c:if>
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) == '9' }">
										<tr class="alert alert-danger">
											<td>${linha.listaNivel[2].codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;${linha.listaNivel[2].descricao}</td>
											<td>- ${linha.listaNivel[2].valorOrcado}</td>
											<c:set var="NIVEL_BASE_03"
												value="${linha.listaNivel[2].codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
							<c:if test="${ NIVEL_CONTA_USUARIO >= 4 }">
								<c:if test="${ NIVEL_BASE_04 != NIVEL_04 }">
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) != '9' }">
										<tr class="alert alert-success">
											<td>${linha.listaNivel[3].codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${linha.listaNivel[3].descricao}</td>
											<td>${linha.listaNivel[3].valorOrcado}</td>
											<c:set var="NIVEL_BASE_04"
												value="${linha.listaNivel[3].codigo}" />
										</tr>
									</c:if>
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) == '9' }">
										<tr class="alert alert-danger">
											<td>${linha.listaNivel[3].codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${linha.listaNivel[3].descricao}</td>
											<td>-${linha.listaNivel[3].valorOrcado}</td>
											<c:set var="NIVEL_BASE_04"
												value="${linha.listaNivel[3].codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
							<c:if test="${ NIVEL_CONTA_USUARIO >= 5 }">
								<c:if test="${ NIVEL_BASE_05 != NIVEL_05 }">
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) != '9' }">
										<tr class="alert alert-success">
											<td>${linha.listaNivel[4].codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${linha.listaNivel[4].descricao}</td>
											<td>${linha.listaNivel[4].valorOrcado}</td>
											<c:set var="NIVEL_BASE_05"
												value="${linha.listaNivel[4].codigo}" />
										</tr>
									</c:if>
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) == '9' }">
										<tr class="alert alert-danger">
											<td>${linha.listaNivel[4].codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${linha.listaNivel[4].descricao}</td>
											<td>-${linha.listaNivel[4].valorOrcado}</td>
											<c:set var="NIVEL_BASE_05"
												value="${linha.listaNivel[4].codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
							<c:if test="${ NIVEL_CONTA_USUARIO >= 6 }">
								<c:if test="${ NIVEL_BASE_06 != NIVEL_06 }">
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) != '9' }">
										<tr class="alert alert-success">
											<td>${linha.listaNivel[5].codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${linha.listaNivel[5].descricao}</td>
											<td>${linha.listaNivel[5].valorOrcado}</td>
											<c:set var="NIVEL_BASE_06"
												value="${linha.listaNivel[5].codigo}" />
										</tr>
									</c:if>
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) == '9' }">
										<tr class="alert alert-danger">
											<td>${linha.listaNivel[5].codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${linha.listaNivel[5].descricao}</td>
											<td>-${linha.listaNivel[5].valorOrcado}</td>
											<c:set var="NIVEL_BASE_06"
												value="${linha.listaNivel[5].codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
							<c:if test="${ NIVEL_CONTA_USUARIO >= 7 }">
								<c:if test="${ NIVEL_BASE_07 != NIVEL_07 }">
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) != '9' }">
										<tr class="alert alert-success">
											<td>${linha.listaNivel[6].codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${linha.listaNivel[6].descricao}</td>
											<td>${linha.listaNivel[6].valorOrcado}</td>
											<c:set var="NIVEL_BASE_07"
												value="${linha.listaNivel[6].codigo}" />
										</tr>
									</c:if>
									<c:if
										test="${linha.listaNivel[1].codigo.substring(0,1) == '9' }">
										<tr class="alert alert-danger">
											<td>${linha.listaNivel[6].codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${linha.listaNivel[6].descricao}</td>
											<td>-${linha.listaNivel[6].valorOrcado}</td>
											<c:set var="NIVEL_BASE_07"
												value="${linha.listaNivel[6].codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr>
							<th colspan="2">Total</th>
							<th colspan="1" class="text-right">${Total}</th>
						</tr>
					</tfoot>
				</table>
			</div>
		</div>
	</div>
</div>

<%
	}
%>