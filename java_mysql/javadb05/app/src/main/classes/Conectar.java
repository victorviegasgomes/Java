package classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
  private static final String username = "root";
  private static final String password = "victor";
  private static final String url = "jdbc:mysql://localhost:3306/AGENDA";
  
  public static Connection connectToMySql() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connect = DriverManager.getConnection(url, username, password);
    return connect;
  }
}