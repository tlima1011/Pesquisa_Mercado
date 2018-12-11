package br.com.pesquisamercado.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		String url = "jdbc:mysql://localhost/pesquisa_mercado";
		String usuario = "root";
		String senha = "";
		try {
			Class.forName("com.mysql.jdbc.Driver"); //necessário para o Tomcat 7
			return DriverManager.getConnection("jdbc:mysql://localhost/pesquisa_mercado", "root", "");
		} catch (SQLException | ClassNotFoundException ex) {
			throw new RuntimeException(ex);
		}
	}
	

}
