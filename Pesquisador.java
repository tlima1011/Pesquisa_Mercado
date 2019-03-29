package br.com.pesquisamercado.modelo;

import java.util.Calendar;

public class Pesquisador {
	
	private int idPesquisador; 
	private String nome; 
	private Calendar dataNascimento; 
	private int idade; 
	private String endereco; 
	private String bairro; 
	private String telefone; 
	private String zona; 
	private String estadoCivil; 
	private String rg; 
	private String cpf; 
	private String email;
	private String senha;
		
	public Pesquisador(String nome, Calendar dataNascimento, int idade, String endereco, String bairro, String telefone,
			String zona, String estadoCivil, String rg, String cpf, String email, String senha) {
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.endereco = endereco;
		this.bairro = bairro;
		this.telefone = telefone;
		this.zona = zona;
		this.estadoCivil = estadoCivil;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}
	
	public Pesquisador() {
		
	}

	public int getIdPesquisador() {
		return idPesquisador;
	}


	public void setIdPesquisador(int idPesquisador) {
		this.idPesquisador = idPesquisador;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Calendar getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
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


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
	
	
	
	
	
	
	
	

}
