package modelo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;

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
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			
			String sql = "UPDATE grupo SET nome = ?, descricao = ? WHERE codigo = ?";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			
			pstmt.setString(1,  grupo.getNome());
			pstmt.setString(2, grupo.getDescricao());
			pstmt.setInt(3, grupo.getCodigo());
			
			pstmt.execute();
			
			pstmt.close();
			conexao.close();
		}catch(SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public void excluir(int codigo) {
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			
			String sql = "DELETE FROM grupo WHERE codigo = ?";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			
			pstmt.setInt(1, codigo);
			
			pstmt.execute();
			
			pstmt.close();
			conexao.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Grupo pesquisarPorCodigo(int codigo) {
		Grupo grupoResult = null;
		
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			
			String sql = "SELECT nome, descricao FROM grupo WHERE codigo = ?";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			
			pstmt.setInt(1, codigo);
			
			ResultSet rs = pstmt.executeQuery();
			
            if(rs.next()) {
            	grupoResult = new Grupo();
            	
            	grupoResult.setCodigo(codigo);
    			grupoResult.setDescricao(rs.getString("descricao"));
    			grupoResult.setNome(rs.getString("nome"));
            }
			
			rs.close();
			pstmt.close();
			conexao.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return grupoResult;
	}
	
	public ArrayList<Grupo> pesquisarTodos(){
		ArrayList<Grupo> grupos = new ArrayList<>();
		
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			
			String sql = "SELECT codigo, nome, descricao FROM grupo";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Grupo grupo = new Grupo();
            
            	grupo.setCodigo(rs.getInt("codigo"));
    			grupo.setDescricao(rs.getString("descricao"));
    			grupo.setNome(rs.getString("nome"));
    			
    			grupos.add(grupo);
			}
        
			rs.close();
			pstmt.close();
			conexao.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return grupos;
	}
}
