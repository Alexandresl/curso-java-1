# Curso Java Completo

## Links úteis

[Atalhos do Eclipse](Eclipse-atalhos.md)

 [URI Online Judge](www.urionlinejudge.com.br)

## Seção 1: Introdução

### 1. Introdução: Visão geral do curso

[Material de apoio](Recursos/pdf/01-Curso-Java-COMPLETO.pdf)

#### Profissional Java

* Fundamentos
  * Lógica de programação
  * Estrutura de dados
  * Programação Orientada a Objetos
  * Banco de dados
  * Análise e Design de Sistemas
* Comercial
  * Backend
  * Web
  * Mobile
  * Desktop

#### **Assuntos abordados**

* *Lógica de Programação - Algoritmos Usando Java (iniciante)*
  * Conceitos de programação
  * Introdução à linguagem Java
  * Estrutura sequencial
  * Estrutura condicional
  * Estruturas repetitivas
* *Java e Programação Orientada a Objetos (parte 1)*
  * Introdução à programação Orientada a Objetos
  * Construtores, palavra this, sobrecarga, encapsulamento
  * Comportamento de memória, arrays, listas
  * Tópicos especiais em Java
  * BÔNUS - Nivelamento sobre Git e Github
  * Enumerações, composição
  * Herança e polimorfismo
  * Tratamento de exceções
* *PROJETO - Sistema jogo de xadrez*
  * Composição de objetos, herança, coleções, etc.
  * Desenvolvimento em camadas
  * Padrão de projetos
* *Java e Programação Orientada a objetos (parte 2) + Programação Funcional*
  * Trabalhando com arquivos
  * Interfaces
  * Generics, Set, Map
  * Programação funcional e expressões lambda
  * BÔNUS - Nivelamento álgebra relacional, SQL, MySQL
  * Acesso a banco de dados com JDBC
  * Interface Gráfica com JavaFX
* *PROJETO - Aplicação desktop com JavaFX e banco de dados MySQL com JDBC*
  * Padrão MVC - Model View Controller
  * Padrão Camadas
  * FXML, SceneBuilder
  * Tratamento de eventos de UI
  * CRUD completo
  * padrão0 de projetos
* *PROJETO - Web Services com Spring Boot e JPA / Hibernate*
  * BÔNUS - Nivelamento ORM com JPA / Hibernate
  * Padrão camadas
  * Web e HTTP
  * REST / Web Services
  * Modelo de domínio complexo
  * Maven
  * Banco de dados H2
  * Spring Data JPA
  * CRUD completo
  * Tratamento de exceções
* *PROJETO - Web services com Spring boot e NoSQL (MongoDB)*
  * Bônus - Nivelamento NoSQL e MongoDB
  * Modelo de domínio: agregados e desnormalização
  * Padrão DTO
  * Spring Data MongoDB
  * CRUD completo
  * Tratamento de exceções

## Seção 2: Conceitos de programação

### 2. Visão geral do capítulo

### 3. Material de apoio do capítulo

[Material de apoio](Recursos/pdf/02-conceitos-de-programacao.pdf)

### 4. Algoritmo, Automação, Programa de computador

#### **Algoritmo**

* Sequência finita de instruções para se resolver um problema. Aplicamos este conceito a diversas área de conhecimento.
* Exemplo:
  * **problema**: *lavar a roupa suja*
  * **Algoritmo** (*um dos algoritmos possíveis*):
    * 1. Colocar a roupa em um recipiente
    * 2. Colocar um pouco de sabão e amaciente
    * 3. Encher de água
    * 4. Mexer tudo até dissolver todo o sabão
    * 5. Deixar de molho por vinte minutos
    * 6. Esfregar a roupa
    * 7. Enxaguar
    * 8. Torcer

#### **Automação**

* Consiste em utilizar máquina(s) para executar o procedimento desejado de forma automática ou semiautomática.

#### **Computador**

* **Hardware** - Parte física (a máquina em si)
* **Software** - Parte lógicas (programas)
  * Sistema operacional (Windows, Linux, iOS)
  * Aplicativos (apps de escritório, app de câmera, navegador web)
  * Jogos
  * Utilitários (Antivírus, compactador de arquivos)
  * Outros

#### **Programa** x **Algoritmo**

