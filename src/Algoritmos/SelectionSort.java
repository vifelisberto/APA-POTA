package Algoritmos;

public class SelectionSort {

    public int qtdComparacoes;

    public SelectionSort(int[] vetor) {
        qtdComparacoes = 0;

        int[] v = new int[vetor.length];
        System.arraycopy(vetor, 0, v, 0, vetor.length);

        SortOp(v);
    }

    private void SortOp(int[] v) {
        int n = v.length;
        do {
            int newn = 0;
            for (int i = 1; i <= n - 1; i++) {
                if (v[i - 1] > v[i]) {
                    qtdComparacoes++;
                    int aux = v[i];
                    v[i] = v[i - 1];
                    v[i - 1] = aux;
                    newn = i;
                }
            }
            // Conta a ultima comparação do for.
            n = newn;
        } while (n != 0);
    }
}
