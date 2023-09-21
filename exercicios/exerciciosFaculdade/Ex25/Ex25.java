/**
 * @(#)Ex25.java
 *
 *
 * @author 
 * @version 1.00 2023/9/04
 */

public class Ex25 {

    public static void main(String args[]){
    	
	Media m = new Media();
	
	m.Acrescenta(3);
	m.Acrescenta(5);
	m.Acrescenta(10);
	m.Acrescenta(8);
	
	System.out.println("A media e = " + m.MediaAtual());
	} 
}