package br.edu.ifc.poo.aula09;

public class Main {

    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Fabricio", "06756919903", "4784812");
        Carro corsa = new Carro(p1, new Marca(1, "Chevrolet", 2005));

        corsa.setMarchaAtual(0);
        corsa.setModelo("Corsa");
        corsa.setNumMarchas(5);
        corsa.setVelAtual(0);
        corsa.setVelMax(180);
        corsa.setVolCombustivel(10);

        System.out.println(corsa.toString());

        System.out.println("Vol. Combustível: " + corsa.exibirVolumeCombustivel());
        corsa.comGasolinaAditivada(10);
        corsa.comGasolinaComum(20);

        System.out.println("Vol. Combustível: " + corsa.exibirVolumeCombustivel());
        System.out.println("Autonomia: " + corsa.getAutonomia());
    }
}
