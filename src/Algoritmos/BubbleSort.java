package Algoritmos;

public class BubbleSort {

    public int qtdComparacoes;

    public BubbleSort(int[] v) {
        qtdComparacoes = 0;
        int[] vetor = new int[v.length];
        System.arraycopy(v, 0, vetor, 0, v.length);
        
        BubbleSort(vetor);
    }

    private void BubbleSort(int[] vetor) {
        int i;
        int j;
        int temp;

        for (i = 0; i < vetor.length; i++) {
            qtdComparacoes++;
            for (j = i + 1; j < vetor.length; j++) {
                qtdComparacoes++;
                qtdComparacoes++;
                if (vetor[i] > vetor[j]) {
                    temp = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = temp;
                }
            }
            qtdComparacoes++;
        }
        qtdComparacoes++;
    }
}
