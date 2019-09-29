package Execucoes;

import static Execucoes.Program.QTD_VETORES;

public class MediaResultado {

    public int mediaComparacoesCinco = 0;
    public int mediaComparacoesDez = 0;
    public int mediaComparacoesCinquenta = 0;
    public int mediaComparacoesCem = 0;
    public int mediaComparacoesMil = 0;
    public int mediaComparacoesDezMil = 0;
    public String algoritmo;

    public MediaResultado(String algoritmo){
        this.algoritmo = algoritmo;
    }
    
    public void mediaComparacoes() {
        this.mediaComparacoesCinco = this.mediaComparacoesCinco / QTD_VETORES;
        this.mediaComparacoesDez = this.mediaComparacoesDez / QTD_VETORES;
        this.mediaComparacoesCinquenta = this.mediaComparacoesCinquenta / QTD_VETORES;
        this.mediaComparacoesCem = this.mediaComparacoesCem / QTD_VETORES;
        this.mediaComparacoesMil = this.mediaComparacoesMil / QTD_VETORES;
        this.mediaComparacoesDezMil = this.mediaComparacoesDezMil / QTD_VETORES;
    }

    @Override
    public String toString() {
        String resultado = "\n" + this.algoritmo;
        resultado += "\nMedia Cinco Elementos; " + this.mediaComparacoesCinco;
        resultado += "\nMedia Dez Elementos; " + this.mediaComparacoesDez;
        resultado += "\nMedia Cinquenta Elementos; " + this.mediaComparacoesCinquenta;
        resultado += "\nMedia Cem Elementos; " + this.mediaComparacoesCem;
        resultado += "\nMedia Mil Elementos; " + this.mediaComparacoesMil;
        resultado += "\nMedia Dez Mil Elementos; " + this.mediaComparacoesDezMil;

        return resultado;
    }
}
