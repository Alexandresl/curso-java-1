# Curso Java Completo

## Links úteis

## Seção 1: Introdução

### 1. Introdução: Visão geral do curso

[Material de apoio](Recursos/Curso-Java-COMPLETO.pdf)

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

#### **Computador**:

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