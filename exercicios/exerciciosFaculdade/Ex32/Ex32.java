/**
 * @(#)Ex32.java
 *
 *
 * @author 
 * @version 1.00 2023/9/25
 */

import javax.swing.JOptionPane;

public class Ex32 {

    public static void main(String[] args){
    	 Vendedor e1 = new Vendedor();
    	 Gerente e2 = new Gerente();
    	 Horista e3 = new Horista();
    	 
    	 if(e1.valor_do_salario() > e2.valor_do_salario() && e1.valor_do_salario() > e3.valor_do_salario()){
    	 	JOptionPane.showMessageDialog(null,"Nome: " + e1.nome_do_funcionario() + 
    	 								  "\nNumero: " + e1.numero_funcional() +
    	 								  "\nSalario: " + e1.valor_do_salario());
    	 }else if (e2.valor_do_salario() > e1.valor_do_salario() && e2.valor_do_salario() > e3.valor_do_salario()){
    	 	JOptionPane.showMessageDialog(null,"Nome: " + e2.nome_do_funcionario() + 
    	 								  "\nNumero: " + e2.numero_funcional() +
    	 								  "\nSalario: " + e2.valor_do_salario());
    	 }else{
    	 	JOptionPane.showMessageDialog(null,"Nome: " + e3.nome_do_funcionario() + 
    	 								  "\nNumero: " + e3.numero_funcional() +
    	 								  "\nSalario: " + e3.valor_do_salario());
    	 }
    }
}