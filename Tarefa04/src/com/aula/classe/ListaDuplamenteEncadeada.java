package com.aula.classe;

public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    public void inserir(String dado) {
        No novo = new No(dado);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.setProximo(novo);
            novo.setAnterior(fim);
            fim = novo;
        }
    }

    public void percorrerDuplo() {
        System.out.println("Percorrendo do início ao fim:");
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            if (atual.getProximo() == null) break;
            atual = atual.getProximo();
        }
        System.out.println();

        System.out.println("Percorrendo do fim ao início:");
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getAnterior();
        }
        System.out.println();
    }
}
