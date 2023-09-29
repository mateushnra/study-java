/**
 * @(#)PessoaJuridica.java
 *
 *
 * @author 
 * @version 1.00 2023/9/28
 */

import javax.swing.JOptionPane;

public class PessoaJuridica extends Pessoa{

	private String inscr_estadual;
	private String CNPJ;
	private Pessoa contato;

    public PessoaJuridica() {
    	super();
    	inscr_estadual = JOptionPane.showInputDialog(null, "Informe a sua inscricao estadual: ");
    	CNPJ = JOptionPane.showInputDialog(null, "Informe o seu CNPJ: ");
    	contato = new Pessoa();
    }
    
    public void exibirNomeContato(){
    	JOptionPane.showMessageDialog(null, "O nome do contato e: " + contato.retornaNome());
    }
}