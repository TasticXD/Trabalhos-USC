package Exercicios;
import java.util.Scanner;

public class VerifiarCidadeCuritiba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque o nome da cidade: ");
        String nomeCidade = scanner.nextLine().toLowerCase();
        if (nomeCidade.equals("curitiba")) {
            System.out.println("A cidade é Curitiba!");
        } else {
            System.out.println("A cidade não é Curitiba!.");
        }
        scanner.close();
    }
}
