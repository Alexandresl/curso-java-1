### 32. Material de apoio do capítulo

[Estrutura condicional](PDFs/Aula%20030%20-%20Estrutura%20condicional.pdf)

### 33. Expressões comparativas

* O resultado de uma expressão comparativa é um valor verdade: *true* ou *false*. Ex.: `5 > 10 = false`.

#### Operadores comparativos

| Operador | Significado    |
| -------- | -------------- |
| >        | Maior          |
| <        | Menor          |
| >=       | Maior ou igual |
| <=       | Menor ou igual |
| ==       | Igual          |
| !=       | Diferente      |

#### Exemplos de expressões comparativas

* Suponha `x = 5`:

| Expressão | Resultado |
| --------- | --------- |
| x > 0     | true      |
| x == 3    | false     |
| 10 <= 30  | true      |
| x != 2    | true      |

### 34. Expressões lógicas

* As expressões lógicas, assim como as comparativas, quando avaliadas retornam um valor verdade: *true* ou *false*.

#### Operadores lógicos

| Operador | Significado |
| -------- | ----------- |
| &&       | E           |
| ∥        | OU          |
| !        | Não         |

#### Exemplos de expressões lógicas

##### E

* Suponha `x = 5`:

| Expressão                    | Resultado |
| ---------------------------- | --------- |
| x <= 20 && x == 10           | false     |
| x > 0 && x != 3              | true      |
| x <= 20 && x == 10 && x != 3 | false     |

* Tabela verdade do operador "**E**"

| A   | B   | A && B |
| --- | --- | ------ |
| F   | F   | F      |
| F   | V   | F      |
| V   | F   | F      |
| V   | V   | V      |

##### OU

* Suponha `x = 5`:

| Expressão                | Resultado |
| ------------------------ | --------- |
| X == 10 ∥ X <= 20        | true      |
| x > 0 ∥ x != 3           | true      |
| x <= 0 ∥ x != 3 ∥ x != 5 | true      |

* Tabela verdade do operador "**OU**"

| A   | B   | A ∥ B |
| --- | --- | ----- |
| F   | F   | F     |
| F   | V   | V     |
| V   | F   | V     |
| V   | V   | V     |

##### NÃO

* Suponha `x = 5`:

| Expressão             | Resultado |
| --------------------- | --------- |
| !(X == 10)            | true      |
| !(x >= 2 )            | false     |
| !(x <= 20 && x == 10) | true      |

* Tabela verdade do operador "**NÃO**"

| A   | !A  |
| --- | --- |
| F   | V   |
| V   | F   |

### 35. Estrutura condicional (if-else)

* **Estrutura condicional** é uma *estrutura de controle* que permite definir que um certo *bloco de comando* somente será executado dependendo da *condição*.

#### Sintaxe da estrutura condicional

```Java
// Simples:

if (<condição>) {
  <comando 1>
  <comando 2>
}
```

```java
// composta

if (<condição>) {
  <comando 1>
  <comando 2>
} else {
  <comando 3>
  <comando 4>
}
```

#### Encadeamento de estruturas condicionais

```java
// Exemplo 1
// Comando completo

if (<condição>) {
  <comando 1>
  <comando 2>
} else {
  if (<condição>) {
    <comando 3>
    <comando 4>
  } else {
    <comando 5>
    <comando 6>
  }
}

// Exemplo 2
// Comando reduzido para evitar aumento de identação

if (<condição>) {
  <comando 1>
  <comando 2>
} else if (<condição>) {
  <comando 3>
  <comando 4>
} else {
  <comando 5>
  <comando 6>
}

```

### 36. AVISO: exercícios para iniciantes PARTE 2

### 37. Exercícios para Iniciantes - PARTE 2

[Exercícios estrutura condicional](PDFs/Aula%20035%20-%20Exercícios%202.pdf)

#### Exercícios Resolvidos
 
 [Exercício resolvido 1](https://www.youtube.com/watch?v=SRyQZBaA-_s)
 [Código fonte](ws-eclipse/s4/aula37-exemplo1/src/Main.java)

 [Exercício resolvido 2](https://www.youtube.com/watch?v=3lhkB5I8P6E)
 [Código fonte](ws-eclipse/s4/aula37-exemplo2/src/Main.java)

 [Exercício resolvido 3](https://www.youtube.com/watch?v=UjCVIcKccdQ)
 [Código fonte](ws-eclipse/s4/aula37-exemplo3/src/Main.java)

 #### Exercícios propostos

 [Exercício 1](ws-eclipse/s4/aula37-exercicio1/src/Main.java)

 [Exercício 2](ws-eclipse/s4/aula37-exercicio2/src/Main.java)
 
 [Exercício 3](ws-eclipse/s4/aula37-exercicio3/src/Main.java)
 
 [Exercício 4](ws-eclipse/s4/aula37-exercicio4/src/Main.java)
 
 [Exercício 5](ws-eclipse/s4/aula37-exercicio5/src/Main.java)

 [Exercício 6](ws-eclipse/s4/aula37-exercicio6/src/Main.java)
 
 [Exercício 7](ws-eclipse/s4/aula37-exercicio7/src/Main.java)

 [Exercício 8](ws-eclipse/s4/aula37-exercicio8/src/Main.java)

 ### 38. Sintaxe opcional - operadores de atribuição cumulativa

#### Operadores de atribuição cumulativa

| Operadores | expressão equivalente |
| ---------- | --------------------- |
| a += b;    | a = a + b;            |
| a -= b;    | a = a - b;            |
| a *= b;    | a = a * b;            |
| a /= b;    | a = a / b;            |
| a %= b;    | a = a % b;            |

[Exemplo de uso](ws-eclipse/s4/aula38-exemplo1/src/Main.java)

### 39. Sintaxe opcional - switch-case

* Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma varíavel, ao invés de várias estruturas *if-else* encadeadas, alguns preferem utilizar a estrutura *switch-case*.

#### Sintaxe

```java
switch ( expressão ) {
  case valor1:
    comando1;
    comando2; 
    break;
  case valor2:
    comando3;
    comando4;
    break;
  default:
    comando5;
    comando6;
    break;
}
```

[Exemplo de uso](ws-eclipse/s4/aula39-exemplo1/src/Main.java)

### 40. Expressão condicional ternária

A *Expressão condicional ternária* é uma estrutura opcional ao *if-else* quando se deseja decidir um **valor** com base em uma condição.

#### Sintaxe

```java
( condicao ) ? valor_se_verdadeira : valor_se_falso
```

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