import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = new String("/storage/emulated/0/Android/data/be.xbd.kotlin/files/projects/javaio01/src/main/java/arquivo.txt");
        File arq = new File(path);
        try {
            Scanner leitor = new Scanner(arq);
            while(leitor.hasNext()) {
                String linhas = leitor.nextLine();
                System.out.println(linhas);
            }
        }catch(Exception e) {
            System.out.println("erro ao abrir o arquivo!");
        }
        //leitor.close();
    }
}