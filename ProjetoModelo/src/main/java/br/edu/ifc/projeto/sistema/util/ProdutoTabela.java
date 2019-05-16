/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.gui.aula18.sistema.view;

import br.edu.ifc.gui.aula18.sistema.model.Produto;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author fabricio
 */
public class ProdutoTabela extends AbstractTableModel {

    private String colunas[] = {"id", "nome", "valor", "objeto"};
    private List<?> lista;

    private final int COLUNA_ID = 0;
    private final int COLUNA_NOME = 1;
    private final int COLUNA_VALOR = 2;
    private final int COLUNA_OBJETO = 3;

    public ProdutoTabela(List<?> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int indice) {
        return colunas[indice];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case COLUNA_ID:
                return Long.class;
            case COLUNA_NOME:
                return String.class;
            case COLUNA_VALOR:
                return Character.class;
            default:
                return String.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto aluno = (Produto) this.lista.get(rowIndex);

        switch (columnIndex) {
            case COLUNA_ID:
                return aluno.getId();
            case COLUNA_NOME:
                return aluno.getNome();
            case COLUNA_VALOR:
                return aluno.getValor();
            case COLUNA_OBJETO:
                return aluno;
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Produto aluno = (Produto) this.lista.get(rowIndex);

        switch (columnIndex) {
            case COLUNA_ID:
                aluno.setId(Long.parseLong(aValue.toString()));
                break;
            case COLUNA_NOME:
                aluno.setNome(String.valueOf(aValue));
                break;
            case COLUNA_VALOR:
                aluno.setValor(Double.parseDouble(aValue.toString()));
                break;
            case COLUNA_OBJETO:
                aluno = (Produto) aValue;
                break;
        }
        fireTableDataChanged();
    }

    public void escondeColunaObjeto(JTable tabela, TableColumn coluna) {
        tabela.removeColumn(coluna);
    }

    public void removerLinha(int linha) {
        lista.remove(linha);
        fireTableDataChanged();
    }

    public void removerLinhas() {
        lista.clear();
        fireTableDataChanged();
    }
}
