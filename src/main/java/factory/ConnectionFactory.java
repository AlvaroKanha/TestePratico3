package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static final String URL_DB = "jdbc:mysql://localhost:3306/banco_teste_automacao";
	private static final String USER_NAME = "terceiroteste";
	private static final String PASSWORD = "Senha123@";

	public static Connection conexaoMysql() throws Exception {
		Connection conexao = DriverManager.getConnection(URL_DB, USER_NAME, PASSWORD);
		return conexao;
	}

	public static void main(String[] args) throws Exception {
		Connection conexaoMysql = conexaoMysql();
		if (conexaoMysql != null) {
			conexaoMysql.close();
		}
	}
}
