# Game1 - Jogo de Dados em Java

Este é um simples jogo de dados em Java para dois jogadores. Cada jogador lança um dado e vence quem tirar o maior valor. Em caso de empate, ambos jogam novamente.

## Como funciona

1. O programa solicita o nome dos dois jogadores.
2. Se os nomes forem iguais, adiciona " 1" e " 2" para diferenciá-los.
3. O usuário informa o número de faces do dado (mínimo 2).
4. Cada jogador joga o dado na sua vez.
5. Quem tirar o maior valor vence. Em caso de empate, jogam novamente.

## Estrutura dos arquivos

- `App.java`: Ponto de entrada do programa.
- `Jogador.java`: Classe que representa um jogador.
- `Dado.java`: Classe que representa o dado.
- `Jogo.java`: Lógica principal do jogo.
- `utilitarios/Teclado.java`: Utilitário para leitura de dados do teclado.

## Como executar

1. Compile todos os arquivos Java:
    ```sh
    javac src/*.java src/utilitarios/*.java
    ```
2. Execute o programa:
    ```sh
    java -cp src App
    ```

## Exemplo de uso

```
Digite o nome do primeiro Jogador : Ana
Digite o nome do segundo Jogador : Ana
Digite o número de faces do dado: 6

Ana 1, é sua vez!
Rodando dado: 4
Parou em :4
Ana 1, sua face: 4

------------------

Ana 2, é sua vez!
Rodando dado: 2
Parou em :2
Ana 2, sua face: 2

------------------

Ana 1, você venceu!
Placar: 4 x 2
```

---

Desenvolvido para fins
