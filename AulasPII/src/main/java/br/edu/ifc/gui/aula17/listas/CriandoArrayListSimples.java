package br.edu.ifc.gui.aula17.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author fabricio
 */
public class CriandoArrayListSimples {

    public static void main(String[] args) {
        // Lista de String
        List<String> lista1 = new ArrayList<>();
        lista1.add("Leão");        //Adiciona no fim
        lista1.add("Tigre");       //Adiciona no fim
        lista1.add("Carhorro");    //Adiciona no fim
        lista1.add(0, "Gato");     //Adiciona no inicio
        // ----------------------------------------------------------------

        //Criando uma lista com base em outra
        List<String> lista2 = new ArrayList<>(lista1);
        lista2.add(0, "Jacaré");
        lista2.add("Cavalo");
        lista2.add("Burro");
        // ----------------------------------------------------------------

        // Modificando um animal (Burro por Jumento)
        int indiceDoBurro = lista2.indexOf("Burro");
        lista2.set(indiceDoBurro, "Jumento");
        // ----------------------------------------------------------------

        //Imprimindo a lista
        System.out.println(lista2);

        // Removendo o Cavalo de três maneiras
        lista2.remove(lista2.indexOf("Cavalo"));    // 1
        lista2.remove("Cavalo");                    // 2
        lista2.removeIf(new Predicate<String>() {   // 3
            @Override
            public boolean test(String t) {
                return t.startsWith("Ca");
            }
        });
        // ----------------------------------------------------------------

        // acessando elementos da lista
        int tamanhoDaLista = lista2.size();
        System.out.println("Tamanho da Lista: " + tamanhoDaLista);
        System.out.println("Primeiro Animal: " + lista2.get(0));
        System.out.println("Segundo Animal: " + lista2.get(1));
        System.out.println("Último Animal: " + lista2.get(tamanhoDaLista - 1));
        System.out.println("Gato existe na lista?: " + lista2.contains("Gato"));
        // --------------------------------------------------------------------
        // Ordenando a lista
        Collections.sort(lista2);
        //Embaralhando a lista
        Collections.shuffle(lista2);

        //Iterando na lista
        System.out.println("Lista de Animais - foreach");
        for (String animal : lista2) {
            System.out.println(animal);
        }
        
        //Iterando na lista
        System.out.println("Lista de Animais - Iterator");
        Iterator<String> iterator = lista2.iterator();
        while (iterator.hasNext()) {
            String proximoElemento = iterator.next();
            System.out.println(proximoElemento);
        }

    }
}
