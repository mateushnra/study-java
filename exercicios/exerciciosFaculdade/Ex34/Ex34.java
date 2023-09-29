/**
 * @(#)Ex34.java
 *
 *
 * @author 
 * @version 1.00 2023/9/25
 */

import javax.swing.JOptionPane;

public class Ex34 {

    public static void main(String[] args) {
    	MaiorMenor m = new MaiorMenor();
    	int num = 0;
    	
    	do{
    		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero:\nCaso for 0 o programa encerrara "));	
    		m.acrescenta(num);	
    	}while(num != 0);
    	
    	JOptionPane.showMessageDialog(null, "Media: " + m.media_atual() +
    								        "\nMaior numero: " + m.maior_numero() +
    								        "\nMenor numero: " + m.menor_numero());
    }
}