/**
 * @(#)Principal.java
 *
 *
 * @author
 * @version 1.00 2023/9/16
 */

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String args[]) {
    	byte acao = 0;
    	boolean chegou = false;
    	Viagem minhaViagem = new Viagem();
    	
    	do{
	    	acao = Byte.parseByte(JOptionPane.showInputDialog(null, "Informe qual acao voce deseja realizar:\n1 - Abastecer\n2 - Consultar o tanque" + 
	    															"\n3 - Consultar tempo de viagem\n4 - Consultar Velocidade Media\n5 - Realizar viagem "));
	    	switch(acao){
	    		case 1: 
	    			minhaViagem.abastecer();
	    			break;
	    	 	case 2:
	    	 		JOptionPane.showMessageDialog(null, "No momento o seu tanque possui " + minhaViagem.consultaCombustivel() + " de gasolina!");
	    			break;
	    		case 3:
	    	 		if(minhaViagem.consultaTempoViagem() < 1)
  						JOptionPane.showMessageDialog(null, "A duracao da viagem ate o momento e de " + (short)(minhaViagem.consultaTempoViagem() * 60) + " minutos!");
  					else
  						JOptionPane.showMessageDialog(null, "A duracao da viagem ate o momento e de " + (short)minhaViagem.consultaTempoViagem() + " horas e de " 
  															+ (short)((minhaViagem.consultaTempoViagem() - (short)minhaViagem.consultaTempoViagem()) * 60) + " minutos!");
	    			break;
	    		case 4: 
	    			if(minhaViagem.consultaTrechosViajados() == 0)
	    				JOptionPane.showMessageDialog(null, "Voce ainda nao realizou nenhum trecho da viagem, portanto sua velocidade media e de 0 km/h!");
	    			else
	    				JOptionPane.showMessageDialog(null, "A velocidade media ate agora percorrida e de " + minhaViagem.consultaVelocidadeMedia() + " km/h!");
	    			break;
    			case 5:
    				if(minhaViagem.consultaCombustivel() > 0){
    					if(!minhaViagem.realizar_viagem())
    	 					JOptionPane.showMessageDialog(null, "Voce percorreu um trecho da sua viagem, mas ainda nao chegou ao destino, abasteca novamente para prosseguir");
    	 				else
    	 					chegou = true;
    				} else
    					JOptionPane.showMessageDialog(null, "Voce nao pode viajar sem combustivel, tente abastecer!");
    				break;
	    		default:
	    			JOptionPane.showMessageDialog(null, "Essa opcao nao existe, informe uma acao de 1 a 5!");
    		}
    	}while(chegou == false);
    	
    	JOptionPane.showMessageDialog(null, "Voce chegou ao seu destino! Confira as estatisticas da viagem abaixo:" +
    										"\n\nDuracao total da viagem: " + (short)minhaViagem.consultaTempoViagem() + " hora(s) e " 
    										+ (short)((minhaViagem.consultaTempoViagem() - (short)minhaViagem.consultaTempoViagem()) * 60)+ " minuto(s)" +
    										"\nVelocidade media da viagem inteira: " + minhaViagem.consultaVelocidadeMedia() + " km/h" +
    										"\nQuantidade de trechos viajados: " + minhaViagem.consultaTrechosViajados() +
    										"\nCombustivel restante no tanque: " + (byte)(minhaViagem.consultaCombustivel()) + " litros" +
    										"\nDistancia total percorrida: " + minhaViagem.consultaDistanciaTotal() + " km");
    }
    
}