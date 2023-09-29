/**
 * @(#)Horista.java
 *
 *
 * @author 
 * @version 1.00 2023/9/25
 */

import javax.swing.JOptionPane;

public class Horista extends Empregado{

	private float valor_hora;
	private short horas_trabalhadas;
	
    public Horista() {
    	super();
    	valor_hora = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor da sua hora: "));
    	horas_trabalhadas = Short.parseShort(JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas no mes: "));
    }
    
    public float valor_do_salario(){
    	return valor_hora * horas_trabalhadas;
    }
    
}