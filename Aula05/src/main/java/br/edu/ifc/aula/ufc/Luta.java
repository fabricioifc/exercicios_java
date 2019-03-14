package br.edu.ifc.aula.ufc;

import java.util.Random;

public class Luta {

  private int rounds;
  private boolean aprovada;

  private Lutador desafiante;
  private Lutador desafiado;

  public Luta() {
  }

  public Luta(int rounds, boolean aprovada, Lutador desafiante, Lutador desafiado) {
    this.rounds = rounds;
    this.aprovada = aprovada;
    this.desafiante = desafiante;
    this.desafiado = desafiado;
  }

  /**
   * Regras. <br />
   * Regra 01: lutadores precisam ser da mesma categoria <br />
   * Regra 02: não pode ser o mesmo lutador
   *
   * @param desafiante
   * @param desafiado
   */
  public void marcarLuta(Lutador desafiante, Lutador desafiado) {
    if (desafiante.getCategoria().equals(desafiado.getCategoria())
        && desafiante != desafiado) {
      this.aprovada = true;
      this.desafiado = desafiado;
      this.desafiante = desafiante;
    } else {
      this.aprovada = false;
      this.desafiado = null;
      this.desafiante = null;
      System.out.println("Luta não pode ser marcada!");
    }
  }

  public void lutar() {
    if (aprovada) {
      System.out.println("=========DESAFIADO=========");
      this.desafiado.apresentar();
      System.out.println("=========DESAFIANTE=========");
      this.desafiante.apresentar();

      verificarVencedor();
    } else {
      System.out.println("Não vai rolar a luta!");
    }
  }

  private void verificarVencedor() {
    Random aleatorio = new Random();
    int vencedor = aleatorio.nextInt(3);

    switch (vencedor) {
      case 0: //para empate
        System.out.println("=============EMPATOU==============");
        this.desafiante.empatarLuta();
        this.desafiado.empatarLuta();
        break;
      case 1: // para vitória
        System.out.println("=============VITÓRIA==============");
        this.desafiante.ganharLuta();
        this.desafiado.perderLuta();
        break;
      case 2: // para derrota
        System.out.println("=============DERROTA==============");
        this.desafiante.perderLuta();
        this.desafiado.ganharLuta();
        break;
    }
    System.out.println("================================================");
  }

  public int getRounds() {
    return rounds;
  }

  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public boolean isAprovada() {
    return aprovada;
  }

  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }

  public Lutador getDesafiante() {
    return desafiante;
  }

  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public Lutador getDesafiado() {
    return desafiado;
  }

  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }

}
