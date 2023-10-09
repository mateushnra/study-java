/**
 * @(#)Ex37.java
 *
 *
 * @author 
 * @version 1.00 2023/10/5
 */

import javax.swing.JOptionPane;

public class Ex37 {

    public static void main (String[] args) {
    	float num1, num2, resultado;
    	char operacao;
    	boolean finalizar = false, opValido;
    	while (!finalizar){
    		num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do primeiro numero: "));	
    		num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do segundo numero: "));
    		opValido = false;
    		
    		do{
    			operacao = JOptionPane.showInputDialog(null, "Informe que tipo de operacao deseja realizar:" +
	    													 "\n+" +
	    													 "\n-" +
	    													 "\n*" +
	    													 "\n/").charAt(0);
	    		if(operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/'){
	    			opValido = true;
	    		}
	    											
    		}while(!opValido);
    		
    		switch (operacao){
    			case '+':
    				resultado = num1 + num2;
    				JOptionPane.showMessageDialog(null, "O resultado da soma e " + resultado);
    				break;
    			case '-':
    				resultado = num1 - num2;
    				JOptionPane.showMessageDialog(null, "O resultado da subtracao e " + resultado);
    				break;
    			case '*':
    				resultado = num1 * num2;
    				JOptionPane.showMessageDialog(null, "O resultado da multiplicacao e " + resultado);
    				break;
    			case '/':
    				try{
    					if(num1 / num2 < Float.MAX_VALUE ){
    						JOptionPane.showMessageDialog(null, "O resultado da divisao e " + num1 / num2);
    					}else{
    						JOptionPane.showMessageDialog(null, "Divisor deve ser diferente de 0!");
    					}	
    				}catch(Exception e){
    					JOptionPane.showMessageDialog(null, "Divisor deve ser diferente de 0!");
    				}
    				break;
    			default: 
    				JOptionPane.showMessageDialog(null, "Operacao invalida!");
    				break;
    		}
    	}
    }
     
}