package aula3;
import java.util.Scanner;


public class Desafio {
   public static void main(String[] args) {
	   
	   
	   Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o signo de "+ nome +": ");
		String signo = scanner.nextLine();
		
		System.out.println("Digite a idade do(a) "+ nome + ": ");
		int idade = scanner.nextInt();
		
		
		System.out.println("O(A) "+ nome + " tem "+ idade + " anos e seu signo é "+ signo);
		
		scanner.close();
   }
} 
