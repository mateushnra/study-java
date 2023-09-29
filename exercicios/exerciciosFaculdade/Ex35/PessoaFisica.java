/**
 * @(#)PessoaFisica.java
 *
 *
 * @author 
 * @version 1.00 2023/9/28
 */

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa {

	private String profissao;
	private String data_nasc;
	private Pessoa pai;
	private Pessoa mae;
	private String RG;
	private String CPF;

    public PessoaFisica() {
    	super();
    	profissao = JOptionPane.showInputDialog(null, "Informe a sua profissao: ");
    	data_nasc = JOptionPane.showInputDialog(null, "Informe o numero a sua data de nascimento no formato dd/mm/aaaa: ");
    	pai = new Pessoa();
    	mae = new Pessoa();
    	RG = JOptionPane.showInputDialog(null, "Informe o seu RG: ");
    	CPF = JOptionPane.showInputDialog(null, "Informe o seu CPF: ");
    }
    
    public String cidadeDoPai(){
    	return (pai.enderecoDaPessoa()).nomeCidade();
    }
}