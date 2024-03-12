package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Contato;
import modelo.jdbc.ConnectionFactory;

public class ContatoDAO {
	public void inserir(Contato contato) {
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			String sql = "INSERT INTO contato(codigo, nome, telefone, grupo_codigo) VALUES (?,?,?,?)";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			
			pstmt.setInt(1, contato.getCodigo());
			pstmt.setString(2, contato.getNome());
			pstmt.setString(3, contato.getTelefone());
			pstmt.setInt(4, contato.getGrupo().getCodigo());
			
			pstmt.execute();
			
			pstmt.close();
			conexao.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void atualizar(Contato contato) {
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			
			String sql = "UPDATE contato SET nome = ?, telefone = ?, grupo_codigo = ? WHERE codigo = ?";
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			
			pstmt.setString(1, contato.getNome());
			pstmt.setString(2, contato.getTelefone());
			pstmt.setInt(3, contato.getGrupo().getCodigo());
			pstmt.setInt(4, contato.getCodigo());
			
			pstmt.execute();
			
			pstmt.close();
			conexao.close();
		}catch(SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public void excluir(Contato contato) {
		
	}
	
	public Contato pesquisarPorCodigo(int codigo) {
		return null;
	}
	
	public ArrayList<Contato> pesquisarTodos(){
		return null;
	}
}
