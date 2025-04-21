import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import javadb02.src.db.Javadb;
public class Main {
  public static void main(String [] args) throws SQLExeption {
    Connection conexao = new ConnectionFactory().getConnection();
    
    String sql = "insert into contactos (nome, email, endereco, nascimento) values(?,?,?,?)";
    PreparedStantment stmt = conexao.preparedStantment(sql);
    
    stmt.setNome(1, "victor");
    stmt.setEmail(2, "vviegasgomes@gmail.com");
    stmt.setEndereco(3, "benfica/dona xepa");
    stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
    
    stmt.execute();
    stmt.close();
    
    System.out.println("gravado!");
    
    conexao.close();
  }
}