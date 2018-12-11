package br.com.pesquisamercado.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import br.com.pesquisamercado.modelo.Idade;

public class TesteIdade {

	public static void main(String[] args) {
		
		//String dataNascimento;
		Idade idade = new Idade();
		Scanner scanner = new Scanner(System.in);
		Calendar calendario = GregorianCalendar.getInstance();
		Calendar dataNascimento;
		
		System.out.println("Digite a data de Nascimento: ");
		dataNascimento = scanner.nextInt();
		
		int idadeAtual = idade.calcularIdade(Calendar dataNascimento, int anoAtual);
		System.out.println("Idade atual: " +idadeAtual +" anos de idade");
		
		
		
	}

}
