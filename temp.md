### 17. Instalando o Eclipse

[Link](https://www.eclipse.org/downloads/packages/) para download do Eclipse

### 18. Primeiro programa em Java no Eclipse

#### Passo a passo para criação do projeto no Eclipse:
* Workspace (selecione a pasta aonde os projetos serão salvos)
* Mudar o layout: Window -> Perspective -> Open Perspective -> Java
* Zerar o layout: Window -> Perspective -> Reset Perspective
* Mostrar a aba Console: Window -> Show View -> Console
* Criar projeto: File -> New -> Java Project

#### Criar uma classe
* Botão direito na pasta "src" -> New -> Class
* Package: deixe em branco
* Nome da classe: Main (com M maiúsculo)
* Marque a opção: public static void main(String[] args)

[Atalhos do eclipse](keyboard-eclipse.md)

## Seção 4: Estrutura sequencial

### 19. Visão geral do capítulo

### 20. Material de apoio do capítulo

[Estrutura sequencial](PDFs/Aula%20018%20-%20Estrutura%20sequencial.pdf)

### 21. Expressões aritméticas

* **Expressões aritméticas** são aquelas expressões que quando calculadas, resultam em um valor númérico.

#### Operadores aritméticos

| Operador | Significado              |
| -------- | ------------------------ |
| +        | Adição                   |
| -        | Subtração                |
| *        | Multiplicação            |
| /        | Divisão                  |
| %        | Resto da divisão ("mod") |

#### Precedência
  * 1º Lugar: * / %
  * 2º Lugar: + -

#### Exemplos de expressões aritméticas

| Expressão          | resultado |
| ------------------ | --------- |
| 2 * 6 / 3          | 4         |
| 3 + 2 * 4          | 11        |
| (3 + 2) * 4        | 20        |
| 60 / (3 + 2) * 4   | 48        |
| 60 / ((3 + 2) * 4) | 3         |
| 14 % 3             | 2         |
| 19 % 5             | 4         |

### 22. Variáveis e tipos básicos em Java

* Um programa de computador em execução lida com dados. Estes dados são armazenados em variáveis.
* Em programação, uma variável é um porção de memória (RAM) utilizada para armazenar dados durante a execução dos programas.
* Sintaxe: `<tipo> <nome> = <valor inicial (opcional)>;`
  
* Ex.:
```java
int idade = 25; // Número inteiro
double altura = 1.68; // Número ponto flutuante
char sexo = 'F';
```

* Em resumo, uma variável possui:
  * Nome (ou identificados)
  * Tipo
  * valor
  * Endereço

#### Tipos primitivos em Java

| Descrição                | Tipo        | Tamanho | Valores                                    | Valor padrão |
| ------------------------ | ----------- | ------- | ------------------------------------------ | ------------ |
| tipos numéricos inteiros | **byte**    | 8 bits  | -128 a 127                                 | 0            |
| tipos numéricos inteiros | **short**   | 16 bits | -32768 a 32767                             | 0            |
| tipos numéricos inteiros | **int**     | 32 bits | -2147483648 a 2147483647                   | 0            |
| tipos numéricos inteiros | **long**    | 64 bits | -9223372036854770000 a 9223372036854770000 | 0L           |
| tipos numéricos com      | **float**   | 32 bits | -1,4024E-37 a 3,4028E+38                   | 0.0f         |
| ponto flutuante          | **double**  | 64 bits | -4,94E-307 a 1,79E+308                     | 0.0          |
| um caractere Unicode     | **char**    | 16 bits | '\u0000' a '\uFFFF'                        | '\u0000'     |
| valor verdade            | **boolean** | 1 bit   | {false, true}                              | false        |


* **String** - Cadeia de caracteres (palavras ou textos)
* Para descobrir um código unicode referente a um caracter, podemos utilizar o link [unicode-table.com](https://unicode-table.com/pt/). Ex.: 'a' = '\u0061'

* A quantidade de bits determina a quantidade de valores diferentes que determinada tipo pode armazenar. Para sabermos este limite basta utilizarmos o número de bits como expoente de 2. Ex.:
  * 8 bits = 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 = 2⁸ = 256

#### **Nome de variáveis**
* Não pode começar com dígito: use uma letra ou _ (underscore)
* Não pode ter espaço em branco
* Não usar acentos ou til
* Sugestão: use o padrão "*camel case*"

| Errado                     | Correto                  |
| -------------------------- | ------------------------ |
| int 5minutos;              | int _5minutos;           |
| int salário;               | int salario;             |
| int salário do funcionário | int salarioDoFuncionario |

### 23. As três operações básicas de programação

* Um programa de computador é capaz de realizar essencialmente três operações:
  * *Entrada de dados*
  * *Processamento de dados*
  * *Saída de dados*

#### **Entrada de dados**
* É quando o usuário informa dados para o programa. 
* Estes dados serão armazenados em variáveis.
* Os dados são inseridos através de dispositivos de entrada. Ex.: Teclado
* A operação de entrada de dados também é chamada de **leitura**

#### **Processamento de dados**
* É quando o programa realiza os cálculos.
* O processamento de dados é realizado pelo processador do computador.
* O processamento da dados se dá por um comando de **atribuição**. ex.: `media = (x + y) / 2`

#### **Saída de dados**
* É quando o programa informa dados para o usuário.
* A apresentação destes dados se dá por dispositivos de saída. Ex.: Monitor do computador.
* Esta operação também é conhecida como **escrita**

### 24. Saída de dados em Java

#### Para escrever na tela um texto qualquer:

```java
// Sem quebra de linha ao final
System.out.print("Bom dia!");

// Com quera de linha no ao final
System.out.println("Bom dia!");
```

#### Para escrever na tela o conteúdo de uma variável de algum tipo básico:

```java
int y = 32;
System.out.println(y);
```

#### Para escrever o conteúdo de uma variável com ponto flutuante

```java

Locale.setDefault(Locale.US);

double x = 10.35784;

System.out.println(x); // 10.35784
System.out.printf("%.2f%n", x); // 10.35
System.out.printf("%.4f%n", x); // 10.3578
```

  * *Obs*.: O comando `printf` por padrão irá formatar conforme a configuração do sistema operacional. Dessa forma ele irá apresentar os números de número flutuantes com o separador da vírgula. Ex.: `10,3578`. Para que seja apresentado com o ponto (.) deverá ser definido o `locale` conforme exemplo acima.

#### Para concatenar vários elementos em um mesmo comando de escrita (print e println)

```java
// Regra geral para o comando print e println
// ele1 + ele2 + ... + eleN

int x = 5;
System.out.println("Resultado = " + x + " Metros");
```

#### Para concatenar vários elementos em um mesmo comando de escrita (printf)

```java
// Regra geral para o comando printf
// texto1 %f texto2 %f, variavel1, variavel2
// onde:
// %f = número de ponto flutuante
// \n = quebra de linha

System.out.printf("Resultado = %.2f metros\n", x);
```

#### Para concatenar vários elementos em um mesmo comando de escrita (printf - diferentes tipos de dados)

```java
// %f = número flutuante
// %d = inteiro
// %s = texto
// \n = quebra de linha

String nome = "Maria";
int idade = 31;
double renda = 4000.0;

System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
```

  * Mais informações sobre [formatação de números](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)

### 25. Processamento de dados em Java, Casting

* Em programação, o processamento de dados é feito através do comando de atribuição.

```
// Sintaxe
<variável> = <expressão>;

Regra:
1 - A expressão é calculada;
2 - O resultado da expressão é armazenado na variável
```

```java
  // exemplo 1

  int x, y;
  x = 5;
  y = 2 * x;
  System.out.println(x); // retorna 5
  System.out.println(y); // retorna 10
```

```java
  // exemplo 2

  int x;
  double y;
  x = 5;
  y = 2 * x;
  System.out.println(x); // retorna 5
  System.out.println(y); // retorna 10.0
```

```java
  // exemplo 3

  Locale.setDefault(Locale.US);
      
  double b, B, h, area;

  b = 6.0;
  B = 8.0;
  h = 5.0;

  area = (b + B) / 2 * h;

  System.out.printf("A área do trapézio é %.2f", area);
  // A área do trapézio é 35.00
```

* *Boa prática* - Sempre indique o tipo do número, se a exporessão for de ponto flutuante (não inteira).
  * Para **double** use: `.0`
  * Para **float** use: `f`

```java
  // exemplo 4

  int a, b;

  double resultado;
  
  a = 5;
  b = 2;
  
  resultado = (double) a / b;
  
  System.out.println(resultado);
```
* neste exemplo é realizado o casting para *double*, pois, caso contrário, o resultado mesmo armazenado em uma variávvel do tipo *double* será *inteira* (*2.0*)

```java
  // exemplo 5

  double a;
  int b;
  
  a = 5.0;
  b = (int) a;
  
  System.out.println(b);
```
  * Neste exemplo o casting é feito para poder armazenar um valor de uma variável do tipo *double* em uma variável do tipo *int*.

### 26. Entrada de dados em Java - Parte 1

* Para realizarmos a entrada de dados em um programa java, utilizamos um objeto chamado *Scanner*. O **Scanner** é importado de `java.util.Scanner`
* Este objeto é instanciado da seguinte forma:
```java
Scanner sc = new Scanner(System.in);

sc.close()
```
* No exemplo podemos ver a utilização da função `close()`. Esta função serve para desalocar este recurso disponibilizado e deve ser utilizada quando não precisamos mais deste recurso.

#### Para ler uma palavra (texto sem espaços)

```java
// Suponha uma variável do tipo String declarada:

String x;
x = sc.next();
```

#### Para ler um número inteiro

```java
// Suponha uma variável tipo int declarada:

int x;
x = sc.nextInt();
```

#### Para ler um número com ponto flutuante

```java
// Suponha uma variável tipo double declarada:

double x;
x = sc.nextDouble();
```

* **Atenção** - Para considerar o separador de decimais como ponto, **ANTES** da declaração do *Scanner*, faça `Locale.setDefault(Locale.US);`

#### Para ler um caractere

```java
// Suponha uma variável tipo char declarada:

char x;
x = sc.next().charAT(0);
```

#### Para ler vários dados na mesma linha

```java
String x;
int y;
double z;

x = sc.next();
y = sc.nextInt();
z = sc.nextDouble();
```

### 27. Entrada de dados em Java - Parte 2

#### Para ler um texto até a quebra de linha

```java
Scanner sc = new Scanner(System.in);

String s1, s2, s3;

System.out.println("Digite 3 parágrafos:");
s1 = sc.nextLine();
s2 = sc.nextLine();
s3 = sc.nextLine();

System.out.println("Dados digitados");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

sc.close();
```

* Neste exemplo vemos a diferença entre o método `next()` que lê apenas uma palavra, ou seja, uma cadeia de caracteres sem espaço, do `nextLine()` que irá ler toda a cadeia de caracteres até que seja digitado o *Enter*.

#### Quebra de linha pendente

* Quando você usa um comando de leitura diferente do ´nextLine()´ e dá alguma quebra de linha, essa quebra de linha fica "*pendente*" na entrada padrão. Se você então fizer um `nextLine()`, aquela quebra de linha pendente será absorvida pela `nextLine()`.

##### Solução:

* Faza um `nextLine()` extra antes de fazer o `nextLine()` de seu interesse, conforme exemplo abaixo.

```java
Scanner sc = new Scanner(System.in);
		
int x;
String s1, s2, s3;

System.out.println("Digite 1 inteiro e três parágrafos:");
x = sc.nextInt();
sc.nextLine();
s1 = sc.nextLine();
s2 = sc.nextLine();
s3 = sc.nextLine();

System.out.println("Dados digitados:");
System.out.println(x);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

sc.close();
```

#### 28. Funções matemáticas em Java

#### Alguns exemplos de funções matemáticas

| Exemplo             | Significado                                    |
| ------------------- | ---------------------------------------------- |
| A = Math.Sqrt(x);   | Variável A recebe a raiz quadrada de x         |
| A = Math.pow(x, y); | Variável A recebe o resultado de x elevado a y |
| A = Math.abs(x);    | Variável A recebe o valor absoluto de x        |

* A relação completa dos métodos da função Math podem ser consultados [Aqui](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html).

```java
// Exemplo 1
public class Main {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A); // Raiz quadrada de 3.0 = 1.7320508075688772
		System.out.println("Raiz quadrada de " + y + " = " + B); // Raiz quadrada de 4.0 = 2.0
		System.out.println("Raiz quadrada de 25 = " + C); // Raiz quadrada de 25 = 5.0
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println("");
		System.out.println(x + " elevado a " + y + " = " + A); // 3.0 elevado a 4.0 = 81.0
		System.out.println(x + " elevado ao quadrado = " + B); // 3.0 elevado ao quadrado = 9.0
		System.out.println("5 elevado ao quadrado = " + C); // 5 elevado ao quadrado = 25.0
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("");
		System.out.println("Valor absoluto de " + y + " = " + A); // Valor absoluto de 4.0 = 4.0
		System.out.println("Valor absoluto de " + z + " = " + B); // Valor absoluto de -5.0 = 5.0

	}

}
```

### 29. AVISO: exercícios para iniciantes PARTE 1

* Até o momento nós apresentamos a "*estrutura sequencial*":
  * Entrada de dados
  * Processamento (atribuição)
  * Saída de dados

* A seguir será realizado exercícios sobre estes tópicos.

### 30. Exercícios para iniciantes - Parte 1

* [Lista de Exercícios 1](PDFs/Aula%20028%20-%20Exercícios%201.pdf)

#### Exercício Resolvido

[Link](https://www.youtube.com/watch?v=Ah1Y6d6deq0)
[Código fonte](ws-eclipse/s4/aula30-exemplo1/src/Main.java)

#### Exercícios propostos

* [Exercício 1](ws-eclipse/s4/aula30-exercicio1/src/Main.java)
* [Exercício 2](ws-eclipse/s4/aula30-exercicio2/src/Main.java)
* [Exercício 3](ws-eclipse/s4/aula30-exercicio3/src/Main.java)
* [Exercício 4](ws-eclipse/s4/aula30-exercicio4/src/Main.java)
* [Exercício 5](ws-eclipse/s4/aula30-exercicio5/src/Main.java)
* [Exercício 6](ws-eclipse/s4/aula30-exercicio6/src/Main.java)

## Seção 5: Estrutura condicional

### 31. Visão geral do capítulo

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