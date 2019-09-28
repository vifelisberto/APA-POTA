package Algoritmos;

public class InsertionSort {

    public int qtdComparacoes;

    public InsertionSort(int[] v) {
        qtdComparacoes = 0;
        int[] vetor = new int[v.length];
        System.arraycopy(v, 0, vetor, 0, v.length);
        
        InsertionSort(vetor);
    }

    private void InsertionSort(int[] vetor) {
        int i;
        int j;
        int key;

        for (i = 1; i < vetor.length; i++) {
            qtdComparacoes++;
            key = vetor[i];
            for (j = i - 1; j >= 0 && vetor[j] > key; j--) {
                qtdComparacoes++;
                vetor[j + 1] = vetor[j];
            }
            qtdComparacoes++;
            vetor[j + 1] = key;
        }
        qtdComparacoes++;
    }
}
