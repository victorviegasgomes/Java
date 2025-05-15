import java.util.*;
import util.list.*;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		System.out.println("=====Lista de tarefas=====");
		System.out.println("1) Adicionar tarefa");
		System.out.println("2) Remover tarefas");
		System.out.println("3) Listar Tarefas");
		System.out.println("4) Sair");
		System.out.print("Opção #");
		opcao = leitor.nextInt();
		while(true) {
			switch(opcao) {
				case 1: {
					String tarefaParaAdicionar;
					int totalTarefas = 0;
					int contador = 0;
					System.out.println("Quantas tarefas vai adicionar?: ");
					totalTarefas = leitor.nextInt();
					while(contador <= totalTarefas) {
						System.out.print("Tarefa #" + contador + 1 + ": ");
						tarefaParaAdicionar = leitor.nextLine();
						Tarefas.setTarefa(tarefaParaAdicionar);
						System.out.println(Tarefas.addTarefa(tarefaParaAdicionar));
					}
				}case 2: {
					
				}case 3: {
					
				}default: {
					break;
				}
			}
		}
	}
}