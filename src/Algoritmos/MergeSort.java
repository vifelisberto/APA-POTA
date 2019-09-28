package Algoritmos;

public class MergeSort {

    public int qtdComparacoes;

    public MergeSort(int[] vetor) {
        int[] v = new int[vetor.length];
        System.arraycopy(vetor, 0, v, 0, vetor.length);
        qtdComparacoes = 0;
        mergeSort(v, 0, v.length - 1);
        
        for (int z = 0; z < v.length; z++) {
            System.out.print(v[z] + ", ");
        }
    }

    private void mergeSort(int vetor[], int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            intercala(vetor, inicio, meio, fim);
        }
        qtdComparacoes++;
    }

    private void intercala(int vetor[], int inicio, int meio, int fim) {
        int i, j, k;
        int vetorB[] = new int[vetor.length];
        for (i = inicio; i < meio; i++) {
            qtdComparacoes++;
            vetorB[i] = vetor[i];
        }
        qtdComparacoes++;
        for (j = meio + 1; j < fim; j++) {
            qtdComparacoes++;
            vetorB[fim + meio + 1 - j] = vetor[j];
        }
        qtdComparacoes++;
        i = inicio;
        j = fim;
        for (k = inicio; k < fim; k++) {
            qtdComparacoes++;
            if (vetorB[i] <= vetorB[j]) {
                vetor[k] = vetorB[i];
                i = i + 1;
            } else {
                vetor[k] = vetorB[j];
                j = j - 1;
            }
            qtdComparacoes++;
        }
        qtdComparacoes++;
    }
}
