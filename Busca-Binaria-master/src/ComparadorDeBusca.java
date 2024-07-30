import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ComparadorDeBusca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArvoreBinaria arvore = new ArvoreBinaria();
        long start;

        System.out.print("Digite o tamanho da tabela: ");
        int tamanho = scanner.nextInt();

        int[] tabela = new int[tamanho];

        // Geração de chaves aleatórias
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = random.nextInt();
        }

        // Construção de uma Arvore Binária sem balanceamento
        start = System.currentTimeMillis();
        for (int i = 0; i < tamanho; i++) {
            arvore.insereElemento(tabela[i]);
        }
        long tempoConstrucaoArvore = System.currentTimeMillis() - start;

        // Ordenação da tabela
        start = System.currentTimeMillis();
        Arrays.sort(tabela);
        long tempoOrdenacaoTabela = System.currentTimeMillis() - start;

        // Geração de chaves aleatórias para pesquisa
        int[] pesquisas = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            pesquisas[i] = random.nextInt();
        }

        // Pesquisa de chaves na árvore
        start = System.currentTimeMillis();
        for (int i = 0; i < tamanho; i++) {
            arvore.encontraElemento(pesquisas[i]);
        }
        long tempoPesquisaArvore = System.currentTimeMillis() - start;

        // Pesquisa de chaves com busca binária
        start = System.currentTimeMillis();
        for (int i = 0; i < tamanho; i++) {
            buscaBinaria(pesquisas[i], tabela);
        }
        long tempoBuscaBinaria = System.currentTimeMillis() - start;

        System.out.printf("Tempo de Construção da Árvore: %.3f s%n",(float)tempoConstrucaoArvore/1000);
        System.out.printf("Tempo de Pesquisa na Árvore:   %.3f s%n",(float)tempoPesquisaArvore/1000);
        System.out.printf("Tempo de Ordenacao da Tabela:  %.3f s%n",(float)tempoOrdenacaoTabela/1000);
        System.out.printf("Tempo de Busca Binaria:        %.3f s%n",(float)tempoBuscaBinaria/1000);

    }

    private static void buscaBinaria(int dado, int[] tabela){
        int inf, sup, meio;
        inf = 0;
        sup = tabela.length - 1;

        while (inf <= sup) {
            meio = (inf + sup) / 2;
            if (dado == tabela[meio]) break;
            if (dado < tabela[meio]) sup = meio - 1;
            else inf = meio + 1;
        }
    }
}
