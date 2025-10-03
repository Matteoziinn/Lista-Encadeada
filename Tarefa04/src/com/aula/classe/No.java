package com.aula.classe;

public class No {
    private int valor;
    private String dado;
    private No proximo;
    private No anterior;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    public No(String dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }

    public int getValor() {
        return valor;
    }

    public String getDado() {
        return dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
