/**
 * @(#)Animal.java
 *
 *
 * @author 
 * @version 1.00 2023/9/18
 */

import javax.swing.JOptionPane;

public class Animal {	
	private String tipo;
	private String cor;
	
    public Animal() {
    	tipo = JOptionPane.showInputDialog(null,"Informe o porte: ");
    	cor = JOptionPane.showInputDialog(null, "Informe a cor: ");
    }
  
    public String recuperaCor(){
    	return cor;
    }    
   
   	public void exibirTipoCor (){
   		JOptionPane.showMessageDialog(null, "Eu sou um animal " + tipo + " de cor " + cor);
   	}
    
}