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
    	float float1 = 3.14f //Deve ser escrito f no final de um numero ponto flutuante float
    	double float1 = 3.14d //Deve ser escrito d no final de um numero ponto flutuante double
    	char char1 = 'c'; //Aspas simples apenas, sendo aspas duplas para String
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
    	
    	// O conteúdo do if e de outros como while e for não necessita de {} em caso de que o corpo seja apenas 1 linha
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
   
//Vetor e matriz
    public static void vetorMatriz(){
    	//VETOR
    	int[] vet = new int [3];//Declarando um vetor do tipo inteiro
    	int vet[] = new int [3];//A ordem do primeiro [] não importa, ou seja, pode ser ao lado do int ou do vet
    	
    	int tam = 3;//Declarando uma variavel para controle de tamanho do vetor
      	int[] vet = new int[tam];//Declarando o vetor com tamanho correspondente a variavel de controle
      	
      	int[] vet = {3,2,5,1,7};//Declarando os valores diretamente na inicialização do vetor
    	
    	//MATRIZ
    	int[][] mat = new int[3][5];
    	int mat[][] = new int[3][5];
    	
    	int[][] mat = {{1,2}, {3,4}, {5,6}};
    	
    	//LENGTH
    	vet.length; //Retorna a quantidade de posições do vetor
    	mat.length; //Retorna a quantidade de vetores dentro da matriz	
    }
    
//Strings
	public static void string(){
		//Uma variavel String é um objeto da classe String
		String nome = "Sou uma string";//Declaração de uma string
		String nome = new String("Sou uma string");//Declaração de uma string de outra forma, instanciando o objeto chamando o construtor
		
		//Concatenação
		String str1 = "Olá";
		String str2 = " Mundo!";
		String str1+= str2;//Saída = "Olá Mundo!"
		
		//Length para string
		str1.length();//Retorna a quantidade caracteres que existe na string, precisa ter o (), pois é um método da classe String
		
		//CharAt
		str1.charAt(0);//Retorna um valor char referente a respectiva posição da String, com indices semelhantes a um vetor, sendo 0 a primeira posição.
		
		//substring
		str1 = str1.substring(0,2);//Pega da string desde a posição 0 até a segunda posição - 1, ou seja, como ali é 2, será exibido 0 e 1 apenas, sendo a saida = "Ol"
		
		//Upper Case e Lower Case
		str1 = str1.toUpperCase();//Deixa tudo em maiúsculo
		str1 = str1.toLowerCase();//Deixa tudo minúsculo
		
		//IndexOf
		str1.indexOf("Ol");//Retorna a posição da primeira letra da string digitada, se houver mais de uma sequência semelhante a Ol na string ele pegará a primeira. Caso digite uma sequência não existente na String, uma letra maiscula em vez de minuscula ou um caracter não existente, será retornado -1
		
		//Equals
		str1.equals("Olá");//Retorna um boolean caso a string seja igual ao valor digitado, considerando que é case Sensitive. Nesse caso retornaria true
		
		//String Value
		//Retorna uma String do valor númerico digitado
		String.valueOf(3);
		String.valueOf(1.39131412d);
		
		//Conversão de um valor em string para numerico ou boolean
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
		
		//O método de input sempre recebe um valor String, portanto caso deseje receber um valor numerico deve ser convertido o numero em string para o respectivo tipo
		inputText = JOptionPane.showInputDialog(null, "Informe o texto para armazenar na variavel inputText: ");
		inputNum = Short.parseShort(JOptionPane.showInputDialog(null, "Informe um numero para ser convertido em short e armazenado na variavel inputNum: "));
		
		//Para apenas exibir uma mensagem utilize o seguinte comando da biblioteca
		JOptionPane.showMessageDialog(null, "Mensagem a ser exibida!");
	}

