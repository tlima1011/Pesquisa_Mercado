package br.com.pesquisamercado.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.pesquisamercado.modelo.Pesquisador;

public class PesquisadorDao {

	private Connection connection;

	public PesquisadorDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Pesquisador pesquisador) {
		String sql = "insert into pesquisador (nome, dataNascimento, idade, endereco, bairro, telefone, zona, estadoCivil, rg, cpf, email, senha) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql)) {
			stmt.setString(1, pesquisador.getNome());
			stmt.setDate(2, new Date(pesquisador.getDataNascimento().getTimeInMillis()));
			stmt.setInt(3, pesquisador.getIdade());
			stmt.setString(4, pesquisador.getEndereco());
			stmt.setString(5, pesquisador.getBairro());
			stmt.setString(6, pesquisador.getTelefone());
			stmt.setString(7, pesquisador.getZona());
			stmt.setString(8, pesquisador.getEstadoCivil());
			stmt.setString(9, pesquisador.getRg());
			stmt.setString(10, pesquisador.getCpf());
			stmt.setString(11, pesquisador.getEmail());
			stmt.setString(12, pesquisador.getSenha());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
	}// fim adiciona

	public List<Pesquisador> getLista() {
		String sql = "select * from pesquisador";
		List<Pesquisador> pesquisadores = new ArrayList();
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Pesquisador pesquisador = new Pesquisador();
				pesquisador.setIdPesquisador(rs.getInt("idpesquisador"));
				pesquisador.setNome(rs.getString("nome"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				pesquisador.setDataNascimento(data);
				pesquisador.setIdade(rs.getInt("idade"));
				pesquisador.setEndereco(rs.getString("endereco"));
				pesquisador.setBairro(rs.getString("bairro"));
				pesquisador.setTelefone(rs.getString("telefone"));
				pesquisador.setZona(rs.getString("zona"));
				pesquisador.setEstadoCivil(rs.getString("estadoCivil"));
				pesquisador.setRg(rs.getString("rg"));
				pesquisador.setCpf(rs.getString("cpf"));
				pesquisador.setEmail(rs.getString("email"));
				pesquisador.setSenha(rs.getString("senha"));
				pesquisadores.add(pesquisador);
			} // fim while
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return pesquisadores;
	}// fim lista

	public Pesquisador busca(int idPesquisador) {
		String sql = "select * from pesquisador where idpesquisador = ?";
		Pesquisador pesquisador = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, idPesquisador);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				pesquisador = new Pesquisador();
				pesquisador.setIdPesquisador(rs.getInt("idpesquisador"));
				pesquisador.setNome(rs.getString("nome"));
				Calendar data = Calendar.getInstance();
				pesquisador.setIdade(rs.getInt("idade"));
				data.setTime(rs.getDate("dataNascimento"));
				pesquisador.setDataNascimento(data);
				pesquisador.setEndereco(rs.getString("endereco"));
				pesquisador.setBairro(rs.getString("bairro"));
				pesquisador.setTelefone(rs.getString("telefone"));
				pesquisador.setZona(rs.getString("zona"));
				pesquisador.setEstadoCivil(rs.getString("estadoCivil"));
				pesquisador.setRg(rs.getString("rg"));
				pesquisador.setCpf(rs.getString("cpf"));
				pesquisador.setEmail(rs.getString("email"));
				pesquisador.setSenha(rs.getString("senha"));
			} // fim if
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return pesquisador;
	}

	public void altera(Pesquisador pesquisador) {
		String sql = "update pesquisador set nome = ?, dataNascimento = ?, idade = ?, endereco = ?, bairro = ?, telefone = ?" + " zona = ?" + " estadoCivil = ?" + " rg = ? "
				+ "cpf = ? " + "email = ? " + "senha = ? " + " where codigo = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, pesquisador.getNome());
			stmt.setDate(2, new Date(pesquisador.getDataNascimento().getTimeInMillis()));
			stmt.setInt(3, pesquisador.getIdade());
			stmt.setString(4, pesquisador.getEndereco());
			stmt.setString(5, pesquisador.getBairro());
			stmt.setString(6, pesquisador.getTelefone());
			stmt.setString(7, pesquisador.getZona());
			stmt.setString(8, pesquisador.getEstadoCivil());
			stmt.setString(9, pesquisador.getRg());
			stmt.setString(10, pesquisador.getCpf());
			stmt.setString(11, pesquisador.getEmail());
			stmt.setString(12, pesquisador.getSenha());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
	}

	public void remove(Pesquisador pesquisador) {
		String sql = "delete from pesquisador where idPesquisador = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, pesquisador.getIdPesquisador());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
	} // fim remove
}
