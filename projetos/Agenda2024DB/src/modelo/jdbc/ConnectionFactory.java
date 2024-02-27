package modelo.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		String stringJDBC = "jdbc:mysql://localhost:3306/agenda2024";
		String usuario = "root";
		String senha = "root";

		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection(stringJDBC, usuario, senha);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conexao;
	}
}