* Existe uma similaridade entre os conceitos de programa de commputador e algoritmos.
* Em linhas gerais, **programas de computador** são **algoritmos** executados pelo computador.
* Desta forma, podemos concluir que o computador é uma máquina que **automatiza** a execução de **algoritmos**.
* Os **algoritmos** automatizados pelo computador são os chamados *algoritmos computacionais*:
  * processamento de dados
  * cálculos
  * etc

### 5. O que é preciso para se fazer um programa de computador

#### Para criar um programa de computador, vamos precisar de

* Uma **linguagem de programação**: regras **léxicas** e **sintáticas** para se escrever o programa.
* uma **IDE**: software para editar e testar o programa.
* um **compilador**: software para transfermar o **código fonte** em **código objeto**.
* um **gerador de código** ou **máquina virtual**: software que permite que o programa seja executado.

### 6. Linguagem de programação, léxica e sintática

#### Linguagem de programação

* É um conjunto de regras **léxicas** (*ortografia*) e **sintáticas** (gramática) para se escrever programas.

#### Léxica

* Diz respeito à correção das **palavras isoladas** (ortografia).

#### Sintática

* Diz respeito à correção das sentenças (gramática).

#### Exemplos de linguagens de programação

* Existem diversas linguagens de programação: **C**, **Pascal**, **C++**, **Java**, **C#**, **Python**, **Ruby**, **PHP**, **JavaScript**, etc.

### 7. IDE - Ambiente Integrado de Desenvolvimento

* IDE é a sigla para *Integrated Development Environment* ou *Ambiente Integrado de Desenvolvimento*. Trata-se de um conjunto de softwares utilizados para a construção de programas. Exemplos:
  * C/C++: **Code Blocks**
  * Java: **Eclipse, NetBeans**
  * C#: **Microsoft Visual Studio**

#### Funcionalidades de uma IDE

* Edição de código fonte (endentação, autocompletar, destaque de palavras, etc)
* Depuração e testes
* Construção do produto final (build)
* Sugestão de modelos (templates)
* Auxiliar em várias tarefas do seu projeto
* etc

### 8. Compilação, interpretação, código fonte, código objeto, máquina virtual

#### Código fonte

* É aquele escrito pelo programador em linguagem de programação

#### Tipos de linguagens

* **Compiladas**
  * O código fonte é transformado (compilado) pelo compilador em código objeto. O compilador realiza uma análise léxica e sintática do código fonte.
  * Uma vez que o código fonte foi compilado e transformado em código objeto. Este passará por um gerador de código, processo conhecido como *build*.
  * Após o *build* teremos um código executável que poderá ser executado pelo sistema operacional.
  * Exemplos de linguagens que tipicamente usam esta abordagem: **C** e **C++**.

* **Interpretadas**
  * Nas linguagens interpretadas, o código fonte passa por um interpretador. Este realizará as análise léxicas, sintáticas e fará a geração do código sob demanda no momento em que o programa é executado.
  * Exemplos de linguagens que tipicamente usam esta abordagem: **PHP**, **JavaScript**, **Python** e **Ruby**

* **Abordagem híbrida**
  * Nesta abordagem o código fonte passa por uma précompilação, com a análise léxica e sintática, resultando em um **bytecode**.
  * Este **bytecode** é executado por uma máquina virtual, que faz a interpretação deste código sob demanda.
  * Exemplos de linguagens que tipicamente usam esta abordagem: **Java** e **C#**

#### Vantagens

* **Linguagens compiladas**
  * Velocidade do programa
  * Auxílio do compilador antes da execução

* **Linguagens interpretadas**
  * Flexibilidade de manutenção do aplicativo em produção
  * Expressividade da linguagem
  * Código fonte não precisa ser compilado para rodar em plataformas diferentes

* **Abordagem híbrida**
  * Se beneficia das principais vantagens das duas abordagem:
  * Principais vantagens:
    * Auxílio do compilador antes da execução
    * Código fonte não precisa ser compilado para rodar em plataformas diferentes
  * Vantagens secundárias (parcialmente aproveitadas):
    * Velocidade do programa
    * Flexibilidade de manutenção do aplicativo em produção

## Seção 3: Introdução à linguagem Java

### 9. Visão geral do capítulo

### 10. Material de apoio do capítulo

