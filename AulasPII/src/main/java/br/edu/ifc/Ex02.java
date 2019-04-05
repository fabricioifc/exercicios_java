package br.edu.ifc.revisoes.inicio;

import javax.swing.JOptionPane;

/**
 *
 * @author fabricio
 */
public class Ex02 {

  public static void main(String[] args) {
    int altura, base, area;

    base = Integer.parseInt(JOptionPane.showInputDialog(null, "Base: "));
    altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Altura: "));

//    area = base * altura;
    area = calcularAreaRetangulo(base, altura);
    JOptionPane.showMessageDialog(null, "Área: " + area);

  }

  public static int calcularAreaRetangulo(int base, int altura) {
    return base * altura;
  }
}
