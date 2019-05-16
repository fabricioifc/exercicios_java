/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.gui.aula18.sistema.controller;

import br.edu.ifc.gui.aula18.sistema.model.Produto;
import br.edu.ifc.gui.aula18.sistema.view.ProdutoGUI;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;

/**
 *
 * @author fabricio
 */
public class ProdutoController implements ProdutoListener {

    private List<Produto> lista = new ArrayList<>();
    private ProdutoGUI tela;

    public ProdutoController(JInternalFrame tela) {
        this.tela = (ProdutoGUI) tela;

        lista.add(new Produto(1L, "Macarrão", 5.50));
    }

    @Override
    public boolean salvar(Produto produto) {
        produto.setId(Long.parseLong(String.valueOf(lista.size() + 1)));
        boolean salvou = lista.add(produto);

        if (salvou) {
            tela.limparTela();
            tela.mostrarMensagem("Produto Salvo com Sucesso!");
            carregar();
        }
        return salvou;
    }

    @Override
    public void carregar() {
        try {
            tela.montarTabela(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
