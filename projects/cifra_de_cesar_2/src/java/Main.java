import cifra.Cifra;
public class Main{
	
	public static void main(String[]args){
		Cifra cesar = new Cifra();

		cesar.setDados();
		
		String palavra = cesar.criarCifra();

		System.out.println("cifra gerada: "+palavra);
		
	}
}
