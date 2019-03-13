package br.edu.ifc.poo.aula04.exercicios.ex05;

public class FabricaLampa {

    // poderiamos utilizar ENUM também
    public static final String INCANDECENTE = "INCANDECENTE";
    public static final String FLUORECENTE = "FLUORECENTE";

    public Lampada construir(String lampada) {
        if (lampada.equals(INCANDECENTE)) {
            return new Incandecente();
        } else if (lampada.equals(FLUORECENTE)) {
            return new Fluorecente();
        }
        return null;
    }

    class Incandecente implements Lampada {

        @Override
        public void ligar() {
            System.out.println("Ligando a lâmpada " + this.toString());
        }

        @Override
        public void desligar() {
            System.out.println("Desligando a lâmpada " + this.toString());
        }

    }

    class Fluorecente implements Lampada {

        @Override
        public void ligar() {
            System.out.println("Ligando a lâmpada " + this.toString());
        }

        @Override
        public void desligar() {
            System.out.println("Desligando a lâmpada " + this.toString());
        }

    }
}
