import java.util.Scanner;

public class Main{
	public static void main(String arg[]){
		Scanner leia = new Scanner(System.in);
		System.out.print("operação: ");
		String operacao = leia.nextLine();
		char operador = '+';

		if(operacao.contains("+")){
			operador = '+';
		}else if(operacao.contains("-")){
			operador = '-';
		}else if(operacao.contains("*")){
			operador = '*';
		}else if(operacao.contains("/")){
			operador ='/';
		}

		String[] partes = operacao.split("\\"+operador);

		String numero1 = partes[0];
		String numero2 = partes[1];

		float num1 = Float.parseFloat(numero1.trim());
		float num2 = Float.parseFloat(numero2.trim());

		float resultado = 0;

		if(operador == '+'){
			resultado = num1 + num2;
			
			if(resultado % 1 != 0){
				System.out.format("resultado: %.3f",resultado);
			}else{
				System.out.format("resultado: %.0f",resultado);
			}
			
		}else if(operador == '-'){
			resultado = num1-num2;

			if(resultado % 1 != 0){
				System.out.format("resultado: %.3f",resultado);
			}else{
				System.out.format("resultado: %.0f",resultado);
			}
			
		}else if(operador =='*'){
			resultado = num1*num2;

			if(resultado % 1 != 0){
				System.out.format("resultado: %.3f",resultado);
			}else{
				System.out.format("resultado: %.0f",resultado);
			}
			
		}else if(operador == '/'){
			resultado = num1/num2;

			if(resultado % 1 != 0){
				System.out.format("resultado: %.3f",resultado);
			}else{
				System.out.format("resultado: %.0f",resultado);
			}
		}else{
			System.err.println("ERRO! verifique a expressão.");
		}
	}
}
