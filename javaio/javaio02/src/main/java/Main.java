import java.io.FileWriter;
import java.io.BufferedWriter;
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter arquivo = new FileWriter("arquivo.txt", true);
            BufferedWriter escritor = new BufferedWriter(arquivo);
            //escreva alguma coisa para salvar no arquivo
            escritor.write("");
            System.out.println("dados salvos");
            escritor.close();
        }catch(Exception e) {
            System.out.println("erro ao carregar o arquivo");
        }
    }
}