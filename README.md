# Jogo da Forca em Java ☕

Este projeto é um clássico Jogo da Forca desenvolvido em Java para ser executado em linha de comando (CLI). O trabalho foi criado como parte da avaliação da disciplina de **Modelagem e Programação de Sistemas Computacionais** e cobre desde a modelagem UML até a implementação orientada a objetos, conforme os requisitos propostos.

## 📜 Funcionalidades

* **Palavra Aleatória:** O sistema escolhe uma palavra de forma aleatória a partir de um arquivo de texto (`palavras_jogo_forca.txt`).
* **Mecânica de Adivinhação:** O jogador pode adivinhar letras para tentar completar a palavra.
* **Controle de Tentativas:** O jogador tem um número limitado de 6 tentativas. A cada letra errada, uma tentativa é consumida.
* **Estado do Jogo:** A interface exibe a palavra com as letras já descobertas, as letras erradas já tentadas e o número de tentativas restantes.
* **Fim de Jogo:** O sistema detecta condições de vitória (palavra completa) ou derrota (tentativas esgotadas) e informa o jogador.
* **Jogar Novamente:** Ao final de cada partida, o jogador tem a opção de iniciar um novo jogo ou sair.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Modelagem:** Diagramas UML (Casos de Uso, Classes, Sequência e Atividades)
* **Princípios:** Programação Orientada a Objetos (POO)

## 🚀 Como Executar o Projeto

**Pré-requisito:** Ter o **JDK (Java Development Kit)** instalado.

1.  Clone este repositório:
    ```bash
    git clone Natalia-DiasRibeiro/jogoDaForca/tree/main
    ```
2.  Navegue até a pasta do projeto:
    ```bash
    cd nome-da-pasta-do-projeto
    ```
3.  Compile os arquivos-fonte:
    ```bash
    # Windows
    javac src\*.java
    
    # Linux / macOS
    javac src/*.java
    ```
4.  Execute o programa a partir da pasta raiz do projeto:
    ```bash
    java -cp src Main
    ```

## 👥 Autores

Este projeto foi desenvolvido por:

* Natalias Dias Ribeiro
* Victor dos Santos Santin