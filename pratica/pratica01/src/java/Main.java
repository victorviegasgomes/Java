import java.util.Scanner;
public class Main{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int i,c,arvore;
		System.out.print("tamanho da árvore: ");
		int tamanho = leia.nextInt();
		for(i = 1; i <= tamanho; i++){
			for(c = 0; c <= tamanho-i; c++){
				System.out.print(" ");
			}
			for(arvore = 0; arvore <= (tamanho-c)*2; arvore++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
