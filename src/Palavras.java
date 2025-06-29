import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Palavras {

    private ArrayList<String> listaDePalavras;

    public Palavras(String nomeArquivo) {
        this.listaDePalavras = new ArrayList<>();
        carregarPalavrasDoArquivo(nomeArquivo);
    }

    private void carregarPalavrasDoArquivo(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                String palavra = leitor.nextLine().trim().toUpperCase();
                if (!palavra.isEmpty()) {
                    listaDePalavras.add(palavra);
                }
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo de palavras nao encontrado!");
            listaDePalavras.add("PADRAO");
        }
    }

    // Método público que retorna uma palavra aleatória da lista
    public String getPalavraAleatoria() {
        if (listaDePalavras.isEmpty()) {
            return "VAZIO";
        }
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaDePalavras.size());
        return listaDePalavras.get(indiceAleatorio);
    } //professor, nao colocamos acento porque estava quebrando o codigo
}