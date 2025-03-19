public class Main{
	public static void main(String args[]){
		String texto = "programação";
		char letraProcurada = 'a';
		boolean encontrado = false;

		for(int i = 0; i <texto.length(); i++){
			if(texto.charAt(i) == letraProcurada){
				encontrado = true;
				break;
			}
		}
		System.out.println(encontrado);
		System.out.format("a letra \"%s\" foi encontrada na string",letraProcurada);
	}
}
