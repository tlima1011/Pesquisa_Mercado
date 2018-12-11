package br.com.pesquisamercado.modelo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Convidado {

	private long idConvidado;
	private String nome;
	private String rg;
	private String estado;
	private Calendar dataNascimento;
	private int idade;
	private String cpf;
	private String endereco;
	private String bairro;
	private String cidade;
	private String telefone;
	private String celular;
	private String email;
	private String nacionalidade;
	private String tempoCidade;
	private String estadoCivil;
	private char temFilhos;
	private int qtdeFilhos;
	private int idadeFilhos1;
	private int idadeFilhos2;
	private int idadeFilhos3;
	private int idadeFilhos4;
	private char trabalhaFora;
	private String profissao;
	private Calendar dataHoraInclusao;
	private char estuda;
	private String curso;
	private String faculdade;
	private int contBanheiro;
	private int[] banheiros = { 0, 3, 7, 10, 14 };
	private int pontosBanheiro;
	private int contEmpregadas;
	private int[] empregadas = { 0, 3, 7, 10, 13 };
	private int pontosEmpregadas;
	private int contAutomoveis;
	private int[] automoveis = { 0, 3, 5, 8, 11 };
	private int pontosAutomoveis;
	private int contMicrocomputador;
	private int[] microcomputador = { 0, 3, 6, 8, 11 };
	private int pontosMicrocomputador;
	private int contLavaLoucas;
	private int[] lavaLoucas = { 0, 3, 6, 6, 6 };
	private int pontosLavaLoucas;
	private int contGeladeira;
	private int[] geladeira = { 0, 2, 3, 5, 5 };
	private int pontosGeladeira;
	private int contFreezer;
	private int[] freezer = { 0, 2, 4, 6, 6 };
	private int pontosFreezer;
	private int contLavaRoupas;
	private int[] lavaRoupas = { 0, 2, 4, 6, 6 };
	private int pontosLavaRoupas;
	private int contDvd;
	private int[] dvd = { 0, 1, 3, 4, 6 };
	private int pontosDvd;
	private int contMicroondas;
	private int[] microondas = { 0, 2, 4, 4, 4 };
	private int pontosMicroondas;
	private int contMotocicleta;
	private int[] motocicleta = { 0, 1, 3, 3, 3 };
	private int pontosMotocicleta;
	private int contSecadoraRoupas;
	private int[] secadoraRoupas = { 0, 2, 2, 2, 2 };
	private int pontosSecadoraRoupas;
	private String anoModeloCarro;
	private char aguaEncanada;
	private int pontoAgua;
	private char ruaPavimentada;
	private int pontoRua;
	private int entrevistado;
	private String profissaoChefe;
	private String nomeEmpresa;
	private int pontos;
	private String nivel = "";

	Scanner scanner = new Scanner(System.in);

	public Convidado(String nome, String rg, String estado, Calendar dataNascimento, int idade, String cpf, String endereco,
			String bairro, String cidade, String telefone, String celular, String email, String nacionalidade,
			String tempoCidade, int idade, String estadoCivil, char temFilhos, int qtdeFilhos, int idadeFilhos1, int idadeFilhos2, int idadeFilhos3, int idadeFilhos4, char trabalhaFora, String profissao,
			Calendar dataHoraInclusao, char estuda, String curso, String faculdade, int contBanheiro, int[] banheiros,
			int pontosBanheiro, int contEmpregadas, int[] empregadas, int pontosEmpregadas, int contAutomoveis,
			int[] automoveis, int pontosAutomoveis, int contMicrocomputador, int[] microcomputador,
			int pontosMicrocomputador, int contLavaLoucas, int[] lavaLoucas, int pontosLavaLoucas, int contGeladeira,
			int[] geladeira, int pontosGeladeira, int contFreezer, int[] freezer, int pontosFreezer, int contLavaRoupas,
			int[] lavaRoupas, int pontosLavaRoupas, int contDvd, int[] dvd, int pontosDvd, int contMicroondas,
			int[] microondas, int pontosMicroondas, int contMotocicleta, int[] motocicleta, int pontosMotocicleta,
			int contSecadoraRoupas, int[] secadoraRoupas, int pontosSecadoraRoupas, String anoModeloCarro,
			char aguaEncanada, int pontoAgua, char ruaPavimentada, int pontoRua, int entrevistado,
			String profissaoChefe, String nomeEmpresa, int pontos, String nivel) {

		this.nome = nome;
		this.rg = rg;
		this.estado = estado;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.tempoCidade = tempoCidade;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		this.temFilhos = temFilhos;
		this.qtdeFilhos = qtdeFilhos;
		this.idadeFilhos1 = idadeFilhos1;
		this.idadeFilhos2 = idadeFilhos2;
		this.idadeFilhos3 = idadeFilhos3;
		this.idadeFilhos4 = idadeFilhos4;
		this.trabalhaFora = trabalhaFora;
		this.profissao = profissao;
		this.dataHoraInclusao = dataHoraInclusao;
		this.estuda = estuda;
		this.curso = curso;
		this.faculdade = faculdade;
		this.contBanheiro = contBanheiro;
		this.banheiros = banheiros;
		this.pontosBanheiro = pontosBanheiro;
		this.contEmpregadas = contEmpregadas;
		this.empregadas = empregadas;
		this.pontosEmpregadas = pontosEmpregadas;
		this.contAutomoveis = contAutomoveis;
		this.automoveis = automoveis;
		this.pontosAutomoveis = pontosAutomoveis;
		this.contMicrocomputador = contMicrocomputador;
		this.microcomputador = microcomputador;
		this.pontosMicrocomputador = pontosMicrocomputador;
		this.contLavaLoucas = contLavaLoucas;
		this.lavaLoucas = lavaLoucas;
		this.pontosLavaLoucas = pontosLavaLoucas;
		this.contGeladeira = contGeladeira;
		this.geladeira = geladeira;
		this.pontosGeladeira = pontosGeladeira;
		this.contFreezer = contFreezer;
		this.freezer = freezer;
		this.pontosFreezer = pontosFreezer;
		this.contLavaRoupas = contLavaRoupas;
		this.lavaRoupas = lavaRoupas;
		this.pontosLavaRoupas = pontosLavaRoupas;
		this.contDvd = contDvd;
		this.dvd = dvd;
		this.pontosDvd = pontosDvd;
		this.contMicroondas = contMicroondas;
		this.microondas = microondas;
		this.pontosMicroondas = pontosMicroondas;
		this.contMotocicleta = contMotocicleta;
		this.motocicleta = motocicleta;
		this.pontosMotocicleta = pontosMotocicleta;
		this.contSecadoraRoupas = contSecadoraRoupas;
		this.secadoraRoupas = secadoraRoupas;
		this.pontosSecadoraRoupas = pontosSecadoraRoupas;
		this.anoModeloCarro = anoModeloCarro;
		this.aguaEncanada = aguaEncanada;
		this.pontoAgua = pontoAgua;
		this.ruaPavimentada = ruaPavimentada;
		this.pontoRua = pontoRua;
		this.entrevistado = entrevistado;
		this.profissaoChefe = profissaoChefe;
		this.nomeEmpresa = nomeEmpresa;
		this.pontos = pontos;
		this.nivel = nivel;
	}
	
	public Convidado() {

	}

	public Long getIdConvidado() {
		return idConvidado;
	}

	public void setIdConvidado(Long idConvidado) {
		this.idConvidado = idConvidado;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getTempoCidade() {
		return tempoCidade;
	}

	public void setTempoCidade(String tempoCidade) {
		this.tempoCidade = tempoCidade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public char getTemFilhos() {
		return temFilhos;
	}

	public void setTemFilhos(char temFilhos) {
		this.temFilhos = temFilhos;
	}

	public int getQtdeFilhos() {
		return qtdeFilhos;
	}

	public void setQtdeFilhos(int qtdeFilhos) {
		this.qtdeFilhos = qtdeFilhos;
	}

	public int getIdadeFilhos1() {
		return idadeFilhos1;
	}

	public void setIdadeFilhos1(int idadeFilhos1) {
		this.idadeFilhos1 = idadeFilhos1;
	}

	public int getIdadeFilhos2() {
		return idadeFilhos2;
	}

	public void setIdadeFilhos2(int idadeFilhos2) {
		this.idadeFilhos2 = idadeFilhos2;
	}

	public int getIdadeFilhos3() {
		return idadeFilhos3;
	}

	public void setIdadeFilhos3(int idadeFilhos3) {
		this.idadeFilhos3 = idadeFilhos3;
	}

	public int getIdadeFilhos4() {
		return idadeFilhos4;
	}

	public void setIdadeFilhos4(int idadeFilhos4) {
		this.idadeFilhos4 = idadeFilhos4;
	}

	public char getTrabalhaFora() {
		return trabalhaFora;
	}

	public void setTrabalhaFora(char trabalhaFora) {
		this.trabalhaFora = trabalhaFora;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Calendar getDataHoraInclusao() {
		return dataHoraInclusao;
	}

	public void setDataHoraInclusao(Calendar dataHoraInclusao) {
		this.dataHoraInclusao = dataHoraInclusao;
	}

	public char getEstuda() {
		return estuda;
	}

	public void setEstuda(char estuda) {
		this.estuda = estuda;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public int getContBanheiro() {
		return contBanheiro;
	}

	public void setContBanheiro(int contBanheiro) {
		this.contBanheiro = contBanheiro;
	}

	public int[] getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(int[] banheiros) {
		this.banheiros = banheiros;
	}

	public int getPontosBanheiro() {
		return pontosBanheiro;
	}

	public void setPontosBanheiro(int pontosBanheiro) {
		this.pontosBanheiro = pontosBanheiro;
	}

	public int getContEmpregadas() {
		return contEmpregadas;
	}

	public void setContEmpregadas(int contEmpregadas) {
		this.contEmpregadas = contEmpregadas;
	}

	public int[] getEmpregadas() {
		return empregadas;
	}

	public void setEmpregadas(int[] empregadas) {
		this.empregadas = empregadas;
	}

	public int getPontosEmpregadas() {
		return pontosEmpregadas;
	}

	public void setPontosEmpregadas(int pontosEmpregadas) {
		this.pontosEmpregadas = pontosEmpregadas;
	}

	public int getContAutomoveis() {
		return contAutomoveis;
	}

	public void setContAutomoveis(int contAutomoveis) {
		this.contAutomoveis = contAutomoveis;
	}

	public int[] getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(int[] automoveis) {
		this.automoveis = automoveis;
	}

	public int getPontosAutomoveis() {
		return pontosAutomoveis;
	}

	public void setPontosAutomoveis(int pontosAutomoveis) {
		this.pontosAutomoveis = pontosAutomoveis;
	}

	public int getContMicrocomputador() {
		return contMicrocomputador;
	}

	public void setContMicrocomputador(int contMicrocomputador) {
		this.contMicrocomputador = contMicrocomputador;
	}

	public int[] getMicrocomputador() {
		return microcomputador;
	}

	public void setMicrocomputador(int[] microcomputador) {
		this.microcomputador = microcomputador;
	}

	public int getPontosMicrocomputador() {
		return pontosMicrocomputador;
	}

	public void setPontosMicrocomputador(int pontosMicrocomputador) {
		this.pontosMicrocomputador = pontosMicrocomputador;
	}

	public int getContLavaLoucas() {
		return contLavaLoucas;
	}

	public void setContLavaLoucas(int contLavaLoucas) {
		this.contLavaLoucas = contLavaLoucas;
	}

	public int[] getLavaLoucas() {
		return lavaLoucas;
	}

	public void setLavaLoucas(int[] lavaLoucas) {
		this.lavaLoucas = lavaLoucas;
	}

	public int getPontosLavaLoucas() {
		return pontosLavaLoucas;
	}

	public void setPontosLavaLoucas(int pontosLavaLoucas) {
		this.pontosLavaLoucas = pontosLavaLoucas;
	}

	public int getContGeladeira() {
		return contGeladeira;
	}

	public void setContGeladeira(int contGeladeira) {
		this.contGeladeira = contGeladeira;
	}

	public int[] getGeladeira() {
		return geladeira;
	}

	public void setGeladeira(int[] geladeira) {
		this.geladeira = geladeira;
	}

	public int getPontosGeladeira() {
		return pontosGeladeira;
	}

	public void setPontosGeladeira(int pontosGeladeira) {
		this.pontosGeladeira = pontosGeladeira;
	}

	public int getContFreezer() {
		return contFreezer;
	}

	public void setContFreezer(int contFreezer) {
		this.contFreezer = contFreezer;
	}

	public int[] getFreezer() {
		return freezer;
	}

	public void setFreezer(int[] freezer) {
		this.freezer = freezer;
	}

	public int getPontosFreezer() {
		return pontosFreezer;
	}

	public void setPontosFreezer(int pontosFreezer) {
		this.pontosFreezer = pontosFreezer;
	}

	public int getContLavaRoupas() {
		return contLavaRoupas;
	}

	public void setContLavaRoupas(int contLavaRoupas) {
		this.contLavaRoupas = contLavaRoupas;
	}

	public int[] getLavaRoupas() {
		return lavaRoupas;
	}

	public void setLavaRoupas(int[] lavaRoupas) {
		this.lavaRoupas = lavaRoupas;
	}

	public int getPontosLavaRoupas() {
		return pontosLavaRoupas;
	}

	public void setPontosLavaRoupas(int pontosLavaRoupas) {
		this.pontosLavaRoupas = pontosLavaRoupas;
	}

	public int getContDvd() {
		return contDvd;
	}

	public void setContDvd(int contDvd) {
		this.contDvd = contDvd;
	}

	public int[] getDvd() {
		return dvd;
	}

	public void setDvd(int[] dvd) {
		this.dvd = dvd;
	}

	public int getPontosDvd() {
		return pontosDvd;
	}

	public void setPontosDvd(int pontosDvd) {
		this.pontosDvd = pontosDvd;
	}

	public int getContMicroondas() {
		return contMicroondas;
	}

	public void setContMicroondas(int contMicroondas) {
		this.contMicroondas = contMicroondas;
	}

	public int[] getMicroondas() {
		return microondas;
	}

	public void setMicroondas(int[] microondas) {
		this.microondas = microondas;
	}

	public int getPontosMicroondas() {
		return pontosMicroondas;
	}

	public void setPontosMicroondas(int pontosMicroondas) {
		this.pontosMicroondas = pontosMicroondas;
	}

	public int getContMotocicleta() {
		return contMotocicleta;
	}

	public void setContMotocicleta(int contMotocicleta) {
		this.contMotocicleta = contMotocicleta;
	}

	public int[] getMotocicleta() {
		return motocicleta;
	}

	public void setMotocicleta(int[] motocicleta) {
		this.motocicleta = motocicleta;
	}

	public int getPontosMotocicleta() {
		return pontosMotocicleta;
	}

	public void setPontosMotocicleta(int pontosMotocicleta) {
		this.pontosMotocicleta = pontosMotocicleta;
	}

	public int getContSecadoraRoupas() {
		return contSecadoraRoupas;
	}

	public void setContSecadoraRoupas(int contSecadoraRoupas) {
		this.contSecadoraRoupas = contSecadoraRoupas;
	}

	public int[] getSecadoraRoupas() {
		return secadoraRoupas;
	}

	public void setSecadoraRoupas(int[] secadoraRoupas) {
		this.secadoraRoupas = secadoraRoupas;
	}

	public int getPontosSecadoraRoupas() {
		return pontosSecadoraRoupas;
	}

	public void setPontosSecadoraRoupas(int pontosSecadoraRoupas) {
		this.pontosSecadoraRoupas = pontosSecadoraRoupas;
	}

	public String getAnoModeloCarro() {
		return anoModeloCarro;
	}

	public void setAnoModeloCarro(String anoModeloCarro) {
		this.anoModeloCarro = anoModeloCarro;
	}

	public char getAguaEncanada() {
		return aguaEncanada;
	}

	public void setAguaEncanada(char aguaEncanada) {
		this.aguaEncanada = aguaEncanada;
	}

	public int getPontoAgua() {
		return pontoAgua;
	}

	public void setPontoAgua(int pontoAgua) {
		this.pontoAgua = pontoAgua;
	}

	public char getRuaPavimentada() {
		return ruaPavimentada;
	}

	public void setRuaPavimentada(char ruaPavimentada) {
		this.ruaPavimentada = ruaPavimentada;
	}

	public int getPontoRua() {
		return pontoRua;
	}

	public void setPontoRua(int pontoRua) {
		this.pontoRua = pontoRua;
	}

	public int getEntrevistado() {
		return entrevistado;
	}

	public void setEntrevistado(int instrucao) {
		this.entrevistado = instrucao;
	}

	public String getProfissaoChefe() {
		return profissaoChefe;
	}

	public void setProfissaoChefe(String profissaoChefe) {
		this.profissaoChefe = profissaoChefe;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int pontosBanheiro(int contBanheiros, int[] banheiros) {
		return banheiros[contBanheiros];

	}

	public int pontosEmpregadas(int contEmpregadas, int[] empregadas) {
		return empregadas[contEmpregadas];

	}

	public int pontosAutomoveis(int contAutomoveis, int[] automoveis) {
		return automoveis[contAutomoveis];

	}

	public int pontosMicrocomputador(int contMicrocomputador, int[] microcomputador) {
		return automoveis[contAutomoveis];

	}

	public int pontosLavaLoucas(int contLavaLoucas, int[] lavaLoucas) {
		return lavaLoucas[contLavaLoucas];

	}

	public int pontosGeladeira(int contGeladeira, int[] geladeira) {
		return geladeira[contGeladeira];

	}

	public int pontosFreezer(int contFreezer, int[] freezer) {
		return freezer[contFreezer];

	}

	public int pontosLavaRoupas(int contFreezer, int[] freezer) {
		return lavaRoupas[contLavaRoupas];

	}

	public int dvd(int contDvd, int[] dvd) {
		return dvd[contDvd];

	}

	public int pontosMicroondas(int contMicroondas, int[] microondas) {
		return microondas[contMicroondas];

	}

	public int pontosMotocicleta(int contMotocicleta, int[] motocicleta) {
		return motocicleta[contMotocicleta];

	}

	public int pontosSecadoraRoupas(int contSecadoraRoupas, int[] secadoraRoupas) {
		return secadoraRoupas[contSecadoraRoupas];

	}
	
	public int pontoAgua(char aguaEncanada) {
		if (aguaEncanada == 'S' || aguaEncanada == 's') {
			return 4;
		} else {
			return 0;
		}
	}

	public int pontoRua(char ruaPavimentada) {
		if (ruaPavimentada == 'S' || ruaPavimentada == 's') {
			return 2;
		} else {
			return 0;
		}
	}

	public String escolaridade(int entrevistado) {
		switch (entrevistado) {
		case 1:
			entrevistado = 0;
			return "Analfabeto ou Fundamental incompleto I";
		case 2:
			entrevistado = 1;
			return "Fundamental Completo 1 / Fundamental 2 incompleto";
		case 3:
			entrevistado = 2;
			return "Fundamental 2 Completo ou Médio Completo";
		case 4:
			entrevistado = 4;
			return "Médio Completo / Superior Incompleto";
		case 5:
			entrevistado = 7;
			return "Superior Completo - digite 7";
		default:
			return "Inválido";
		}
	}

	public int pontos(int pontosBanheiro, int pontosEmpregadas, int pontosAutomoveis, int pontosMicrocomputador,
			int pontosLavaLoucas, int pontosGeladeira, int pontosFreezer, int pontosLavaRoupas, int pontosDvd,
			int pontosMicroondas, int pontosMotocicleta, int pontosSecadoraRoupas, int entrevistado, int pontoAgua,
			int pontoRua) {
		return pontosBanheiro + pontosEmpregadas + pontosAutomoveis + pontosMicrocomputador + pontosLavaLoucas
				+ pontosGeladeira + pontosFreezer + pontosLavaRoupas + pontosDvd + pontosMicroondas + pontosMotocicleta
				+ pontosSecadoraRoupas + entrevistado + pontoAgua + pontoRua;
	}

	public String nivel (int pontos) {
		if (pontos >= 0 && pontos < 16) {
			return "D/E";
		} else if (pontos >= 17 && pontos <= 22) {
			return "C2";
		} else if (pontos >= 23 && pontos <= 28) {
			return "C1";
		} else if (pontos >= 29 && pontos <= 37) {
			return "B2";
		} else if (pontos >= 38 && pontos <= 44) {
			return "B1";
		} else if (pontos >= 45 && pontos <= 100) {
			return "A";
		} else {
			System.out.println("Nível indefinido fora de escopo");
		}
		return nivel;
	}
}
