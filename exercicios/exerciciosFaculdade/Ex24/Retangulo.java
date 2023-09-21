/**
 * @(#)Retangulo.java
 *
 *
 * @author 
 * @version 1.00 2023/8/28
 */


public class Retangulo {

    	
		private float Base, Altura;
		
	public Retangulo(){
	}
	
	public Retangulo(float b, float a) {
	    this.Base = b; this.Altura = a;
	}
	    
	public void setBase(Float b){
		this.Base = b;
	}
	
	public float retornaBase(){
		return this.Base;
	}
	
	public void setAltura(Float a){
		this.Altura = a;
	}
	
	public float retornaAltura(){
		return this.Altura;
	}
	    
	public float calcularArea(){
		return(this.Base *this.Altura);
	}
	
	public float calcularPerimetro(){
		return((2*this.Base) + 2*(this.Altura));
	}
    
    public void exibeArea (){
    	System.out.println("A area e: " + calcularArea());
    }
    
    public void exibePerimetro (){
    	System.out.println("O perimetro e: " + calcularPerimetro());
    }
    
}