# Segunda Atividade de Sistemas Operacionais

## Discente: Gabriel Rodrigues Barbosa

# Simulação de Uso de Semáforos e Threads

Este projeto foi desenvolvido para simular o uso de semáforos e threads em Java. O objetivo é demonstrar como threads podem ser sincronizadas usando semáforos para controlar o acesso concorrente a recursos compartilhados, como panelas e frigideiras.

## Desenvolvimento

O projeto consiste em duas classes principais:

- `Fogao.java`: Contém a implementação dos métodos `usarPanela()` e `usarFrigideira()` que simulam o uso de panelas e frigideiras, respectivamente.
- `App.java`: Classe principal que executa o código da simulação.

## Como Executar o Código

Para executar o código, siga os passos abaixo:

1. Abra o terminal.
2. Navegue até o diretório que contém os arquivos `Fogao.java` e `App.java`.
3. Compile o código usando o comando:
    ```bash
    javac App.java
    ```
4. Execute o programa usando o comando:
    ```bash
    java App
    ```

Por favor, note que a linguagem Java diferencia maiúsculas de minúsculas, então certifique-se de usar `java` e `javac` em letras minúsculas.

## Descrição do Código

A classe `Fogao` implementa os métodos `usarPanela()` e `usarFrigideira()`, que simulam o uso de panelas e frigideiras, respectivamente. Estes métodos são sincronizados para garantir o acesso seguro aos recursos compartilhados. A classe `App` cria e executa múltiplas threads que utilizam esses métodos para simular o uso concorrente do fogão.

O código Java contém comentários explicativos para facilitar o entendimento.

## Desenvolvimento

O código foi desenvolvido usando o Visual Studio Code e linguagem java versão 21.0.1
