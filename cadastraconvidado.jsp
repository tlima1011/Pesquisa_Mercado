<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*, br.com.pesquisamercado.dao.*, br.com.pesquisamercado.modelo.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>...Cadastra Convidado...</title>
<script type="text/javascript">
	function fMasc(objeto, mascara) {
		obj = objeto
		masc = mascara
		setTimeout("fMascEx()", 1)
	}
	function fMascEx() {
		obj.value = masc(obj.value)
	}
	function mCPF(cpf) {
		cpf = cpf.replace(/\D/g, "")
		cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2")
		cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2")
		cpf = cpf.replace(/(\d{3})(\d{1,2})$/, "$1-$2")
		return cpf
	}
	function mTel(tel) {
		tel = tel.replace(/\D/g, "")
		tel = tel.replace(/^(\d)/, "($1")
		tel = tel.replace(/(.{3})(\d)/, "$1)$2")
		if (tel.length == 9) {
			tel = tel.replace(/(.{1})$/, "-$1")
		} else if (tel.length == 10) {
			tel = tel.replace(/(.{2})$/, "-$1")
		} else if (tel.length == 11) {
			tel = tel.replace(/(.{3})$/, "-$1")
		} else if (tel.length == 12) {
			tel = tel.replace(/(.{4})$/, "-$1")
		} else if (tel.length > 12) {
			tel = tel.replace(/(.{4})$/, "-$1")
		}
		return tel;
	}