//Classe, atributos, encapsulamento, construtor, métodos e sobrecarga
	public static void classeAtributosEncapsulamentoConstrutorMetodos(){
		public class NomeClasse {//Criando uma classe
			
			//Atributos da classe podem ser private(só a propria classe acessa), public(Qualquer lugar acessa) e protected(apenas a propria classe e classes filhas podem acessar)
			private float num;//Atributo da classe do tipo float
			private String texto;//Atributo da classe do tipo String
			protected boolean teste;//Atributo da classe do tipo boolean
			
			//Construtor deve ser apenas public e o nome da Classe identicamente ao declarado acima, é possível passar parametros ou inicializar variaveis diretamente dentro do escopo do código sem passar nada
			public NomeClasse(float a, String txt){
				this.num = a;
				this.texto = txt;
				this.teste = true;
			}
			
			//Sobrecarga do construtor
			public NomeClasse(float a){//A sobrecarga se da pela criação de dois métodos com nomes identicos, mudando assim os parametros que receberão, portanto ao chamar o método qual será chamado é identificado pelos parametros diferentes e os valores respectivos passados
				this.num = a;
				this.texto = "texto";
				this.teste = true;
			}
			
			//Métodos em uma classe
			
			//O método do tipo void executa o que esta dentro e não retorna nada
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
	
//Herança, Polimorfismo, Agregação, Abstração
	public static void herancaPolimorfismoAgregacaoAbstracao(){
		public abstract class ClasseAbstrataPai{//Declaração de uma classe Abstrata é indicada com abstract, assim, ela apenas serve para passar métodos e atributos, não podendo ser instanciada.
			protected String cpf;
			
			public ClasseAbstrataPai(){
				cpf = "113.123.123-23";
			}
			
			public abstract void metodoAbstrato();//O método comum as classes filhas é declarada aqui na classe abstrata sem nenhuma implementação, porém na classe filha é modificado.
		}
		
		public class ClasseConcretaFilha extends ClasseAbstrataPai{
			protected String rg;
			
			public ClasseConcretaFilha(){
				super();
				rg = "13123123-23";
			}
			
			public void metodoAbstrato(){//Método abstrato sendo executado!
				System.out.println("Seu rg é: " + this.rg + ". Seu cpf é: " + super.cpf);
			}
		}
		
		public class SuperClasse{
			protected String nome;
			protected short idade;
			protected ClasseConcretaFilha objetoAgregado;//declara a existencia de um atributo que é um objeto de outra classe, assim poderá futuramente acessar seus métodos através desse objeto
			
			public SuperClasse(String nome){
				this.nome = nome;
				idade = 18;//Funciona sem o this também, desde que o nome esteja correto e não haja conflito de variavel identica
				objetoAgregado = new ClasseConcretaFilha();//Instancia o objeto, assim fazendo que seja executado o conceito de agregação
			}
			
			public void metodoPolimorfismo(){
				idade += 2;//Codigo qualquer
			}
		}
		
		public class ClasseFilha1 extends SuperClasse{//O extends indica que esta classe esta herdando a classe SuperClasse
			private float salario;
			
			public ClasseFilha1(String nome, float salario){//Além do atributo da propria classe, caso no construtor da classe pai haja parametros, é necessário coloca-lo na ordem
				super();//Chama o método construtor da classe pai, assim gerando os valores nome e idade
				this.salario = salario;
			}
			
			public void metodoPolimorfismo(){//método passa por um polimorfismo, pois a classe pai já tem uma execução definida para o método, porém a filha altera e chama de um jeito diferente
				idade += 3;
			}
		}
		
		public class ClasseFilha2 extends SuperClasse{//Outra classe filha para comparação
			private float comissao;
			
			public ClasseFilha2(float com){
				comissao = com;	
			}
			
			//Método existente na classe pai, porém o código da filha é diferente tanto da outra classe filha como da pai.
			public void metodoPolimorfismo(){
				idade -= 3;
			}
		}
		
		//Simulando o programa main onde será executado e instanciado as classes
		public static void main(){
			ClasseFilha1 c1 = new ClasseFilha1(); //Cria uma variavel objeto da classe ClasseFilha1, e instancia como ClasseFilha1(), portanto o correto seria falar que não há polimorfismo aqui
			SuperClasse c2 = new ClasseFilha(); // Agora aqui existe polimorfismo, pois esta sendo criado um objeto da SuperClasse, porém sendo instanciado como ClasseFilha, portanto qualquer modificação de um método da SuperClasse será executado de acordo com a filha.
			
			c2.metodoPolimorfismo();//Chama o método da classe pai, porém sendo modificado pela filha através do polimorfismo
			c1.metodoPolimorfismo();//Chama o método da classe filha diretamente, portatno não é exatamente um polimorfismo
		}
	}
	
//Tratamento de erro
	public static void tratamentoErro(){
		String txt = null;//Declarar uma String nula
		
        try{//Neste bloco caso o que seja executado gere algum erro, ele irá procurar a exceção do erro nos catch abaixo.
  			txt = txt.toUpperCase();//vai dar erro, pois não tem como transformar em upper case algo nulo	
		}catch(ArithmeticException e){//Esse catch procura um erro de aritmetica, porém não se trata desse erro o listado acima, caso fosse, seria executado o bloco abaixo
			System.out.println("Erro aritmetico");
		}catch(Exception e){//Esse catch pega qualquer erro, como não é o erro de cima, então cairá nesse, que alterará o texto para algo valido
			txt = "Correcao do erro";
		}finally{//O finally é executado independentemente se houve erro ou não, porém é executado por último, após o try ou catch.
			System.out.println(txt);
		}
	}
}





