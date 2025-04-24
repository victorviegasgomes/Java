package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

public class ContatoDao {
  public void save(Contato contato) {
    String sql = "insert into contato(nome, idade, datacadastro) values(?,?,?)";
    Connection conn = null;
    PreparedStatement prepar = null;
    
    try {
      conn = Conectar.connectToMySql();
      prepar = conn.prepareStatement(sql);
      
      prepar.setString(1, contato.getNome());
      prepar.setInt(2, contato.getIdade());
      prepar.setDate(3, new Date(contato.getDataCadastro().getTime()));
      prepar.execute();
    }catch(Exception e) {
      e.printStackTrace();
    }finally {
      try {
        if(prepar != null) {
          prepar.close();
        }
        if(conn != null) {
          conn.close();
        }
      }catch(Exception e) {
        e.printStackTrace();
      }
    }
  }
}