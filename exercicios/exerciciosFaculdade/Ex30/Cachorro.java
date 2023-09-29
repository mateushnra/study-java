/**
 * @(#)Cachorro.java
 *
 *
 * @author 
 * @version 1.00 2023/9/18
 */

import javax.swing.JOptionPane;

public class Cachorro extends Animal {
	private String nome;
	private String raca;

    public Cachorro() {
    	super();
    	nome = JOptionPane.showInputDialog(null,"Informe o nome: ");
    	raca = JOptionPane.showInputDialog(null,"Informe a raca: ");
    }
    
    public void exibirNomeRaca(){
    	JOptionPane.showMessageDialog(null, nome + " e um " + raca);
    }
    
}