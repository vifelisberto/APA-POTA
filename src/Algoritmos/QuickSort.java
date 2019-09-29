package Algoritmos;

public class QuickSort {

    public int qtdComparacoes;

    public QuickSort(int vetor[]) {
        int[] v = new int[vetor.length];
        System.arraycopy(vetor, 0, v, 0, vetor.length);
        qtdComparacoes = 0;

        sort(v, 0, v.length - 1);
    }

    private int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            qtdComparacoes++;
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private void sort(int arr[], int low, int high) {
        qtdComparacoes++;
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}
