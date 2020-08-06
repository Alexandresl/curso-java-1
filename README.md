# curso-java-1

## Atalhos Eclipse (Extra)
* **Aumentar fonte** - CTRL +
* **Diminuir fonte** - CTRL -
* **Executar como aplicação Java** - Alt Shift X, J

## Seção 1: Introdução

### 1. Introdução: Visão geral do curso

[Curso Java Completo](https://github.com/Alexandresl/Curso-java-1/blob/master/PDFs/Aula%201%20-%20Curso%20Java%20Completo.pdf)

## Seção 2: Conceitos de programação

### 2. Visão geral do capítulo

### 3. Material de apoio do capítulo

[Conceitos de programação](https://github.com/Alexandresl/Curso-java-1/blob/master/PDFs/Aula%203%20-%20Conceitos%20de%20programa%C3%A7%C3%A3o.pdf)

### 4. Algoritmo, automação e programação de computador

* **Algoritmo** - Sequência finita de instruções para se resolver um problema. 
* Aplica-se a diversas áreas do conhecimento.
* **Automação** - Consiste em utilizar máquina(s) para executar o procedimento desejado de forma automática ou semiautomática.
* **Computador**:
    * **Hardware** - Parte física (a máquina em si)
    * **software** - parte lógica (programas)
* **Programa ~ Algoritmo** - Programas de computador são **algoritmos** executados pelo computador (em linhas gerais).
* **Conclusão** - O computador é uma máquina que **automatiza** a execução de **algoritmos**.
* O computador é apto para executar apenas algoritmos computacionais. ex.: Processamento de dádos, cálculos, etc.

### 5. O que é preciso para se fazer um programa de computador

**Vamos precisar de**:
    * Uma **linguagem de programação**: regras **léxicas** e **sintáticas** para se escrever o programa
    * Uma **IDE**: software para editar e testar o programa
    * Um **compilador**: software para transformar o **código fonte** em **código objeto**
    * Um **gerador de código** ou **máquina virtual**: software que permite que o programa se executado

### 6. Linguagens de programação, léxica e sintática

* É um conjunto de regras **léxicas** (ortografia) e **sintáticas** (gramática) para se escrever programas.
* **Léxica** - Diz respeito à correção das **palavras** "isoladas" (ortografia)
* **Sintática** - Diz respeito à correção das sentenças (gramática)
* **Linguagens de programação** - Ex.: C, Pascal, C++, Python, Ruby, PHP, JavaScript, etc.

### 7. IDE - Ambiente Integrado de Desenvolvimento

* É um conjunto de softwares utilizado para a construção de programas
* Exemplos:
    * C/C++: Code Blocks
    * Java: Eclipse, NetBeans
    * C#: Microsoft Visual Studio

## Seção 3: Introdução à linguagem Java

### 8. Visão geral do capítulo

### 9. Material de apoio do capítulo

[Introdução à linguagem Java](https://github.com/Alexandresl/Curso-java-1/blob/master/PDFs/Aula%209%20-%20Introdu%C3%A7%C3%A3o%20a%20linguagem%20Java.pdf)

### 10. Entendendo as versões do Java

* Referência: [https://www.oracle.com/java/technologies/java-se-glance.html](https://www.oracle.com/java/technologies/java-se-glance.html)
* **LTS** - Long Term Suport

### 11. Histórico e edições de Java

* **Java** é tanto uma linguagem de programação (regras sintáticas) quanto uma Plataforma de desenvolvimento e execução, composto entre outras coisas de bibliotecas (API) e ambienbte de execução.
* **Histórico**
    * Problemas resolvidos e motivo para o sucesso do Java:
        * Ponteiros / Gerenciamento de memória
        * Portabilidade falha: reescrever parte do código ao mudar de SO
        * Utilização em dispositivos diversos
        * Custo
    * Criada pela Sun Microsystems no meio da década de 1990
    * Adquirida pela Oracle Corporation em 2010
* **Aspectos notáveis**
    * Código compilado para *bytecode* e executado em máquina virtual (JVM)
    * Portável, segura e robusta
    * Roda em vários tipos de dispositivos
    * Domina o mercado corporativo desde o fim do século 20
    * Padrão Android por muitos anos
* **Edições**
    * **Java ME** - Java Micro Edition - dispositivos embarcados e móveis - IoT
        * [http://www.oracle.com/technetwork/java/javame](http://www.oracle.com/technetwork/java/javame)
    * **Java SE** - Java Standard Edition - core - desktops e servidores
        * [https://www.oracle.com/java/technologies/java-se-glance.html](https://www.oracle.com/java/technologies/java-se-glance.html)
    * **Java EE** - Java Enterprise Edition - aplicações corporativas
        * [http://www.oracle.com/technetwork/java/javaee](http://www.oracle.com/technetwork/java/javaee)

### 12. JDK / JVM - Máquina Virtual do Java

* **JVM** - Java Virtual Machine
    * Máquina virtual do Java - necessário para executar sistemas Java
* **Compilação e interpretação**
    * Linguagens **compiladas** - C, C++
    * Linguagens **interpretadas** - PHP, JavaScript
    * Linguagens **pré-compiladas + máquina virtual** - Java, C#

### 13. Estrutura de uma aplicação Java

* Java é uma linguagem orientada a objetos. A unidade lógica básica de um programa orientado a objeto é a **classe**. 
* Todo o código em java deve estar dentro de classes.
* **package** (pacote) - agrupamento *LÓGICO** de classes relacionadas.
* **Módulo** - Introduzido no Java 9 - Agrupamento lógico de pacotes relacionados.
* **Runtime** - Agrupamento físico.
* **Aplicação** - Agrupamento de módulos relacionados

### 14. Instalando Java JDK

* Baixar e instalar o Java JDK - [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)
* Configurar variáveis de ambiente do sistema
    * Painel de controle -> Variáveis de ambiente
        * JAVA_HOME:
            * C:\Program Files\Java\jdk-11.0.4
        * Path: incluir
            * C:\Program Files\Java\jdk-11.0.4\bin
    * Testar no terminal de comando: *java -version*
* Baixar e descompactar o Eclipse
    * [https://www.eclipse.org/downloads/packages/](https://www.eclipse.org/downloads/packages/)
    * Testar: rodar o eclipse e escolher um "*workspace*" (pasta onde você vai salvar seus projetos)

### 15. Instalando o Eclipse

### 16. Primeiro programa em Java no Eclipse

* Workspace (Selecione a pasta aonde os projetos serão salvos)
* Mudar o layout: Windows -> Perspective -> Open Perspective -> Java
* Zerar o layout: Windows -> Perspective -> Reset Perspective
* Mostar a aba Console: Windows -> Show View -> Console
* Criar projeto: File -> New -> Java Project
* **Criar Classe**:
    * Botão direito na pasta "src" -> New -> Class
    * Package: deixar em branco
    * Nome da classe Main (com M maiúsculo)
    * Marque a opção: *public static void main(String[] args)*

## Seção 4: Estrutura sequencial

### 17. Visão geral do capítulo

### 18. Material de apoio do capítulo

[Estrutura sequencial](https://github.com/Alexandresl/Curso-java-1/blob/master/PDFs/Aula%2018%20-%20Estrutura%20sequencial.pdf)

### 19. Expressões aritméticas

* São expressões que quando calculadas retornam um valor númérico.
* **Operadores aritméticos**:
```
-------------------------------------------------
|	Operador	|	Significado	|
-------------------------------------------------
|	+		|	Adição		|
|	-		|	Subtração	|
|	*		|	Multiplicação	|
|	/		|	Divisão		|
|	%		|	Módulo		|
-------------------------------------------------
```
* **Precedência**:
    * **1º lugar**: * / %
    * **2º lugar**: + 0
    * **Obs**.: expressões entre parênteses são calculadas em primeiro lugar

### 20. Variáveis e tipos básicos em Java

* **Visão geral**:
    * Um programa de computador em execução lida com dados
    * Como estes dados são armazenados? **Em variáveis**
    * **Variável** - (*definição informal*) Um programação, uma variável é uma porção de memória (RAM) utilizada para armazenar dados durante a execução dos programas.
* **Declaração de variáveis**
    * Sintaxe:
    ```
    <tipo> <nome> = <valor inicial>;
    ```
    * Exemplos:
    ```java
    int idade = 25;
    double altura = 1.68;
    char sexo = 'F';
    ```
* **Uma variável possui**:
    * Nome (ou identificador)
    * Tipo
    * Valor
    * Endereço
* **Tipos primitivos em Java**:

```
---------------------------------------------------------------------------------------------------------------------------------
|	Descrição		|	Tipo	|	Tamanho	|	Valores				|	Valor padrão	|
---------------------------------------------------------------------------------------------------------------------------------
|				|	byte	|	8 bits	|	-128 a 127			|	0		|
|				|------------------------------------------------------------------------------------------------
|	tipos numéricos		|	short	|	16 bits	|	-32768 a 32767			|	0		|
|				|------------------------------------------------------------------------------------------------
|	inteiros		|	int	|	32 bits	|	-2147483648 a 2147483647	|	0		|
|				|------------------------------------------------------------------------------------------------
|				|	long	|	64 bits	|	-9223372036854770000 a		|	0L		|
|				|		|		|	9223372036854770000		|			|
---------------------------------------------------------------------------------------------------------------------------------
|	tipos números com	|	float	|	32 bits	|	-1,4024E-37 a 3,4028E+38	|	0.0f		|
|				|------------------------------------------------------------------------------------------------
|	ponto flutuante		|	double	|	64 bits	|	-4,94E-307 a 1,79E+308		|	0.0		|
---------------------------------------------------------------------------------------------------------------------------------
| 	Um caractere Unicode	|	char	|	16 bits	|	'\u0000' a '\uFFFF'		|	'\u0000'	|
---------------------------------------------------------------------------------------------------------------------------------
|	Um valor verdade	|	boolean	|	1 bit	|	{false, true}			|	false		|
---------------------------------------------------------------------------------------------------------------------------------
```
* **String** - Cadeia de caracteres (palavras ou textos)
* **Veja**: [unicode-table.com](https://unicode-table.com/pt/)
* **Nome de variáveis**:
    * Não pode começar com dígito: use uma letra ou o _
    * Não pode ter espaço em branco
    * Não usar acentos ou til
    * Sugestão: use o parão "*Camel case*"

### 21. As três operações básicas de programação

* Um programa de computador é capaz de realizar essencialmente três operações:
    * Entrada de dados - (*Leitura*) - Usuário informa dados para o programa, que são armazenados em variáveis. O usuário informa dados através de dispositivos de entrada, como, por exemplo, um teclado.
    * Processamento de dados - É quando o programa realiza cálculos. O processamento de dados se dá por um comando chamado **atribuição**.
    * Saída de dados - (*Escrita*) - É quando o programa informa dados para o usuário. o programa utiliza para esta operação os dispositivos de saída, como o monitor.

### 22. Saída de dados em Java

* Para escrefver na tela um texto qualquer
    * Sem quebra de linha no final:
    ```java
    System.out.print("Bom dia!");
    ```
    * Com quebra de linha no final:
    ```java
    System.out.println("Bom dia!");
    ```
* Para escrever o conteúdo de uma variável de algum tipo básico:
    * Suponha uma variável *y* tipo **int** declarada e iniciada:
    ```java
    int y = 32;
    
    System.out.println(y);
    ```
* Para escrever o conteúdo de uma variável de ponto flutuante:
    * Suponha uma variável *x* do tipo **double** declarada e iniciada:
    ```java
    double x = 10.35784;

    system.out.println(x);
    system.out.printf("%.2f\n", x);
    system.out.printf("%.4f\n", x);
    ```
    * Observações:
        * *\n* - quebra de linha. Independente de plataforma.
        * O comando printf, por padrão retorna o número no formato da localidade do sistema
        * Para considerar o separador de decimais como ponto, **antes** da declaração do *Scanner*, faça:
        ```java
        Locale.setDefault(Locale.US)
        ```
* Para concatenar vários elementos em um mesmo comando de escrita:
    * Regra geral para **print** e **println**: elemento1 + elemento2 + ... + elementoN
    ```java
    System.out.println("Resultado: " + x + " Metros");
    ```
    * Regra geral para **printf**: "Texto1 %f Texto2 %f Texto3", variavel1, variavel2
        ```java
        System.out.printf("Resultado = %.2f metros\n", x);
        ```
        * Observações:
            * *%f - ponto flutuante
            * *%d* - Inteiro
            * *%s* - texto
            * *%n* ou *\n* - quebra de linha
            * mais informações [link](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)
        ```java
        String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade, renda);
        ```

### 23. Processamento de dados em Java e Casting

* O **processamento de dados** é feito pelo comando de atribuição
* **Sintaxe**:
```
<variavel> = <expressão>;
```
* ***BOA PRÁTICA*** - Sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira).
    * Para **double** - .0 - ex.: *5.0*
    * Para **float** - f - ex.: *5f*

### 24. Entrada de dados em Java - Parte 1

* A entrada de dados é a operação realizada quando o usuário informa dados para o programa por meio de de dispositivos de leitura.
* Os dados informados pelo usuário são armazenado em variáveis
* **Scanner**
    * Para fazer entrada de dados, nós vamos criar um objeto do tipo "*Scanner*" da seguinte forma:
    ```java
    Scanner sc = new Scanner(System.in);
    ```
    * Para que possamos instanciar um objeto do tipo *Scanner*, teremos que realizar a importação:
    ```java
    import java.util.Scanner;
    ```
    * Para desalocar o recurso do *Scanner*, quando não formos mais utilizar, temos que usar o camando a seguir:
    ```java
    sc.close();
    ```
* Para ler **uma palavra** (texto sem espaços):
```java
    String x;
    x = sc.next();
```
* Para ler **um número inteiro**:
```java
int x;
x = sc.nextInt();
```
* Para ler **um número com ponto flutuante**:
```java
double x;
x = sc.nextDouble();

// será retornado o número no formato do sistema operacional
// Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner, faça:
// Locale.setDefault(Locale.US);
```
* Para ler **um caractere**:
```java
char x;
x = sc.next().charAt(0);
```
* Para ler **Vários dados na mesma linha**
```java
String x;
int y;
double z;

x = sc.next();
y = sc.nextInt()
z = sc.nextDouble()

// Aceita cada um dos valores separados por um espaço. Ex.: string 3 5.3
```