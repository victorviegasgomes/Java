import java.util.Scanner;
public class Main{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		String texto = "abcdefghijklmnopqrstuvwxyz";

		System.out.println("\n\n      cifra de césar\n");
		System.out.println("----------------------------------------\n");

		System.out.print("qual chave você gostaria de usar: ");
		int chave = leia.nextInt();
		System.out.print("digite um texto: ");
		String textoUsuario = leia.next();

		System.out.println("\n----------------------------------------\n");

		char letras;

		for(int i = 0; i < textoUsuario.length(); i++){
			letras = textoUsuario.charAt(i);
			if(letras >= 'a' && letras <= 'z'){
				letras += chave;
				System.out.print(letras);
			}else if(letras == 'z'){
				letras = 'a';
				letras += chave-1;
				System.out.print(letras);
			}else{
				break;
			}
		}

		System.out.println("\n\n----------------------------------------\n");
	}
