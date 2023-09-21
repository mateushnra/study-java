/**
 * @(#)Ex18.java
 *
 *
 * @author 
 * @version 1.00 2023/8/24
 */


import javax.swing.JOptionPane;

public class Ex18 {

     public static void main(String args[]){
     	
     int contVogais = 0; String frase = "Pos graduacao em desenvolvimento de aplicacoes web";
     char c;
     frase = frase.toUpperCase();
    	
    for(int i = 0; i < frase.length(); i++){
    	c = frase.charAt(i);
    	if(c == 'A' || c == 'E' || c == 'I' || 
    	   c == 'O' || c == 'U'){
    	contVogais++;		
    	}
    }
    System.out.println("A quantidade de vogais na frase e de: " + contVogais);
    }   
}