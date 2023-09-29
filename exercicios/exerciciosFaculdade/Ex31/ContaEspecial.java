/**
 * @(#)ContaEspecial.java
 *
 *
 * @author 
 * @version 1.00 2023/9/21
 */

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {
	private float limite_credito;
	
    public ContaEspecial() {
    	super();
    	limite_credito = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o limite de credito da conta: "));
    }
    
    public float exibirLimite(){
    	return limite_credito;
    }
    
     public boolean retirar(float val){
     	float quantidadeLimite = 0;
     	
     	if (val <= (Saldo + limite_credito)){
     		if (val > Saldo){
     			quantidadeLimite = val - Saldo;
     			limite_credito -= quantidadeLimite;
     			Saldo -= (val - quantidadeLimite); 	
     		} else {
     			Saldo -= val;
     		}
     		return true;
     	
     	} else {
     		return false;
     	}
    	
    }
    
    
    
    
}