package br.edu.ifc.poo.aula01;

public class CachorroTeste {

  public static void main(String[] args) {
    Cachorro c1 = new Cachorro();
    Cachorro c2 = new Cachorro();

    c1.nome = "Tobi";
    c1.tamanho = 5;
    c1.raca = "Viralata";

    c2.nome = "Adamastor";
    c2.tamanho = 100;
    c2.raca = "Doberman";

    c1.latir();
    c2.latir();
  }
}
