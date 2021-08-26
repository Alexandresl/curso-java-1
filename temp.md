### 41. Escopo e inicialização

* *Escopo de uma variável*: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
* Uma variável não pode ser usada se não for iniciada.
* Falaremos de escopo de método no Capítulo 5.

[Exemplo](ws-eclipse/s5/aula41-exemplo1/src/Main.java)

## Seção 6: Estruturas repetitivas

### 42. Visão geral do capítulo

### 43. Material de apoio do capítulo

[Material Estruturas Repetitivas](PDFs/Aula%20041%20-%20Estruturas%20repetitivas.pdf)

### 44. Como utilizar o DEBUG no Eclipse (Execução passo a passo)

* Para marcar uma linha de breakpoint:
  * *Run* -> *Toggle Breakpoint*
* Para iniciar o debug:
  * Botão direito na classe -> *Debug as* -> *Java Aplication*
* Para executar uma linha:;
  * *F6*
* Para interromper o debug:
  * botão *stop*

[Exemplo](ws-eclipse/s06/aula44-exemplo1/src/Main.java)

### 45. Estrutura repetitiva enquanto (while)

* É uma *estrutura de controle* que *repete* um bloco de comandos *enquanto* uma *condição* for verdadeira.
* *Quando usar*: quando **não** se sabe previamente a quantidade de repetições que será realizada.

#### Sintaxe

```java
while ( condicao ) {
  comando 1;
  comando 2;
}

// regra:
// Condição verdadeira: executa e volta
// Condição falsa: pula fora
```

[Exemplo](ws-eclipse/s06/aula45-exemplo1/src/Main.java)

### 46. Teste de mesa com estrutura repetitiva enquanto

### 47. Exercícios de teste de mesa com while

### 48. AVISO: exercícios para iniciantes PARTE 3

### 49. Exercícios para iniciantes - PARTE 3

[Lista de exercícios](PDFs/Aula%20047%20-%20Exercício%203.pdf)

#### Exercícios resolvidos

[Exercício resolvido 1](https://www.youtube.com/watch?v=r3qCFqaNHds)
[Código fonte](ws-eclipse/s06/aula49-exemplo1/src/Main.java)

[Exercício resolvido 2](https://www.youtube.com/watch?v=vT0QEDHK2yU)
[Código fonte](ws-eclipse/s06/aula49-exemplo2/src/Main.java)

#### Exercícios propostos

[Exercício 1](ws-eclipse/s06/aula49-exercicio1/src/Main.java)

[Exercício 2](ws-eclipse/s06/aula49-exercicio2/src/Main.java)

[Exercício 3](ws-eclipse/s06/aula49-exercicio3/src/Main.java)

### 50. Estrutura repetitiva (for)

* A restrutura repetitiva "*para*" é uma **estrutura de controle** que **repete** um bloco de comandos para um certo **intervalo de valores**.
* **Quando usar**: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.

#### Sintaxe

```java
for ( inicio; condição; incremento ) {
  comando 1;
  comando 2;
}
```

[Exemplo 1](ws-eclipse/s06/aula50-exemplo1/src/Main.java)