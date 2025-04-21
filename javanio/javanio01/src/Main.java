import java.nio.file.*;
public class Main {
  public static void main(String [] args) {
    Path directory = Paths.get("/storage/emulated/0/Documents/language/Java/javanio/javanio01/src");
    if(Files.isDirectory(directory)) {
      System.out.println("o directório existe!");
    }else {
      System.out.println("o directório NÃO existe!");
    }
  }
}