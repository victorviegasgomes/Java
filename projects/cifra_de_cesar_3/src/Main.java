import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner leia = new Scanner (System.in);
		System.out.println("-------------------------------\n");
		
		System.out.print("digite uma palavra: ");
		String palavra = leia.nextLine();
		System.out.print("escolha a chave desejada: ");
		int chave = leia.nextInt();

		System.out.println("\n-------------------------------\n");

		String cifra = criarCifra(palavra,chave);

		System.out.println("cifra: "+cifra);

		System.out.println("\n-------------------------------\n");
	}
	public static String criarCifra(String texto, int chave){
		StringBuilder cifra = new StringBuilder();

		for(int i = 0; i < texto.length(); i++){
			char letras = texto.charAt(i);
			if(Character.isLetter(letras)){
				char base = Character.isUpperCase(letras)?'A':'a';
				char modificador = (char)((letras-base+chave)%26+base);
				cifra.append(modificador);
			}else{
				cifra.append(letras);
			}
		}
		
		return cifra.toString();
	}
}
