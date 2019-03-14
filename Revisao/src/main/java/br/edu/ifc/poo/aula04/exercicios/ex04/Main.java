package br.edu.ifc.poo.aula04.exercicios.ex04;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    Conta c1 = new ContaCorrente(0);
    Conta c2 = new ContaEspecial(0);

    // Conta Corrente
    c1.depositar(100);
    c1.sacar(10);
    JOptionPane.showMessageDialog(null,
        "Saldo da conta "
        + c1.getClass().getSimpleName()
        + " é: " + c1.obterSaldo());

    // Conta Especial
    c2.depositar(100);
    c2.sacar(10);
    JOptionPane.showMessageDialog(null,
        "Saldo da conta "
        + c2.getClass().getSimpleName()
        + " é: " + c2.obterSaldo());

  }
}
