package br.com.pesquisamercado.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pesquisamercado.dao.ConvidadoDao;
import br.com.pesquisamercado.modelo.Convidado;

@WebServlet("/cadastraConvidado")
public class CadastraConvidadoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String rg = request.getParameter("rg");
		String estado = request.getParameter("estado");
		Calendar dataNascimento = null;
		int idade  = Integer.parseInt(request.getParameter("idade"));
		String cpf = request.getParameter("cpf");
		String endereco = request.getParameter("endereco");
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String telefone = request.getParameter("telefone");
		String celular = request.getParameter("celular");
		String email = request.getParameter("email");
		String nacionalidade = request.getParameter("nacionalidade");
		String tempoCidade = request.getParameter("tempoCidade");
		String estadoCivil = request.getParameter("estadoCivil");
		String temFilhos = request.getParameter("temFilhos");
		int qtdeFilhos  = Integer.parseInt(request.getParameter("qtdeFilhos")); 
		int idadeFilhos = Integer.parseInt(request.getParameter("idadeFilhos"));
		int idadeFilhos1  = Integer.parseInt(request.getParameter("idadeFilhos1"));
		int idadeFilhos2  = Integer.parseInt(request.getParameter("idadeFilhos2"));
		int idadeFilhos3  = Integer.parseInt(request.getParameter("idadeFilhos3"));
		int idadeFilhos4  = Integer.parseInt(request.getParameter("idadeFilhos4"));
		String trabalhaFora = request.getParameter("trabalhaFora");
		String profissao = request.getParameter("profissao");
		Calendar dataHoraInclusao = null; 
		String estuda = request.getParameter("estuda");
		String faculdade = request.getParameter("faculdade");
		String curso = request.getParameter("curso");
		int contBanheiro = Integer.parseInt(request.getParameter("contBanheiro"));
		int banheiros = Integer.parseInt(request.getParameter("banheiros"));
		int pontosBanheiro = Integer.parseInt("pontosBanheiro");
		int contEmpregadas = Integer.parseInt(request.getParameter("contEmpregadas"));
		int empregadas = Integer.parseInt(request.getParameter("empregadas"));
		int pontosEmpregadas = Integer.parseInt(request.getParameter("pontosEmpregadas"));
		int contAutomoveis = Integer.parseInt(request.getParameter("contAutomovel"));
		int automoveis = Integer.parseInt(request.getParameter("automoveis"));
		int pontosAutomoveis = Integer.parseInt(request.getParameter("pontosAutomoveis"));
		int contMicrocomputador = Integer.parseInt(request.getParameter("contMicrocomputador"));
		int microcomputador = Integer.parseInt(request.getParameter("microcomputador"));
		int pontosMicrocomputador = Integer.parseInt(request.getParameter("pontosMicrocomputador"));
		int contLavaLoucas = Integer.parseInt(request.getParameter("contLavaLoucas"));
		int lavaLoucas = Integer.parseInt(request.getParameter("lavaLoucas"));
		int pontosLavaLoucas = Integer.parseInt(request.getParameter("pontosLavaLoucas"));
		int contGeladeira = Integer.parseInt(request.getParameter("contGeladeira"));
		int geladeira = Integer.parseInt(request.getParameter("geladeira"));
		int pontosGeladeira = Integer.parseInt(request.getParameter("pontosGeladeira"));
		int contFreezer = Integer.parseInt(request.getParameter("contFreezer"));
		int freezer = Integer.parseInt(request.getParameter("freezer"));
		int pontosFreezer = Integer.parseInt(request.getParameter("pontosFreezer"));
		int contLavaRoupas = Integer.parseInt(request.getParameter("contLavaRoupas"));
		int lavaRoupas = Integer.parseInt(request.getParameter("contLavaRoupas"));
		int pontosLavaRoupas = Integer.parseInt(request.getParameter("lavaRoupas"));
		int contDvd = Integer.parseInt(request.getParameter("contDvd"));
		int dvd = Integer.parseInt(request.getParameter("dvd"));
		int pontosDvd = Integer.parseInt(request.getParameter("pontosDvd"));
		int contMicroondas = Integer.parseInt(request.getParameter("contMicroondas"));
		int microondas = Integer.parseInt(request.getParameter("microondas"));
		int pontosMicroondas = Integer.parseInt(request.getParameter("pontosMicroondas"));
		int contMotocicleta = Integer.parseInt(request.getParameter("contMotocicleta"));
		int motocicleta = Integer.parseInt(request.getParameter("motocicleta"));
		int pontosMotocicleta = Integer.parseInt(request.getParameter("pontosMotocicleta"));
		int contSecadoraRoupas = Integer.parseInt(request.getParameter("contSecadoraRoupas"));
		int secadoraRoupas = Integer.parseInt(request.getParameter("secadoraRoupas"));
		int pontosSecadoraRoupas = Integer.parseInt(request.getParameter("pontosSecadoraRoupas"));
		String anoModeloCarro = request.getParameter("anoModeloCarro");
		String aguaEncanada = request.getParameter("aguaEncanada");
		int pontoAgua = Integer.parseInt(request.getParameter("pontoAgua"));
		String ruaPavimentada = request.getParameter("ruaPavimentada");
		int pontoRua = Integer.parseInt(request.getParameter("pontoRua"));
		Integer entrevistado = Integer.parseInt(request.getParameter("entrevistado"));
		String profissaoChefe = request.getParameter("profissaoChefe");
		String nomeEmpresa = request.getParameter("nomeEmpresa");
		Integer pontos = Integer.parseInt(request.getParameter("pontos"));
		String nivel = request.getParameter("nivel");
	
		try {
			//valor = new Double(request.getParameter("valor"));
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dataNascimento"));
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			dataHoraInclusao = Calendar.getInstance();
			dataHoraInclusao.setTime(date);
						
		} catch (RuntimeException e) {
//			out.println("Erro de conversão de valor! (Não numérico)");
//			return;
			throw new ServletException(e);
		} catch (ParseException e) {
//			out.println("Erro de conversão de data! use (DD/MM/YYYY)");
	//		return;
			throw new ServletException(e);
		} 
		// Instanciação do Convidado
		Convidado convidado = new Convidado(); 								
		new ConvidadoDao().adiciona(convidado); 
		
		// Resposta para o usuario 
		out.println("<html><body><h3>");
		out.println("Convidado: " + convidado.getNome() + " cadastrado com sucesso!");
		out.println("</h3></body></html>");
	}
	
}
