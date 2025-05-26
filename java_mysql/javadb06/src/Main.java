import java.sql.*;

public class Main {
  public static void main(String[] args) {
    Connection conn = null;
    Statement state = null;
    
    String url = "jdbc:mysql://localhost:3306/javadb";
    String user = "root";
    String pass = "victor_dev_java";
    
    try {
      conn = DriverManager.getConnection(url, user, pass);
      state = conn.createStatement();
      ResultSet sql = state.executeQuery("create table if not exists pessoas(" + 
      "id int not null," + 
      "nome varchar(30) not null" + 
      "nascimento date);");
      System.out.println("Conexão bem sucedida!");
      conn.close();
      state.close();
    }catch(Exception e) {
      System.out.println("ERRO! " + e.getMessage());
    }
  }
}