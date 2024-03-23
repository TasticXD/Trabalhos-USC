package Desafios;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operacao;

        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextDouble();

        System.out.print("Escolha uma operação (+, -, *, /): ");
        scanner.nextLine();
        operacao = scanner.nextLine().charAt(0);

        switch (operacao) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
                } else {
                    System.out.println("Não é permitido divisões por zero.");
                }
                break;
            default:
                System.out.println("Operação invalida. Favor escolha uma das operações: +, -, *, /.");
        }

        scanner.close();
    }
}
