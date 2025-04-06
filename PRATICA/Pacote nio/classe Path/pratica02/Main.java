import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Main {
  public static void main(String arg []) {
    Path path = Paths.get("/storage/emulated/0/Documents/language/java/PRATICA/pacote nio/pratica02/arquivo.txt");
    
    System.out.println("nome do arquivo: " + path.getFileName());
    System.out.println("diretorio pai: " + path.getParent());
    System.out.println("raíz: " + path.getRoot());
    System.out.println("é absoluto? " + path.isAbsolute());
  }
}