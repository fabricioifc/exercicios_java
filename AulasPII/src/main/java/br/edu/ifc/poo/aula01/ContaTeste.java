package br.edu.ifc.poo.aula01;

public class ContaTeste {

  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.setCliente("José");
    c1.setSaldo(0);

    Conta c2 = new Conta();
    c2.setCliente("Ronaldo");
    c2.setSaldo(100);
    
    c1.exibeSaldo();
    c2.exibeSaldo();

    c1.deposita(100);
    c1.saca(50);
    c2.transferePara(c1, 35);

    // não deve permitir
    c1.saca(100);
    
    c1.exibeSaldo();
    c2.exibeSaldo();
  }
}
