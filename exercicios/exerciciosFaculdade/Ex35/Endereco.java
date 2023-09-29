/**
 * @(#)Endereco.java
 *
 *
 * @author 
 * @version 1.00 2023/9/28
 */

import javax.swing.JOptionPane;

public class Endereco {

	private String rua;
	private int nro;
	private String bairro;
	private String cep;
	private String cidade;

    public Endereco() {
    	rua = JOptionPane.showInputDialog(null, "Informe a sua rua: ");
    	nro = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da sua residencia: "));
    	bairro = JOptionPane.showInputDialog(null, "Informe o seu bairro: ");
    	cep = JOptionPane.showInputDialog(null, "Informe o seu cep: ");
    	cidade = JOptionPane.showInputDialog(null, "Informe a sua cidade: ");
    }
    
    public String nomeCidade(){
    	return cidade;
    }
    
}