# Estruturas de Dados Google Developer Student Club UTSG

## Array

Estrutura mais simples e direta para se guardar uma lista de valores, utilizada como base para muitas estruturas de dados. Pode ser usada para guardar uma lista (de nomes, numeros e outros valores) sem seguir regras definidas para inserção ou remoção.

Sua implementação interna varia de linguagem para linguagem. Em linguagens como Java ou C, arrays são estáticos por padrão. Isso significa que quando ele é iniciado, o programador deve ser explícito quanto ao seu tamanho. Caso ele deseje armazenar mais valores, será necessário instanciar um novo array com o tamanho desejado e transferir os valores do antigo para o novo.

Já em linguagens como Javascript, arrays são dinâmicos por padrão. Dessa forma, precisa-se instanciar o array apenas uma vez (sem declarar tamanho) e a linguagem realiza as operações necessárias para que o programador precise pensar apenas nas operações de inserção e remoção desejadas, sem se preocupar com o tamanho do vetor.

## Stacks

Estrutura útil para se guardar valores em formato que se assemelha à uma pilha, seguindo o modelo First In Last Out, em que o primeiro item inserido na pilha será o último a ser removido.

O funcionamento da Callstack de diversas linguagens de programação se baseia nessa estrutura. Quando uma função é chamada, ela é inserida na pilha de execução (callstack) até que seja completamente executada. Outras funções que são chamadas dentro da função original vão sendo empilhadas de maneira que a última chamada é removida da pilha ao ser completada.

## Queues

Estrututra análoga à pilha, com a diferença que segue o modelo First in First Out, em que o primeiro item inserido na pilha será o primeiro item a ser removido.

Filas podem ser utilizadas para mantermos registros de coisas que precisam ser executadas na ordem em que foram chamadas, porém o ambiente de execução não é tão rápido quanto a velocidade em que as coisas são chamadas. Um exemplo de uso de fila é o Event Loop interno do Javascript, que utiliza uma fila para guardar chamadas de funções assíncronas para serem executadas, começando pela chamada mais antiga. Quando a função retorna um valor (Mais precisamente falando, para o Javascript, é quando o método Promise.resolve() é chamado), ela é removida da fila e é iniciada a execução do próximo item da fila.

## Hash Tables

Tabelas hash são estruturas úteis para guardar valores quando desejamos obter tempo de acesso constante (O(1)). Elas utilizam um espaço fixo na memória, de forma que, dado um determinado índice, queremos sempre poder saber de antemão em qual endereço ele se encontra.

Isso é feito através de uma função hash, que recebe um valor e retorna um hash para ser utilizado como índice para armazenar algo na tabela. Dessa maneira, podemos sempre receber um índice e encontrá-lo imediatamente (ou então, descobrir que ele não está na tabela) passando-o como argumento para a função.

Tabelas hash são estruturas úteis em casos em que deseja-se guardar valores de forma que operações de leitura são mais frequentes do que operações de escrita. Isso se deve pelo fato de que tabelas hash precisam ser redimensionadas após determinado número de inserções, operação que pode ser custosa para o programa.

## (Singly) Linked List

Listas encadeadas são úteis para guardar valores quando não se sabe de antemão quantos valores precisarão ser guardados. Um exemplo de aplicação é o fato da lista encadeada ser usada internamente nas implementações de Arrays dinâmicos em diversas linguagens (arrays do Javascript ou o pacote ArrayList do Java).

## Binary Tree

Árvores são estruturas úteis para guardar dados de maneira hierárquica (Deseja-se que exista um dado central, com filhos que possuem filhos etc.).

Um exemplo de aplicação para as árvores (nesse caso, não necessariamente binárias), é para o sistema de arquivos em sistemas operacionais (geralmente utilizando árvores B e suas derivações).

Árvores binárias, quando balanceadas, são estruturas muito úteis para se armazenar dados de forma dinâmica e ainda mantendo performáticas as operações de leitura, inserção e remoção de dados.
