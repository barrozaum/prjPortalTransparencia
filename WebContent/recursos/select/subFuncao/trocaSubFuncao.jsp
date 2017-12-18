<%@page import="entity.SubFuncao"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="mb_funcao" class="manager.ManagerFuncaoSubFuncao"></jsp:useBean>
<%
	// validando dados
	if (request.getParameter("exercicio").equals("") || request.getParameter("codigoUnidadeGestora").equals("")
			|| request.getParameter("codigoFuncao").equals("")) {
		out.print("<option value=''>SELECIONE A FUNÇÃO</option>");
	} else {

		Integer exercicio = new Integer(request.getParameter("exercicio"));
		Integer codigoUnidadeGestora = new Integer(request.getParameter("codigoUnidadeGestora"));
		Integer codigoFuncao = new Integer(request.getParameter("codigoFuncao"));

		List<SubFuncao> lista = mb_funcao.findSubFuncaoByUnidadeGestoraFuncao(exercicio, codigoUnidadeGestora, codigoFuncao);

		if (lista.isEmpty()) {
			out.print("<option value=''>SUBFUNCAO NÃO ENCONTRADA</option>");

		} else {
			out.print("<option value=''>TODAS AS SUBFUNCÕES</option>");
			for (SubFuncao sf : lista) {

				out.print("<option value='" + sf.getCodigo() + "'>" + sf.getDescricao() + "</option>");
			}
		}

	}
%>