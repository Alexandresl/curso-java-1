# curso-java-1

## Atalhos Eclipse (Extra)
* **Aumentar fonte** - CTRL +
* **Diminuir fonte** - CTRL -

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