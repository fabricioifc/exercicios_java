package br.edu.ifc.poo.aula10.prova;

import javax.swing.JOptionPane;

public class TestarObjetoGeometrico {

    public static void main(String[] args) {
        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha uma forma geométrica.",
                null,
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Círculo", "Retângulo"},
                0);

        System.out.println(escolha);

        String mensagem = null;
        ObjetoGeometrico og = null;
        if (escolha == 0) {
            String eRaio = JOptionPane.showInputDialog("Informe o ráio do círculo: ");
            og = new Circulo(Double.parseDouble(eRaio));

            mensagem = "Área do círculo: " + og.calcularArea() + "\n" + "Perímetro do círculo: " + og.calcularPerimetro();
        } else {
            String eBase = JOptionPane.showInputDialog("Informe o base do quadrado: ");
            String eAltura = JOptionPane.showInputDialog("Informe o altura do quadrado: ");
            og = new Retangulo(Double.parseDouble(eBase), Double.parseDouble(eAltura));

            mensagem = "Área do quadrado: " + og.calcularArea() + "\n" + "Perímetro do quadrado: " + og.calcularPerimetro();
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
