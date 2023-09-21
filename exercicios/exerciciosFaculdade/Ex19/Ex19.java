/**
 * @(#)Ex19.java
 *
 *
 * @author 
 * @version 1.00 2023/8/24
 */


public class Ex19 {

    public static void main(String args[]){
    	int contVogais = 0; String frase = "Pos graduacao em desenvolvimento de aplicacoes web", semVogais ="";char c;
     	frase = frase.toUpperCase();
    	
    for(int i = 0; i < frase.length(); i++){
    	c = frase.charAt(i);
    	if(c != 'A' && c != 'E' && c != 'I' && 
    	   c != 'O' && c != 'U'){
    		semVogais += c;
    	}
    }
    System.out.println(semVogais);
    }
    
    
}