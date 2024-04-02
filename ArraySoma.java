package Exercicios;
import java.util.Arrays;

public class ArraySoma {
    public static void main(String[] args) {
      
        int[] num = {1, 2, 3, 4, 5};

       
        int soma = Arrays.stream(num).sum();

        
        System.out.println("A soma dos elementos é: " + soma);
    }
}
