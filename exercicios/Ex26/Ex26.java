/**
 * @(#)Ex25.java
 *
 *
 * @author 
 * @version 1.00 2023/9/04
 */

import javax.swing.JOptionPane;

public class Ex26 {

    public static void main(String args[]){
    	
    char fim;
    
	Media m = new Media();

	do{
		m.Acrescenta(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um valor: ")));
		fim = JOptionPane.showInputDialog(null, "Digite 's' caso deseje encerrar a entrada de dados: ").charAt(0);
	} while(Character.toUpperCase(fim)!= 'S');
	
	System.out.println("A media e = " + m.MediaAtual());
	} 
}