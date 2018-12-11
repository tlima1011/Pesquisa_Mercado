package br.com.pesquisamercado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.pesquisamercado.modelo.Empresa;

public class EmpresaDao {

	private Connection connection;

	public EmpresaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Empresa empresa) {
		String sql = "insert into empresa (nome, contato, telefone, endereco, bairro, email) values (?,?,?,?,?,?)";
		try (PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql)) {
			stmt.setString(1, empresa.getNome());
			stmt.setString(2, empresa.getContato());
			stmt.setString(3, empresa.getTelefone());
			stmt.setString(4, empresa.getEndereco());
			stmt.setString(5, empresa.getBairro());
			stmt.setString(6, empresa.getEmail());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
	}// fim adiciona

	public List<Empresa> getLista() {
		String sql = "select * from empresa";
		List<Empresa> empresas = new ArrayList();
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Empresa empresa = new Empresa();
				empresa.setIdEmpresa(rs.getInt("idempresa"));
				empresa.setNome(rs.getString("nome"));
				empresa.setContato(rs.getString("contato"));
				empresa.setTelefone(rs.getString("telefone"));
				empresa.setEndereco(rs.getString("endereco"));
				empresa.setBairro(rs.getString("bairro"));
				empresa.setEmail(rs.getString("email"));
				empresas.add(empresa);
			} // fim while
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return empresas;
	}// fim lista

	public Empresa busca(int idEmpresa) {
		String sql = "select * from empresa where codigo = ?";
		Empresa empresa = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, idEmpresa);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				empresa = new Empresa();
				empresa.setIdEmpresa(rs.getInt("idempresa"));
				empresa.setNome(rs.getString("nome"));
				empresa.setContato(rs.getString("contato"));
				empresa.setTelefone(rs.getString("telefone"));
				empresa.setEndereco(rs.getString("endereco"));
				empresa.setBairro(rs.getString("bairro"));
				empresa.setEmail(rs.getString("email"));
			} // fim if
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return empresa;
	}// fim busca

	public void altera(Empresa empresa) {
		String sql = "update imovel set nome = ?, contato = ?," + " telefone = ?, "
				+ "endereco = ?, bairro = ?, email = ?" + " where codigo = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, empresa.getNome());
			stmt.setString(2, empresa.getContato());
			stmt.setString(3, empresa.getTelefone());
			stmt.setString(4, empresa.getEndereco());
			stmt.setString(5, empresa.getBairro());
			stmt.setString(6, empresa.getEmail());
			stmt.setInt(7, empresa.getIdEmpresa());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
	}// fim altera

	public void remove(Empresa empresa) {
		String sql = "delete from empresa where idempresa = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, empresa.getIdEmpresa());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
	} // fim remove
}
