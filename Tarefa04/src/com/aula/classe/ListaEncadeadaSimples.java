package com.aula.classe;

public class ListaEncadeadaSimples {
    private No inicio;

    public void inserir(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

    public No getInicio() {
        return inicio;
    }
}
