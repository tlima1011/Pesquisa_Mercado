package br.com.pesquisamercado.teste;

import java.util.Calendar;

import br.com.pesquisamercado.dao.PesquisadorDao;
import br.com.pesquisamercado.modelo.Idade;
import br.com.pesquisamercado.modelo.Pesquisador;

public class AdicionaPesquisador {

	public static void main(String[] args) {

		Pesquisador pesquisador = new Pesquisador();

		pesquisador.setNome("Andreia");
		pesquisador.setDataNascimento(Calendar.getInstance());
//		Idade idade = new Idade();
//		idade.calcularIdade();
		pesquisador.setEndereco("Largo Padre Péricles,7");
		pesquisador.setBairro("Barra Funda");
		pesquisador.setTelefone("3368-4593");
		pesquisador.setZona("Oeste");
		pesquisador.setEstadoCivil("Solteira");
		pesquisador.setRg("2474777");
		pesquisador.setCpf("32656898");
		pesquisador.setEmail("amdreiapinheiro1912@gmail.com");
		pesquisador.setSenha("andreia");
		new PesquisadorDao().adiciona(pesquisador);
		System.out.println("Salvo Pesquisador(a) no BD.");

	}

}
