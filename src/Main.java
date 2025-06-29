import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palavras gerenciadorDePalavras = new Palavras("palavras_jogo_forca.txt");
        
        System.out.println("--- BEM-VINDO AO JOGO DA FORCA ---");
        System.out.print("Digite seu nome, jogador: ");
        String nomeJogador = scanner.nextLine();
        
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            String palavraSorteada = gerenciadorDePalavras.getPalavraAleatoria();
            JogoDaForca jogo = new JogoDaForca(palavraSorteada);

            System.out.println("\n" + nomeJogador + ", o jogo começou! A palavra tem " + palavraSorteada.length() + " letras.");

            
            while (!jogo.jogoAcabou()) {
                
                System.out.println("\n------------------------------------");
                System.out.println("Jogador: " + nomeJogador);
                System.out.println("Palavra: " + jogo.getPalavraComLacunas());
                System.out.println("Tentativas restantes: " + jogo.getTentativasRestantes());
                System.out.println("Letras erradas: " + jogo.getLetrasErradas());
                System.out.print("Digite uma letra: ");

                String input = scanner.next();
                if (input.length() > 0) {
                    char letra = input.charAt(0);
                    jogo.fazerAdivinhacao(letra);
                }
            }

            
            if (jogo.jogadorVenceu()) {
                System.out.println("\n************************************");
                System.out.println("PARABENS, " + nomeJogador + "! Voce venceu!");
                System.out.println("A palavra era: " + palavraSorteada);
                System.out.println("************************************");
            } else {
                System.out.println("\n------------------------------------");
                System.out.println("QUE PENA, " + nomeJogador + "! Voce perdeu.");
                System.out.println("A palavra era: " + palavraSorteada);
                System.out.println("------------------------------------");
            }

            System.out.print("\nDeseja jogar novamente? (S/N): ");
            String resposta = scanner.next();
            jogarNovamente = resposta.equalsIgnoreCase("S");
        }

        System.out.println("\nObrigado por jogar! Ate a proxima.");
        scanner.close();
    }
}
