/**
 * @(#)ex10.java
 *
 *
 * @author 
 * @version 1.00 2023/8/14
 */


public class Ex11 {

    public static void main (String args[]) {
    	float Val_Fabrica = 37.00f; 
    	float Comissao = Val_Fabrica * 0.12f;
    	float Imposto = Val_Fabrica * 0.2695f;
    	float Val_Venda = (Val_Fabrica + Comissao + Imposto);

    	System.out.println("Valor Final = " + Val_Venda);
    }
    
    
}