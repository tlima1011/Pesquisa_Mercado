/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pesquisamercado.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Idade {
	
	public int calcularIdade(Calendar dataNascimento, int anoAtual) { 
		
		GregorianCalendar calendario=new GregorianCalendar();
		anoAtual = calendario.get(Calendar.YEAR);
		SimpleDateFormat nascimento = new SimpleDateFormat("ddmmyyyy");
		int nascimento1 =  Integer.parseInt(nascimento.format(nascimento));
		return anoAtual - nascimento1;
		//int nascimento = dataNascimento.substring(dataNascimento.length() - 4);
	}
}
	
//	public static int calcularIdade(int anoAtual, int dataNascimento) {
//		
//		int nascimento; 
		
		
//		GregorianCalendar calendario=new GregorianCalendar();
//		anoAtual = calendario.get(Calendar.YEAR);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//nascimento = dataNascimento.substring(dataNascimento.length() - 4);
		
		//int anoNascimento = dataNascimento.substring(dataNascimento.length() - 4);
		
		
		
		//int anohj=hj.get(Calendar.YEAR);
//	}
//}

//	public int getIdade() {
//
////		GregorianCalendar hj=new GregorianCalendar();
////		GregorianCalendar dataNascimento=new GregorianCalendar();
////		int anohj=hj.get(Calendar.YEAR);
////		int anoNascimento=dataNascimento.get(Calendar.YEAR);
////		return anohj-anoNascimento;
//		
//		System.out.println("Informe a data de nascimento");
//		dataNascimento = scanner.next();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		anoNascimento = dataNascimento.substring(dataNascimento.length() - 4);
//		int nascimento = Integer.parseInt(anoNascimento);
//		anoAtual = calendario.get(Calendar.YEAR);
//		if(nascimento >= anoAtual) {
//			//System.out.println("Erro: Data de Nascimento maior que atual");
//			return -1;
//		}
//		return anoAtual - nascimento;
	


