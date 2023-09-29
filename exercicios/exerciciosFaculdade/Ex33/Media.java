/**
 * @(#)Media.java
 *
 *
 * @author 
 * @version 1.00 2023/9/25
 */

public class Media {
	
	private float soma;
	private int contador;
	
    public Media() {
    	soma = 0;
    	contador = 0;
    }
    
    public void acrescenta (float i){
    	soma += i;
    	if(!(i == 0)){
    		contador++;
    	}
    }
    
    public float media_atual(){
    	return soma / contador;
    }  
}