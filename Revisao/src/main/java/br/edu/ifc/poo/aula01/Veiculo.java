package br.edu.ifc.poo.aula01;

import javax.swing.JOptionPane;

public class Veiculo {

  public String cor;
  private int ano;
  private int velocidade;
  protected boolean ligado;

  private static int qtdVeiculos; //global
  private static final int VELOCIDADE_MAXIMA = 120; //constante

  public Veiculo() {
    this("branco", 2019);
  }

  public Veiculo(String cor, int ano) {
    this.cor = cor;
    this.ano = ano;
    qtdVeiculos++;
  }

  public void ligar() {
    System.out.println("Ligou");
    this.ligado = true;
  }

  public void desligar() {
    System.out.println("Desligou");
    this.ligado = false;
  }

  public void acelerar() {
    this.acelerar(1);
  }

  //sobrecarga
  public void acelerar(int valor) {
    if (velocidade < VELOCIDADE_MAXIMA) {
      System.out.println("Acelerou");
      this.velocidade += valor;
    } else {
      JOptionPane.showConfirmDialog(null, "Atingiu a velocidade máxima!");
    }

  }

  public void frear(boolean parar) {
    if (parar) {
      this.velocidade = 0;
      System.out.println("Parou");
    } else {
      this.velocidade -= 10;
      System.out.println("Freou");
    }
  }

  public void setAno(int valor) {
    this.ano = valor;
  }

  public int getAno() {
    return this.ano;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
  }

  public boolean isLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public static int getQtdVeiculos() {
    return qtdVeiculos;
  }

}
