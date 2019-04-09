<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>...Cadastro de Pesquisador</title>
<script type="text/javascript">
			function fMasc(objeto,mascara) {
				obj=objeto
				masc=mascara
				setTimeout("fMascEx()",1)
			}
			function fMascEx() {
				obj.value=masc(obj.value)
			}
			function mCPF(cpf){
				cpf=cpf.replace(/\D/g,"")
				cpf=cpf.replace(/(\d{3})(\d)/,"$1.$2")
				cpf=cpf.replace(/(\d{3})(\d)/,"$1.$2")
				cpf=cpf.replace(/(\d{3})(\d{1,2})$/,"$1-$2")
				return cpf
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
		<i>...Cadastro do Pesquisador...</i>
	</h3>
	<hr />
	<form action="cadastraPesquisador" method="post">
		<table>
			<tr>
				<td><i>Nome:</i></td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td><i>Data de Nascimento:</i></td>
				<td><input type="date" name="dataNascimento" id="data"  /></td>
			</tr>
			<tr>
				<td><i>Idade:</i></td>
				<td><input type="text" name="idade" id="idade" disabled size="1"/></td>
			</tr>
			<tr>
				<td><i>Endereço:</i></td>
				<td><input type="text" name="endereco"/></td>
			</tr>
			<tr>
				<td><i>Telefone:</i></td>
				<td><input type="text" name="telefone"  placeholder="Ex.:(00)0000-0000" onkeydown="javascript: fMasc(this, mTel);"/></td>
			</tr>
			<tr>
				<td><i>Bairro:</i></td>
				<td><input type="text" name="bairro" /></td>
			</tr>
			<tr>
				<td><i>Zona:</i></td>
				<td><select name="zona">
						<option value="sul">Sul</option>
						<option value="norte">Norte</option>
						<option value="leste">Leste</option>
						<option value="oeste">Oeste</option>
				</select></td>
			</tr>
			<tr>
				<td><i>Estado Civil:</i></td>
				<td><select name="estadoCivil">
						<option value="solteiro">Solteiro</option>
						<option value="casado">Casado</option>
						<option value="viuvo">Viúvo</option>
						<option value="divorciado">Divorciado</option>
				</select></td>
			</tr>
			<tr>
				<td><i>RG:</i></td>
				<td><input type="text" name="rg" /></td>
			</tr>
			<tr>
				<td><i>CPF:</i></td>
				<td><i><input type="text" name="cpf" placeholder="Ex.: 000.000.000-00" onkeydown="javascript: fMasc( this, mCPF );"/></td>
			</tr>
			<tr>
				<td><i>E-mail:</i></td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td><i>Senha:</i></td>
				<td><input type="password" name="senha" /></td>
			</tr>
		</table>
		<br />
		<hr />
		<input type="submit" value="Gravar" /><input type="reset" value="Limpar Dados"/>
	</form>
	<script  src="js/calculaIdade.js"></script>
</body>
</html>