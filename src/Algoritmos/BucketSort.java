package Algoritmos;

public class BucketSort {

    public int qtdComparacoes;

    public BucketSort(int[] vetor) {
        int[] v = new int[vetor.length];
        System.arraycopy(vetor, 0, v, 0, vetor.length);
        qtdComparacoes = 0;
        
        
    }
}
