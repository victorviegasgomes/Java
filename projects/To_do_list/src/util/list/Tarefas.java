package util.list;
import java.util.*;
import java.util.function.*;

public class Tarefas {
	private static String tarefa;
	private static ArrayList<String> listaDeTarefas = new ArrayList<>();
	private static final int TAMANHO = listaDeTarefas.size();
	
	public static String addTarefa(String tarefaParaAdicionar) {
		listaDeTarefas.add(tarefaParaAdicionar);
		return "Tarefa salva!";
	}
	public static String removeTarefa(String tarefaParaRemover) {
		listaDeTarefas.remove(tarefaParaRemover);
		return "Tarefa removida!";
	}
	public static void ListarTarefas() {
		for(int i = 0; i < TAMANHO; i++) {
			System.out.println(listaDeTarefas.get(i));
		}
	}
	
	public static void setTarefa(String tarefa) {
		tarefa = tarefa;
	}
	public static String getTarefa() {
		return tarefa;
	}
}