package br.com.pesquisamercado.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pesquisamercado.dao.PesquisadorDao;
import br.com.pesquisamercado.modelo.Pesquisador;

@WebServlet("/cadastraPesquisador")
public class CadastraPesquisadorServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		Calendar dataNascimento = null;
		int idade = Integer.parseInt(request.getParameter("idade"));
		String endereco = request.getParameter("endereco");
		String bairro = request.getParameter("bairro");
		String telefone = request.getParameter("telefone");
		String zona = request.getParameter("zona");
		String estadoCivil = request.getParameter("estadoCivil");
		String rg = request.getParameter("rg");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dataNascimento"));
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			out.println("Erro de conversão de data! use (dd/MM/yyyy)");
			return;
			// throw new ServletException(e);
		}

		Pesquisador pesquisador = new Pesquisador(nome, dataNascimento, idade, endereco, bairro, telefone,
				zona, estadoCivil, rg, cpf, email, senha);

		new PesquisadorDao().adiciona(pesquisador);

		// Resposta para o cliente
		out.println("<html><body><h3>");
		out.println("Pesquisador: " + pesquisador.getNome() + " cadastrado com sucesso!");
		out.println("</h3></body></html>");
	}

}
