/**
 * @(#)Ex36.java
 *
 *
 * @author 
 * @version 1.00 2023/9/28
 */
 
 import javax.swing.JOptionPane;

public class Ex36 {

    public static void main(String args[]) {
    	int i = 0;
		try{
			i =	Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero: "));	
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Voce digitou um caracter alfanumerico!");
		}
    }
    
}