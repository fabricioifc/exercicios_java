package br.edu.ifc.poo.aula01;

public class VeiculoTeste {

  public static void main(String[] args) {
    Veiculo v1 = new Veiculo();
    Veiculo v2 = new Veiculo();
    
    v1.cor = "Vermelho";
//    v1.ano = 2008;
    v1.setAno(2008);
//    v1.velocidade = 0;
    v1.setVelocidade(0);
    v1.setLigado(false);

    System.out.println(v1.isLigado());
    v1.ligar();
    System.out.println(v1.isLigado());
    v1.acelerar();
    v1.acelerar();
    v1.acelerar();
    v1.acelerar(30);
    v1.acelerar(100);
    v1.acelerar(100);
    v1.frear(false);
    v1.frear(true);
    v1.desligar();
    
    
    System.out.println(v1.getQtdVeiculos());    
  }
}
