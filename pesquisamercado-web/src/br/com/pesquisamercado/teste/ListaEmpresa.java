package br.com.pesquisamercado.teste;

import java.util.List;

import br.com.pesquisamercado.dao.EmpresaDao;
import br.com.pesquisamercado.modelo.Empresa;


public class ListaEmpresa {

	public static void main(String[] args) {
		
		List<Empresa> empresas = new EmpresaDao().getLista();
		System.out.println("...:::Lista de Empresas:::...\n");
		empresas.forEach(i -> System.out.println(i.getIdEmpresa() + " - " + i.getNome() + " - E-mail: "+i.getEmail()));
		
	}

}
