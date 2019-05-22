package br.edu.ifc.gui.aula18.sistema.controller;

import br.edu.ifc.gui.aula18.sistema.model.Produto;

public interface ProdutoListener {
    
    void carregar() throws Exception;
    boolean salvar(Produto produto) throws Exception;
    boolean excluir(Produto produto) throws Exception;
}
