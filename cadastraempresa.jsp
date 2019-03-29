<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>...Cadastro de Empresas...</title>
<script type="text/javascript">
			function fMasc(objeto,mascara) {
				obj=objeto
				masc=mascara
				setTimeout("fMascEx()",1)
			}
			function fMascEx() {
				obj.value=masc(obj.value)
			}
			function mTel(tel) {
				tel=tel.replace(/\D/g,"")
				tel=tel.replace(/^(\d)/,"($1")
				tel=tel.replace(/(.{3})(\d)/,"$1)$2")
				if(tel.length == 9) {
					tel=tel.replace(/(.{1})$/,"-$1")
				} else if (tel.length == 10) {
					tel=tel.replace(/(.{2})$/,"-$1")
				} else if (tel.length == 11) {
					tel=tel.replace(/(.{3})$/,"-$1")
				} else if (tel.length == 12) {
					tel=tel.replace(/(.{4})$/,"-$1")
				} else if (tel.length > 12) {
					tel=tel.replace(/(.{4})$/,"-$1")
				}
				return tel;
			}
	
</script>
</head>
<body>
	<h3>
		<i>Cadastro de Empresas</i>
	</h3>
	<hr />
	<form action="cadastraEmpresa" method="post">
		<table>
			<tr>
				<td>Nome da Empresa:</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td>Contato:</td>
				<td><input type="text" name="contato" /></td>
			</tr>
			<tr>
				<td>Telefone:</td>
				<td><input type="text" name="telefone" placeholder="Ex.: 0000-0000" onkeydown="javascript: fMasc( this, mTel );"/></td>
			</tr>
			<tr>
				<td>Endereço:</td>
				<td><input type="text" name="endereco" /></td>
			</tr>
			<tr>
				<td>Bairro:</td>
				<td><input type="text" name="bairro" /></td>
			</tr>
			<tr>
				<td>E-mail:</td>
				<td><input type="text" name="email" /></td>
			</tr>
		</table>
		<br />
		<hr />
		<input type="submit" value="Gravar" />
		<input type="reset" value="Apagar" />
	</form>
</body>
</html>