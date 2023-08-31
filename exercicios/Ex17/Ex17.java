/**
 * @(#)Ex17.java
 *
 *
 * @author 
 * @version 1.00 2023/8/21
 */

import javax.swing.JOptionPane;

public class Ex17 {

    public static void main(String args[]) {
    	int vet[] = new int[10], sum = 0;
    	
    	for(short i = 0; i < 10; i++){
    		vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o elemento " + i + " do vetor: "));
    	}
    	
    	for(short i = 0; i < 10; i++){
    		sum += vet[i];
    	}
    	
    	for(short i = 0; i < 10; i++){
    		System.out.println(vet[i]);
    	}
    	
    	System.out.println(sum);
    }
 }