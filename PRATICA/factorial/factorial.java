import java.util.Scanner;
public class factorial {
								
								public static void main(String[] args) {
																Scanner leia = new Scanner(System.in);
																System.out.print("digite um número ");
																int numero = leia.nextInt();
																int factorial = 1;
																for (int i = 1; i <= numero; i++) {
																								factorial *= i;
																}
																System.out.println(factorial);
								}
								
}