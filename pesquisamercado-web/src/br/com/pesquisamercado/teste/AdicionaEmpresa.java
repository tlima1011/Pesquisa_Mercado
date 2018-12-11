package br.com.pesquisamercado.teste;

import java.util.Calendar;

import br.com.pesquisamercado.dao.EmpresaDao;
import br.com.pesquisamercado.dao.PesquisadorDao;
import br.com.pesquisamercado.modelo.Empresa;

public class AdicionaEmpresa {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		empresa.setNome("Kyra Pesquisa");
		empresa.setContato("Solange");
		empresa.setTelefone("3043-8062");
		empresa.setEndereco("Rua Gomes de Carvalho, 342");
		empresa.setBairro("Vila Olimpia");
		empresa.setEmail("kira@kira.com.br");
		new EmpresaDao().adiciona(empresa);
		System.out.println("Empresa Salva no BD.");
				
	}

}
