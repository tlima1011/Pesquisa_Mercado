package br.com.pesquisamercado.modelo;

import java.util.Calendar;

public class ProjetoPesquisa {
	
	private int idProjeto; 
	private String projeto;
	private String descProjeto; 
	private Calendar dataProjeto; 
	private Calendar dataEntrevista1; 
	private Calendar dataEntrevista2;
	private double recrutamento; 
	private double incentivo; 
	private String beneficios; 
	private String enderecoPesquisa; 
	private int idPesquisador;
	private int idEmpresa;
	
	
	public int getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	public String getDescProjeto() {
		return descProjeto;
	}
	public void setDescProjeto(String descProjeto) {
		this.descProjeto = descProjeto;
	}
	public Calendar getDataProjeto() {
		return dataProjeto;
	}
	public void setDataProjeto(Calendar dataProjeto) {
		this.dataProjeto = dataProjeto;
	}
	public Calendar getDataEntrevista1() {
		return dataEntrevista1;
	}
	public void setDataEntrevista1(Calendar dataEntrevista1) {
		this.dataEntrevista1 = dataEntrevista1;
	}
	public Calendar getDataEntrevista2() {
		return dataEntrevista2;
	}
	public void setDataEntrevista2(Calendar dataEntrevista2) {
		this.dataEntrevista2 = dataEntrevista2;
	}
	public double getRecrutamento() {
		return recrutamento;
	}
	public void setRecrutamento(double recrutamento) {
		this.recrutamento = recrutamento;
	}
	public double getIncentivo() {
		return incentivo;
	}
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public String getEnderecoPesquisa() {
		return enderecoPesquisa;
	}
	public void setEnderecoPesquisa(String enderecoPesquisa) {
		this.enderecoPesquisa = enderecoPesquisa;
	}
	public int getIdPesquisador() {
		return idPesquisador;
	}
	public void setIdPesquisador(int idPesquisador) {
		this.idPesquisador = idPesquisador;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	} 
	
	

}
