package br.edu.ifc.gui.aula17.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author fabricio
 */
public class Ex02 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        // adicionando 5 cores
        lista.add("Vermelho");
        lista.add("Verde");
        lista.add("Amarelo");
        lista.add("Azul");
        lista.add("Preto");
        // adicionando mais uma cor no inicio
        lista.add(0, "Branco");
        //Embaralhando a lista
        Collections.shuffle(lista);
        // imprimindo a lista
        System.out.println(lista.toString());
        //Ordenando a lista
        Collections.sort(lista);
        // 1° elemento
        System.out.println(lista.get(0));
        // último elemento
        int tamanho = lista.size();
        System.out.println(lista.get(tamanho - 1));
        // cores primárias
        System.out.println("Cores Primárias");
        for (String cor : lista) {
            if (cor.equalsIgnoreCase("Vermelho") || cor.equalsIgnoreCase("Amarelo") || cor.equalsIgnoreCase("Azul")) {
                System.out.println(cor);
            }
        }
        //removendo cores que começam com A
        lista.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.startsWith("A");
            }
        });
        
        //Imprimindo todas as cores (em loop)
        System.out.println("Todas as Cores");
        for (String cor : lista) {
            System.out.println(cor);
        }

    }
}
