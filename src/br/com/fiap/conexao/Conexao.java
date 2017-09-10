package br.com.fiap.conexao;

import com.mysql.jdbc.Connection;

@SuppressWarnings("unused")
public class Conexao {
	private static Connection connection;
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String SERVIDOR = "127.0.0.1";
	private static final String PORTA = "3306";
	private static final String BANCO = "FIAP";
	private static final String URL = "jdbc:mysql:thin:@";
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	
	private Conexao() {
	}
}
