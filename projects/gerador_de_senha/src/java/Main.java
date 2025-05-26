import java.util.Random;
import java.util.Scanner;
public class Main{
	     public static String gerarSenha(int tamanho){
	         String caractere = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$_&-*?!%";
	         Random roleta = new Random();
	         StringBuilder palavra = new StringBuilder();
	         for (int i = 0; i < tamanho; i++){
	             int indice = roleta.nextInt(caractere.length());
	             char letraSenha = caractere.charAt(indice);
	             palavra.append(letraSenha);
	     }
	     return palavra.toString();
	}
	public static void main(String args []){
		Scanner leia = new Scanner(System.in);
		System.out.print("quantas senhas você quer gerar: ");
		int quantidadeSenhas = leia.nextInt();

		for(int c = 0; c < quantidadeSenhas; c++){
			String senhaGerada = gerarSenha(8);
			System.out.println("senha "+(c+1)+": "+senhaGerada);
		}
	}
}
