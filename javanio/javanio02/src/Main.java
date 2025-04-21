import java.nio.file.*;
import java.util.List;

public class Main {
  public static void main(String [] args) {
    Path arquivo = Paths.get("/storage/emulated/0/Documents/language/Java/javanio/javanio02/src/arquivo.txt");
    
    try {
      List<String> texto = Files.readAllLines(arquivo);
      texto.forEach(linha -> System.out.println(linha));
      /*
      for(String linhas: texto) {
        System.out.println(linhas);
      }*/
    }catch(Exception e) {
      System.out.println("ERRO!");
    }
  }
}