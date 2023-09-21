Considerando a implementação da classe **Media** exibida a seguir:

```
public class Media {
    private float soma;
    private int contador;

    public Media(){
        this.soma = 0;
        this.contador = 1;
    }

    public void acrescenta(int i){
        this.soma += i;
        this.contador++;
    }

    public float media_atual(){
        return this.soma / this.contador;
    }
}
```

Implemente uma classe **MaiorMenor** como uma subclasse da classe **Media** possuindo como atributos *maior* e *menor* (float) que devem armazenar respectivamente o maior e o menor número somado para se calcular a média. O método construtor deve somente chamar o construtor da superclasse. Sobrecarregue o método **acrescenta** (que recebe como parâmetro um valor real) de forma que, antes de chamar o **acrescenta** da superclasse, verifique se este não é o maior ou o menor número e faça as devidas atualizações. Defina também os métodos **maior_numero** e **menor_numero** que devem retornar respectivamente os valores dos atributos **maior** e **menor**.

Na classe principal (dentro da função main) declare e crie um objeto *m* da classe **MaiorMenor**, estabeleça um laço para o usuário possa digitar um número, faça a chamada do método **acrescenta** (da classe **MaiorMenor**) passando este número como parâmetro (obs.: o usuário deve digitar 0 para interromper o laço). Exiba o valor da média calculada, o maior e o menor número digitado pelo usuário.
