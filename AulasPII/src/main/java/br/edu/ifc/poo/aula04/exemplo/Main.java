package br.edu.ifc.poo.aula04.exemplo;

import br.edu.ifc.poo.aula04.exemplo.interfaces.DAOEstoque;
import br.edu.ifc.poo.aula04.exemplo.interfaces.DAOGeral;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author fabricio
 */
public class Main {

    public static Collection produtos;

    static {
        Main.produtos = new ArrayList();
    }

    public static void main(String[] args) {
        DAOGeral cliente = new Cliente(1, "José");
        cliente.inserir();
        cliente.listar();
        cliente.excluir();

        DAOGeral arroz = new Produto(10, "Arroz");
        DAOEstoque feijao = new Produto(11, "Feijão");
        Produto macarrao = new Produto(12, "Macarrão");

        arroz.inserir();
        arroz.inserir();
        macarrao.inserir();
        arroz.inserir();
        arroz.listar();
//    feijao.baixar();
//    macarrao.baixar();
        macarrao.listar();

//        arroz.exportar("/home/fabricio/produto");
//        feijao.exportar("/home/fabricio/produto");
        macarrao.exportar("/home/fabricio/produto");
        Produto importado = (Produto) macarrao.importar("/home/fabricio/produto");

        System.out.println(importado.getDescricao());

    }
}
