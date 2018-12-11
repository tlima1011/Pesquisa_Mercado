package br.com.pesquisamercado.teste;

import java.util.List;

import br.com.pesquisamercado.dao.ConvidadoDao;
import br.com.pesquisamercado.modelo.Convidado;

public class ListaConvidado {

	public static void main(String[] args) {
		
		List<Convidado> convidados = new ConvidadoDao().getLista();
		System.out.println("...:::Lista de Convidados:::...\n");
		convidados.forEach(i -> System.out.println(i.getIdConvidado() + " - " + i.getNome() + " - E-mail: "+i.getEmail() 
		+ " - Nivel: " + i.getNivel() + " " +i.getIdade()));

	}

}
