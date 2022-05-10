package com.bandtec.desafio.fila;

import static java.util.Objects.isNull;

public class FilaString {
    // Atributos
    private int tamanho;
    private String[] fila;

    // Construtor
    public FilaString(int capaciade) {
        this.tamanho = 0;
        fila = new String[capaciade];
    }

    // Métodos

    /* Método isEmpty() - retorna true se a fila está vazia e false caso contrário */
    public boolean isEmpty() {
        boolean cheio = true;
        if (tamanho == 0) {
            cheio = true;
        }else{
            cheio = false;
        }
        return cheio;
    }

    /* Método isFull() - retorna true se a fila está cheia e false caso contrário */
    public boolean isFull() {
        if (fila.length == tamanho) {
            return true;
        }
        return false;
    }

    /* Método insert - recebe um elemento e insere esse elemento na fila
                       no índice tamanho, e incrementa tamanho
                       Retornar IllegalStateException caso a fila esteja cheia
     */
    public void insert(String info) {

        if (!isFull()) {
            tamanho++;
            for (int i = 0; i < tamanho; i++) {
                if(isNull(fila[i])){
                    fila[i] = info;
                }
            }
        } else {
            throw new IllegalStateException();
        }
    }


    /* Método peek - retorna o primeiro elemento da fila, sem removê-lo */
    public String peek() {
        return fila[0];
    }

    /* Método poll - remove e retorna o primeiro elemento da fila, se a fila não estiver
       vazia. Quando um elemento é removido, a fila "anda", e tamanho é decrementado
     */
    public String poll() {
        String primeiro = "";
           if(!isEmpty()){
               for(int i = 0; i <= tamanho-1; i++) {
                   primeiro = fila[0];
                   fila[i] = fila[i + 1];
               }
               fila[tamanho-1] = null;
               tamanho--;
               }
        return primeiro;
    }

    /* Método exibe() - exibe o conteúdo da fila */
    public void exibe() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(fila[i]);
        }
    }

    public int getTamanho(){
        return tamanho;
    }
}
