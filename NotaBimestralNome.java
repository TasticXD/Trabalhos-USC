package Exercicios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nomes = new String[3];

      
        int[] primeirobimestreNotas = new int[3];

        
        int[] segundobimestreNotas = new int[3];

   
        Scanner scanner = new Scanner(System.in);

      
        for (int i = 0; i < 3; i++) {
            System.out.println("Coloque o nome do estudante " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();

            System.out.println("Coloque a nota do " + nomes[i] + " no primeiro bimestre:");
            primeirobimestreNotas[i] = scanner.nextInt();

            System.out.println("Coloque a nota do " + nomes[i] + " no segundo bimestre:");
            segundobimestreNotas[i] = scanner.nextInt();

           
            scanner.nextLine();
        }

       
        System.out.println("Media Bimestral:");
        for (int i = 0; i < 3; i++) {
            double averageGrade = (primeirobimestreNotas[i] + segundobimestreNotas[i]) / 2.0;
            System.out.println(nomes[i] + ": " + averageGrade);
        }

        
        scanner.close();
    }
}
