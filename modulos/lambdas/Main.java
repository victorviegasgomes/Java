import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> valores = new ArrayList<Integer>();
    ArrayList<Integer> dobro = new ArrayList<Integer>();
    ArrayList<Integer> triplo = new ArrayList<Integer>();
    ArrayList<Integer> par = new ArrayList<Integer>();
    ArrayList<Integer> impar = new ArrayList<Integer>();
    
    valores.add(1);
    valores.add(2);
    valores.add(3);
    valores.add(4);
    valores.add(5);
    valores.add(6);
    
    Consumer<Integer> triplicar = (val) -> {
      triplo.add(val*3);
    };
    
    valores.forEach((val)-> {
      dobro.add(val*2);
    });
    
    valores.forEach((val) -> {
      if(val % 2 == 0) {
        par.add(val);
      }else {
        impar.add(val);
      }
    });
    
    valores.forEach(triplicar);
    
    System.out.println(valores);
    System.out.println(dobro);
    System.out.println(triplo);
    System.out.println(par);
    System.out.println(impar);
  }
}