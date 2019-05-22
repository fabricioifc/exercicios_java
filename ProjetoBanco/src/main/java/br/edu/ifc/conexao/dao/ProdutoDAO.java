/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.conexao.dao;

import br.edu.ifc.conexao.db.DatabaseConnection;
import br.edu.ifc.conexao.model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabricio
 */
public class ProdutoDAO implements GenericDAO<Produto, Long> {

    private final String SQL_INSERT = "INSERT INTO produtos (nome, valor) values (?,?)";
    private final String SQL_UPDATE = "UPDATE produtos set nome = ?, valor = ? where id = ?";
    private final String SQL_DELETE = "DELETE FROM produtos where id = ?";
    private final String SQL_SELECT = "SELECT * FROM produtos";
    private final String SQL_SELECT_BY_ID = "SELECT * FROM produtos where id = ?";

    @Override
    public boolean salvar(Produto objeto) throws SQLException {
        int i = 1;
        boolean resultado;
        try {
            PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(SQL_INSERT);
            ps.setString(i++, objeto.getNome());
            ps.setDouble(i++, objeto.getValor());

            resultado = ps.executeUpdate() == 1;
            DatabaseConnection.commit();
            return resultado;
        } catch (SQLException ex) {
            DatabaseConnection.rollback();
            throw ex;
        } finally {
            DatabaseConnection.fecharConexao();
        }
    }

    @Override
    public List<Produto> listarTodos() throws SQLException {
        List<Produto> lista = new ArrayList<>();
        ResultSet rs;
        try {
            PreparedStatement ps = DatabaseConnection.getInstance().getConnection().prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new Produto(rs.getLong("id"), rs.getString("nome"), rs.getDouble("valor")));
            }

            DatabaseConnection.commit();
            return lista;
        } catch (SQLException ex) {
            DatabaseConnection.rollback();
            throw ex;
        } finally {
            DatabaseConnection.fecharConexao();
        }
    }

    @Override
    public Produto getPorId(Long id, Produto objeto) throws SQLException {
        throw new UnsupportedOperationException("Implemente este método.");
    }

    @Override
    public boolean atualizar(Produto objeto) throws SQLException {
        throw new UnsupportedOperationException("Implemente este método.");
    }

    @Override
    public boolean excluir(Produto objeto) throws SQLException {
        throw new UnsupportedOperationException("Implemente este método.");
    }
}
