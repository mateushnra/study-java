/**
 * @(#)Ex15.java
 *
 *
 * @author 
 * @version 1.00 2023/8/21
 */


public class Ex15 {

   public static void main(String args[]) {
    	short sum = 0; 
    	
    	for(short i = 1; i <= 1000; i++){
    		if(i % 2 == 0 && i % 5 == 0 && i % 7 == 0){
    			sum += i;
    		}
    	}
    	
    	System.out.println(sum);
    }
}