/**
 * @(#)Ex20.java
 *
 *
 * @author 
 * @version 1.00 2023/8/24
 */


public class Ex20 {

    public static void main(String args[]){
    	int contVogais = 0; String frase = "Pos graduacao em desenvolvimento de aplicacoes web", invertido ="";char c;
    	
    for(int i = frase.length() - 1; i >= 0 ; i--){
    	c = frase.charAt(i);
    	invertido += c;
    }
    System.out.println(invertido);
    }
   
}