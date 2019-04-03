package br.edu.ifc.aula.ufc;

public class Main {

  public static void main(String[] args) {
    Lutador anderson = new Lutador("Anderson Silva", 38, 1.88, 
        72.0, 10, 2, 0, CategoriaType.PENA, NacionalidadeType.BRASIL);
    Lutador neymar = new Lutador();
    neymar.setNome("Neymar");
    neymar.setAltura(1.78);
    neymar.setCategoria(CategoriaType.PENA);
    neymar.setDerrotas(2);
    neymar.setEmpates(12);
    neymar.setIdade(26);
    neymar.setNacionalidade(NacionalidadeType.BRASIL);
    neymar.setPeso(35.0);
    neymar.setVitorias(0);

    Luta lutaDoAno = new Luta();
    lutaDoAno.setRounds(5);

    lutaDoAno.marcarLuta(anderson, neymar);
    lutaDoAno.lutar();

  }
}
