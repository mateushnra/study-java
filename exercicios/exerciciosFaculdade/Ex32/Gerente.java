/**
 * @(#)Gerente.java
 *
 *
 * @author 
 * @version 1.00 2023/9/25
 */

import javax.swing.JOptionPane;

public class Gerente extends Empregado {

	private float salario_mensal;

    public Gerente() {
    	super();
    	salario_mensal = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o seu salario mensal: "));
    }
    
    public float valor_do_salario(){
    	return salario_mensal;
    }
    
}