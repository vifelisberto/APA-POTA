package Execucoes;

import static Execucoes.Program.QTD_VETORES;

public class MediaResultado {

    public long mediaComparacoesCinco = 0;
    public long mediaComparacoesDez = 0;
    public long mediaComparacoesCinquenta = 0;
    public long mediaComparacoesCem = 0;
    public long mediaComparacoesMil = 0;
    public long mediaComparacoesDezMil = 0;

    public void mediaComparacoes() {
        this.mediaComparacoesCinco = this.mediaComparacoesCinco / QTD_VETORES;
        this.mediaComparacoesDez = this.mediaComparacoesDez / QTD_VETORES;
        this.mediaComparacoesCinquenta = this.mediaComparacoesCinquenta / QTD_VETORES;
        this.mediaComparacoesCem = this.mediaComparacoesCem / QTD_VETORES;
        this.mediaComparacoesMil = this.mediaComparacoesMil / QTD_VETORES;
        this.mediaComparacoesDezMil = this.mediaComparacoesDezMil / QTD_VETORES;
    }

    public String toString(String algoritmo) {
        String resultado = "\n" + algoritmo;
        resultado += "\nMedia Cinco Elementos; " + this.mediaComparacoesCinco;
        resultado += "\nMedia Dez Elementos; " + this.mediaComparacoesDez;
        resultado += "\nMedia Cinquenta Elementos; " + this.mediaComparacoesCinquenta;
        resultado += "\nMedia Cem Elementos; " + this.mediaComparacoesCem;
        resultado += "\nMedia Mil Elementos; " + this.mediaComparacoesMil;
        resultado += "\nMedia Dez Mil Elementos; " + this.mediaComparacoesDezMil;

        return resultado;
    }
}
