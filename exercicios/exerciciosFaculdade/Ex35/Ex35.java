/**
 * @(#)Ex35.java
 *
 *
 * @author 
 * @version 1.00 2023/9/25
 */

import javax.swing.JOptionPane;

public class Ex35 {

    public static void main(String[] args) {
    	PessoaJuridica p1 = new PessoaJuridica();
    	PessoaFisica p2 = new PessoaFisica();
    	
    	p1.exibirNomeContato();
    	JOptionPane.showMessageDialog(null, "O nome da cidade do pai e: " + p2.cidadeDoPai());
	}
}