[Material de apoio](Recursos/pdf/03-introducao-linguagem-java.pdf)

### 11. Entendendo as versões do Java

[Link atual das versões do Java](https://www.oracle.com/java/technologies/downloads/)

* LTS - Long Term Support

### 12. Histórico e edições do Java

#### O que é Java?

* Java é além de uma linguagem de programação, ou seja, um conjunto de regras sintáticas, uma plataforma de desenvolvimento e execução. Esta incluí bibliotecas (APIs) e ambiente de execução.

#### Histórico

* Os problemas resolvidos e o motivo de seu sucesso:
  * Ponteiros / gerenciamento de memória
  * Portabilidade falha: reescrever parte do código ao mudar de S.O.
  * Utilização em diversos dispositivos
  * Custo

* Criada pela Sum Microsystems no meio da década de 1990

* Adquirida pela Oracle Corporation em 2010

#### Aspectos notáveis

* O código java é compilado para *bytecode* e executado em uma máquina virtual - *JVM*.
* É portável, segura e robusta.
* Roda em vários tipos de dispositivos.
* Domina o mercado corporativo desde o fim do século 20.
* Padrão para o desenvolvimento Android por muitos anos.

#### As edições do Java

* [Java ME - Java Micro Edition](https://www.oracle.com/java/technologies/javameoverview.html) - Para dispositivos embarcados e móveis - IoT

* [Java SE - Java Standard Edition](https://www.oracle.com/java/technologies/java-se-glance.html) - Core - Para Desktops e servidores

* [Java EE](https://www.oracle.com/java/technologies/java-ee-glance.html) - Java Enterprise Edition - Para plicações corporativas

### 13. JDK / JVM - Máquina virtual do Java

#### JVM - Java Virtual Machine

* A **JVM** - máquina virtual do Java - é necessária para executar sistema em Java. Também é necessária no desenvolvimento de aplicações em Java.

### 14. Estrutura de uma aplicação Java

* **Java** é uma linguagem de programação orientada a objetos e a unidade básica dela é a **classe**, ou seja, todo o código estará dentro de uma classe.
* temos também o conceito de **pacote** ou**package**, que é o agrupamento lógico de classes relacionadas.
* A partir do Java 9, foi adicionado o conceito de **módulo**, que é o agrupamento de pacotes relacionados.
* A **aplicação** é um agrupamento de módulos relacionados.

### 15. Instalando o Java JDK

* Windows: [https://www.youtube.com/watch?v=QekeJBShCy4](https://www.youtube.com/watch?v=QekeJBShCy4)

* Linux: [https://www.youtube.com/watch?v=Sv0EwYPLw8w&list=PLNuUvBZGBA8mcAF-YX7RJhA26TBLdG5yk&index=3](https://www.youtube.com/watch?v=Sv0EwYPLw8w&list=PLNuUvBZGBA8mcAF-YX7RJhA26TBLdG5yk&index=3)

Mac: [https://github.com/devsuperior/sds2/tree/master/instalacao/mac#java-11-on-macos](https://github.com/devsuperior/sds2/tree/master/instalacao/mac#java-11-on-macos)

### 16. Instalando o Java JDK

[Link da distribuição Zulu](https://www.azul.com/downloads/?package=jdk)

* Configuração das variáveis de ambiente do sistema
  * Painel de Controle -> Variáveis de ambiente
    * JAVA_HOME: C:\Program Files\Java\jdk... (pasta da versão instalada)
    * Path: incluir o caminho - C:\Program Files\Java\jdk... (pasta da versão instalada)/bin
* Para verificar se a configuração ocorreu com sucesso, basta testar no terminal o comando: ```java version```

### 17. Instalando o Eclipse

Link do download: [https://www.eclipse.org/downloads/packages/](https://www.eclipse.org/downloads/packages/)

### 18. Primeiro programa em Java no Eclipse

#### Primeiros passos

* Workspace: Seleciona a pasta onde o projeto será salvo
* Mudar o Layout: Windows -> Perspective -> Open Perspective -> Java
* Zerar o Layout: Windows -> Perspective -> Reset Perspective
* Mostrar a aba do console: Windows -> Show View -> Console
* Criar Projetos: File -> New -> Java Project
* Para criar uma classe:
  * Botão direito na pasta *src* -> new -> class
  * Package: em branco
  * nome da classe: Main (com M maiúsculo)
  * marque a opção: *public static void main (string[] args)*
* Alterar o tamanho da fonte:
  * Ctrl +
  * Ctrl -

[Exemplo 1](Workspace/aula018_Exemplo_001)

## Seção 4: Estrutura sequencial

### 19. Visão geral do capítulo

### 20. Material de apoio do capítulo

[Material de apoio](Recursos/pdf/04-estrutura-sequencial.pdf)

### 21. Expressões aritméticas

* **Expressões aritméticas** são aquelas que quando calculadas retornam um valor numérico. Exemplo: *4 + 5 = 9*

#### Operadores Aritméticos

| Operador | Significado               |
| -------- | ------------------------- |
| +        | Adição                    |
| -        | Subtração                 |
| *        | Multiplicação             |
| /        | divisão                   |
| %        | Módulo (Resto da divisão) |

#### Ordem de prescedência

| Importância | operadores                                  |
| ----------- | ------------------------------------------- |
| 1º Lugar    | * (multiplicação), / (divisão) e % (módulo) |
| 2º Lugar    | + (adição) e - (subtração)                  |

#### Exemplos

| Expressão          | Resultado |
| ------------------ | --------- |
| 2 * 6 / 3          | 4         |
| 3 + 2 * 4          | 11        |
| (3 + 2) * 4        | 20        |
| 60 / (3 + 2) * 4   | 48        |
| 60 / ((3 + 2) * 4) | 3         |

### 22. Variáveis e tipos básicos em Java

* Um programa de computador em execução lida com dados. Estes dados são armazenados em variáveis.
* **Variáveis** em programação é uma porção de memória (RAM) utilizada para armazenar dados durante a execução dos programas.
* Para uma programa em Java utilizar variávies, estas devem ser declaradas com a seguinte sintaxe: ```<tipo> <nome> = <valor inicial>;```. Exemplo:

```java
int idade = 25;
double altura = 1.68;
char sexo = 'F';
```

* Desta forma concluímos que uma variável possui:
  * Nome (ou identificador)
  * Tipo
  * Valor
  * Endereço (local da memória onde o dado está armazenado)

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

* **String** é uma cadeia de caracteres e apesar de não ser um tipo primitivo será amplamente utilizado.
* Para descobrir um código unicode referente a um caracter, podemos utilizar o link [unicode-table.com](https://unicode-table.com/pt/). Ex.: 'a' = '\u0061'

* A quantidade de bits determina a quantidade de valores diferentes que determinada tipo pode armazenar. Para sabermos este limite basta utilizarmos o número de bits como expoente de 2. Ex.:
  * 8 bits = 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 = 2⁸ = 256

#### Nome de variáveis

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
  * Entrada de dados
  * Processamento de dados
  * Saída de dados

#### Entrada de dados

* É quando um usuário informa dados para um programa. Os dados informados serão armazenados dentro de variáveis.
* Os dados são inseridos pelo usuário através de **dispositivos de entrada**.
* Um exemplo de dispositivo de entrada é o teclado.
* A operação de **entrada de dados** também é conhecida como **leitura**.

#### Processamento de dados

* É quando o computador realiza cálculos de acordo com as instruções contidas nos programas de computadores.
* O **processamento de dados** se dá por um comando chamado de **atribuição** (**=**).

#### Saída de dados

* É quando um programa informa dados para o usuário.
* O programa utiliza **dispositivos de saída** para informar estes dados.
* Um exemplo de **dispositivo de saída** é o monitor do computador.
* A operação de **saída de dados** também é conhecida como **escrita**.

### 24. Saída de dados em Java

#### Para escrevermos um texto qualquer

```java
// Sem quebra de linha ao final
System.out.print("Bom dia!");

// Com quabra de linha ao final
System.out.println("Bom dia!");
```

* Para escrever na tela o conteúdo de uma variável de algum tipo básico:

```java
// considerando uma variável do tipo int declarada e iniciada
int y = 32;

System.out.println(y);
```

#### Para escrever o conteúdo de uma variável com ponto flutuante

```java
// Considerando uma variável do tipo double declarada e iniciada
double x = 10.35784;

System.out.println(x);
System.out.printf("%.2f%n", x);
System.out.printf("%.4f%n", x);
```

* **Atenção**: para considerar o separador de decimais como ponto, **antes** da declaração do Scanner, faça: ```Locale.setDefault(Locale.US);```
* **Atenção 2**: O simbolo **%n** representa uma quebra de linha e pode ser utilizada independente de plataforma.

#### Para concatenar vários elementos em um mesmo comando de escrita Sem formatação

* Como regra geral para concatenar usando os comandos **print** ou **println** utilizamos: ```elemento1 + elemento2 + ... + elementoN```. Exemplo:

```java
System.out.println("Resultado = " + x + " metros");
```

#### Para concatenar vários elementos em um mesmo comando de escrita Com formatação

* Como regra geral para concatenar usando o comando **printf**: ```"elemento1 %f elemento2 %f elemento3", variavel1, variavel2```
* O simbolo **%f** representa um número de ponto flutuante.
* O simbolo **%n** representa uma quebra de linha.

```java
System.out.printf("Resultado = %.2f metros%n", x);
```

#### Para concatenar vários elementos em um mesmo comando de escrita com diferentes tipos de variáveis

* Para concatenar com diferentes tipos de variáveis utilizaremos:
  * *%f* para ponto flutuante
  * *%d* para inteiro
  * *%s* para texto
  * *%n* para quebra de linha
* Mais informações sobre formato de números em [https://docs.oracle.com/javase/tutorial/java/data/numberformat.html](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)

```java
String nome = "Maria";
int idade = 31;
double renda = 4000.0;

System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
```

[Exemplo 1](Workspace/aula024_Exemplo_001)

[Exercício 1](workspace/aula024_Exercicio_001/)

### 25. Processamento de dados em Java, Casting

* O processamento de dados em Java é feito por meio do comando de atribuição.
* Sintaxe: ```<variavel> = <expressão>;```.
* Lê-se que a *variável* recebe o resultado da *expressão*.

#### Regra de execução

1. A expressão é calculada.
2. O resultado da expressão é armazenado na variável.

```Java
// Exemplo 1

int x, y;

x = 5;

y = 2 * x;

System.out.println(x); // 5
System.out.println(y); // 10
```

[Exemplo 1](Workspace/aula025_Exemplo_001)

```java
// Exemplo 2

int x;
double y;

x = 5;

y = 2 * x;

System.out.println(x); // 5
System.out.println(y); // 10.0
```

[Exemplo 2](Workspace/aula025_Exemplo_002)

```java
// Exemplo 3

double b, B, h, area;

b = 6.0;
B = 8.0;
h = 5.0;

area = (b + B) / 2.0 * h;

System.out.println(area); // 35.0
```

[Exemplo 3](Workspace/aula025_Exemplo_003)

* **Atenção** - Sempre indique o tipo do número, se a expressão fo de ponto flutuante (não inteira).
  * Para **double** use: **.0**
  * Para float use: **f**

```java
// Exemplo 4
int a, b;
double resultado;

a = 5;
b = 2;

resultado = (double) a / b;

System.out.println(resultado); // 2.5
```

[Exemplo 4](Workspace/aula025_Exemplo_004)

```java
// Exemplo 5

double a;
int b;

a = 5.0;
b = (int) a;

System.out.println(b); // 5

```

[Exemplo 5](Workspace/aula025_Exemplo_005)

### 26. Entrada de dados em Java - Parte 1

* A entrada de dados é quando um usuário informa dados para um programa por meio de um dispositivo de entrada. Os dados são inseridos dentro de variáveis.

#### Scanner

* Para realizarmos a entrada de dados em Java, precisaremos criar um objeto do tipo *Scanner*. Para isso, utilizaremos o seguinte comando: ```Scanner sc = new Scanner(System.in);```
* Para conseguirmos criar um objeto do tipo *Scanner*, precisamos utilizar o ```import java.util.Scanner;```
* Após utilizarmos o objeto precisamos desalocar o objeto através do comando: ```sc.close()```

#### Para ler uma palavra

```java
// Exemplo 1

Scanner sc = new Scanner(System.in);
String x;

x = sc.next();

System.out.println("Você digitou: " + x);

sc.close();
```

[Exemplo 1](Workspace/aula026_Exemplo_001)

#### Para ler um número inteiro

```java
// Exemplo 2

Scanner sc = new Scanner(System.in);
int x;

x = sc.nextInt();

System.out.println("Você digitou: " + x);

sc.close();
```

[Exemplo 2](Workspace/aula026_Exemplo_002)

#### Para ler um número com ponto flutuante

```java
// Exemplo 3

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
double x;

x = sc.nextDouble();

System.out.printf("Você digitou: %.2f%n", x);

sc.close();

```

* **Atenção**: para considerar o separador de decimais como ponto, **antes** da declaração do Scanner, faça: ```Locale.setDefault(Locale.US);```

[Exemplo 3](Workspace/aula026_Exemplo_003)

#### Para ler um caractere

```java
// Exemplo 4

Scanner sc = new Scanner(System.in);
char x;

x = sc.next().charAt(0);

System.out.println("Você digitou: " + x);

sc.close();
```

[Exemplo 4](Workspace\aula026_Exemplo_004)

### Para ler vários dados na mesma linha

```java
// Exemplo 5

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

String x;
int y;
double z;

x = sc.next();
y = sc.nextInt();
z = sc.nextDouble();

System.out.println("Dados digitados:");
System.out.println(x);
System.out.println(y);
System.out.println(z);

sc.close();
```

[Exemplo 5](Workspace/aula026_Exemplo_005)

### 27. Entrada de dados em Java - Parte 2

#### Para ler um texto até a quebra de linha

```java
// Exemplo 1

Scanner sc = new Scanner(System.in);

String s1, s2, s3;

s1 = sc.nextLine();
s2 = sc.nextLine();
s3 = sc.nextLine();

System.out.println("Dados digitados:");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

sc.close();
```

[Exemplo 1](Workspace/aula027_Exemplo_001)

### Quebra de linha pendente

Quando você usa um comando de leitura diferente do *nextLine()* e dá alguma quebra de linha, essa quebra de linha fica "*pendente*" na entrada padrão.

Se você então fizer um *nextLine()*, aquela quebra de linha pendente será absorvida.

**Solução** - Faça um *nextLine()* extra antes de fazer o nextLine() de seu interesse.

```java
// Exemplo 2

Scanner sc = new Scanner(System.in);

int x;
String s1, s2, s3;

x = sc.nextInt();
sc.nextLine(); // nextLine() extra para consumir a quebra de linha
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

[Exempl 2](Workspace/aula027_Exemplo_002)

### 28. Funções matemáticas em Java

#### Algumas funções matemáticas em Java

| Exemplo                   | Significado                                    |
| ------------------------- | ---------------------------------------------- |
| ```A = Math.sqrt(x);```   | Variável A recebe a reaiz quadrada de x        |
| ```A = Math.pow(x, y);``` | Variável A recebe o resultado de x elevado a y |
| ```A = Math.abs(x);```    | Variável A recebe o valor ab soluto de x       |

* Mais Métodos podem ser verificados em [java.lang.Math](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)

```java
// Exemplo 1

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
B = Math.pow(x,  2.0);
C = Math.pow(5.0, 2.0);
System.out.println(x + " elevado a " + y + " = " + A); // 3.0 elevado a 4.0 = 81.0
System.out.println(x + " elevado ao quadrado = " + B); // 3.0 elevado ao quadrado = 9.0
System.out.println("5 elevado ao quadrado = " + C); // 5 elevado ao quadrado = 25.0

A = Math.abs(y);
B = Math.abs(z);
System.out.println("O valor absoluto de " + y + " = " + A); // O valor absoluto de 4.0 = 4.0
System.out.println("O valor absoludo de " + z + " = " + B); // O valor absoludo de -5.0 = 5.0
```

### 29. Aviso: exercícios para iniciantes PARTE 1

Até o momento nós aprendemos no curso a estrutura sequencial, ou seja:

* Entrada de dados
* Processamenteo (atribuição)
* Saída

Agora serão apresentados exercícios para praticar os tópicos apresentados.

### 30. Exercícios para iniciantes - PARTE 1

[Exercícios 1](Recursos/pdf/Exercicios1-estrutura-sequencial.pdf)

[Link Exercício resolvido no Youtube](https://www.youtube.com/watch?v=Ah1Y6d6deq0)

#### Exercício resolvido 1

Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguinda, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais, conforme exemplo:

| Entrada | Saída            |
| ------- | ---------------- |
| 10.0    | AREA = 300.00    |
| 30.0    | PRECO = 60000.00 |
| 200.00  |                  |

Desta forma:

*area* = *largura* x *comprimento*
*preco* = *area* x *preco do metro quadrado*

[Exercício Resolvido](Workspace/aula030_Exercicio_resolvido_001)

#### Exercício 01

Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos:

| Entrada | Saída     |
| ------- | --------- |
| 10      | SOMA = 40 |
| 30      |           |

| Entrada | Saída      |
| ------- | ---------- |
| -30     | SOMA = -20 |
| 10      |            |

| Entrada | Saída    |
| ------- | -------- |
| 0       | SOMA = 0 |
| 0       |          |

[Exercício 1](Workspace/aula030_Exercicio_001)

#### Exercício 02

Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.

Fórmula da área: *area* = *Π* . *raio²*
Considere o valor de *Π* = 3.14159

Exemplos:

| Entrada | Saída       |
| ------- | ----------- |
| 2.00    | A = 12.5664 |

| Entrada | Saída          |
| ------- | -------------- |
| 100.64  | A = 31819.3103 |

| Entrada | Saída          |
| ------- | -------------- |
| 150.00  | A = 70685.7750 |

[Exercício 2](Workspace/aula030_Exercicio_002)

#### Exercício 03

Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a formula: *DIFERENCA* = (A x B - C x D).

Exemplos:

| Entrada | Saída           |
| ------- | --------------- |
| 5       | DIFERENCA = -26 |
| 6       |                 |
| 7       |                 |
| 8       |                 |

| Entrada | Saída          |
| ------- | -------------- |
| 5       | DIFERENCA = 86 |
| 6       |                |
| -7      |                |
| 8       |                |

[Exercício 3](Workspace/aula030_Exercicio_003)

#### Exercício 04

Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir mostre o número e o salário do funcionário, com duas casas decimais.

Exemplos:

| Entrada | Saída              |
| ------- | ------------------ |
| 25      | NUMBER = 25        |
| 100     | SALARY = U$ 550.00 |
| 5.50    |                    |

| Entrada | Saída               |
| ------- | ------------------- |
| 1       | NUMBER = 1          |
| 200     | SALARY = U$ 4100.00 |
| 20.50   |                     |

| Entrada | Saída               |
| ------- | ------------------- |
| 6       | NUMBER = 6          |
| 145     | SALARY = U$ 2254.75 |
| 15.55   |                     |

[Exercício 4](workspace/aula030_Exercicio_004/)

#### Exercício 05

Fazer um programa para ler o código de uma peça 1 o número de peças 1, o valor unitátio de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

Exemplos:

| Entrada   | Saída                   |
| --------- | ----------------------- |
| 12 1 5.30 | VALOR A PAGAR: R$ 15.50 |
| 16 2 5.10 |                         |

| Entrada    | Saída                   |
| ---------- | ----------------------- |
| 13 2 15.30 | VALOR A PAGAR: R$ 51.40 |
| 161 4 5.20 |                         |

| Entrada   | Saída                   |
| --------- | ----------------------- |
| 1 1 15.10 | VALOR A PAGAR: R$ 30.20 |
| 2 1 15.10 |                         |

[Exercício 5](Workspace/aula030_Exercicio_005)

#### Exercício 06

Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:

a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159).
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Fórmulas:

* Área do triângulo retangulo:

area = base * altura / 2

* Área do círculo

area = π * raio²

* Área do trapézio

area = (base1 + base2) * altura / 2

* Área do quadrado

area = lado²

* Área do retângulo

area = base x altura

| Entrada     | Saída             |
| ----------- | ----------------- |
| 3.0 4.0 5.2 | TRIANGULO: 7.800  |
|             | CIRCULO: 84.949   |
|             | TRAPEZIO: 18.200  |
|             | QUADRADO: 16.000  |
|             | RETANGULO: 12.000 |

| Entrada        | Saída              |
| -------------- | ------------------ |
| 12.7 10.4 15.2 | TRIANGULO: 96.520  |
|                | CIRCULO: 725.833   |
|                | TRAPEZIO: 175.560  |
|                | QUADRADO: 108.160  |
|                | RETANGULO: 132.080 |

[Exercício 6](Workspace/aula030_Exercicio_006)