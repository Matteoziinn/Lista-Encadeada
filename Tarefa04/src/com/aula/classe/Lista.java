package com.aula.classe;

public class Lista {
    private No inicio;

    public Lista() {
        this.inicio = null;
    }

    public void inserir(int valor) {
        No novo = new No(valor);
        novo.setProximo(inicio);
        inicio = novo;
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

    public int contarOcorrencias(int valor) {
        int count = 0;
        No atual = inicio;
        while (atual != null) {
            if (atual.getValor() == valor) count++;
            atual = atual.getProximo();
        }
        return count;
    }

    public void removerPares() {
        while (inicio != null && inicio.getValor() % 2 == 0) {
            inicio = inicio.getProximo();
        }
        No atual = inicio;
        while (atual != null && atual.getProximo() != null) {
            if (atual.getProximo().getValor() % 2 == 0) {
                atual.setProximo(atual.getProximo().getProximo());
            } else {
                atual = atual.getProximo();
            }
        }
    }

    public void inserirOrdenado(int valor) {
        No novo = new No(valor);
        if (inicio == null || inicio.getValor() >= valor) {
            novo.setProximo(inicio);
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.getProximo() != null && atual.getProximo().getValor() < valor) {
                atual = atual.getProximo();
            }
            novo.setProximo(atual.getProximo());
            atual.setProximo(novo);
        }
    }

    public No getInicio() {
        return inicio;
    }
}
