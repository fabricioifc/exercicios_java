package br.edu.ifc.gui.aula17.listas;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListExemplo01 {

    public static void main(String[] args) {
        // ArrayList de Cores
        java.util.List<String> coresArrayList = new java.util.ArrayList<>();
        coresArrayList.add("Vermelho");
        coresArrayList.add("Verde");
        coresArrayList.add("Azul");

        // LinkedList de Cores
        java.util.List<String> coresLinkedList = new java.util.LinkedList<>();
        coresLinkedList.add("Vermelho");
        coresLinkedList.add("Verde");
        coresLinkedList.add("Azul");

        // Vector de Cores
        java.util.List<String> coresVector = new java.util.Vector<>();
        coresVector.add("Vermelho");
        coresVector.add("Verde");
        coresVector.add("Azul");

        // Imprimindo as listas
        System.out.println(coresArrayList.toString());
        System.out.println(coresLinkedList.toString());
        System.out.println(coresVector.toString());

        // Pilha
        Stack pilha = new Stack();
        pilha.push("Vermelho");
        pilha.push("Verde");
        pilha.push("Azul");

        // Imprimindo pilha
        System.out.println(pilha.firstElement());   //Primeiro elemento
        System.out.println(pilha.peek());           //Topo da lista (não remove)
        System.out.println(pilha.pop());            //Topo da lista (remove)
        System.out.println(pilha.pop());            //Topo da lista (remove)
        System.out.println(pilha.pop());            //Topo da lista (remove)
        System.out.println(pilha.size());           //Tamanho

        Stack<Integer> numeros = new Stack<>();
        numeros.push(1);
        numeros.push(2);
        numeros.push(3);
        numeros.push(4);
        numeros.push(5);

        Collections.shuffle(numeros);
        System.out.println(numeros.firstElement());
        System.out.println(numeros.peek());
        System.out.println(numeros.pop());
        System.out.println(numeros.size());
        System.out.println(numeros.toString());

        // Fila
        Queue<String> fila = new LinkedList();

        fila.offer("Vermelho");
        fila.offer("Verde");
        fila.offer("Azul");

        System.out.println(fila.element());     // Pega o primeiro (não remove)
        System.out.println(fila.poll());        // Pega o primeiro (remove)
        System.out.println(fila.poll());        // Pega o primeiro (remove)
        System.out.println(fila.poll());        // Pega o primeiro (remove)
        System.out.println(fila.isEmpty());     // Vazia?

    }
}
