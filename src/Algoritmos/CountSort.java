package Algoritmos;

public class CountSort {

    public int qtdComparacoes;

    public CountSort(int[] v) {
        qtdComparacoes = 0;
        int[] vetor = new int[v.length];
        System.arraycopy(v, 0, vetor, 0, v.length);

        ordena(vetor, vetor.length);
    }

    private static void ordena(int[] vetor, int m) {
        int n = vetor.length;

        int vetoraux[] = new int[m];

        for (int i = 0; i < m; i++) {
            vetoraux[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            vetoraux[vetor[i]]++;
        }

        int sum = 0;
        for (int i = 1; i < m; i++) {
            int dum = vetoraux[i];
            vetoraux[i] = sum;
            sum += dum;
        }
        int vetorOrdenado[] = new int[n];
        for (int i = 0; i < n; i++) {
            vetorOrdenado[vetoraux[vetor[i]]] = vetor[i];
            vetoraux[vetor[i]]++;
        }

        for (int i = 0; i < n; i++) {
            vetor[i] = vetorOrdenado[i];
        }
    }
}
