package br.edu.ifc.gui.aula18.sistema.controller;

import br.edu.ifc.gui.aula18.sistema.model.Produto;

public interface ProdutoListener {
    
    void carregar();
    boolean salvar(Produto produto);
}
