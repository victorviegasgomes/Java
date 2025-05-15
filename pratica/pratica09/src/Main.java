import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		String caminho = "/storage/emulated/0/Documents/language/Java/pratica/pratica09/src/nomes.txt";
		Arquivo arquivo = new Arquivo();
		try {
			String linha = arquivo.ler(caminho);
			System.out.println(linha);
		}catch(Exception e) {
			JOptionPane.showMenssageOiaLog(null, "erro ao ler o arquivo");
		}
	}
}
