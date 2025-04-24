package classes;

import java.util.Date;
import classes.ContatoDao;
import classes.Contato;

public class Main {
  public static void main(String [] args) {
    ContatoDao contatoDao = new ContatoDao();
    
    Contato contato = new Contato();
    contato.setNome("Victor");
    contato.setIdade(17);
    contato.setDataCadastro(new Date());
    
    contatoDao.save(contato);
  }
}