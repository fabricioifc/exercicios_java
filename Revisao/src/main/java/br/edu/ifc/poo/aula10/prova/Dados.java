package br.edu.ifc.poo.aula10.prova;

import javax.swing.JOptionPane;

abstract public class Dados implements ObjetoGeometrico {

    protected Double raio, base, altura;

    public Dados(Double raio) {
        this.raio = raio;
    }

    public Dados(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void imprimirResultado(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
