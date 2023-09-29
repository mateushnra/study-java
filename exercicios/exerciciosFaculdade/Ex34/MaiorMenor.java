/**
 * @(#)MaiorMenor.java
 *
 *
 * @author 
 * @version 1.00 2023/9/25
 */

public class MaiorMenor extends Media{

	private float maior;
	private float menor;
	
    public MaiorMenor() {
    	super();
    }
    
    public void acrescenta (int i){
    	if(!(i == 0)){
    		if(i >= maior)
    			maior = i;
    		else
    			menor = i;
    		
    		super.acrescenta(i);
    	}
    }
    
    public float maior_numero(){
    	return maior;
    }
    
    public float menor_numero(){
    	return menor;
    }
}