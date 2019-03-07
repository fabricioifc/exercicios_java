package br.edu.ifc.poo.aula03.ex04;

public class Main {

  public static void main(String[] args) {
    Ingresso i1 = new Ingresso(10);
    Vip i2 = new Vip(10, 5);
    Normal i3 = new Normal(10);
    CamaroteInferior i4 = new CamaroteInferior(10, 10);
    CamaroteSuperior i5 = new CamaroteSuperior(10, 15);
    
    i1.imprimeValor();
    
    //VIP
    i2.getValorComAdicional(); //VIP
    i2.imprimeValor();         //Ingresso
    
    //Normal
    i3.imprimeValor();
    i3.imprimir();
    
    //Inferior
    i4.imprimeValor();
    i4.getValorComAdicional();
    i4.getLocalizacao();
        
    //Superior
    i5.imprimeValor();
    i5.getValorComAdicional();
  }
}
