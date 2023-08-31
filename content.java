//Coment�rio de uma linha em Java
/*Coment�rio de mais de uma linha em Java
 *
 * Cuidado ao utilizar acentua��o ou outros caracteres especiais, pois mesmo em coment�rios pode ocorrer erros.
 */


/*O public class indica a classe respons�vel por reconhecer esta aplica��o, e dentro dela � chamado primeiramente
 *o m�todo main(), onde se inicia a aplica��o.
 *
 *Tome cuidado com o nome da public class, pois o arquivo deve possuir o mesmo nome. Nesse caso � content, ent�o
 *o arquivo deve ser chamado de content.
 */
public class content {

//O main representa o m�todo principal da classe da aplica��o, portanto onde se inicia.
//O public indica que � acess�vel por outras classes externas
//O static � essencial para poder executar o m�todo main sem ter que criar um objeto da classe.
//O void representa uma fun��o que n�o retorna nada, apenas executa os comandos de dentro
/*(String args[]) ou (String[] args) � um argumento do m�todo main e do programa todo, sendo um vetor de strings formado
 quando � ou n�o passados argumentos atrav�s da invoca��o do nome do programa na linha de comando do sistema operacional*/
    public static void main(String args[]){
    	
    	//Comando que exibe no console dados(string,num�ricos,etc)
    	System.out.println("Hello World!");
    }
    
//Declara��es de v�riaveis, tipos primitivos e identificadores v�lidos e operadores b�sicos.
    public static void tipoDados(){
    	//Tipos de dados primitivos
    	byte n1; //inteiro que vai de -128 at� 127
    	short n2; //inteiro que vai de -32.768 at� 32.767
    	int n3; // inteiro que vai de -2.147.483.648 at� -2.147.483.647
    	long n4; // inteiro que vai de -9223372036854775808 at� 9223372036854775807
    	float n5; // Float de -/+ 3.40282347E+38F (7 digitos significativos aprox...)
    	double n6; // Float de -/+ 1.79769313486231570E+308 (15 digitos significativos)
    	char c1; // 0 at� 65536 (representa o caracter atrav�s da tabela ASCII)
    	boolean b1; // true ou flase
    	
    	//Identificadores v�lidos para vari�veis
    	int ident; int Ident; int iDENT; int Ide_n; int _Ide_nt; int $ident;
    	 
    	//Identificadores n�o v�lidos
    	int ����@#; //s�mbolos (exceto $ e _) e acentua��o
    	int 3Ident; //Iniciar com n�mero
    	int int; //Palavras reservadas
    	
    	//Operadores b�sicos
    	int num1 = 3, num2 = 4;
    	
    	num1 + num2; //Soma
    	num1 - num2; //Subtra��o
    	num1 * num2; //Multiplica��o
    	num1 / num2; //Divis�o
    	num1 % num2; //M�dulo (pegar resto da divis�o)
    	
    	//Declara��o de valores em vari�veis
    	
    	int numero = 5;
    	float float1 = 3.14f //Deve ser escrito f no final de um numero ponto flutuante
    	char char1 = "c", char2 = 'c'; //Aspas simples ou dupla para declara��o de char
    	boolean bool = true, bool2 = false; 
    }
    
//Concatena��o, express�es aritm�ticas, increment, decrement, operadores relacionais e l�gicos
    public static void operacoesConcatenacao(){
    	int x = 2, y = 3; boolean teste = true;
    	
    	//Concatena��o � representada pelo +
    	System.out.println("O valor de x + y �: " + x + y);
    	
    	//Express�o e operadores de atribui��o
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
    	x < y; // Compara��o de menor que
    	x > y; // Compara��o de maior que
    	x <= y; // Compara��o de menor ou igual que
    	x >= y; // Compara��o de maior ou igual que
    	
    	//Operadores l�gicos
    	x == 3 && y == 3; //Opera��o l�gica E (And)
    	x == 3 || y == 3; //Opera��o l�gica OU (Or)
    	!teste; //Verifica se a vari�vel � o valor de nega��o dela, no caso teste � true, ent�o verifica se teste � false
    }
    
//If, Else, Else IF, switch, while, do while e for, break e continue
    public static void ifSwitchWhileFor(){
    	int x = 1, y = 2; boolean teste = true;
    	
    	// O conte�do do if e de outros como while, for n�o necessita de {} em caso de o corpo seja apenas 1 linha
    	if(x == 1){
    		x++;
    	} //Funciona
    	
    	if(x == 1)//Funciona, por�m se houver outra linha abaixo do x++, dentro do if seria executado apenas a linha x++
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
    	
    	//Switch � �til caso necessite testar v�rios valores de uma mesma vari�vel
    	switch (x){ //Inicia o switch e informa a vari�vel em an�lise entre os ()
    		case 1: x++;//Verifica se o valor dela � o que vem depois do case e antes do :/ Caso afirmativo executa a linha depois
    			break; // O break termina o loop uma vez que foi encontrado o valor, sem ele continuaria rodando mesmo que encontrasse o valor e depois encerra o loop.
    		case 2: x--;
    			break;
    		case 3: x = 1;
    			break;
    		default: x = 0; //Exibe essa linha caso o valor da vari�vel n�o for encontrada em nenhum case
    	}
    	
    	//repeti��o com while (Primeiro verifica e depois executa o que est� dentro
    	while(x != 3){//para o looping quando a condi��o for diferente do informado, enquanto continua se a condi��o estiver de acordo com o informado
    		x++;// C�digo executado a cada looping
    		if(x == 2){
    			x--;
    			continue; // Encerra aqui o c�digo e volta ao inicio do looping
    			break; // O break tamb�m funciona aqui, encerrando o c�digo aqui e terminando o looping
    		}
    		y++;
    	}
    	
    	//repeti��o com do while (Primeiro executa e depois verifica)
    	do { // inicia o looping e c�digo do corpo do looping
    		x++;
    	} while(x != 3); //Verifica a condi��o
    	
    	//repeti��o com for
    	for(x = 0/*inicializa o que estiver aqui*/; x < 10 /*Condi��o verificada a cada looping*/); x++ /*executa o que estiver aqui a cada looping*/){
    		y++;//Corpo do c�digo executado a cada looping
    	}
    	
    }
}