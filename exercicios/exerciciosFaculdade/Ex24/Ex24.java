/**
 * @(#)Ex24.java
 *
 *
 * @author 
 * @version 1.00 2023/9/04
 */

import
public class Ex24 {

    public static void main(String args[]){
    	
	Retangulo ret1 = new Retangulo(6,4);
	Retangulo ret2 = new Retangulo();
	ret2.setBase(2f);
	ret2.setAltura(3f);
	
	System.out.println("A maior area e de: ");
	if(ret1.calcularArea() > ret2.calcularArea())
		System.out.println("Ret1, com o respectivo valor de: " + ret1.calcularArea());
	else
		System.out.println("Ret2, com o respectivo valor de: " + ret2.calcularArea());
	
	System.out.println("\nO maior perimetro e de: ");
	if(ret1.calcularPerimetro() > ret2.calcularPerimetro())
		System.out.println("Ret1, com o respectivo valor de: " + ret1.calcularPerimetro());
	else
		System.out.println("Ret2, com o respectivo valor de: " + ret2.calcularPerimetro());
    }
    
    
}