package cifra;
import java.util.Scanner;
public class Cifra{
	private int chave;
	private String palavra;

	public void getDados(String palavra, int chave){
		this.palavra = palavra;
		this.chave = chave;
	}

	public void setDados(){
		Scanner leia = new Scanner(System.in);
		System.out.print("digite uma palavra: ");
		palavra = leia.next();
		System.out.print("escolha uma chave: ");
		chave  = leia.nextInt();
	}

	public String criarCifra(){
		StringBuilder novaPalavra = new StringBuilder();
		
		for(int i = 0; i < palavra.length(); i++){
			char letra = palavra.charAt(i);
			char letras;
			if(Character.isLetter(letra)){
				if(letra == 'z'){
					letras = 'a';
					novaPalavra.append(letra+=(chave-1));
				}else if(letra == 'Z'){
					letras = 'A';
					novaPalavra.append(letras+=(chave-1));
				}else if(letra != 'Z' && letra != 'z'){
					novaPalavra.append((char)(letra+=chave));
				}
			}else{
				novaPalavra.append(letra);
			}
		}
		return novaPalavra.toString();
	}
}
