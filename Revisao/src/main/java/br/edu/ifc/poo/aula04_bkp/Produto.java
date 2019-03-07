package br.edu.ifc.poo.aula04_bkp;

import br.edu.ifc.poo.aula04_bkp.interfaces.DAOEstoque;
import br.edu.ifc.poo.aula04_bkp.interfaces.DAOGeral;
import java.util.ArrayList;
import java.util.Collection;

public class Produto implements DAOGeral, DAOEstoque {

  private int numero;
  private String descricao;

  public Produto(int numero, String descricao) {
    this.numero = numero;
    this.descricao = descricao;
  }

  @Override
  public void inserir() {
    System.out.println("Inserindo produto");
    Main.produtos.add(this);
  }

  @Override
  public void excluir() {
    Main.produtos.remove(this);
  }

  @Override
  public void listar() {
    System.out.println("********************************");
    System.out.println("Lista de Produtos");
    for (Object objeto : Main.produtos) {
      Produto p = (Produto) objeto;
      System.out.println(p.getDescricao());
    }
    System.out.println("********************************");
  }

  @Override
  public void baixar() {
    System.out.println("Baixando produto do estoque");
    Main.produtos.remove(this);
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

}
