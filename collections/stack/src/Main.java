import java.util.Stack;

public class Main {
  public static void main(String [] args) {
    Stack<String> carros = new Stack<>();
    
    carros.push("corvetti");
    carros.push("camaro");
    carros.push("eclipse");
    carros.push("audi tt");
    carros.push("mustang");
    
    System.out.println(carros);
    for(String c: carros) {
      System.out.println(c);
    }
    System.out.println("topo da pilha: " + carros.peek());
    //peek: método que retorna o elemento que está no topo da pilha
    System.out.println("topo da pilha: " + carros.pop());
    //método que retira o elemento do topo e mostra o novo elemento que está, no topo
    carros.clear(); //limpa a pilha todo
    System.out.println(
      carros.empty()?
      "pilha vazia" : "pilha cheia"
    );//retorna um boolean que caso a pilha esteja vazia retorna true se não retorna false
  }
}