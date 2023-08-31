/**
 * @(#)Ex13.java
 *
 *
 * @author 
 * @version 1.00 2023/8/17
 */


import javax.swing.JOptionPane;

public class Ex13 {
	
	public static void main(String args[]){
		String strSexo = JOptionPane.showInputDialog(null, "Informe o seu sexo, sendo 'm' para masculino, e 'f' para feminino: ");
		float numAltura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a sua altura: "));
		float pesoIdeal = 0;
		
		strSexo = strSexo.toUpperCase();
		
		if (strSexo.charAt(0) == 'M'){
			pesoIdeal = 72.7f * numAltura - 58;
		}else{
			if (strSexo.charAt(0) == 'F'){
			pesoIdeal = 62.1f * numAltura - 44.7f;
		} else{
			JOptionPane.showMessageDialog(null, "Sexo nao valido");
			System.exit(0);
		}
		}
			JOptionPane.showMessageDialog(null, "O seu peso ideal e: " + pesoIdeal );
	}
}