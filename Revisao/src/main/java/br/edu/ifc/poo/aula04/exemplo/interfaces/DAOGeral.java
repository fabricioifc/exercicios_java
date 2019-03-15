package br.edu.ifc.poo.aula04.exemplo.interfaces;

/**
 * Interfaces não podem conter variáveis. Apenas constantes e métodos abstratos.
 *
 * @author fabricio
 */
public interface DAOGeral {

  static final String TESTE = "DAOGeral"; // apenas um exemplo de constante em uma interface.

  void inserir();

  void excluir();

  void listar();

}
