Implemente uma classe **Endereco** que contenha os atributos *rua*, *nro*, *bairro*, *cep*, *cidade*. Defina o método **construtor** para que estes valores possam ser informados pelo usuário. Defina o método **nomeCidade** que retorna o valor do atributo em questão.

Implemente uma classe **Pessoa** que contenha os atributos *codigo*, *nome*, *endereco* (da classe **Endereco**) e *telefone*. Defina o método **construtor** para que estes valores possam ser informados pelo usuário. Defina o método **enderecoDaPessoa** que retorna o atributo *endereco*.

Implemente uma classe **PessoaJuridica** (sendo uma subclasse da classe Pessoa) que contenha os atributos *inscr_estadual*, *CNPJ* e *contato* (objeto da classe **Pessoa**). Defina o método **construtor** para que os atributos possam ser inicializados pelo usuário.

Implemente uma classe **PessoaFisica** (sendo uma subclasse da classe **Pessoa**) que contenha os atributos *profissao*, *data_nasc*, *pai* (objeto da classe **Pessoa**), *mae* (objeto da classe **Pessoa**), *RG* e *CPF*. Defina o método **construtor** para que os atributos possam ser inicializados pelo usuário. Defina o método **cidadeDoPai** que retorna o nome da cidade onde o pai da pessoa mora.

Na classe **Principal**, defina o método **main** declarando objeto *p1*, e *p2* da classe **Pessoa**, instancie *p1* como **PessoaJuridica**, *p2* como **PessoaFisica**, exiba o nome do contato da pessoa jurídica e a cidade do pai da pessoa física.
