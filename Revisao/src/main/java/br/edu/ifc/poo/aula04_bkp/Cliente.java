/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.poo.aula04_bkp;

import br.edu.ifc.poo.aula04_bkp.interfaces.DAOGeral;

/**
 *
 * @author fabricio
 */
public class Cliente implements DAOGeral {

  private int codigo;
  private String nome;

  public Cliente(int codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
  }

  @Override
  public void inserir() {
    System.out.println("Inserindo cliente");
  }

  @Override
  public void excluir() {
    System.out.println("Excluindo cliente");
  }

  @Override
  public void listar() {
    System.out.println("Listando clientes");
  }

}
