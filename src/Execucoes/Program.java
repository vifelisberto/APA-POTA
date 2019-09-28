package Execucoes;

import Algoritmos.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Program {

    // Variável para controle da quantidade de vetores que serão gerados.
    static final int QTD_VETORES = 50;

    // Inicializamos os vetores, são gerados 50 vetores de cada tamanho (5, 10, 50, 100, 1000, 10000).
    static final int[][] VETORES_CINCO = gerarVetoresAleatorios(QTD_VETORES, 5);
    static final int[][] VETORES_DEZ = gerarVetoresAleatorios(QTD_VETORES, 10);
    static final int[][] VETORES_CINQUENTA = gerarVetoresAleatorios(QTD_VETORES, 50);
    static final int[][] VETORES_CEM = gerarVetoresAleatorios(QTD_VETORES, 100);
    static final int[][] VETORES_MIL = gerarVetoresAleatorios(QTD_VETORES, 1000);
    static final int[][] VETORES_DEZ_MIL = gerarVetoresAleatorios(QTD_VETORES, 10000);

    static final String PATH_ARQUIVO_SAIDA = System.getProperty("user.home") + "\\Desktop\\Comparacoes.csv";

    public static void main(String[] args) {
        executarAlgoritmos();
    }

    private static void executarAlgoritmos() {
        // Inicializa as váriaveis que irão guardar os resultados de cada algoritmos (as médias).
        MediaResultado resultadoBubble = new MediaResultado();
        MediaResultado resultadoSelection = new MediaResultado();
        MediaResultado resultadoInsertion = new MediaResultado();
        MediaResultado resultadoMerge = new MediaResultado();
        MediaResultado resultadoQuick = new MediaResultado();
        MediaResultado resultadoCount = new MediaResultado();
        MediaResultado resultadoBucket = new MediaResultado();
        MediaResultado resultadoRadix = new MediaResultado();
        MediaResultado resultadoHeap = new MediaResultado();

        for (int i = 0; i < QTD_VETORES; i++) {
            // Bubble
            //executaBubbleComparacoes(i, resultadoBubble);
            // Selection
            //executaSelectionComparacoes(i, resultadoSelection);
            // Insertion
            //executaInsertionComparacoes(i, resultadoInsertion);
            // Heap
            executaHeapComparacoes(i, resultadoHeap);
            // Merge
            //executaMergeComparacoes(i, resultadoMerge);
            // Quick
            //executaQuickComparacoes(i, resultadoQuick);
            // Count
            //executaCountComparacoes(i, resultadoCount);
            // Bucket
            //executaBucketComparacoes(i, resultadoBucket);
            // Radix
            //executaRadixComparacoes(i, resultadoRadix);
        }

        resultadoBubble.mediaComparacoes();
        resultadoSelection.mediaComparacoes();
        resultadoInsertion.mediaComparacoes();
        resultadoHeap.mediaComparacoes();
        resultadoMerge.mediaComparacoes();
        resultadoQuick.mediaComparacoes();
        resultadoCount.mediaComparacoes();
        resultadoBucket.mediaComparacoes();
        resultadoRadix.mediaComparacoes();

        System.out.println("Resultados: \n");
//        System.out.println("\nBubble: \n" + resultadoBubble.toString());
//        System.out.println("\nSelection: \n" + resultadoSelection.toString());
//        System.out.println("\nInsertion: \n"+ resultadoInsertion.toString());
        System.out.println("\nHeap: \n" + resultadoHeap.toString("Heap Sort"));
//        System.out.println("\nMerge: \n" + resultadoMerge.toString());
//        System.out.println("\nQuick: \n" + resultadoQuick.toString());
//        System.out.println("\nCount: \n" + resultadoCount.toString());
//        System.out.println("\nBucket: \n" + resultadoBucket.toString());
//        System.out.println("\nRadix: \n" + resultadoRadix.toString());

        System.out.println("Gerando CSV de Saída dos dados.");
        gerarCSV(resultadoHeap.toString("Heap Sort"));
    }

    public static void executaHeapComparacoes(int i, MediaResultado resultado) {
        resultado.mediaComparacoesCinco += new HeapSort(VETORES_CINCO[i]).qtdComparacoes;
        resultado.mediaComparacoesDez += new HeapSort(VETORES_DEZ[i]).qtdComparacoes;
        resultado.mediaComparacoesCinquenta += new HeapSort(VETORES_CINQUENTA[i]).qtdComparacoes;
        resultado.mediaComparacoesCem += new HeapSort(VETORES_CEM[i]).qtdComparacoes;
        resultado.mediaComparacoesMil += new HeapSort(VETORES_MIL[i]).qtdComparacoes;
        resultado.mediaComparacoesDezMil += new HeapSort(VETORES_DEZ_MIL[i]).qtdComparacoes;
    }

    public static void executaBubbleComparacoes(int i, MediaResultado resultado) {
//        resultado.mediaComparacoesCinco += new BubbleSort(VETORES_CINCO[i]).qtdComparacoes;
//        resultado.mediaComparacoesDez += new BubbleSort(VETORES_DEZ[i]).qtdComparacoes;
//        resultado.mediaComparacoesCinquenta += new BubbleSort(VETORES_CINQUENTA[i]).qtdComparacoes;
//        resultado.mediaComparacoesCem += new BubbleSort(VETORES_CEM[i]).qtdComparacoes;
//        resultado.mediaComparacoesMil += new BubbleSort(VETORES_MIL[i]).qtdComparacoes;
//        resultado.mediaComparacoesDezMil += new BubbleSort(VETORES_DEZ_MIL[i]).qtdComparacoes;
    }

    public static void executaSelectionComparacoes(int i, MediaResultado resultado) {
        resultado.mediaComparacoesCinco += new SelectionSort(VETORES_CINCO[i]).qtdComparacoes;
        resultado.mediaComparacoesDez += new SelectionSort(VETORES_DEZ[i]).qtdComparacoes;
        resultado.mediaComparacoesCinquenta += new SelectionSort(VETORES_CINQUENTA[i]).qtdComparacoes;
        resultado.mediaComparacoesCem += new SelectionSort(VETORES_CEM[i]).qtdComparacoes;
        resultado.mediaComparacoesMil += new SelectionSort(VETORES_MIL[i]).qtdComparacoes;
        resultado.mediaComparacoesDezMil += new SelectionSort(VETORES_DEZ_MIL[i]).qtdComparacoes;
    }

    public static void executaInsertionComparacoes(int i, MediaResultado resultado) {
//        resultado.mediaComparacoesCinco += new InsertionSort(VETORES_CINCO[i]).qtdComparacoes;
//        resultado.mediaComparacoesDez += new InsertionSort(VETORES_DEZ[i]).qtdComparacoes;
//        resultado.mediaComparacoesCinquenta += new InsertionSort(VETORES_CINQUENTA[i]).qtdComparacoes;
//        resultado.mediaComparacoesCem += new InsertionSort(VETORES_CEM[i]).qtdComparacoes;
//        resultado.mediaComparacoesMil += new InsertionSort(VETORES_MIL[i]).qtdComparacoes;
//        resultado.mediaComparacoesDezMil += new InsertionSort(VETORES_DEZ_MIL[i]).qtdComparacoes;
    }

    public static void executaMergeComparacoes(int i, MediaResultado resultado) {
        resultado.mediaComparacoesCinco += new MergeSort(VETORES_CINCO[i]).qtdComparacoes;
        resultado.mediaComparacoesDez += new MergeSort(VETORES_DEZ[i]).qtdComparacoes;
        resultado.mediaComparacoesCinquenta += new MergeSort(VETORES_CINQUENTA[i]).qtdComparacoes;
        resultado.mediaComparacoesCem += new MergeSort(VETORES_CEM[i]).qtdComparacoes;
        resultado.mediaComparacoesMil += new MergeSort(VETORES_MIL[i]).qtdComparacoes;
        resultado.mediaComparacoesDezMil += new MergeSort(VETORES_DEZ_MIL[i]).qtdComparacoes;
    }

    public static void executaQuickComparacoes(int i, MediaResultado resultado) {
//        resultado.mediaComparacoesCinco += new QuickSort(VETORES_CINCO[i]).qtdComparacoes;
//        resultado.mediaComparacoesDez += new QuickSort(VETORES_DEZ[i]).qtdComparacoes;
//        resultado.mediaComparacoesCinquenta += new QuickSort(VETORES_CINQUENTA[i]).qtdComparacoes;
//        resultado.mediaComparacoesCem += new QuickSort(VETORES_CEM[i]).qtdComparacoes;
//        resultado.mediaComparacoesMil += new QuickSort(VETORES_MIL[i]).qtdComparacoes;
//        resultado.mediaComparacoesDezMil += new QuickSort(VETORES_DEZ_MIL[i]).qtdComparacoes;
    }

    public static void executaCountComparacoes(int i, MediaResultado resultado) {
//        resultado.mediaComparacoesCinco += new CountSort(VETORES_CINCO[i]).qtdComparacoes;
//        resultado.mediaComparacoesDez += new CountSort(VETORES_DEZ[i]).qtdComparacoes;
//        resultado.mediaComparacoesCinquenta += new CountSort(VETORES_CINQUENTA[i]).qtdComparacoes;
//        resultado.mediaComparacoesCem += new CountSort(VETORES_CEM[i]).qtdComparacoes;
//        resultado.mediaComparacoesMil += new CountSort(VETORES_MIL[i]).qtdComparacoes;
//        resultado.mediaComparacoesDezMil += new CountSort(VETORES_DEZ_MIL[i]).qtdComparacoes;
    }

    public static void executaBucketComparacoes(int i, MediaResultado resultado) {
//        resultado.mediaComparacoesCinco += new BucketSort(VETORES_CINCO[i]).qtdComparacoes;
//        resultado.mediaComparacoesDez += new BucketSort(VETORES_DEZ[i]).qtdComparacoes;
//        resultado.mediaComparacoesCinquenta += new BucketSort(VETORES_CINQUENTA[i]).qtdComparacoes;
//        resultado.mediaComparacoesCem += new BucketSort(VETORES_CEM[i]).qtdComparacoes;
//        resultado.mediaComparacoesMil += new BucketSort(VETORES_MIL[i]).qtdComparacoes;
//        resultado.mediaComparacoesDezMil += new BucketSort(VETORES_DEZ_MIL[i]).qtdComparacoes;
    }

    public static void executaRadixComparacoes(int i, MediaResultado resultado) {
//        resultado.mediaComparacoesCinco += new RadixSort(VETORES_CINCO[i]).qtdComparacoes;
//        resultado.mediaComparacoesDez += new RadixSort(VETORES_DEZ[i]).qtdComparacoes;
//        resultado.mediaComparacoesCinquenta += new RadixSort(VETORES_CINQUENTA[i]).qtdComparacoes;
//        resultado.mediaComparacoesCem += new RadixSort(VETORES_CEM[i]).qtdComparacoes;
//        resultado.mediaComparacoesMil += new RadixSort(VETORES_MIL[i]).qtdComparacoes;
//        resultado.mediaComparacoesDezMil += new RadixSort(VETORES_DEZ_MIL[i]).qtdComparacoes;
    }

    private static int[][] gerarVetoresAleatorios(int qtdVetores, int tamanhoVetores) {
        int[][] vetores = new int[qtdVetores][tamanhoVetores];

        for (int i = 0; i < qtdVetores; i++) {
            vetores[i] = gerarVetorAleatorio(tamanhoVetores);
        }

        return vetores;
    }

    private static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random rd = new Random();

        for (int i = 0; i < vetor.length; i++) {
            int numero = rd.nextInt(30000) + 1;

            for (int j = 0; j < vetor.length; j++) {
                if (numero == vetor[j] && j != i) {
                    numero = rd.nextInt(30000) + 1;
                } else {
                    vetor[i] = numero;
                }
            }
        }
        return vetor;
    }

    private static void gerarCSV(String texto) {
        File file = new File(PATH_ARQUIVO_SAIDA);
        if (file.exists()) {
            file.delete();
        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(texto + "\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Não foi possível criar o arquivo. - " + e.getMessage());
        }
    }
}
