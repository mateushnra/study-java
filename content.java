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
    	float float1 = 3.14f //Deve ser escrito f no final de um numero ponto flutuante float
    	double float1 = 3.14d //Deve ser escrito d no final de um numero ponto flutuante double
    	char char1 = 'c'; //Aspas simples apenas, sendo aspas duplas para String
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
    	
    	// O conte�do do if e de outros como while e for n�o necessita de {} em caso de que o corpo seja apenas 1 linha
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
   
//Vetor e matriz
    public static void vetorMatriz(){
    	//VETOR
    	int[] vet = new int [3];//Declarando um vetor do tipo inteiro
    	int vet[] = new int [3];//A ordem do primeiro [] n�o importa, ou seja, pode ser ao lado do int ou do vet
    	
    	int tam = 3;//Declarando uma variavel para controle de tamanho do vetor
      	int[] vet = new int[tam];//Declarando o vetor com tamanho correspondente a variavel de controle
      	
      	int[] vet = {3,2,5,1,7};//Declarando os valores diretamente na inicializa��o do vetor
    	
    	//MATRIZ
    	int[][] mat = new int[3][5];
    	int mat[][] = new int[3][5];
    	
    	int[][] mat = {{1,2}, {3,4}, {5,6}};
    	
    	//LENGTH
    	vet.length; //Retorna a quantidade de posi��es do vetor
    	mat.length; //Retorna a quantidade de vetores dentro da matriz	
    }
    
//Strings
	public static void string(){
		//Uma variavel String � um objeto da classe String
		String nome = "Sou uma string";//Declara��o de uma string
		String nome = new String("Sou uma string");//Declara��o de uma string de outra forma, instanciando o objeto chamando o construtor
		
		//Concatena��o
		String str1 = "Ol�";
		String str2 = " Mundo!";
		String str1+= str2;//Sa�da = "Ol� Mundo!"
		
		//Length para string
		str1.length();//Retorna a quantidade caracteres que existe na string, precisa ter o (), pois � um m�todo da classe String
		
		//CharAt
		str1.charAt(0);//Retorna um valor char referente a respectiva posi��o da String, com indices semelhantes a um vetor, sendo 0 a primeira posi��o.
		
		//substring
		str1 = str1.substring(0,2);//Pega da string desde a posi��o 0 at� a segunda posi��o - 1, ou seja, como ali � 2, ser� exibido 0 e 1 apenas, sendo a saida = "Ol"
		
		//Upper Case e Lower Case
		str1 = str1.toUpperCase();//Deixa tudo em mai�sculo
		str1 = str1.toLowerCase();//Deixa tudo min�sculo
		
		//IndexOf
		str1.indexOf("Ol");//Retorna a posi��o da primeira letra da string digitada, se houver mais de uma sequ�ncia semelhante a Ol na string ele pegar� a primeira. Caso digite uma sequ�ncia n�o existente na String, uma letra maiscula em vez de minuscula ou um caracter n�o existente, ser� retornado -1
		
		//Equals
		str1.equals("Ol�");//Retorna um boolean caso a string seja igual ao valor digitado, considerando que � case Sensitive. Nesse caso retornaria true
		
		//String Value
		//Retorna uma String do valor n�merico digitado
		String.valueOf(3);
		String.valueOf(1.39131412d);
		
		//Convers�o de um valor em string para numerico ou boolean
		boolean bool; int inteiro, float flutuante;
		
		bool = Boolean.parseBoolean("true");
		inteiro = Integer.parseInt("3");
		flutuante = Float.parseFloat("3.14");
	}	
		
//Biblioteca de input de dados JOptionPane
import javax.swing.JOptionPane;//Importa a biblioteca no inicio do programa

	public static void inputDados(){
		String inputText
		short inputNum;
		
		//O m�todo de input sempre recebe um valor String, portanto caso deseje receber um valor numerico deve ser convertido o numero em string para o respectivo tipo
		inputText = JOptionPane.showInputDialog(null, "Informe o texto para armazenar na variavel inputText: ");
		inputNum = Short.parseShort(JOptionPane.showInputDialog(null, "Informe um numero para ser convertido em short e armazenado na variavel inputNum: "));
		
		//Para apenas exibir uma mensagem utilize o seguinte comando da biblioteca
		JOptionPane.showMessageDialog(null, "Mensagem a ser exibida!");
	}

//Classe, atributos, encapsulamento, construtor, m�todos e sobrecarga
	public static void classeAtributosEncapsulamentoConstrutorMetodos(){
		public class NomeClasse {//Criando uma classe
			
			//Atributos da classe podem ser private(s� a propria classe acessa), public(Qualquer lugar acessa) e protected(apenas a propria classe e classes filhas podem acessar)
			private float num;//Atributo da classe do tipo float
			private String texto;//Atributo da classe do tipo String
			protected boolean teste;//Atributo da classe do tipo boolean
			
			//Construtor deve ser apenas public e o nome da Classe identicamente ao declarado acima, � poss�vel passar parametros ou inicializar variaveis diretamente dentro do escopo do c�digo sem passar nada
			public NomeClasse(float a, String txt){
				this.num = a;
				this.texto = txt;
				this.teste = true;
			}
			
			//Sobrecarga do construtor
			public NomeClasse(float a){//A sobrecarga se da pela cria��o de dois m�todos com nomes identicos, mudando assim os parametros que receber�o, portanto ao chamar o m�todo qual ser� chamado � identificado pelos parametros diferentes e os valores respectivos passados
				this.num = a;
				this.texto = "texto";
				this.teste = true;
			}
			
			//M�todos em uma classe
			
			//O m�todo do tipo void executa o que esta dentro e n�o retorna nada
			public void metodoVazio(){
				
			}
			
			//retorna um valor do tipo String
			public String metodoString(){
				return "String";
			}
			
			//retorna um valor do tipo float
			public float metodoFloat(){
				return 3.1231f;
			}
		}
	}
	
