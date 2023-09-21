/**
 * @(#)Ex3.java
 *
 *
 * @author 
 * @version 1.00 2023/8/17
 */

import javax.swing.JOptionPane;

public class Ex3 {
	
	public static void main(String args[]){
		String strIdade = JOptionPane.showInputDialog(null, "Informe a sua idade");
		int numIdade = Integer.parseInt(strIdade);
		
		if (numIdade > 21)
			JOptionPane.showMessageDialog(null, "Voce e emancipado!");
		else
			JOptionPane.showMessageDialog(null, "Voce nao e emancipado!");
	}
}