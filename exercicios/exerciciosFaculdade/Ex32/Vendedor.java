/**
 * @(#)Vendedor.java
 *
 *
 * @author 
 * @version 1.00 2023/9/25
 */

import javax.swing.JOptionPane;

public class Vendedor extends Empregado{

	private float salarioBase;
	private float valor_vendas_mes;
	private float perc_comissao;

    public Vendedor() {
    	super();
    	salarioBase = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o seu salario base: "));
    	valor_vendas_mes = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor total das vendas realizadas no mes: "));
    	perc_comissao = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a porcentagem da comissao em decimal: "));
    }
    
    public float valor_do_salario(){
    	return salarioBase + valor_vendas_mes * perc_comissao;
    }
    
}