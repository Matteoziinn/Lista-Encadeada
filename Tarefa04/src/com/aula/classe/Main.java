package com.aula.classe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1 - Contar ocorrências em lista de inteiros
        Lista lista = new Lista();
        lista.inserir(5);
        lista.inserir(3);
        lista.inserir(5);
        lista.inserir(7);
        System.out.println("Ocorrências de 5: " + lista.contarOcorrencias(5));

        // 2 - Inverter lista de strings
        List<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("Python");
        listaStrings.add("C++");
        listaStrings.add("Go");

        System.out.println("Lista original: " + listaStrings);
        UtilLista.inverter(listaStrings);
        System.out.println("Lista invertida: " + listaStrings);

        // 3 - Concatenar listas encadeadas simples
        ListaEncadeadaSimples l1 = new ListaEncadeadaSimples();
        l1.inserir(1);
        l1.inserir(2);
        ListaEncadeadaSimples l2 = new ListaEncadeadaSimples();
        l2.inserir(3);
        l2.inserir(4);
        ListaEncadeadaSimples concatenada = UtilLista.concatenar(l1, l2);
        System.out.println("Lista concatenada:");
        concatenada.exibir();

        // 4 - Remover pares de lista de inteiros
        lista.removerPares();
        System.out.println("Lista sem pares:");
        lista.exibir();

        // 5 - Lista circular: percorrer duas voltas
        ListaCircular lc = new ListaCircular();
        lc.inserir("Ana");
        lc.inserir("Bruno");
        lc.inserir("Carla");
        System.out.println("Percorrendo duas voltas na lista circular:");
        lc.percorrerDuasVoltas();

        // 6 - Inserir ordenado em lista de inteiros
        lista = new Lista();
        lista.inserirOrdenado(8);
        lista.inserirOrdenado(3);
        lista.inserirOrdenado(5);
        lista.inserirOrdenado(1);
        System.out.println("Lista ordenada:");
        lista.exibir();

        // 7 - Verificar palíndromo em lista de caracteres
        List<Character> listaChars1 = Arrays.asList('R','A','D','A','R');
        List<Character> listaChars2 = Arrays.asList('T','E','S','T','E');

        System.out.println("Lista 1: " + listaChars1 + " -> Palíndromo? " + UtilLista.ehPalindromo(listaChars1));
        System.out.println("Lista 2: " + listaChars2 + " -> Palíndromo? " + UtilLista.ehPalindromo(listaChars2));

        // 8 - Lista duplamente encadeada: ida e volta
        ListaDuplamenteEncadeada ld = new ListaDuplamenteEncadeada();
        ld.inserir("A");
        ld.inserir("B");
        ld.inserir("C");
        ld.percorrerDuplo();

        // 9 - Dividir lista encadeada em duas (menor e maior/igual a X)
        var partes = UtilLista.dividir(concatenada, 3);
        System.out.println("Menores que 3:");
        partes.getKey().exibir();
        System.out.println("Maiores ou iguais a 3:");
        partes.getValue().exibir();

        // 10 - Batata quente em lista circular
        lc.inserir("Diego");
        lc.inserir("Fernanda");
        System.out.println("Batata quente:");
        lc.batataQuente(3);
    }
}
