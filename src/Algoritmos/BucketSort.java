package Algoritmos;

public class BucketSort {

    public int qtdComparacoes;

    public BucketSort(int[] vetor) {
        int[] v = new int[vetor.length];
        System.arraycopy(vetor, 0, v, 0, vetor.length);
        qtdComparacoes = 0;

        sort(v, getMax(v, v.length));
    }

    private int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            // Verificar
            qtdComparacoes++;
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    private void sort(int[] a, int maxVal) {
        int[] bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            bucket[a[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                a[outPos++] = i;
            }
        }
    }
    
    
}
