<label for="exercico">ORG�O</label>
<select name="exercicio" id="exercicio" class="form-control">
	<option value="">ESCOLHA O ORG�O</option>
	<c:forEach items="${mbOrgao.findAllOrgao()}" var="linha">
		<option value="${linha.codigo}">${linha.descricao}</option>
	</c:forEach>
</select>
<br />
<jsp:useBean id="mbOrgao" class="manager.ManagerOrgao"></jsp:useBean>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>