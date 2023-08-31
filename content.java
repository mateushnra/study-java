//Comentário de uma linha em Java
/*Comentário de mais de uma linha em Java
 *
 * Cuidado ao utilizar acentuação ou outros caracteres especiais, pois mesmo em comentários pode ocorrer erros.
 */


/*O public class indica a classe responsável por reconhecer esta aplicação, e dentro dela é chamado primeiramente
 *o método main(), onde se inicia a aplicação.
 *
 *Tome cuidado com o nome da public class, pois o arquivo deve possuir o mesmo nome. Nesse caso é content, então
 *o arquivo deve ser chamado de content.
 */
public class content {

//O main representa o método principal da classe da aplicação, portanto onde se inicia.
//O public indica que é acessível por outras classes externas
//O static é essencial para poder executar o método main sem ter que criar um objeto da classe.
//O void representa uma função que não retorna nada, apenas executa os comandos de dentro
/*(String args[]) ou (String[] args) é um argumento do método main e do programa todo, sendo um vetor de strings formado
 quando é ou não passados argumentos através da invocação do nome do programa na linha de comando do sistema operacional*/
    public static void main(String args[]){
    	
    	//Comando que exibe no console dados(string,numéricos,etc)
    	System.out.println("Hello World!");
    }
    
//Declarações de váriaveis, tipos primitivos e identificadores válidos e operadores básicos.
    public static void tipoDados(){
    	//Tipos de dados primitivos
    	byte n1; //inteiro que vai de -128 até 127
    	short n2; //inteiro que vai de -32.768 até 32.767
    	int n3; // inteiro que vai de -2.147.483.648 até -2.147.483.647
    	long n4; // inteiro que vai de -9223372036854775808 até 9223372036854775807
    	float n5; // Float de -/+ 3.40282347E+38F (7 digitos significativos aprox...)
    	double n6; // Float de -/+ 1.79769313486231570E+308 (15 digitos significativos)
    	char c1; // 0 até 65536 (representa o caracter através da tabela ASCII)
    	boolean b1; // true ou flase
    	
    	//Identificadores válidos para variáveis
    	int ident; int Ident; int iDENT; int Ide_n; int _Ide_nt; int $ident;
    	 
    	//Identificadores não válidos
    	int áèêã@#; //símbolos (exceto $ e _) e acentuação
    	int 3Ident; //Iniciar com número
    	int int; //Palavras reservadas
    	
    	//Operadores básicos
    	int num1 = 3, num2 = 4;
    	
    	num1 + num2; //Soma
    	num1 - num2; //Subtração
    	num1 * num2; //Multiplicação
    	num1 / num2; //Divisão
    	num1 % num2; //Módulo (pegar resto da divisão)
    	
    	//Declaração de valores em variáveis
    	
    	int numero = 5;
    	float float1 = 3.14f //Deve ser escrito f no final de um numero ponto flutuante
    	char char1 = "c", char2 = 'c'; //Aspas simples ou dupla para declaração de char
    	boolean bool = true, bool2 = false; 
    }
    
//Concatenação, expressões aritméticas, increment, decrement, operadores relacionais e lógicos
    public static void operacoesConcatenacao(){
    	int x = 2, y = 3; boolean teste = true;
    	
    	//Concatenação é representada pelo +
    	System.out.println("O valor de x + y é: " + x + y);
    	
    	//Expressão e operadores de atribuição
    	x = y = 0; //y recebe 0, e x recebe y, portanto recebe 0
    	x += y; // Mesmo que x = x + y
    	x -= y; // Mesmo que x = x - y
    	x *= y; // Mesmo que x = x * y
    	x /= y; // Mesmo que x = x / y
    	
    	
    	//Incremen e Decrement e sufixo e prefixo
    	x = y++; x = y--;  // Sufixo: resulta em x receber o valor de y sem o incremento/decremento
    	x = ++y; x = --y;// Prefixo: resulta em x receber o valor de y com o incremento/decremento
    	
    	//Operadores Relacionais
    	x == y; // Igualdade 
    	x != y; // Diferente 
    	x < y; // Comparação de menor que
    	x > y; // Comparação de maior que
    	x <= y; // Comparação de menor ou igual que
    	x >= y; // Comparação de maior ou igual que
    	
    	//Operadores lógicos
    	x == 3 && y == 3; //Operação lógica E (And)
    	x == 3 || y == 3; //Operação lógica OU (Or)
    	!teste; //Verifica se a variável é o valor de negação dela, no caso teste é true, então verifica se teste é false
    }
    
//If, Else, Else IF, switch, while, do while e for, break e continue
    public static void ifSwitchWhileFor(){
    	int x = 1, y = 2; boolean teste = true;
    	
    	// O conteúdo do if e de outros como while, for não necessita de {} em caso de o corpo seja apenas 1 linha
    	if(x == 1){
    		x++;
    	} //Funciona
    	
    	if(x == 1)//Funciona, porém se houver outra linha abaixo do x++, dentro do if seria executado apenas a linha x++
    		x++;
    		
    	// If e Else
    	if(x == 2){
    		x++;
    	} else{
    		x--;
    	}
    	
    	// If ninhado (else if)
    	if(x == 3){
    		x++;
    	} else if(x == 2){
    		x--;
    	} else {
    		x = 0;
    	}
    	
    	//Switch é útil caso necessite testar vários valores de uma mesma variável
    	switch (x){ //Inicia o switch e informa a variável em análise entre os ()
    		case 1: x++;//Verifica se o valor dela é o que vem depois do case e antes do :/ Caso afirmativo executa a linha depois
    			break; // O break termina o loop uma vez que foi encontrado o valor, sem ele continuaria rodando mesmo que encontrasse o valor e depois encerra o loop.
    		case 2: x--;
    			break;
    		case 3: x = 1;
    			break;
    		default: x = 0; //Exibe essa linha caso o valor da variável não for encontrada em nenhum case
    	}
    	
    	//repetição com while (Primeiro verifica e depois executa o que está dentro
    	while(x != 3){//para o looping quando a condição for diferente do informado, enquanto continua se a condição estiver de acordo com o informado
    		x++;// Código executado a cada looping
    		if(x == 2){
    			x--;
    			continue; // Encerra aqui o código e volta ao inicio do looping
    			break; // O break também funciona aqui, encerrando o código aqui e terminando o looping
    		}
    		y++;
    	}
    	
    	//repetição com do while (Primeiro executa e depois verifica)
    	do { // inicia o looping e código do corpo do looping
    		x++;
    	} while(x != 3); //Verifica a condição
    	
    	//repetição com for
    	for(x = 0/*inicializa o que estiver aqui*/; x < 10 /*Condição verificada a cada looping*/); x++ /*executa o que estiver aqui a cada looping*/){
    		y++;//Corpo do código executado a cada looping
    	}
    	
    }
}