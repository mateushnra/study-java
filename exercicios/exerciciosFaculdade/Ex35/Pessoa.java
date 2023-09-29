/**
 * @(#)Pessoa.java
 *
 *
 * @author 
 * @version 1.00 2023/9/28
 */

import javax.swing.JOptionPane;

public class Pessoa {
	
	private int codigo;
	private String nome;
	private Endereco endereco;
	private String telefone;
	
    public Pessoa() {
    	codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o codigo do usuario: "));
    	nome = JOptionPane.showInputDialog(null, "Informe o seu nome: ");
    	endereco = new Endereco();
    	telefone = JOptionPane.showInputDialog(null, "Informe o seu numero: ");
    }
    
    public Endereco enderecoDaPessoa(){
    	return endereco;
    }
    
    public String retornaNome(){
    	return nome;
    } 
     
}