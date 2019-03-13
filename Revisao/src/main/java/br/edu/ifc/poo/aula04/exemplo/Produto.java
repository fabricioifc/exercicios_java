package br.edu.ifc.poo.aula04.exemplo;

import br.edu.ifc.poo.aula04.exemplo.interfaces.Arquivo;
import br.edu.ifc.poo.aula04.exemplo.interfaces.DAOEstoque;
import br.edu.ifc.poo.aula04.exemplo.interfaces.DAOGeral;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Produto implements DAOGeral, DAOEstoque, Serializable, Arquivo {

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

    @Override
    public Object importar(String caminhoDoArquivo) {
        try {

            FileInputStream entrada = new FileInputStream(caminhoDoArquivo + this.numero);
            ObjectInputStream arquivo = new ObjectInputStream(entrada);

            Produto obj = (Produto) arquivo.readObject();
            arquivo.close();
            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public void exportar(String caminhoDoArquivo) {
        try {
            File arquivo = new File(caminhoDoArquivo + this.numero);
            arquivo.createNewFile();
            FileOutputStream fileOut = new FileOutputStream(arquivo.getPath(), false);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(this);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

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

    @Override
    public String toString() {
        return new StringBuffer().append(this.numero).append(";").append(this.descricao).toString();
    }

}
