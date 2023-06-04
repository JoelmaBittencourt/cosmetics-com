# Cosmetics com
Este projeto trata-se de uma implementação de um sistema de gerenciamento de produtos de uma loja de cosméticos.
O objetivo é fornecer uma estrutura básica para a criação e manipulação de diferentes tipos de produtos, como perfumes e maquiagens.

# Classe Produto

A classe abstrata `Produto` representa um produto genérico. Ela implementa as interfaces `Estoque` e `Desconto` e possui os seguintes atributos:

- `nome`: o nome do produto.
- `descricao`: uma breve descrição do produto.
- `preco`: o preço do produto.
- `marca`: a marca do produto.
- `estoque`: uma instância da interface `Estoque` que representa o estoque do produto.

A classe `Produto` possui um construtor que recebe os valores dos atributos mencionados acima.

Além disso, a classe possui os métodos getter e setter para cada atributo, permitindo acessá-los e modificá-los.

# Classe Perfumes

A classe `Perfumes` é uma subclasse de `Produto` e representa um produto do tipo perfume. Ela herda os atributos e métodos da classe `Produto`.

A classe `Perfumes` possui um construtor que chama o construtor da classe `Produto` para inicializar os atributos herdados.

Além disso, a classe pode implementar os métodos da interface `Estoque` e `Desconto` de acordo com suas necessidades.

# Classe Maquiagem

A classe `Maquiagem` é uma subclasse de `Produto` e representa um produto do tipo maquiagem. Ela herda os atributos e métodos da classe `Produto`.

A classe `Maquiagem` possui um construtor que chama o construtor da classe `Produto` para inicializar os atributos herdados.

Além disso, a classe pode implementar os métodos da interface `Estoque` e `Desconto` de acordo com suas necessidades.

A classe também possui um método específico `exibirDetalhesDeProduto()` que imprime informações adicionais sobre o produto, como o tipo e a cor da maquiagem.

Note que os métodos `removerProduto()`, `exibirStatusEstoque()` e `aplicarDesconto()` foram mencionados nas classes `Perfumes` e `Maquiagem`,
mas estão vazios no momento. Esses métodos podem ser implementados posteriormente de acordo com a lógica de negócio específica de cada classe.


# Como executar o projeto:

1. Faça o clone deste repositório para obter uma cópia local do código-fonte.

2. Abra o projeto em sua IDE de preferência. Certifique-se de que você tenha configurado o ambiente de desenvolvimento Java corretamente.

3. Compile o código-fonte para garantir que não há erros de compilação. Isso pode ser feito diretamente na IDE ou usando ferramentas de compilação como o Maven ou Gradle.

4. Localize a classe principal do projeto, que contém o método `main` para iniciar a aplicação. Geralmente, essa classe é identificada por um nome significativo, como "Main" ou "App".

5. Execute a classe principal. Isso iniciará a aplicação e executará o código contido no método `main`. Dependendo da IDE utilizada, você pode clicar com o botão direito na classe e selecionar a opção "Run" ou "Execute" para iniciar a aplicação.

6. A aplicação será executada e você poderá interagir com ela conforme definido no código do projeto.

# Contribuições:

Contribuições são bem-vindas! Se você encontrar algum problema, bug ou tiver sugestões de melhorias, sinta-se à vontade para contribuir com o projeto. Você pode fazer isso de várias maneiras:

- Enviando relatórios de problemas (issues) detalhados, descrevendo o problema encontrado.
- Propondo alterações e melhorias através de pull requests.
- Ajudando a documentar e melhorar a qualidade do código.