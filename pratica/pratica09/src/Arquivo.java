import java.io.*;

public class Arquivo
{
	public String ler(String caminho) throws Exception {
		String conteudo = "";
		BufferedReader leitor = null;
		try {
			FileReader leitorArquivo = new FileReader(caminho);
			leitor = new BufferedReader(leitorArquivo);
			String linha = leitor.readLine();
			while(linha != null) {
				conteudo += linha;
				linha = leitor.readLine();
				if(linha != null) {
					conteudo += linha;
				}
			}
		}catch(Exception erro) {
			throw erro;
		}finally {
			if(leitor != null) {
				leitor.close();
			}
		}
		return conteudo;
	}
}