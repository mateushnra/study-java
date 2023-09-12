/**
 * @(#)Media.java
 *
 *
 * @author 
 * @version 1.00 2023/9/4
 */


public class Media {

	private float Soma, Contador;

    public Media() {
    	this.Soma = 0; this.Contador = 0;
    }
    
    public void Acrescenta(float val){
    	this.Soma += val;
    	this.Contador++;
    }
    
    public float MediaAtual(){
    	return this.Soma / this.Contador;
    }
}