package br.edu.ifc.gui.aulasbdii;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fabricio
 */
public class Conexao {

  private final static String URL_DATABASE = "jdbc:postgresql://localhost:5432/mercadodb";
  private final static String USUARIO = "postgres";
  private final static String SENHA = "postgres";

  public static Connection criarConexao() throws SQLException {
    Connection conexao = DriverManager.getConnection(URL_DATABASE, USUARIO, SENHA);
    conexao.setAutoCommit(false);
    return conexao;
  }

  public static void fecharConexao(Connection conn) {
    try {
      conn.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
  
  public static void commit(Connection conn){
    try {
      conn.commit();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
  
  public static void rollback(Connection conn){
    try {
      conn.rollback();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
