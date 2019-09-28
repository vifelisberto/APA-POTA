package Algoritmos;

public class HeapSort {

    public int qtdComparacoes;
    int x[];

    public HeapSort(int[] vetor) {
        qtdComparacoes = 0;
        x = new int[vetor.length + 1];
        System.arraycopy(vetor, 0, x, 1, vetor.length);

        // transforma o vetor digitado em um heap
        // cada nó pai é maior que seus filhos
        transforma_heap(x.length - 1);
        // ordenando
        ordena(x.length - 1);

        /*for (int i = 1; i <= x.length - 1; i++) {
            System.out.println(i + "º número: " + x[i]);
        }*/
    }

    private void transforma_heap(int qtde) {
        int i, pai, aux;
        for (i = qtde / 2; i >= 1; i--) {
            qtdComparacoes++;
            heap_fica(i, qtde);
        }
        qtdComparacoes++;
    }

    private void heap_fica(int i, int qtde) {
        int f_esq, f_dir, maior, aux;
        maior = i;
        qtdComparacoes++;
        if (2 * i + 1 <= qtde) {
            f_esq = 2 * i + 1;
            f_dir = 2 * i;
            qtdComparacoes++;
            if (x[f_esq] >= x[f_dir] && x[f_esq] > x[i]) {
                maior = 2 * i + 1;
            } else if (x[f_dir] > x[f_esq] && x[f_dir] > x[i]) {
                qtdComparacoes++;
                maior = 2 * i;
            }
        } else if (2 * i <= qtde) {
            qtdComparacoes++;
            f_dir = 2 * i;
            if (x[f_dir] > x[i]) {
                maior = 2 * i;
            }
            qtdComparacoes++;
        }
        if (maior != i) {
            aux = x[i];
            x[i] = x[maior];
            x[maior] = aux;
            heap_fica(maior, qtde);
        }
        qtdComparacoes++;
    }

    private void ordena(int qtde) {
        int i, aux, ultima_posi;
        for (i = qtde; i >= 2; i--) {
            qtdComparacoes++;
            aux = x[1];
            x[1] = x[i];
            x[i] = aux;
            ultima_posi = i - 1;
            heap_fica(1, ultima_posi);
        }
        qtdComparacoes++;
    }
}
