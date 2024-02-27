package modelo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Grupo;
import modelo.jdbc.ConnectionFactory;

public class GrupoDAO {
	//Inserir utilizando Statement apenas para estudo/historico
	public void inserir1(Grupo grupo) {
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			
			String sql = "INSERT INTO grupo(codigo, nome, descricao) "
					+ "VALUES (" + grupo.getCodigo() + ", '" + grupo.getNome() + "', '" + grupo.getDescricao() + "')";
			
			Statement stmt = conexao.createStatement(); 
			stmt.execute(sql);
			stmt.close();
			conexao.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Prepared Statement
	public void inserir2(Grupo grupo) {
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			
			String sql = "INSERT INTO grupo(codigo, nome, descricao) " + "VALUES(?,?,?)";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			
			pstmt.setInt(1,  grupo.getCodigo());
			pstmt.setString(2, grupo.getNome());
			pstmt.setString(3, grupo.getDescricao());
			
			pstmt.execute();
			
			pstmt.close();
			conexao.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void atualizar(Grupo grupo) {
		
	}
	
	public void excluir(int codigo) {
		
	}
	
	public Grupo pesquisarPorCodigo(int codigo) {
		return null;
	}
	
	public ArrayList<Grupo> pesquisarTodos(){
		return null;
	}
}
