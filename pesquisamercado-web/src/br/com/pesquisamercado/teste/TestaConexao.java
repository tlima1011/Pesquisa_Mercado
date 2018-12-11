package br.com.pesquisamercado.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.pesquisamercado.dao.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conectado ao Banco de dados!");
		connection.close();

	}

}
