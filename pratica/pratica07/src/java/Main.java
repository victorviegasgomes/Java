public class Main{
	public static void main(String [] args){
		String text = "olá, estou estudando java";
		int contador = 0;

		for(int i = 0; i < text.length(); i++){
			if(Character.isLetter(text.charAt(i))){
				contador++;
			}
		}
		System.out.println("número de caracteres da string: "+contador);
	}
}
