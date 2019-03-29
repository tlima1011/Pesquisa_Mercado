package br.com.pesquisamercado.modelo;

public class Empresa {

	private int idEmpresa;
	private String nome;
	private String contato;
	private String telefone;
	private String endereco;
	private String bairro;
	private String email;

	public Empresa(String nome, String contato, String telefone, String endereco, String bairro, String email) {

		this.nome = nome;
		this.contato = contato;
		this.telefone = telefone;
		this.endereco = endereco;
		this.bairro = bairro;
		this.email = email;
	}

	public Empresa() {

	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getEmailEhEmail() {
		return this.email.contains("@");
	}
	
//	public boolean getContatoEhEmail() {
//		return this.contato.contains("@");
//	}

}
