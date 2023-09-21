/**
 * @(#)Ex27.java
 *
 *
 * @author 
 * @version 1.00 2023/9/4
 */

import javax.swing.JOptionPane;

public class Ex27 {

    public static void main(String args[]) {
    	byte acao = 0;
    	Conta cliente = new Conta();
    	System.out.println("CONTA CORRENTE" + "\n1 - Deposito" + "\n2 - Retirada" + "\n3 - Consultar saldo" + "\n4 - Finalizar");
    	
    	do{
	    	acao = Byte.parseByte(JOptionPane.showInputDialog(null, "Informe qual acao voce deseja realizar: "));
	    	switch(acao){
	    		case 1: 
	    			cliente.depositar(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor que sera depositado: ")));
	    			break;
	    	 	case 2:
		 			if(cliente.retirar(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor que sera retirado: "))) == true)
		    			JOptionPane.showMessageDialog(null, "O valor informado foi retirado da conta!");
		    		else
		    			JOptionPane.showMessageDialog(null, "Nao e possivel retirar da conta um valor acima do saldo total!");
	    			break;
	    		case 3: 
	    			JOptionPane.showMessageDialog(null, "O saldo disponivel na conta e de: R$" + cliente.consulta_saldo());
	    			break;
	    		case 4:
	    			JOptionPane.showMessageDialog(null, "Atividade na conta sendo encerrada");
	    			break;
	    		default:
	    			JOptionPane.showMessageDialog(null, "Opcao nao existente, informe uma acao de 1 a 4!");
    		}
    	}while(acao != 4);
    }
}