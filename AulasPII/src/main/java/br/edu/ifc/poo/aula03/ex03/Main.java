package br.edu.ifc.poo.aula03.ex03;

public class Main {

  public static void main(String[] args) {
    Conta c1 = new ContaCorrente(12345, "Banco do Brasil", 0.0);
    c1.depositar(100.0);
    c1.depositar(250.0);
    c1.sacar(25.0);
    c1.atualizarSaldo(0.5);
    System.out.println(c1.toString());

    Conta c2 = new ContaPoupanca(98754, "Banco do Brasil");
    c2.depositar(100.0);
    c2.depositar(250.0);
    c2.sacar(25.0);
    c2.atualizarSaldo(0.5);
    System.out.println(c2.toString());
  }
}
