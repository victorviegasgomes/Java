package cadastro;
import java.util.Scanner;
public class Cadastro{
	public Scanner leia = new Scanner(System.in);
	private String nome, morada, sexo;
	private int idade;

	public void CadastroPessoa(String nome, String morada, String sexo, int idade){
		this.nome = nome;
		this.morada = morada;
		this.sexo = sexo;
		this.idade = idade;
	}
	public void cadastrandoPessoa(){
		System.out.print("nome: ");
		nome = leia.next();
		System.out.print("idade: ");
		idade = leia.nextInt();
		System.out.print("morada: ");
		morada = leia.next();
		System.out.print("sexo: ");
		sexo = leia.next();
	}
}
