# curso-java-1

## Seção 1: Introdução

### 1. Introdução: visão geral do curso

[Curso Java Completo](https://github.com/Alexandresl/curso-java-1/blob/master/PDFs/Aula%201%20-%20Curso%20Java%20Completo.pdf)

## Seção 2: Conceitos de programação

### 2. Visão geral do capítulo

### 3. Material de apoio do capítulo

[Conceitos de programação](https://github.com/Alexandresl/curso-java-1/blob/master/PDFs/Aula%203%20-%20Conceitos%20de%20programa%C3%A7%C3%A3o.pdf)

### 4. Algoritmo, Automação, Programa de Computador

#### Resumo da Aula

* Algoritmo: Sequência finita de instruções para se resolver um problema
* Automação: Quando uma máquina realiza o algoritmo
* Computador:
    * Hardware / Software
    * máquina que automatiza algoritmos (de cáltulo)
* Programa de computador: algoritmo executado pelo computador

### 5. O que é preciso para se fazer um programa de computador 

* Uma **linguagem de programação**: Regras **léxicas** e **sintáticas** para se escrever o programa
* Uma **IDE**: Software para editar e testar o programa
* Um **compilador**: Software para transformar o **código fonte** em **código objeto**
* Um **gerador de código** ou **máquina virtual**: Software que permite que o programa seja executado

### 6. Linguagens de programação, léxica, sintática

#### Resumo da Aula

* Linguagem: Conjunto de regras léxicas e sintáticas para se escrever um programa
    * Léxica = Ortografia. Palavras isoladas
    * Sintáticas = Gramática. sentença como um todo
* Exemplos de linguagens: C, Pascal, C++, Python, Ruby, PHP, JavaScript, etc.
* Exemplo de códigos feitos em linguagem C, C++, C# e Java

### 7. IDE - Ambiente Integrado de Desenvolvimento

#### Resumo da Aula

* IDE: É um conjunto de softwares utilizados para a construção de programas
    * C/C++: **Code Blocks**
    * Java: **Eclipse**, **NetBeans**
    * C#: **Microsoft Visual Studio**
* Uma IDE fornece várias funcionalidades para facilitar a construção dos programas

## Seção 3: Introdução à linguagem Java

### 8. Visão geral do capítulo

### 9. Material de apoio do capítulo

[Introdução à linguagem Java](https://github.com/Alexandresl/curso-java-1/blob/master/PDFs/Aula%209%20-%20Introdu%C3%A7%C3%A3o%20a%20linguagem%20Java.pdf)

### 10. Entendendo as versões do Java

Página para download do java:

[https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)

Versões LTS - Long Term Support

### 11. Histórico e edições de Java

* Edições do java:
    * **Java ME** - Java Micro Edition - dispositivos embarcados e móveis - IoT
    * **Java SE** - Java Standard Edition - core - desktop e servidores
    * **Java EE** - Java Enterprise Edition - aplicações corporativas

### 12. JDK / JVM - Máquina Virtual do Java

JVM - Java Virtual Machine - Máquina Virtual do Java - necessário para executar sistemas Java

#### Compilação e interpretação

* Linguagens **compiladas**: C, C++
* Linguagens **interpretadas**: PHP, JavaScript
* Linguagens **Pré-compiltadas + Máquina Virtual**: Java, C#

### 13. Estrutura de uma aplicação Java

#### Resumo da Aula

* **Classe** - É a unidade lógica básica de um programa orientado a objetos
* **Package** - Agrupamento **lógico** de **classes** relacionadas
* **Módulo** (Java 9+) - Agrupamento **lógico** de pacotes (**package**) relacionados
* **Runtime** - Agrupamento **físico**
* **Aplicação** - Agrupamento de **módulos** relacionados

### 14. Instalando Java JDK

Baixar e instalar o Java JDK pelo link:
[https://www.oracle.com/java/technologies/javase-jdk11-downloads.html](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

Configurar variáveis de ambiente do sistema

* Painel de Controle -> Variáveis de Ambiente
    * JAVA_HOME: C:\Program Files\Java\jdk-11.0.4
    * Path: **incluir** C:\Program Files\Java\jdk-11.0.4\bin
* Testar no terminal de comando: **java -version**

### 15. Instalando o Eclipse

Link para download:
[http://www.eclipse.org/downloads/packages/](http://www.eclipse.org/downloads/packages/)

Baixar o **Eclipse IDE Enterprise Java Developers**

### 16. Primeiro programa em Java no Eclipse

#### Dicas eclipse:

* Mudar o layout: Window -> Perspective -> Open Perspective -> Java
* Zerar o layout: Window -> Perspective -> Reset Perspective
* Mostrar a aba Console: Window -> Show View -> Console
* Mudar o tamanho da fonte: **Ctrl +** E **Ctrl -**
* Executar classe executável: Shift + Alt + X, J
* Ctrl + Alt + ↑ ou Ctrl + Alt + ↓, duplica a linha
* Ctrl + Shift + f realiza a identação do código

#### Primeiros passos

* Criar Projeto: File -> New -> Java Project
* Criar Classe:
    * Botão direito na pasta "src" -> New -> Class
    * Package: deixe em branco
    * Nome da classe: Main (com M Maiúsculo)
    * Marque a opção: *public static void main(String[] args)*

## Seção 4: Estrutura sequencial

### 17. Visão geral do capítulo

### 18. Material de apoio do capítulo

[Estrutura Sequencial](https://github.com/Alexandresl/curso-java-1/blob/master/PDFs/Aula%2018%20-%20Estrutura%20sequencial.pdf)

### 19. Expressões aritméticas

#### Resumo da Aula

* Operadores: **+**, **-**, **\***, **/**, **%**
* Precedência entre operadores: 
    * 1º Lugar: *, /, %
    * 2º Lugar: +, -
    * Quando a precedência é a mesma resolve-se da esquerda para a direita
    * Quando a expressão possuir parênteses, estes serão resolvidos em 1º lugar

### 20. Variáveis e tipos básicos em Java

* Um programa de computador em execução lida com dados e esses dados são armazenados em **variáveis**.
* **Variável** é uma porção de **memória RAM** utilizada para armazenar dados durante a execução dos programas.
* A sintaxe de uma declaração de uma variável é: **<tipo> <nome> = <valor inicial>**.
* As variáveis possuem um **nome** (ou **identificador**), um **tipo**, um **valor** e um **endereço**.
* Os tipos primitivos em Java:


```
---------------------------------------------------------------------------------------------------------------
|   Descrição                   |   Tipo    |   Tamanho     |   Valores                     |   Valor padrão  |
---------------------------------------------------------------------------------------------------------------
|                               |   byte    |   8 bits      |   -128 a 127                  |   0             |
|                               |   short   |   16 bits     |   -32768 a 32767              |   0             |
|   Tipos númericos inteiros    |   int     |   32 bits     |   -2147483648 a 2147483647    |   0             |
|                               |   long    |   64 bits     |   -9223372036854770000 a      |   0L            |
|                               |           |               |   9223372036854770000         |                 |
---------------------------------------------------------------------------------------------------------------
|   Tipos númericos com         |   float   |   32 bits     |   -1,4024E-37 a 3,4028E+38    |   0.0f          |
|    Ponto Flutuante            |   double  |   64 bits     |   -4,94E-307 a 1,79E+308      |   0.0           |
---------------------------------------------------------------------------------------------------------------
|   Um caractere Unicode        |   char    |   16 bits     | '\u0000' a '\uFFFF'           |   '\u0000'      |
---------------------------------------------------------------------------------------------------------------
|   Um valor verdade            |   boolean |   1 bit       | {false, true}                 |   false         |
---------------------------------------------------------------------------------------------------------------
```
* Uma String é uma cadeia de caracteres (palavras ou textos).
* Neste [link](https://unicode-table.com/pt/#0056) você encontra uma lista de caracteres unicode.
* Regras / boas práticas para nomear variáveis
    * Não pode começar com dígito: uso uma letra ou _ (underscore)
    * Não pode ter espaço em branco
    * Não usar acentos ou til
    * Sugestão: inicie nome de variáveis com letra **minúscula**
    * Sugestão: use o padrão "*camel case*"

### 21. As três operações básicas de programação

* Um programa de computador é capaz de realizar essencialmente três operações: **Entrada de dados**, **Processamento de dados** e **saída de dados**.
* Na **entrada de dados**, também chamado de **leitura**, um usuário informa **dados** para o programa, através de **dispositivos de entrada**, que são armazenados em **variáveis**.
* O **processamento de dados** ocorre quando o programa realiza os cálculos. Esta ação é realizada pelo **processador** e se dá por umn comando chamado **atribuição**.
* A **saída de dados**, também chamado de **escrita**, é quando o programa mostra dados para o usuário através de **dispositivos de saída**.

### 22. Saída de dados em Java

* São usados os comandos:
```java
// Sem quebra de linha
System.out.print("Bom dia!");

// Com quebra de linha no final
System.out.println("Bom dia!");
```
* Podemos além de textos, imprimir o valor de variáveis:
```java
int y = 32;
System.out.println(y);
```
* Para escrever o conteúdo de uma variável de ponto flutuante utilizamos o ``` System.out.printf() ```.
* O comando ```System.out.printf()``` sempre retorna os falores no formato do sistema operacional.
```java
double x = 10.35784;
System.out.println(x); // Saída: 10.35784
System.out.printf("%.2f\n", x);	// Saída: 10,36 (Retorna no formato definido no sistema operacional)
System.out.printf("%.4f\n", x);	// Saída: 10,3578
Locale.setDefault(Locale.US); // Seta o formato americano
System.out.printf("%.2f\n", x);	// Saída: 10.36
System.out.printf("%.4f\n", x);	// Saída: 10.3578
```
* O marcador **\n** resulta em uma quebra de linha.
* Condorme o exemplo acima, utilizamos o ```Locale.setDefault()``` para definirmos o formato.
* Para concatenar vários elementos em um mesmo comando **print** ou **println**, utilizamos o caractere de adição (**+**). exemplo:
```java
double x = 10.35784;
System.out.println("Resultado = " + x + " Metros."); // Saída: Resultado = 10.35784 Metros.
```
* Para concatenar vários elementos em um mesmo comando **printf**, utilizamos marcadores que deverão ser substituídos pelos valores das variáveis. Estes marcadores iniciam com o caracter de porcento (**%**) e um outro caractere que dependerá do tipo de variável que estamos utilizando.
```java
double x = 10.35784;
// O **%.2f** é impresso com o valor de **x**
System.out.printf("Resultado = %.2f Metros.", x); // Saída: Resultado = 10.36 Metros. 
```
* Os marcadores mudam de acordo com o tipo de variável:
    * **%f** = **ponto flutuante**
    * **%d** = **inteiro**
    * **%s** = **texto**
        * Exemplo:
        ```java
        String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda); 
        // Saída: Resultado = 10.36 Metros.Maria tem 31 anos e ganha R$ 4000.00 reais
        ```

### 23. Processamento de dados em Java, Casting

* O **processamento de dados** se dá pelo comando de atribuição (**=**) e a sintaxe é ```<variável> = <expressão>;``` lê-se variável "**recebe**" o resultado da expressão
* A regra para execução de um comando de atribuição:
    1. A expressão é calculada
    2. O resultado da expressão é armazenado na variável
* Alguns exemplos:
    * Exemplo 1:
	```java
	int x, y;
	x = 5;
	y = 2 * x;
	System.out.println(x); // Saída: 5
	System.out.println(y); // Saída: 10
	```
    * Exemplo 2:
	```java
    int x;
	double y;
	x = 5;
	y = 2 * x;
	System.out.println(x); // Saída: 5
	System.out.println(y); // Saída 10.0
	System.out.println(y); // Saída 10.0
    ```
    * Exemplo 3:
	```java
	// Calcular a área de um trapésio de bases 6 e 8 e altura 5
	// Formula da área:
	// area = (b + B) / 2 * 5
	
	double b, B, h, area;
	b = 6.0; 
	B = 8.0;
	h = 5.0;
			
	area = (b + B) / 2.0 * h;
		
	System.out.println("A área é " + area); // Saída: A área é 35.0
	```
* Importante enfatizar que é uma boa prática indicar o tipo do número, se a expressão for de ponto flutuante:
    * para **double** utiliza-se o **.0**. Exemplo:
	```java
	double x = 1.0;
	```
    * para **float** utiliza-se o **f**. Exemplo:
	```java
	 float y = 5f;
	```
* O **casting** é a conversão explicita de valores: Exemplos:
    * Exemplo 4: Neste exemplo, como a e b são tipos inteiros o resultado, apesar de ser double, ele recebe o valor 2, pois entende que o resultade de dois números inteiros também é inteiro.
    ```java
	int a, b;
	double resultado;
	a = 5;
	b = 2;
	resultado = a / b;
	System.out.println(resultado); // Saída: 2.0
    ```
    * Exemplo 5: Para resolver o problema do exemplo 4 podemos utilizar o casting conforme exemplo abaixo.
	```java
	int a, b;
	double resultado;
	a = 5;
	b = 2;
	resultado = (double) a / b; // fazemos o casting de a / b para double
	System.out.println(resultado); // Saída: 2.5
	```
    * Exemplo 6: Outra situação comum que temos que utilizar o casting é quando o compilador verifica que informações podem ser perdidas. Neste exemplo, apesar do double receber um número que poderia também ser inteiro, para que o int b receba o valor temos que realizar o casting.
	```java
	double a;
	int b;
	a = 5.0;
	b = (int) a; // Aqui, precisamos fazer o casting para int.
	System.out.println(b); // Saída: 5
	```

### 24. Entrada de dados em Java - Parte 1

* Para conseguirmos realizar a entrada de dados em java, precisamos criar um **objeto** do tipo "**Scanner**" da seguinte forma:
```java
Scanner sc = new Scanner(System.in);
```
* para que possamos estânciar um objeto do tipo "**Scanner**" vamos precisar realizar um import, no início o arquivo que estamos codificando, conforme o código a seguir:
```java
import java.util.Scanner;
```
* **Sempre** que não precisarmos mais o dobjeto teremos que realizar o comando a seguir:
```java
sc.close() // comando que desaloca o recorso do Scanner
```
* Para podermos ler uma **String** (palavra sem espaço) utilizamos:
```java
String x; // declara uma variável do tipo String
x = sc.next(); // x irá receber a String digitada
```
* Exemplo 1:
```java
import java.util.Scanner; // import do Scanner

public class Aula24_exe1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Instancia o objeto Scanner
		String x; // Declara a variável do tipo String
		x = sc.next(); // Variável recebe a String digitada
		System.out.println("Você digitou: " + x); // Programa exibe o valor armezenado
		sc.close(); // Scanner é desalocado
	}
}
```
* Para podermos ler um **inteiro** utilizamos:
```java
int x; // declara uma variável do tipo int
x = sc.nextInt(); // x irá receber o inteiro digitado
```
* Exemplo 2:
```java
import java.util.Scanner;

public class Aula24_exe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x; // Declara uma variável do tipo inteiro
		x = sc.nextInt(); // Variável recebe o inteiro digitado
		System.out.println("Você digitou: " + x);
		sc.close();
	}
}
```
* Para podermos ler um número com **ponto flutuante** utilizamos:
```java
double x; // declara uma variável do tipo double
x = sc.nextDouble(); // x irá receber o número de ponto flutuante digitado
```
* Para que possamos utilizar o ***ponto*** (**.**) em sistemas operacionais que estão em português, temos que utilizar o *Locale* **antes** da declaração do Scanner.
```java
Locale.setDefault(Locale.US);
```
* Exemplo 3:
```java
import java.util.Locale;
import java.util.Scanner;

public class Aula24_exe3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x; // Declara uma variável do tipo double
		x = sc.nextDouble(); // Variável recebe o double digitado
		System.out.println("Você digitou: " + x);
		sc.close();
	}
}
```
* Para podermos ler um caractere utilizamos:
```java
char x; // declara uma variável do tipo char
x = sc.next().charAt(0); 
// O next() captura toda a String digitada e o charAt(0) seleciona apenas o primeiro caractere
```
* Exemplo 4:
```java
import java.util.Scanner;

public class Aula24_exe4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x; // Declara uma variável do tipo char
		x = sc.next().charAt(0); // variável irá receber o primeiro caractere da String digitada;
		System.out.println("Você digitou: " + x);
		sc.close();
	}
}
```
* Para podermos ler vários dados na mesma linha, podemos realizar várias leituras (**"Scanners"**) em sequência. No exemplo a seguir, os valores poderão tanto ser lidos um por um, ou seja, digitando os valores e pressionando o *Enter* para cada um deles, quanto digitando os três valores separados por espaço e pressionando uma única vez o "Enter" (Exemplo: digitando: ```Maria 30 4.5``` seguido pelo *Enter* )
```java
import java.util.Locale;
import java.util.Scanner;

public class Aula24_exe5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Declaração de três variáveis
		String x;
		int y;
		double z;
		// São realizadas as leituras em sequência:
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		// São impressos os dados
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
```

### 25. Entrada de dados em Java - Parte 2

* Para ler um texto **até uma quebra de linha** utilizamos o método ```nextLine()```:
```java
import java.util.Scanner;

public class Aula25_exe1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
               // Cada variável poderá receber um parágrafo
		s1 = sc.nextLine(); // Lê uma sequência de String até que seja digitado o Enter
		s2 = sc.nextLine(); // Lê uma sequência de String até que seja digitado o Enter
		s3 = sc.nextLine(); // Lê uma sequência de String até que seja digitado o Enter
		
		System.out.println("Texto digitado:");
		System.out.println(s1); // imprime a primeira String
		System.out.println(s2); // imprime a sugunda String
		System.out.println(s3); // imprime a terceira String
	}
}
```
* **Quebra de linha pendente** - Quando você usa um comando de leitura diferente do *nextLine()* e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão. Se você então fizer um *nextLine()*, aquela quebra de linha pendente será absorvida pelo *nextLine()*. Para resolver este problema podemos fazer um *nextLine()* extra antes de fazer o *nextLine()* que iremos utilizar no programa. Segue um exemplo:
```java
import java.util.Scanner;

public class Aula25_exe2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x; // declaramos um int
		String s1, s2, s3;

		x = sc.nextInt(); // x recebe o valor do inteiro digitado
		sc.nextLine(); // Comando para absorver a quebra de linha resultante da digitação do inteiro
		s1 = sc.nextLine(); // s1 receberá a primeira frase
		s2 = sc.nextLine(); // s2 receberá a segunda frase
		s3 = sc.nextLine(); // s3 receberá a terceira frase

		System.out.println("Texto digitado:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}
```

### 26. Funções matemáticas em Java

* Algumas funções matemáticas do Java:
    * ```A = Math.sqrt(x);``` - Variável **A** recebe a **raiz quadrada** de x
    * ```A = Math.pow(x, y);``` - Variável **A** recebe o resultado de **x elevado a y**
    * ```A = Math.abs(x);``` - Variável **A** recebe o valor absoluto de x
* Exemplo 1:
```java
public class Aula26_exe1 {

	public static void main(String[] args) {
		
		// Declaração de variáveis
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x); // A recebe a raiz quadrada de x
		B = Math.sqrt(y); // B recebe a raiz quadrada de y
		C = Math.sqrt(25.0); // C recebe a raiz qudrada de 25
		// É impresso o valor das variáveis
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y); // A recebe x elevado a y
		B = Math.pow(x, 2.0); // B recebe x elevado ao quadrado
		C = Math.pow(5.0, 2.0); // C recebe 5 elevado ao quadrado
		// É impresso o valor das variáveis
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y); // A recebe o valor absoluto de y
		B = Math.abs(z); // B recebe o valor absoluto de z
		// É impresso o valor das variáveis
		System.out.println("O valor absoluto de " + y + " = " + A);
		System.out.println("O valor absoluto de " + z + " = " + B);

        
		// Resultado
		// Raiz quadrada de 3.0 = 1.7320508075688772
		// Raiz quadrada de 4.0 = 2.0
		// Raiz quadrada de 25 = 5.0
		// 3.0 elevado a 4.0 = 81.0
		// 3.0 elevado ao quadrado = 9.0
		// 5 elevado ao quadrado = 25.0
		// O valor absoluto de 4.0 = 4.0
		// O valor absoluto de -5.0 = 5.0

	}

}
```

### 27. AVISO: exercício para iniciantes PARTE 1

* [Link](https://www.youtube.com/watch?v=Ah1Y6d6deq0) para vídeo no YouTube com um exemplo de exercício resolvido

### 28. Exercícios para Iniciantes - PARTE 1

* Até o momento foi visto a "Estrutura sequencial", ou seja:
	* Entrada de dados
	* Processamento (atribuição)
	* Saída
* Lista de exercícios:
[Lista de exercícios 1](https://github.com/Alexandresl/Curso-java/blob/master/PDFs/Aula%2028%20-%20Exerc%C3%ADcios%201.pdf)

## Seção 5: Estrutura condicional

### 29. Visão geral do capítulo

### 30. Material de apoio do capítulo

[Estrutura Condicional](https://github.com/Alexandresl/Curso-java/blob/master/PDFs/Aula%2030%20-%20Estrutura%20condicional.pdf)

### 31. Expressões comparativas

* O resultado de qualquer expressão comparativa é booleano, ou seja, retorna *verdadeiro* (**true**) ou *falso* (**false**).
* Em java utilizamos seis **operadores comparativos**:
```
-------------------------------------------------
|	Operador	|	Significado	|
-------------------------------------------------
|	>		|	maior		|
|	<		|	menor		|
|	>=		| 	maior ou igual	|
|	<=		|	menor ou igual	|
|	==		|	igual		|
|	!=		| 	diferente	|
-------------------------------------------------
```

### 32. Expressões lógicas

* Assim como as espressões comparativas, as expressões lógicas também retornam um valor booleano.
* Os **operadores lógicos** são:
```
-------------------------------------------------
|	Operador	| 	Significado	|
-------------------------------------------------
|	&&		|	E		|
|	||		| 	OU		|
|	!		| 	NÃO		|
-------------------------------------------------
```

### 33. Estrutura condicional (if-else)

* É uma estrutura de controle que permite definir que um certo **bloco de comandos** somente será executado dependendo de uma **condição**
* Sintaxe da **estrutura condicional**:
```java
// Simples
if ( <Condição> ) {
	<Comando 1>
	<Comando 2>
}
```
```java
// Composta
if ( <Condição> ) {
	<Comando 1>
	<Comando 2>
} else {
	<Comando 3>
	<Comando 4>
}
```
* Se houver mais de duas possibilidades podemos utilizar uma estrutura condicional encadeada:
```java
if ( <Condição> ) {
	<Comando 1>
	<Comando 2>
} else {
	if ( <Condição>) {
		<Comando 3>
		<Comando 4>
	} else {
		<Comando 5>
		<Comando 6>
	}
}
```
* Caso o bloco do *if* ou do *else* possua apenas um comando o abre e fecha chaves é opcional:
```java
if ( <Condição> )
	<Comando 1>
else
	<Comando 2>
```
* Em decorrência da chave opçional mencionado acima, podemos utilizar um encadeamento com mais de um teste lógico conforme a sintaxe abaixo:
```java
if ( <Condição> ) {
	<Comando 1>
	<Comando 2>
} else if ( <Condição> ) {
	<Comando 3>
	<Comando 4>
} else {
	<Comando 5>
	<Comando 6>
}
```

### 34. AVISO: exercício para iniciantes Parte 2

### 35. Exercícios para Iniciantes - PARTE 2

[Exercício 5](https://github.com/Alexandresl/Curso-java/blob/master/PDFs/Aula%2035%20-%20Exerc%C3%ADcios%202.pdf)

### 36. Sintaxe opcional - operadores de atribuição cumulativa

```
---------------------------------
|	a += b; 	| 	a = a + b	|
|	a -= b; 	| 	a = a - b	|
|	a *= b; 	| 	a = a * b	|
|	a /= b; 	| 	a = a / b	|
|	a %= b; 	| 	a = a % b	|
---------------------------------
```

### 37. Sintaxe opcional - estrutura switch-case

* Usada quanto se tem várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.

### 38. Expressão condicional ternária

* Estrutura opcional ao *if-else* quando se deseja decidir um **valor** com base em uma condição.
```java
// Sintaxe
(condicao) ? valor_se_verdadeiro : valor_se_falso
```

### 39. Escopo e inicialização

* Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
* Uma variável não pode ser usada se não for iniciada.

## Seção 6: Estruturas repetitivas

### 40. Visão geral do capítulo

### 41. Material de apoio do capítulo

[Estruturas repetitivas](https://github.com/Alexandresl/curso-java-completo/blob/master/PDFs/Aula%2041%20-%20Estruturas%20repetitivas.pdf)

### 42. Como utilizar o DEBUG no Eclipse (execução passo a passo)

* Para marcar uma linha de breakpoint:
	* *Run* -> *Toggle Breakpoint (Ctrl + Shift + b)*
* Para iniciar o debug:
	* *Botão direito na classe* -> *Debug as* -> *Java Application*
* Para executar uma linha:
	* *F6*
* Para interromper o debug:
	* *Botão Stop*

### 43. Estrutura repetitiva enquanto (while)

* A estrutura repetitiva **while** (*enquanto*), é uma estrutura de controle que repete um bloco de commandos **enquanto** uma condição for verdadeira. Deve ser usada quando não se sabe previamente a quantidade de repetições que serã realizada.
* Sua sintaxe é:
```java
while ( condição ) {
	comando 1;
	comando 2;
}
```

### 44. Teste de mesa com estrutura repetitiva enquanto

### 45. Exercícios de teste de mesa com while

### 46. AVISO: exercícios para iniciantes PARTE 3

### 47. Exercícios para Iniciantes - PARTE 3

[Estrutura repetitiva while](https://github.com/Alexandresl/curso-java-completo/blob/master/PDFs/Aula%2047%20-%20Exerc%C3%ADcio%203.pdf)

### 48. Estrutura repetitiva para (for)

* É uma **estrutura de controle** que **repete** um bloco de comandos **para** um certo **intervalo de valores**. Deve ser utilizado quando se sabe previamente a quantyidade de repetições, ou o intervalo de valores.
* Sua sintaxe é:
```java
for (inicio; condição; incremento) {
	comando 1;
	comando 2;
}
```
### 49. Teste de mesa com estrutura repetitiva para

### 50. Exercícios de testes de mesa com for

### 51. AVISO: exercícios para iniciantes PARTE 4

### 52. Exercícios para iniciantes PARTE 4

[Estrutura repetitiva for](https://github.com/Alexandresl/curso-java-completo/blob/master/PDFs/Aula%2052%20-%20Exerc%C3%ADcio%204.pdf)

### 53. Estrutura repetitiva faça-enquanto (do-while)

* Estrutura menos utilizada, mas em alguns casos se encaixa melhor ao problema.
* O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.
```java
do {
	comando 1;
	comando 2;
} while ( condição );
```

## Seção 7: Outros tópicos básicos sobre Java

### 54. Material de apoio do capítulo

[Outros tópicos básicos](https://github.com/Alexandresl/curso-java-completo/blob/master/PDFs/Aula%2054%20-%20Outros%20t%C3%B3picos%20b%C3%A1sicos.pdf)

### 55. Restrições e convenções para nomes

#### Restrições para nomes de variáveis

* Não pode começar com dígito (número): use uma letro ou _
* Não usar acentos ou til
* Não pode ter espaço em branco
* **Sugestão**: use nomes que tenham significado

#### Convenções

* Usar o Camel Case (ex.: lastName) para:
	* pacotes
	* atributos
	* métodos
	* variáveis e parâmetros

* Usar o Pascal Case (ex.: ProductService) para:
	* classes

### 56. Operadores bitwise

---------------------------------------------------------------------------------
| 	Operador 	| 	Significado 					|
---------------------------------------------------------------------------------
| 	& 			| 	Operação "E" bit a bit 			|
| 	| 			| 	Operação "OU" bit a bit 		|
| 	^			| 	Operação "OU-exclusivo" bit a bit 	|
---------------------------------------------------------------------------------

### 57. Funções interessantes para String

* Formatar: toLowerCase(), toUpperCase(), trim()
* Recortar: substring(inicio), substring(inicio, fim)
* Substituir: replace(char, char), replace(string, string)
* Buscar: IndexOf, LastIndexOf
* str.Split(" ")

### 58. Comentários em Java (básico)

* Podemos ter comentários de um ou de várias linhas:
```java
// Comentário de uma linha

/**
 * Comentário de
 * várias linhas
 */
```

### 59. Funções (sintaxe)

* Representam um processamento que possui um significado
	* Math.sqrt(double) - Calcula a raíz quadrada
	* System.out.println(string) - imprime algo em tela
* Principais vantagens: modularização, delegação e reaproveitamento
* Dados de entrada e saída
	* Funções podem receber dados de entrada (parâmetros ou argumentos)
	* Funções podem ou não retornar uma saída
* Em orientação a objeto, funções em classes recebem o nome de "**métodos**"

## Seção 8: Introdução à Programação Orientada a Objetos

### 60. Visão geral do capítulo

### 61. Material de apoio do capítulo

[Classes, atributos, métodos e membros estáticos](https://github.com/Alexandresl/Curso-java-1/blob/master/PDFs/Aula%2061%20-%20Classes%2C%20atributos%2C%20m%C3%A9todos%20e%20membros%20est%C3%A1ticos.pdf)

### 62. Resolvendo um problema sem orientação a objetos

### 63. Criando uma classe com três atributos para representar melhor o trinângulo

#### Classe - É a definição do tipo

* É um tipo estruturado que pode conter (membros)
	* Atributos (dados / campos)
	* Métodos (funções / operações)
* A classe também pode prover muitos outros recursos, tais como:
	* Construtores
	* Sobrecarga
	* Encapsulamento
	* Herança
	* Polimorfismo
* Exemplos:
	* Entidades: Produtos, Cliente, Triângulo
	* Serviços: ProdutoService, ClienteService, EmailService, StorageService
	* Controladores: ProdutoController, ClienteController
	* Utilitários: Calculadora, Compactador
	* Outros (views, repositórios, gerenciadores, etc.)

### 64. Criando um método para obtermos os benefícios de reaproveitamento e delegação

* Quais são os benefícios de se calcular a área de um triângulo por meio de um **método** dentro da **classe** Triangle?
	* **Reaproveitamento de código**: nós eliminamos o código repetido (cálculo das áreas dos triângulos x e y) no programa principal.
	* **Delegação de responsabilidades**: quem deve ser responsável por saber como calcular a área de um triângulo é o próprio triângulo. A lógica do cálculo da área não deve estar em outro lugar.

### 65. Começando a resolver um segundo problema exemplo

### 66. Object e toString

* Toda a classe em Java é uma subclasse de Object
* Object possui os seguintes métodos:
	* **getClass** - retorna o tipo do objeto
	* **equals** - compara se o objeto é igual a outro
	* **hashCode** - retorna um código hash do objeto
	* **toString** - converte o objeto para string

### 67. Finalizando o programa

### 68. Exercícios de fixação

### 69. Membros estáticos - Parte 1

* Também chamados membros de classe
	* Em oposição a membros de instância
* São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.
* Aplicaçõpes comuns:
	* Classes utilitárias
	* Declaração de constantes
* Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada.

### 70. Membros estáticos - Parte 2

### 71. Exercício de fixação

## Seção 9: Construtores, palavra this, sobrecarga, encapsulamento

### 72. Visão geral do capítulo

### 73. Material de apoio do capítulo

[Construtores, this, sobrecarga e encapsulamento](https://github.com/Alexandresl/Curso-java-1/blob/master/PDFs/Aula%2073%20-%20Construtores%2C%20palavra%20this%2C%20sobrecarga%20e%20encapsulamento.pdf)

### 74. Construtores

* É uma operação especial da classe, que executa no momento da instanciação do objeto
* Usos comuns:
	* Iniciar valores dos atributos
	* Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)
* Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
	* *Product p = new Product();*
* É possível especificar mais de um construtor na mesma classe (*sobrecarga*)

### 75. Palavra this

* É uma referência para o próprio objeto.
* Usos comuns:
	* Diferenciar atributos de vasriáveis locais.
	* Passar o próprio objeto como argumento na chamada de um método ou construtor.

### 76. Sobrecarga

* É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.
* É possível também incluir um construtor padrão.