</script>
</head>
<body>
	<h2>
		<i>...:::Cadastro do Convidado:::...</i>
	</h2>
	<table>
		<form action="cadastrarConvidado" method="post">
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" maxlength="40" /></td>
			</tr>
			<tr>
				<td>RG:</td>
				<td><input type="text" name="rg" maxlength="20" /></td>
			</tr>
			<td>Estado:</td>
			<td><select name="estado">
					<option value="SP">São Paulo</option>
					<option value="AC">Acre</option>
					<option value="AL">Alagoas</option>
					<option value="AP">Amapá</option>
					<option value="AM">Amazonas</option>
					<option value="BA">Bahia</option>
					<option value="CE">Ceará</option>
					<option value="DF">Distrito Federal</option>
					<option value="ES">Espírito Santo</option>
					<option value="GO">Goiás</option>
					<option value="MA">Maranhão</option>
					<option value="MT">Mato Grosso</option>
					<option value="MS">Mato Grosso do Sul</option>
					<option value="MG">Minas Gerais</option>
					<option value="PA">Pará</option>
					<option value="PB">Paraíba</option>
					<option value="PR">Paraná</option>
					<option value="PE">Pernambuco</option>
					<option value="PI">Piauí</option>
					<option value="RJ">Rio de Janeiro</option>
					<option value="RN">Rio Grande do Norte</option>
					<option value="RS">Rio Grande do Sul</option>
					<option value="RO">Rondônia</option>
					<option value="RR">Roraima</option>
					<option value="SC">Santa Catarina</option>
					<option value="SE">Sergipe</option>
					<option value="TO">Tocantins</option>
			</select></td>
			</tr>
			<tr>
				<td>Data de Nascimento:</td>
				<td><input type="date" name="dataNascimento" id="data"/></td>
			</tr>
			<tr>
				<td>Idade:</td>
				<%--<%
				Date nascimento= new Date(request.getParameter("dataNascimento"));
				int idader = new Idade().calcularIdade(nascimento);
				--%>			
				<td><input type="text" name="idade" maxlength="3" size="1" disabled id="idade"/></td>
			</tr>
			<tr>
				<td>CPF:</td>
				<td><input type="text" name="cpf" maxlength="20" placeholder="Ex.: 000.000.000-00" onkeydown="javascript: fMasc( this, mCPF );" /></td>
			</tr>
			<tr>
				<td>Endereço:</td>
				<td><input type="text" name="endereco" maxlength="40" /></td>
			</tr>
			<tr>
				<td>Bairro:</td>
				<td><input type="text" name="bairro" maxlength="30" /></td>
			</tr>
			<td>Cidade:</td>
			<td><input type="text" name="cidade" value="São Paulo"
				maxlength="40" /></td>
			</tr>
			<tr>
				<td>Telefone:</td>
				<td><input type="text" name="telefone" maxlenght="20"
					placeholder="Ex.:(00)0000-0000"
					onkeydown="javascript: fMasc( this, mTel );" /></td>
			</tr>
			<tr>
				<td>Celular:</td>
				<td><input type="text" name="celular" maxlenght="20"
					placeholder="Ex.: (00)00000-0000"
					onkeydown="javascript: fMasc( this, mTel );" /></td>
			</tr>
			<tr>
				<td>E-mail:</td>
				<td><input type="text" name="email" maxlength="40" /></td>
			</tr>
			<tr>
				<td>Em que país nasceu:</td>
				<td><input type="text" name="nacionalidade" value="Brasil"
					maxlength="30" /></td>
			</tr>
			<tr>
				<td>Tempo em que mora na Cidade:</td>
				<td><input type="text" name="tempoCidade" maxlength="20" /></td>
			</tr>
			<tr>
				<td>Estado Civil:</td>
				<td><select name="estadoCivil">
						<option value="solteiro">Solteiro</option>
						<option value="casado">Casado</option>
						<option value="divorciado">Divorciado</option>
						<option value="viuvo">Viuvo</option>
				</select></td>
			</tr>
			<tr>
				<td>Tem Filho (S/N):</td>
				<td><input type="radio" name="temFilho" value="s" onclick="if(document.getElementById('filhos').disabled==true
						{document.getElementById('filhos').disabled=false}">Sim 
						<input type="radio" name="temFilho" value="n" onclick="if(document.getElementById('filhos').disabled==false)
					{document.getElementById('filhos').disabled=true}">Não</td>
			</tr>
			<tr>
				<td id="filhos">Quantos Filhos:</td>
				<td><select name="qtdeFilhos" checked>
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
				</select></td>
			</tr>
			<tr>
				<td id="filhos">Idade dos Filhos:</td>
				<td><input type="text" name="idadeFilhos1" size="1"
					maxlength="3" /> <input type="text" name="idadeFilhos2" size="1"
					maxlength="3" /> <input type="text" name="idadeFilhos3" size="1 "
					maxlength="3" /> <input type="text" name="idadeFilhos4" size="1 "
					maxlength="3" /></td>
			</tr>
			<tr>
				<td id="trabalhaFora">Trabalha Fora (S/N):</td>
				<td><input type="radio" name="trabalhaFora" value="s" checked>Sim
					<input type="radio" name="trabalhaFora" value="n">Não</td>
			</tr>
			<tr>
			<tr>
				<td>Profissao</td>
				<td><input type="text" name="profissao" maxlength="40" /></td>
				</td>
			</tr>
			<tr>
				<td id="estuda">Estuda (S/N)?:</td>
				<td><input type="radio" name="estuda" value="s" checked>Sim
					<input type="radio" name="estuda" value="n">Não</td>
			</tr>
			<tr>
				<td>Curso:</td>
				<td><input type="text" name="curso" maxlength="40" /></td>
				</td>
			</tr>
			<tr>
				<td>Faculdade:</td>
				<td><input type="text" name="faculdade" maxlength="40" /></td>
				</td>
			</tr>
			<tr>
				<td><i><h2>...:::Itens:::...</h2></i></td>
				<td><i><h2>...Pontos...</h2></i></td>
				<hr />
			</tr>
			<tr>
			<td>Banheiro:</td>
			<td><input type="radio" name="contBanheiro" value="0" checked>0
				<input type="radio" name="contBanheiro" value="1">1 <input
				type="radio" name="contBanheiro" value="2">2 <input
				type="radio" name="contBanheiro" value="3">3 <input
				type="radio" name="contBanheiro" value="4">4 ou +
				<input type="text" size="1"/>
			</tr>
			<tr>
			<td>Empregadas mensalistas</td>
			<td><input type="radio" name="contEmpregadas" value="0" checked>0
				<input type="radio" name="contEmpregadas" value="1">1 <input
				type="radio" name="contEmpregadas" value="2">2 <input
				type="radio" name="contEmpregadas" value="3">3 <input
				type="radio" name="contEmpregadas" value="4">4 ou + <input
				type="text" size="1" /></td>
			</tr>
			<tr>
				<td>Automóveis de passeio</td>
				<td><input type="radio" name="contAutomoveis" value="0" checked>0
					<input type="radio" name="contAutomoveis" value="1">1 <input
					type="radio" name="contAutomoveis" value="2">2 <input
					type="radio" name="contAutomoveis" value="3">3 <input
					type="radio" name="contAutomoveis" value="4">4 ou + <input
					type="text" size="1" /></td>
			</tr>
			<tr>
				<td>Microcomputadores</td>
				<td><input type="radio" name="contMicrocomputador" value="0"
					checked>0 <input type="radio" name="contMicrocomputador"
					value="1">1 <input type="radio" name="contMicrocomputador"
					value="2">2 <input type="radio" name="contMicrocomputador"
					value="3">3 <input type="radio" name="contMicrocomputador"
					value="4">4 ou + <input type="text" size="1" /></td>
			</tr>
			<tr>
				<td>Lava Louças:</td>
				<td><input type="radio" name="contLavaLoucas" value="0" checked>0
					<input type="radio" name="contLavaLoucas" value="1">1 <input
					type="radio" name="contLavaLoucas" value="2">2 <input
					type="radio" name="contLavaLoucas" value="3">3 <input
					type="radio" name="contLavaLoucas" value="4">4 ou + <input
					type="text" size="1" /></td>
			</tr>
			<tr>
				<td>Geladeiras</td>
				<td><input type="radio" name="contGeladeira" value="0" checked>0
					<input type="radio" name="contGeladeira" value="1">1 <input
					type="radio" name="contGeladeira" value="2">2 <input
					type="radio" name="contGeladeira" value="3">3 <input
					type="radio" name="contGeladeira" value="4">4 ou + <input
					type="text" size="1" /></td>
			</tr>
			<tr>
				<td>Freezer</td>
				<td><input type="radio" name="contFreezer" value="0" checked>0
					<input type="radio" name="contFreezer" value="1">1 <input
					type="radio" name="contFreezer" value="2">2 <input
					type="radio" name="contFreezer" value="3">3 <input
					type="radio" name="contFreezer" value="4">4 ou + <input
					type="text" size="1" /></td>
			</tr>
			<tr>
				<td>Lava Roupa:</td>
				<td><input type="radio" name="contLavaRoupas" value="0" checked>0
					<input type="radio" name="contLavaRoupas" value="1">1 <input
					type="radio" name="contLavaRoupas" value="2">2 <input
					type="radio" name="contLavaRoupas" value="3">3 <input
					type="radio" name="contLavaRoupas" value="4">4 ou + <input
					type="text" size="1" /></td>
			</tr>
			<tr>
				<td>DVD</td>
				<td><input type="radio" name="contDvd" value="0" checked>0
					<input type="radio" name="contDvd" value="1">1 <input
					type="radio" name="contDvd" value="2">2 <input type="radio"
					name="contDvd" value="3">3 <input type="radio"
					name="contDvd" value="4">4 ou + <input type="text"
					size="1" /></td>
			</tr>
			<tr>
				<td>Microondas</td>
				<td><input type="radio" name="contMicroondas" value="0" checked>0
					<input type="radio" name="contMicroondas" value="1">1 <input
					type="radio" name="contMicroondas" value="2">2 <input
					type="radio" name="contMicroondas" value="3">3 <input
					type="radio" name="contMicroondas" value="4">4 ou + <input
					type="text" size="1" /></td>
			</tr>
			<tr>
				<td>Motocicleta</td>
				<td><input type="radio" name="contMotocicleta" value="0"
					checked>0 <input type="radio" name="contMotocicleta"
					value="1">1 <input type="radio" name="contMotocicleta"
					value="2">2 <input type="radio" name="contMotocicleta"
					value="3">3 <input type="radio" name="contMotocicleta"
					value="4">4 ou + <input type="text" size="1" /></td>
			</tr>
			<tr>
				<td>Secadora de roupas</td>
				<td><input type="radio" name="contSecadoraRoupas" value="0"
					checked>0 <input type="radio" name="contSecadoraRoupas"
					value="1">1 <input type="radio" name="contSecadoraRoupas"
					value="2">2 <input type="radio" name="contSecadoraRoupas"
					value="3">3 <input type="radio" name="contSecadoraRoupas"
					value="4">4 ou + <input type="text" size="1" /></td>
			</tr>
			<tr>
				<td>Automóveis</td>
				<td><input type="text" name="anoModeloCarro" maxlength="40" /></td>
			</tr>
			<tr>
				<td>Agua Encanada</td>
				<td><input type="radio" name="aguaEncanada" value="4" checked>Sim
					<input type="radio" name="aguaEncanada" value="2">Não <input
					type="text" size="3" /></td>
			</tr>
			<tr>
				<td>Rua pavimentada/Asfaltada</td>
				<td><input type="radio" name="ruaPavimentada" value="4" checked>Sim
					<input type="radio" name="ruaPavimentada" value="2">Não <input
					type="text" size="3" /></td>
			</tr>
			<tr>
				<td>Instrucao chefe ou Entrevistado</td>
				<td><select name="instrucao">
						<option value="0">Analfabeto / fundamental I incompleto</option>
						<option value="1">Fundamental I completo / Fundamental II
							incompleto</option>
						<option value="2">Fundamental II completo / Médio
							incompleto</option>
						<option value="4">Médio completo / Superior incompleto</option>
						<option value="7">Superior Completo</option>
				</select></td>
			</tr>
			<tr>
				<td>Profissão Chefe</td>
				<td><input type="text" name="profissaoChefe" maxlength="40" /></td>
			</tr>
			<tr>
				<td>Empresa</td>
				<td><input type="text" name="empresa" maxlength="30" /></td>
			</tr>
			<td>Total de Pontos </td>
			<td><input type="text" name="pontos" size="1" value=""/>
			</tr>
			<td>Criterio Brasil</td>
			<% 
				String criterio = request.getParameter("criterio");
			%>
			<td><input type="text" name="nivel" size="1"
				value=""/></td>
			</tr>
	</table>
	<br />
	<input type="submit" value="Gravar" />
	<input type="reset" value="Apagar" />
	<input type="submit" value="Enviar Email" />
	<hr />
	</form>
	<script  src="js/calculaIdade.js"></script>
</body>
</html>