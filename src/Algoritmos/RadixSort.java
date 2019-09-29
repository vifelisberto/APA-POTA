package Algoritmos;

import java.util.Arrays;

public class RadixSort {

    public int qtdComparacoes;

    public RadixSort(int[] v) {
        qtdComparacoes = 0;
        int[] vetor = new int[v.length];
        System.arraycopy(v, 0, vetor, 0, v.length);

        radixsort(vetor, vetor.length);
        //print(vetor, vetor.length);
    }

    private int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            qtdComparacoes++;
            if (arr[i] > mx) {
                mx = arr[i];
            }
            qtdComparacoes++;
        }
        return mx;
    }

    private void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++) {
            qtdComparacoes++;
            count[(arr[i] / exp) % 10]++;
        }
        qtdComparacoes++;

        for (i = 1; i < 10; i++) {
            qtdComparacoes++;
            count[i] += count[i - 1];
        }
        qtdComparacoes++;

        for (i = n - 1; i >= 0; i--) {
            qtdComparacoes++;
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        qtdComparacoes++;

        for (i = 0; i < n; i++) {
            qtdComparacoes++;
            arr[i] = output[i];
        }
        qtdComparacoes++;
    }

    private void radixsort(int arr[], int n) {
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            qtdComparacoes++;
            countSort(arr, n, exp);
        }
        qtdComparacoes++;
    }

    private void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
