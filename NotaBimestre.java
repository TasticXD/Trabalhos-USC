package Exercicios;
import java.util.Scanner;

public class Nota2BimestresEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Insira a nota do primeiro bimestre: ");
        double notaBimestre1 = scanner.nextDouble();

        
        System.out.print("Insira a nota do segundo bimestre: ");
        double notaBimestre2 = scanner.nextDouble();

      
        double mediaFinal = (notaBimestre1 + notaBimestre2) / 2;

      
        System.out.println("Nota do primeiro bimestre: " + notaBimestre1);
        System.out.println("Nota do segundo bimestre: " + notaBimestre2);

        
        System.out.printf("Média final: %.2f\n", mediaFinal);
        
        scanner.close();
    }
}
