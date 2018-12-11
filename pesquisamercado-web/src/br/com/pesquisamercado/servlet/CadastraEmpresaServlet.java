package br.com.pesquisamercado.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pesquisamercado.dao.EmpresaDao;
import br.com.pesquisamercado.modelo.Empresa;

@WebServlet("/cadastraEmpresa")
public class CadastraEmpresaServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String contato = request.getParameter("contato");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String bairro = request.getParameter("bairro");
		String email = request.getParameter("email");
		try {
			//out.println("Conectado aos dados!!");
		} catch (RuntimeException e) {
			// out.println("Erro de conversão de valor! (Não numérico)");
			// return;
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa(nome, contato, telefone, endereco, bairro, email);
		new EmpresaDao().adiciona(empresa);

		out.println("<html><body><h3>");
		out.println("Empresa " + empresa.getNome() + " Cadastrada com sucesso!");
		out.println("</h3></body></html>");

	}

}
