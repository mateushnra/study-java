/**
 * @(#)Retangulo.java
 *
 *
 * @author 
 * @version 1.00 2023/8/28
 */


public class Retangulo {
	
	private float Base, Altura;
//Para ser o construtor deve ser identico ao nome da classe principal
    public Retangulo(float b, float a) {
    	this.Base = b; this.Altura = a;
    }
    
// Set -> void nome(recebe 1 parametro do tipo de dados)
// Get -> retorna um tipo de valor correspondente ao atributo, e nao possui parametro

public float retornaBase(){
	return this.Base;
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
}