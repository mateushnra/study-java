/**
 * @(#)Empregado.java
 *
 *
 * @author 
 * @version 1.00 2023/9/25
 */

import javax.swing.JOptionPane;

public class Empregado {

	private String numero; 
	private String nome;

    public Empregado() {
    	numero = JOptionPane.showInputDialog(null, "Informe o seu numero: ");
    	nome = JOptionPane.showInputDialog(null, "Informe o seu nome: ");
    }
    
    public String numero_funcional(){
    	return numero;
    }
    
    public String nome_do_funcionario(){
    	return nome;
    }
    
}