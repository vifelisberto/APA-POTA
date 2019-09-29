package Algoritmos;

public class MergeSort {

    public int qtdComparacoes;

    public MergeSort(int[] vetor) {
        int[] v = new int[vetor.length];
        System.arraycopy(vetor, 0, v, 0, vetor.length);
        qtdComparacoes = 0;
        mergeSort(v, 0, v.length - 1);

//        for (int z = 0; z < v.length; z++) {
//            System.out.print(v[z] + ", ");
//        }
    }

    private void mergeSort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            qtdComparacoes++;
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            intercala(vetor, inicio, meio, fim);
        }
    }

    private void intercala(int vetor[], int inicio, int meio, int fim) {
        int[] aux = new int[vetor.length];

        for (int i = inicio; i <= meio; i++) {
            aux[i] = vetor[i];
        }

        for (int i = meio + 1; i <= fim; i++) {
            aux[meio + fim + 1 - i] = vetor[i];
        }

        int i = inicio;
        int j = fim;

        for (int k = inicio; k <= fim; k++) {
            if (aux[i] <= aux[j]) {
                qtdComparacoes++;
                vetor[k] = aux[i];
                i++;
            } else {
                qtdComparacoes++;
                vetor[k] = aux[j];
                j--;
            }
        }
    }
}
