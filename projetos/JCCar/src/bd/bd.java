package bd;

import java.sql.*;

public class bd {
	
	private Connection con;
	private Statement stmt;
	private boolean Erro;
	private String Msg;
	private String Banco, Usuario, Senha;
	
	public bd(String b, String u, String s) {
		this.Banco = "jdbc:mysql://localhost:3306/"+b;
		this.Usuario = u;
		this.Senha = s;
		Erro = false;
		Msg = "";
	}
	
	public boolean conectaBD() throws ClassNotFoundException {
		this.Erro = false;
		    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(this.Banco, this.Usuario, this.Senha);
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.Erro = true;
			this.Msg = "Falha de conexão com o banco de dados!\nErro: " + e.getMessage();
		}
				
		return Erro;
	}
	
	public ResultSet Consultar(String sql) {
		ResultSet objRes = null;
		
		this.Erro = false;
		this.Msg = "Sucesso na execução da consulta!";
		 try {
			objRes = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.Erro = true;
			this.Msg = "Erro na execução da consulta!\nErro: " + e.getMessage();
		}
		 
		 return objRes;
	}
	
	public boolean Atualizar(String sql) {
		this.Erro = false;
		this.Msg = "Sucesso na execução da operação";
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.Erro = true;
			this.Msg = "Erro na execução da operação.\nErro: " + e.getMessage();
		}
		
		return Erro;
		
	}
	
	public boolean Desconectar() {
		this.Erro = false;
		try {
			stmt.close();
			con.close();
			this.Erro = false;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return Erro;
	}
	
	public String Mensagem() {
		return this.Msg;
	}
	

}
