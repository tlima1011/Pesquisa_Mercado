package br.com.pesquisamercado.teste;

import java.sql.Date;
import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import br.com.pesquisamercado.dao.ConvidadoDao;
import br.com.pesquisamercado.modelo.Convidado;
import br.com.pesquisamercado.modelo.Idade;

public class ConvidadoAdiciona {

	public static void main(String[] args) {
		
		Convidado convidado = new Convidado();
		ArrayList arraylist = new ArrayList(); 
		
		convidado.setNome("Carla Cristina Fagundes Rogger");
		convidado.setRg("355546231");
		convidado.setEstado("SP");
		convidado.setDataNascimento((Calendar.getInstance()));
	//	convidado.setDataHoraInclusao((Calendar.getInstance()));
//		Idade idade = new Idade();
//		idade.calcularIdade();
		convidado.setCpf("0000");
		convidado.setEndereco("Rua Bonifacio");
		convidado.setBairro("Vila Formosa");
		convidado.setCidade("São Paulo");
		convidado.setTelefone("20560901");
		convidado.setCelular("995690223");
		convidado.setEmail("0");
		convidado.setNacionalidade("brasileiro");
		convidado.setTempoCidade("19 anos");
		convidado.setEstadoCivil("Solteiro");
		convidado.setTemFilhos('n');
		convidado.setQtdeFilhos(0);
		convidado.setIdadeFilhos1(0);
		convidado.setIdadeFilhos2(0);
		convidado.setIdadeFilhos3(0);
		convidado.setIdadeFilhos4(0);
		convidado.setTrabalhaFora('s');
		convidado.setProfissao("Assistente Atendimento");
		convidado.setDataHoraInclusao((Calendar.getInstance()));
		convidado.setEstuda('s');
		convidado.setCurso("Administração");
		convidado.setFaculdade("Anhembi Morumbi");
		//convidado.calcularPonto();
		new ConvidadoDao().adiciona(convidado);
		System.out.println("Convidado(a) Salvo(a) no BD.");
	}
}
