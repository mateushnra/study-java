package modelo.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {
	public static void main(String args[]) throws SQLException {
		String stringJDBC = "jdbc:mysql://localhost:3306/agenda2024";
		String usuario = "root";
		String senha = "root";
		
		Connection conexao = DriverManager.getConnection(stringJDBC, usuario, senha);
		
		if (conexao != null) {
			System.out.println("Conectado!");
		} else {
			System.out.println("Erro!");
		}
	}
}
