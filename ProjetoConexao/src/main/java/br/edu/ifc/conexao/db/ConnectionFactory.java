package br.edu.ifc.conexao.db;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

  public static final String URL = "jdbc:postgresql://localhost:5432/";
  public static final String DATABASE = "produtosdb";
  public static final String USUARIO = "postgres";
  public static final String SENHA = "postgres";

  /**
   * Pegar a conexão com o banco de dados PostgreSQL
   *
   * @return Connection object
   */
  public static Connection getConnection() {
    try {
      Class.forName("org.postgresql.Driver");

      return DriverManager.getConnection(URL, USUARIO, SENHA);
    } catch (ClassNotFoundException | SQLException ex) {
      throw new RuntimeException("Error connecting to the database", ex);
    }
  }

  /**
   * Criar a base de dados e as tabelas iniciais do projeto
   */
  public static boolean verificarDatabaseExiste() throws SQLException {
    Connection conn = ConnectionFactory.getConnection();
    String sql = "SELECT 1 from pg_database WHERE datname=?";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, DATABASE);
    ResultSet rs = ps.executeQuery();

    if (rs.next() && rs.getBoolean(1)) {
      return true;
    }
    return false;
  }

  /**
   * Criar a base de dados
   *
   * @throws SQLException
   */
  public static void criarDatabase() throws SQLException {
    Connection conn = ConnectionFactory.getConnection();
    String sql = "CREATE DATABASE " + DATABASE;
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.executeUpdate();
  }

  public static void main(String[] args) throws Exception {
    if (!verificarDatabaseExiste()) {
      System.out.println("A base de dados " + DATABASE + " não existe!");
      criarDatabase();
      if (verificarDatabaseExiste()) {
        System.out.println("Base de dados " + DATABASE + " criada com sucesso!");
      } else {
        System.out.println("Não foi possível crair Base de dados " + DATABASE + "!");

//        String text = Files.readAllBytes(Paths.get(getClass().getResource("dump.sql").toURI())).toString();
      }
    }
  }
}
