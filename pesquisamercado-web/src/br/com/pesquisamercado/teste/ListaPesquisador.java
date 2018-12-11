package br.com.pesquisamercado.teste;

import java.util.List;

import br.com.pesquisamercado.dao.PesquisadorDao;
import br.com.pesquisamercado.modelo.Pesquisador;

public class ListaPesquisador {

	public static void main(String[] args) {

		List<Pesquisador> pesquisadores = new PesquisadorDao().getLista();
		System.out.println("...:::Lista de pesquisadores:::...\n");
		pesquisadores.forEach(i -> System.out.println(i.getIdPesquisador() + " - " + i.getNome() + " - E-mail: "+i.getEmail()));
		
	}

}
