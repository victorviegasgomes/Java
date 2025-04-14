import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int valor[] = new int[5];
    int valorMax = (int) (Integer.MAX_VALUE);
    int valorMin = (int) (Integer.MIN_VALUE);
    
    System.out.println("digite 5 números: ");
    for(int i = 0; i < 5; i++) {
      System.out.print("número "+ (i+1) +": ");
      valor[i] = leia.nextInt();
      if(valor[i] > valorMax) {
        valorMax = valor[i];
      }else if(valor[i] < valorMin) {
        valorMin = valor[i];
      }
    }
    System.out.println("maior valor: "+ valorMax);
    System.out.println("menor valor: "+ valorMin);
    
    leia.close();
  }
}