# curso-java-1

## Links úteis

[Atalhos no Eclipse](keyboard-eclipse.md)
[Github Nelio Alves](https://github.com/acenelio)
[URI Online Judge](https://www.urionlinejudge.com.br/judge/en/login)


## Seção 1: Introdução

### 1. Introdução: visão geral do curso

* Profissional Java
	* Fundamentos
		* Lógica de programação
			* Estrutura de dados
			* Programação Orientada a objetos
		* Banco de dados
		* Análise e Design de Sistemas
	* Comercial
		* Backend
		* Web
		* Mobile
		* Desktop

* Assuntos abordados
  * Lógica de Programação e Algoritmo usando Java
    * Conceitos de programação
    * Introdução à linguagem Java
    * Estrutura sequencial
    * Estrutura condicional
    * Estruturas repetitivas
  * Java e Programação Orientada a Objetos (Parte 1)
    * Introdução à programação Orientada a Objetos
    * Construtores, palavra *this*, sobrecarga e encapsulamento
    * Comportamento de memória, array, listas
    * Tópicos especiais em Java
    * *Bônus* - Nivelamento sobre Git e Github
    * Enumeração, composição
    * Herança e polimorfismo
    * Tratamento de exceções
  * Projeto - Sistema Jogo de Xadrez
    * Composição de objetos, herança, coleções, etc.
    * Desenvolvemento em camadas
    * Padrões de projetos
  * Java e Programação Orientada a Objetos (parte 2) + Programação Funcional (lambda)
    * Trabalhando com arquivos
    * Interfaces
    * Generics, Set, map
    * Programação funcional e expressões lambda
    * *Bônus* - Nivelamento Álgebra Relacional, SQL, MySQL
    * Acesso a banco de dados com JDBC
    * Interface Gráfica com JavaFX
  * Projeto - Aplicação desktop com JavaFX e banco de dados MySQL com JDBC
    * Padrão MVC - Model View Controller
    * Padrão Camadas
    * FXML, SceneBuilder
    * Tratamento de eventos de UI
    * CRUD completo
    * Padrão de projetos
  * Projeto - Web Services com Spring Boot e JPA / Hibernate
    * *Bônus* - Nivelamento ORM com JPA / Hibernate
    * Padrão camadas
    * Web e HTTP
    * REST / Web Services
    * Modelo de domínio complexo
    * Maven
    * Banco de dados H2
    * Spring Data JPA
    * CRUD completo
    * Tratamento de exceções
  * Projeto - Web Services com Spring Boot e NoSQL (MongoDB)
    * *Bônus* - Nivelamento NoSQL e MongoDB
    * Modelo de domínio: agregados e desnormalização
    * Padrão DTO
    * Spring Data MongoDB
    * CRUD complemento
    * Tratamento de exceções

[Arquivo Curso Java Completo](PDFs/Aula%20001%20-%20Curso%20Java%20Completo.pdf)

## Seção 2: Conceitos de programação

### 2. Visão geral do capítulo

### 3. Material de apoio do capítulo

[Conceitos de programação](PDFs/Aula%20003%20-%20Conceitos%20de%20programação.pdf)

### 4. Algoritmo, Automação, Programa de Computador

* **Algoritmo** - Sequência finita de instruções para se resolver um problema. Este conceito aplica-se a diversas áreas do conhecimento.

* **Automação** - Consiste em utilizar máquina(s) para executar o procedimento desejado de forma automática ou semiautomática.

* **Computador** - É composto de *Hardware* e *Software*
    * **Hardware** - Parte física, a máquina em si.
    * **Software** - Parte lógica, que são os programas:
        * **Sistema Operacional** - Windows, linux, iOS, ...
        * **Aplicativos** - apps de escritório, apps de câmera, navegador web, ...
        * **Jogos**
        * **Utilitários** - Antivirus, compactador de arquivos
        * **entre outros**

* **Programas** - São *Algoritmos* executados pelo computador. Assim podemos dizer que o computador é uma máquina que *automatiza* a execução de algoritmos computacionais, como por exemplo, processamento de dados, cálculos, etc.

### 5. O que é preciso para se fazer um programa de computador

* Para construir um programa de computador nós vamos precisar:
    * Uma **linguagem de programação**: regras **léxicas** e **sintáticas** para se escrever o programa.
    * Uma **IDE**: Software para editar e testar o programa
    * Um **compilador**: software para transformar o **código fonte** em **código objeto**
    * Um **gerador de código** ou **máquina virtual**: software que permite que o programa seja executado

### 6. Linguagem de programação, léxica e sintática

* **Linguagem de programação** - É um conjunto de regras **léxicas** (ortografia) e **sintáticas** (gramática) para se escrever programas.
* **Léxica** - Diz respeito à correção das **palavras** "*isoladas*" (ortografia).
* **Sintática** - Diz respeito à correção das **sentenças** (gramática).
* **Exemplos de linguagens de programação** - C, Pascal, C++, Java, C#, Python, Ruby, PHP, JavaScript, etc.

### 7. IDE - Ambiente Integraedo de Desenvolvimento

* **IDE** - É um conjunto de softwares utilizado para a construção de programas.
    * Exemplos:
        * C/C++: **Code Blocks**
        * Java: **Eclipse**, **Netbeans**
        * C#: **Microsoft Visual Studio**
* **Funcionalidades de uma IDE**:
    * Edição de código fonte (indentação, autocompletar, destaque de palavras, etc.)
    * Depuração e testes
    * Construção do produto final (build)
    * Sugestão de modelos (templates)
    * Auxiliar em várias tarefas do seu projeto
    * Etc.

### 8. Compilação, interpretação, código fonte, código objeto e máquina virtual

* **Código fonte** - É o código escrito pelo programador em linguagem de programação. Este código não é entendido pelo computador, precisando ser convertido em código objeto.
* **Compilação** - É o processo que transforma código fonte em código objeto. Este código objeto, posteriormente passará por um processo de *build* para a geração do arquivo executável. Exemplos de linguagens compiladas: C, C++ e etc.
* **Interpretação** - É o processo em que a partir do código fonte, um interpretador irá realizar a análise léxica, sintática e a geração do código executável, sob demanda. Exemplo de linguagens interpretadas: PHP, JavaScript, Python, Ruby e etc.
* **Abordagem híbrida** - Além da compilação e a interpretação, existe uma abordagem híbrida. Nela, um compilador realiza uma "*pré-compilação*", neste processo será realizada a análise léxica e sintática gerando um código objeto chamado de *Bytecode*. Este *Bytecode* será interpretado sob demanda por uma máquina virtual. Exemplo de linguagens híbridas: Java e C#.

#### Vantagens:
  * **Compilação**:
    * Velocidade do programa
    * Auxílio do compilador antes da execução
  * **Interpretação**:
    * Flexibilidade de manutenção do aplicativo em produção
    * Expressividade da linguagem (menos verbosidade, normalmente são linguagens fracamente tipadas)
    * Código fonte não precisa ser recompilado para rodar em plataformas diferentes
  * **Híbridas**:
    * Auxílio do compilador antes da execução
    * Código fonte não precisa ser recompilado para rodar em plataformas diferentes
    * Auxílio do compilador antes da execução
    * Flexibilidade de manutenção do aplicativo em produção

## Seção 3: Introdução à linguagem Java

### 9. Visão geral do capítulo

### 10. Material de apoio do capítulo

[Introdução Linguagem Java](PDFs/Aula%20009%20-%20Introdução%20a%20linguagem%20Java.pdf)

### 11. Entendendo as versões do Java

[Página do download](https://www.oracle.com/java/technologies/java-se-glance.html)

* Será instalada a versão do jdk-11, por ser a mais recente versão LTS disponível.

### 12. Histórico e edições de Java

* **Java** além de uma linguagem de programação (regras sintáticas), java também é uma plataforma de programação.
* Como uma Plataforma de desenvolvimento e execução, ela fornece:
  * Biblioteca (API)
  * Ambiente de execução

#### Histórico
* Problemas resolvidos e motivo de seu sucesso:
  * Ponteiros / gerenciamento de memória
  * Portabilidade falha: reescrever parte do código ao mudar de OS
  * Utilização em dispositivos diversos
  * custo

* Criada pela Sun Microsystems no meio da década de 1990.

* Adquirida pela Oracle Corporation em 2010.

####  **Aspectos Notáveis**
* Código compilado para *bytecode* e executado em máquina virtual (JVM)
* Portável, segura e robusta
* Roda em vários tipos de dispositivos
* Domina o mercado corporativo desde o fim do século 20.
* Padrão Android por muitos anos

#### **Edições do Java**
* Java ME - Java Micro Edition - dispositivos embarcados e móveis - IoT - [Link](https://www.oracle.com/java/technologies/javameoverview.html)
* Java SE - Java Standard Edition - core - desktop e servidores - [Link](https://www.oracle.com/java/technologies/java-se-glance.html)
* Java EE - Java Enterprise Edition - aplicações corporativas - [Link](https://www.oracle.com/java/technologies/java-ee-glance.html)

### 13. JDK / JVM - Máquina Virtual do Java

#### **JVM - Java Virtual Machine**
* *Máquina Virtual do Java* - necessário para executar sistemas java
* Documentação do Java SE - [Link](https://docs.oracle.com/en/java/javase/11/)

#### **Compilação e Interpretação**
* Linguagens **compiladas**: C, C++
* Linguagens **interpretadas**: PHP, JavaScript
* Linguagens **pré-compiladas + máquina virtual**: Java, C#

### 14. Estrutura de uma aplicação Java

* **Java** é uma linguagem de programação orientada a objetos e a unidade lógica básica de um programa orientado a objeto é a **classe**.
* **Package** (pacote) - é um agrupamento lógico de classes relacionadas. Ex.: Entities, Services e Repositories.
* **Módulo** - Recurso introduzido no Java 9, é um agrupamento lógico de pacotes relacionados. Ex.: Módulo financeiro, gráfico, etc.
* **Runtime** - É o agrupamento físico. Enquanto o Módulo é o agrupamento a nível de código, o Runtime ocorre com o **build** da aplicação onde os diferentes módulos ficarão separados em arquivos.
* **Aplicação** - Agrupamento de módulos relacionados

### 15. Instalando o Java JDK

#### Instalando o Java JDK
* Vídeo/Tutorial de instalação para as diferentes plataformas:
  * [Windows](https://youtu.be/laC0fiI-IOM)
  * [Línux](https://www.youtube.com/watch?v=Sv0EwYPLw8w&list=PLNuUvBZGBA8mcAF-YX7RJhA26TBLdG5yk&index=3)
  * [Mac](https://github.com/devsuperior/sds2/tree/master/instalacao/mac#java-11-on-macos)

### 16. Instalando Java JDK

* [Link para download do Java Zulu](https://www.azul.com/downloads/)

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

[Link para o projeto](ws-eclipse/secao3/Aula18-Exemplo1)

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

| Expressão          | Resultado |
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
char sexo = 'F'; // Caractere Unicode
```

* Em resumo, uma variável possui:
  * Nome (ou identificador)
  * Tipo
  * valor
  * Endereço (local na memória onde o valor está armazenado)

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

double x = 10.35784;

System.out.println(x); // 10.35784
System.out.printf("%.2f%n", x); // 10,35
System.out.printf("%.4f%n", x); // 10,3578
Locale.setDefault(Locale.US);
System.out.printf("%.2f%n", x); // 10.35
System.out.printf("%.4f%n", x); // 10.3578
```

  * *Obs*.: O comando `printf` por padrão irá formatar conforme a configuração do sistema operacional. Dessa forma ele irá apresentar os números de ponto flutuante com o separador da vírgula em computadores em português. Ex.: `10,3578`. Para que seja apresentado com o ponto (.) deverá ser definido o `locale` conforme exemplo acima.

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

* Para realizarmos a entrada de dados em um programa java, utilizamos um objeto chamado *Scanner*. O **Scanner** é importado de `java.util.Scanner`.
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

[Código fonte](ws-eclipse/Aula30-ExercicioResolvido01)

#### Exercícios propostos

* [Exercício 1](ws-eclipse/Aula30-Exercicio01)
* [Exercício 2](ws-eclipse/Aula30-Exercicio02)
* [Exercício 3](ws-eclipse/Aula30-Exercicio03)
* [Exercício 4](ws-eclipse/Aula30-Exercicio04)
* [Exercício 5](ws-eclipse/Aula30-Exercicio05)
* [Exercício 6](ws-eclipse/Aula30-Exercicio06)

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
| V   | V   | V      |
| V   | F   | F      |
| F   | V   | F      |
| F   | F   | F      |

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
| V   | V   | V     |
| V   | F   | V     |
| F   | V   | V     |
| F   | F   | F     |

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

 [Código fonte](ws-eclipse/Aula037-ExercicioResolvido01)

 [Exercício resolvido 2](https://www.youtube.com/watch?v=3lhkB5I8P6E)

 [Código fonte](ws-eclipse/Aula037-ExercicioResolvido02)

 [Exercício resolvido 3](https://www.youtube.com/watch?v=UjCVIcKccdQ)
 
 [Código fonte](ws-eclipse/Aula037-ExercicioResolvido03)

 #### Exercícios propostos

 [Exercício 1](ws-eclipse/Aula037-Exercicio01)

 [Exercício 2](ws-eclipse/Aula037-Exercicio02)
 
 [Exercício 3](ws-eclipse/Aula037-Exercicio03)
 
 [Exercício 4](ws-eclipse/Aula037-Exercicio04)
 
 [Exercício 5](ws-eclipse/Aula037-Exercicio05)

 [Exercício 6](ws-eclipse/Aula037-Exercicio06)
 
 [Exercício 7](ws-eclipse/Aula037-Exercicio07)

 [Exercício 8](ws-eclipse/Aula037-Exercicio08)
 
### 38. Sintaxe opcional - operadores de atribuição cumulativa

#### Operadores de atribuição cumulativa

| Operadores | expressão equivalente |
| ---------- | --------------------- |
| a += b;    | a = a + b;            |
| a -= b;    | a = a - b;            |
| a *= b;    | a = a * b;            |
| a /= b;    | a = a / b;            |
| a %= b;    | a = a % b;            |

[Exemplo de uso](ws-eclipse/Aula038-Exemplo01)

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

[Exemplo de uso](ws-eclipse/Aula039-Exemplo01)

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

[Exemplo](ws-eclipse/Aula041-Exemplo01)

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

[Exemplo](ws-eclipse/Aula044-Exemplo01)

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

[Exemplo](ws-eclipse/Aula045-Exemplo01)