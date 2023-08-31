/**
 * @(#)Ex21.java
 *
 *
 * @author 
 * @version 1.00 2023/8/28
 */


public class Ex21 {

    public static void main(String args[]){
    	
	Retangulo ret = new Retangulo(3,4);
	
	System.out.println("A base e: " + ret.retornaBase());
	System.out.println("A altura e: " + ret.retornaAltura());
	System.out.println("A area e: " + ret.calcularArea());
	System.out.println("O perimetro e: " + ret.calcularPerimetro());
    }
    
    
}