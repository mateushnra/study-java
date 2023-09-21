/**
 * @(#)Viagem.java
 *
 *
 * @author 
 * @version 1.00 2023/9/16
 */

import javax.swing.JOptionPane;

public class Viagem {
	
	private float consumoCombustivel;
	private float distanciaDestino;
	private float distanciaFalta;
	private float tempoViagem;
	private float tanqueCombustivel;
	private float somaVelocidadeMedia;
	private short qtdTrechosViajados;

    public Viagem() {
    	consumoCombustivel = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe quanto o seu veiculo percorre em km por litro de gasolina na pista: "));
    	distanciaDestino = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe qual a distancia em km para chegar ao seu destino: "));
    	distanciaFalta = distanciaDestino;
    	tempoViagem = 0;
    	tanqueCombustivel = 0;
    	somaVelocidadeMedia = 0;
    	qtdTrechosViajados = 0;
    }
    
    public float consultaCombustivel(){
  		return tanqueCombustivel;
  	}
  	
  	public float consultaTempoViagem(){
  		return tempoViagem;
  	}
  	
  	public short consultaTrechosViajados(){
  		return qtdTrechosViajados;
  	}
  	
  	public float consultaVelocidadeMedia(){
		return somaVelocidadeMedia / qtdTrechosViajados;
	}
	
	public float consultaDistanciaTotal(){
		return distanciaDestino;
	}
  	
  	public void abastecer(){
  		float qtd_abastecer = 0;
  		if(tanqueCombustivel < 50){
  			do{
  				qtd_abastecer = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe com quantos litros de gasolina seu tanque sera abastecido: "));
  				
  				if((tanqueCombustivel + qtd_abastecer) > 50)
  					JOptionPane.showMessageDialog(null, "Seu tanque nao suporta mais que 50 litros, abasteca com uma quantidade menor!");
  			}while(tanqueCombustivel + qtd_abastecer > 50);
  			tanqueCombustivel += qtd_abastecer;
  		} else if(tanqueCombustivel == 50)
  			JOptionPane.showMessageDialog(null, "Seu tanque esta cheio!");
  		  else 
  			JOptionPane.showMessageDialog(null, "O limite de seu tanque e de 50 litros!");
  	}
  	
  	private void calcularTempoViagem(float distanciaPercorrida, float velocidadeMediaTrecho){
  		tempoViagem +=	(distanciaPercorrida / velocidadeMediaTrecho);
  	}
  	
	private float definirVelocidade(){
		float velocidadeMediaTrecho;
		do{
			velocidadeMediaTrecho = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a velocidade media que sera percorrida em km/h para este trecho da viagem: "));
			if(velocidadeMediaTrecho < 20 || velocidadeMediaTrecho > 120)
					JOptionPane.showMessageDialog(null, "A velocidade deve ser maior que 19km/h e menor que 121km/h!");
		}while(velocidadeMediaTrecho < 20 || velocidadeMediaTrecho > 120);
		
		return velocidadeMediaTrecho;
	}
	
	public boolean realizar_viagem(){
  		float distanciaPercorrida = (tanqueCombustivel * consumoCombustivel);
  		float velocidadeMediaTrecho = definirVelocidade();
		distanciaFalta -= (tanqueCombustivel * consumoCombustivel);
		somaVelocidadeMedia += velocidadeMediaTrecho;
		qtdTrechosViajados++;
		
		if(distanciaFalta <= 0){
			tanqueCombustivel = (distanciaFalta * (-1)) / consumoCombustivel;
			distanciaPercorrida -= (tanqueCombustivel * consumoCombustivel);
			calcularTempoViagem(distanciaPercorrida, velocidadeMediaTrecho);
			return true;
		} else{
			tanqueCombustivel = 0;
			calcularTempoViagem(distanciaPercorrida, velocidadeMediaTrecho);
			return false;
		} 
  	}
}