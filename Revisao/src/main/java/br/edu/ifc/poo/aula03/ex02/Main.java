package br.edu.ifc.poo.aula03.ex02;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    OperacaoMatematica op1 = new Soma();
    OperacaoMatematica op2 = new Subtracao();

    JOptionPane.showMessageDialog(null, op1.calcular(10, 15)); //Somar
    JOptionPane.showMessageDialog(null, op2.calcular(10, 5)); //Subtrair
  }
}
