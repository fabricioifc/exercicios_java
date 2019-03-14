package br.edu.ifc.poo.aula04.exercicios.ex05;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int tipo = JOptionPane.showOptionDialog(null,
                "Que lâmpada quer construir?", "Escolha",
                0, JOptionPane.QUESTION_MESSAGE, null,
                new String[]{"Incandecênte", "Fluorecente"},
                null);

        try {
            Lampada lampada = new FabricaLampa().construir(tipo == 0 ? FabricaLampa.INCANDECENTE : FabricaLampa.FLUORECENTE);

            lampada.ligar();
            lampada.desligar();

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
