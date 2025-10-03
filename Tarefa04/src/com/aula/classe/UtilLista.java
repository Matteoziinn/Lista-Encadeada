package com.aula.classe;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

public class UtilLista {

    // 3 - Concatenar duas listas encadeadas simples
    public static ListaEncadeadaSimples concatenar(ListaEncadeadaSimples l1, ListaEncadeadaSimples l2) {
        ListaEncadeadaSimples resultado = new ListaEncadeadaSimples();
        No atual = l1.getInicio();
        while (atual != null) {
            resultado.inserir(atual.getValor());
            atual = atual.getProximo();
        }
        atual = l2.getInicio();
        while (atual != null) {
            resultado.inserir(atual.getValor());
            atual = atual.getProximo();
        }
        return resultado;
    }

    // 9 - Dividir em duas listas
    public static Map.Entry<ListaEncadeadaSimples, ListaEncadeadaSimples> dividir(ListaEncadeadaSimples lista, int x) {
        ListaEncadeadaSimples menores = new ListaEncadeadaSimples();
        ListaEncadeadaSimples maioresOuIguais = new ListaEncadeadaSimples();
        No atual = lista.getInicio();
        while (atual != null) {
            if (atual.getValor() < x) {
                menores.inserir(atual.getValor());
            } else {
                maioresOuIguais.inserir(atual.getValor());
            }
            atual = atual.getProximo();
        }
        return new AbstractMap.SimpleEntry<>(menores, maioresOuIguais);
    }

    // Item 2: Inverter lista de strings (in-place)
    public static void inverter(List<String> lista) {
        int i = 0, j = lista.size() - 1;
        while (i < j) {
            String tmp = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, tmp);
            i++;
            j--;
        }
    }

    // Item 7: Verificar se lista de caracteres forma um palíndromo
    public static boolean ehPalindromo(List<Character> lista) {
        int i = 0, j = lista.size() - 1;
        while (i < j) {
            if (!lista.get(i).equals(lista.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
