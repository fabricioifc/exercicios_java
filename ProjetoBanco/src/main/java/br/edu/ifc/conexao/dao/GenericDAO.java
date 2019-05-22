package br.edu.ifc.conexao.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<K, I extends Number> {
    boolean salvar(K objeto) throws SQLException;
    boolean atualizar(K objeto) throws SQLException;
    boolean excluir(K objeto) throws SQLException;
    List<K> listarTodos()  throws SQLException;
    K getPorId(I id, K objeto) throws SQLException;
}
