import java.util.ArrayList;

public class JogoDaForca {

    private String palavraSecreta;
    private char[] letrasDescobertas;
    private int tentativasRestantes;
    private ArrayList<Character> letrasErradas;

    // O construtor que inicia o jogo
    public JogoDaForca(String palavra) {
        this.palavraSecreta = palavra;
        this.tentativasRestantes = 6; // Número padrão de tentativas
        this.letrasDescobertas = new char[palavra.length()];
        this.letrasErradas = new ArrayList<>();
        
        // Preenche as letras descobertas com underscores (_)
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }
    }

    // Retorna a palavra com as lacunas
    public String getPalavraComLacunas() {
        StringBuilder sb = new StringBuilder();
        for (char letra : letrasDescobertas) {
            sb.append(letra).append(" ");
        }
        return sb.toString();
    }

    public int getTentativasRestantes() {
        return this.tentativasRestantes;
    }

    // Retorna as letras erradas que o jogador já tentou
    public String getLetrasErradas() {
        return this.letrasErradas.toString();
    }

    // Processa a adivinhação de uma letra
    public void fazerAdivinhacao(char letra) {
        letra = Character.toUpperCase(letra);

        // Verifica se a letra já foi tentada (errada ou certa)
        if (new String(letrasDescobertas).indexOf(letra) != -1 || letrasErradas.contains(letra)) {
            // Se já tentou, não faz nada e o jogador tenta de novo.
            System.out.println(" ");
            System.out.println("Você ja tentou essa letra. Tente outra.");
            return;
        }

        boolean acertou = false;
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                letrasDescobertas[i] = letra;
                acertou = true;
            }
        }

        if (!acertou) {
            letrasErradas.add(letra);
            tentativasRestantes--;
        }
    }

    // Verifica se o jogador venceu
    public boolean jogadorVenceu() {
        return new String(letrasDescobertas).equals(palavraSecreta);
    }

    // Verifica se o jogo terminou (por vitória ou derrota)
    public boolean jogoAcabou() {
        return tentativasRestantes <= 0 || jogadorVenceu();
    }
}