package Algoritmos;

import java.util.Arrays;

public class RadixSort {

    public int qtdComparacoes;

    public RadixSort(int[] v) {
        qtdComparacoes = 0;
        int[] vetor = new int[v.length];
        System.arraycopy(v, 0, vetor, 0, v.length);

        radixSort(vetor, vetor.length);
    }

    private int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > mx) {
                qtdComparacoes++;
                mx = arr[i];
            }
        }
        return mx;
    }

    private void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int count[] = new int[10];
        int i;
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    private void radixSort(int arr[], int n) {
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            qtdComparacoes++;
            countSort(arr, n, exp);
        }
    }
}