//Heran�a, Polimorfismo, Agrega��o, Abstra��o
	public static void herancaPolimorfismoAgregacaoAbstracao(){
		public abstract class ClasseAbstrataPai{//Declara��o de uma classe Abstrata � indicada com abstract, assim, ela apenas serve para passar m�todos e atributos, n�o podendo ser instanciada.
			protected String cpf;
			
			public ClasseAbstrataPai(){
				cpf = "113.123.123-23";
			}
			
			public abstract void metodoAbstrato();//O m�todo comum as classes filhas � declarada aqui na classe abstrata sem nenhuma implementa��o, por�m na classe filha � modificado.
		}
		
		public class ClasseConcretaFilha extends ClasseAbstrataPai{
			protected String rg;
			
			public ClasseConcretaFilha(){
				super();
				rg = "13123123-23";
			}
			
			public void metodoAbstrato(){//M�todo abstrato sendo executado!
				System.out.println("Seu rg �: " + this.rg + ". Seu cpf �: " + super.cpf);
			}
		}
		
		public class SuperClasse{
			protected String nome;
			protected short idade;
			protected ClasseConcretaFilha objetoAgregado;//declara a existencia de um atributo que � um objeto de outra classe, assim poder� futuramente acessar seus m�todos atrav�s desse objeto
			
			public SuperClasse(String nome){
				this.nome = nome;
				idade = 18;//Funciona sem o this tamb�m, desde que o nome esteja correto e n�o haja conflito de variavel identica
				objetoAgregado = new ClasseConcretaFilha();//Instancia o objeto, assim fazendo que seja executado o conceito de agrega��o
			}
			
			public void metodoPolimorfismo(){
				idade += 2;//Codigo qualquer
			}
		}
		
		public class ClasseFilha1 extends SuperClasse{//O extends indica que esta classe esta herdando a classe SuperClasse
			private float salario;
			
			public ClasseFilha1(String nome, float salario){//Al�m do atributo da propria classe, caso no construtor da classe pai haja parametros, � necess�rio coloca-lo na ordem
				super();//Chama o m�todo construtor da classe pai, assim gerando os valores nome e idade
				this.salario = salario;
			}
			
			public void metodoPolimorfismo(){//m�todo passa por um polimorfismo, pois a classe pai j� tem uma execu��o definida para o m�todo, por�m a filha altera e chama de um jeito diferente
				idade += 3;
			}
		}
		
		public class ClasseFilha2 extends SuperClasse{//Outra classe filha para compara��o
			private float comissao;
			
			public ClasseFilha2(float com){
				comissao = com;	
			}
			
			//M�todo existente na classe pai, por�m o c�digo da filha � diferente tanto da outra classe filha como da pai.
			public void metodoPolimorfismo(){
				idade -= 3;
			}
		}
		
		//Simulando o programa main onde ser� executado e instanciado as classes
		public static void main(){
			ClasseFilha1 c1 = new ClasseFilha1(); //Cria uma variavel objeto da classe ClasseFilha1, e instancia como ClasseFilha1(), portanto o correto seria falar que n�o h� polimorfismo aqui
			SuperClasse c2 = new ClasseFilha(); // Agora aqui existe polimorfismo, pois esta sendo criado um objeto da SuperClasse, por�m sendo instanciado como ClasseFilha, portanto qualquer modifica��o de um m�todo da SuperClasse ser� executado de acordo com a filha.
			
			c2.metodoPolimorfismo();//Chama o m�todo da classe pai, por�m sendo modificado pela filha atrav�s do polimorfismo
			c1.metodoPolimorfismo();//Chama o m�todo da classe filha diretamente, portatno n�o � exatamente um polimorfismo
		}
	}
	
//Tratamento de erro
	public static void tratamentoErro(){
		String txt = null;//Declarar uma String nula
		
        try{//Neste bloco caso o que seja executado gere algum erro, ele ir� procurar a exce��o do erro nos catch abaixo.
  			txt = txt.toUpperCase();//vai dar erro, pois n�o tem como transformar em upper case algo nulo	
		}catch(ArithmeticException e){//Esse catch procura um erro de aritmetica, por�m n�o se trata desse erro o listado acima, caso fosse, seria executado o bloco abaixo
			System.out.println("Erro aritmetico");
		}catch(Exception e){//Esse catch pega qualquer erro, como n�o � o erro de cima, ent�o cair� nesse, que alterar� o texto para algo valido
			txt = "Correcao do erro";
		}finally{//O finally � executado independentemente se houve erro ou n�o, por�m � executado por �ltimo, ap�s o try ou catch.
			System.out.println(txt);
		}
	}
}





