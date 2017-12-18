<%@page import="entity.Funcao"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="mb_funcao" class="manager.ManagerFuncaoSubFuncao"></jsp:useBean>
<%
	// validando dados
	if (request.getParameter("exercicio").equals("")
			|| request.getParameter("codigoUnidadeGestora").equals("")) {
		out.print("<option value=''>SELECIONE A UNIDADE GESTORA</option>");
	} else {

		Integer exercicio = new Integer(request.getParameter("exercicio"));
		Integer codigoUnidadeGestora = new Integer(request.getParameter("codigoUnidadeGestora"));
		List<Funcao> lista = mb_funcao.findFuncaoByUnidadeGestora(exercicio, codigoUnidadeGestora);

		if (lista.isEmpty()) {
			out.print("<option value=''>FUNCAO NÃO ENCONTRADA</option>");

		} else {
			out.print("<option value=''>TODAS AS FUNCAO</option>");
			for (Funcao f : lista) {

				out.print("<option value='" + f.getCodigo() + "'>" + f.getDescricao() + "</option>");
			}
		}
	}
%>