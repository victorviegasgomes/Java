import java.util.*;
import java.nio.file.*;

public class Main
{
	public static void main(String[] args)
	{
		String caminho = "/storage/emulated/0/Documents/language/Java/pratica/pratica10/src/nomes.txt";
		try {
			Path caminhos = Paths.get(caminho);
			List<String> linhas = Files.readAllLines(caminhos);
			//System.out.println(linhas);
			String res = String.join("\n", linhas);
			System.out.println(res);
		}catch(Exception e) {
			System.out.println("erro ao ler o arquivo");
		}
	}
}
