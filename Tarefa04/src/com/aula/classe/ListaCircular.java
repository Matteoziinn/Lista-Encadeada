package com.aula.classe;

public class ListaCircular {
    private No inicio;
    private No fim;

    public void inserir(String dado) {
        No novo = new No(dado);
        if (inicio == null) {
            inicio = fim = novo;
            novo.setProximo(inicio);
        } else {
            fim.setProximo(novo);
            fim = novo;
            fim.setProximo(inicio);
        }
    }

    public void exibir() {
        if (inicio == null) return;
        No atual = inicio;
        do {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        } while (atual != inicio);
        System.out.println();
    }

    public void percorrerDuasVoltas() {
        if (inicio == null) return;
        No atual = inicio;
        int count = 0;
        do {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
            count++;
        } while (count < 2 * tamanho());
        System.out.println();
    }

    private int tamanho() {
        if (inicio == null) return 0;
        int count = 0;
        No atual = inicio;
        do {
            count++;
            atual = atual.getProximo();
        } while (atual != inicio);
        return count;
    }

    public String batataQuente(int k) {
        if (inicio == null || inicio.getProximo() == inicio) {
            return (inicio != null) ? inicio.getDado() : null;
        }

        No atual = inicio;
        No anterior = fim;

        while (atual.getProximo() != atual) {
            for (int i = 1; i < k; i++) {
                anterior = atual;
                atual = atual.getProximo();
            }
            System.out.println("Eliminado: " + atual.getDado());
            anterior.setProximo(atual.getProximo());
            if (atual == inicio) inicio = atual.getProximo();
            if (atual == fim) fim = anterior;
            atual = atual.getProximo();
        }

        System.out.println("Vencedor: " + atual.getDado());
        return atual.getDado();
    }
}
