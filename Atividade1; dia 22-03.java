package Atividades;
import java.util.Scanner;

public class Atividade1Aula08 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("O numero é positivo.");
        } else if (numero < 0) {
            System.out.println("O numero é negativo.");
        } else {
            System.out.println("O numero é zero.");
        }
        scanner.close();
}
}
