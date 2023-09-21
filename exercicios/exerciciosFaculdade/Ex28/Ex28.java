/**
 * @(#)Ex28.java
 *
 *
 * @author 
 * @version 1.00 2023/9/14
 */

import javax.swing.JOptionPane;
public class Ex28 {

     public static void main(String args[]) {
    	byte acao = 0;
    	Conta cliente = new Conta();
    	
    	do{
	    	acao = Byte.parseByte(JOptionPane.showInputDialog(null, "Informe qual acao voce deseja realizar: " + 
	    													  "\n\nCONTA CORRENTE\n1 - Deposito\n2 - Retirada\n3 - Consultar saldo\n4 - Alterar senha\n5 - Finalizar"));
	    	switch(acao){
	    		case 1: 
	    			cliente.depositar();
	    			break;
	    	 	case 2:
	    	 		if(cliente.VerificarSenha()){
	    	 			if(!cliente.retirar()){
	    	 				JOptionPane.showMessageDialog(null, "Valor insuficiente!");
	    	 			}
	    	 		}
	    	 		else
	    	 			JOptionPane.showMessageDialog(null, "Senha Incorreta!");
	    			break;
	    		case 3: 
	    			if(cliente.VerificarSenha())
	    	 			JOptionPane.showMessageDialog(null, "O saldo disponivel na conta e de: R$" + cliente.consulta_saldo());
	    	 		else
	    	 			JOptionPane.showMessageDialog(null, "Senha Incorreta!");
	    			break;
	    		case 4:
	    			if(!cliente.AlterarSenha())
	    			JOptionPane.showMessageDialog(null, "Senha incorreta...");
	    			break;
    			case 5:
    				JOptionPane.showMessageDialog(null, "Atividade na conta sendo encerrada");
    				break;
	    		default:
	    			JOptionPane.showMessageDialog(null, "Opcao nao existente, informe uma acao de 1 a 5!");
    		}
    	}while(acao != 5);
    }
    
}