================================================== MANUAL DO USUÁRIO - JOGO DA FORCA
Bem-vindo ao Jogo da Forca! Este manual explica como compilar e jogar o jogo a partir do código-fonte.

--- 1. PRÉ-REQUISITOS ---

Para executar o jogo, você precisa ter o Java Development Kit (JDK) instalado em seu computador. Você pode verificar se o Java está instalado abrindo um terminal e digitando o comando:
java -version

--- 2. COMO COMPILAR E EXECUTAR ---

Siga os passos abaixo para iniciar o jogo.

Passo 1: Navegue até a pasta do projeto
Abra um terminal (Prompt de Comando, PowerShell, ou Terminal do Linux/macOS) e use o comando "cd" para navegar até a pasta principal do seu projeto. Esta é a pasta que contém o diretório "src" e o arquivo "palavras_jogo_forca.txt".

Exemplo de como navegar até a pasta:
cd caminho/para/a/pasta/JogoDaForca

Passo 2: Compile o código Java
Com o terminal aberto na pasta raiz do projeto, execute o seguinte comando para compilar todos os arquivos .java que estão na pasta "src".

No Windows:
javac src*.java

No Linux ou macOS:
javac src/*.java

Este comando criará os arquivos .class (o código compilado) dentro da pasta "src". Se nenhum erro aparecer, a compilação foi um sucesso.

Passo 3: Execute o Jogo
Após a compilação, e ainda com o terminal na mesma pasta raiz, execute o jogo com o comando abaixo:
java -cp src Main

O comando "-cp src" informa ao Java para procurar os arquivos .class dentro da pasta "src", e "Main" é o nome da classe que contém o método principal a ser executado.

--- 3. COMO JOGAR ---

Início do Jogo: Ao executar o programa, ele primeiro pedirá que você digite o seu nome de jogador.

A Partida Começa: Uma palavra aleatória será sorteada. A tela inicial da partida mostrará:

A palavra a ser adivinhada, com as letras ocultas por underlines ( _ _ _ ).

O número de tentativas que você ainda tem (o jogo sempre começa com 6).

Uma lista (inicialmente vazia) de letras que você já tentou e errou.

Faça sua Adivinhação: O jogo solicitará que você digite uma letra. Após digitar, pressione Enter. O jogo não diferencia letras maiúsculas de minúsculas.

Resultado da Rodada:

Se a letra estiver correta, ela será revelada nas posições correspondentes na palavra.

Se a letra estiver incorreta, você perderá uma tentativa, e a letra será adicionada à lista de "Letras erradas".

Se você digitar uma letra repetida, o jogo irá informá-lo e nada acontecerá, permitindo que você tente novamente sem penalidade.

Fim de Jogo: A partida termina em duas situações:

Vitória: Você adivinhou todas as letras da palavra corretamente.

Derrota: O número de suas tentativas chegou a zero.

Jogar Novamente: Ao final de cada partida, o sistema perguntará se você deseja jogar novamente. Digite "S" para começar uma nova partida ou "N" para encerrar o programa.
==================================================