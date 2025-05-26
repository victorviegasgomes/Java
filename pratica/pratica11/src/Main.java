import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Date data = new Date();
		
		int mes = data.getMonth();
		System.out.println(mes);
		
		long tempo = data.getTime();
		System.out.println(tempo);
		
		int timeOfSet = data.getTimezoneOffset();
		System.out.println(timeOfSet);
		
		int ano = data.getYear();
		System.out.println(ano);
	}
}
