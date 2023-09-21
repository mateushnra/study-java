/**
 * @(#)Cartao.java
 *
 *
 * @author 
 * @version 1.00 2023/9/14
 */

import javax.swing.JOptionPane;

public class Cartao {
	
	private int Senha;

    public Cartao() {
    	this.CadastrarSenha();
    }
    
   	public boolean VerificarSenha(){
   			int verificaSenha = Integer.parseInt(JOptionPane.showInputDialog(null, "informe sua senha: "));
   			
   			if(Senha == verificaSenha)
   				return true;
   			else
   				return false;
   	}
    
    private void CadastrarSenha(){
    	int Senha1, Senha2;
    	
    	do{
    		Senha1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe qual sera a sua senha: "));
    		Senha2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Confirme a senha: "));
    		
    	}while(Senha1 != Senha2);
    	
    	Senha = Senha1;
    }
    
    public boolean AlterarSenha(){
    	if(this.VerificarSenha()){
    		this.CadastrarSenha();
    		return true;
    	}else
    		return false;
    }
    
}