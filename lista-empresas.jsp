<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>...:::Empresas Parceiras:::...</title>
</head>
<body>
	<h2>
		<i>Empresas Parceiras do Recrutador</i>
	</h2>
	<table cellspacing="2" width="70%">
		<thead align="left">
			<tr>
<!-- 				<th>ID:</th> -->
				<th>Nome:</th>
				<th>Contato:</th>
				<th>Telefone:</th>
				<th>Endereço:</th>
				<th>Bairro:</th>
				<th>E-Mail:</th>
			</tr>
		</thead>
		<jsp:useBean id="dao" class="br.com.pesquisamercado.dao.EmpresaDao" />
		<c:forEach var="empresa" items="${dao.lista}" varStatus="ln">
			<tr bgcolor="#${ln.count % 2 == 0 ? '9c9c9c' : 'ffffff'}">
<%-- 			<td>${empresa.idEmpresa}</td> --%>
				<td>${empresa.nome}</td>
				<td>${empresa.contato}</td>
				<td>${empresa.telefone}</td>
				<td>${empresa.endereco}</td>
				<td>${empresa.bairro}</td>
				<td>${empresa.email}</td> 
			</tr>
			</c:forEach>
	</table>
</body>
</html>