<%@page import="entity.UnidadeGestora"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="mb_unidade_gestora"
	class="manager.ManagerUnidadeGestora"></jsp:useBean>
<%
	Integer exercicio = new Integer(request.getParameter("exercicio"));
	List<UnidadeGestora> lista = mb_unidade_gestora.getListaUnidadeGestora(exercicio);
	if (lista.isEmpty()) {
		out.print("<option value=''>UNIDADE GESTORA NÃO ENCONTRADA</option>");

	} else {
		out.print("<option value=''>ESCOLHA A UNIDADE GESTORA</option>");
		for (UnidadeGestora un : lista) {

			out.print("<option value='" + un.getCodUnidadeGestora() + "'>" + un.getDescricaoUnidade()
					+ "</option>");
		}
	}
%>