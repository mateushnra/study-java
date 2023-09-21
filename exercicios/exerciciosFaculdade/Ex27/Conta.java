/**
 * @(#)Conta.java
 *
 *
 * @author 
 * @version 1.00 2023/9/4
 */

import javax.swing.JOptionPane;

public class Conta {
	
	private String Nome;
	private int Numero;
	private float Saldo;

    public Conta() {
    	Nome = JOptionPane.showInputDialog(null, "Informe o nome da conta: "); 
    	Numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da conta: ")); 
    	Saldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o saldo da conta: "));
    }
    
    public void depositar(float val){
    	Saldo += val;
    }
    
    public boolean retirar(float val){
    	if(val < Saldo){
    		this.Saldo -= val;
    		return true;
    	}else
    		return false;
    }
    
    public float consulta_saldo(){
    	return this.Saldo;
    }
    
}