package br.com.pesquisamercado.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Idade {

	private int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int calcularIdade(Date dataNascimento) {
		GregorianCalendar dataHoje = new GregorianCalendar();
		int diaAtual = 0, mesAtual = 0, anoAtual = 0; 
		diaAtual = dataHoje.get(Calendar.DAY_OF_MONTH);
		mesAtual = dataHoje.get(Calendar.MONTH) + 1;
		anoAtual = dataHoje.get(Calendar.YEAR);
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		String dtNasc = formatador.format(dataNascimento);
		String diaNasc = dtNasc.substring(0, 2);
		String mesNasc = dtNasc.substring(3, 5);
		String anoNasc = dtNasc.substring(6, 10);
		int diaNascimento = Integer.parseInt(diaNasc);
		int mesNascimento = Integer.parseInt(mesNasc);
		int anoNascimento = Integer.parseInt(anoNasc);
		idade = anoAtual - anoNascimento;
		if(mesAtual != mesNascimento) {
			if(mesAtual < mesNascimento) {
				idade--; 
				return idade; 
			}
		}
		else {
			return idade;
		}
		return idade;
	}
}
