package Aula05;
import java.util.Scanner;

public class Desafio03 {
   public static void main (String[] args) {
  
	   Scanner scanner = new Scanner(System.in);
 
	   System.out.println("Digite seu sexo com m(masculino) e f(feminino): ");
	   char sexo = scanner.next().charAt(0);
   
	   System.out.println("Digite sua altura em cm: ");
	   int alt1 = scanner.nextInt();
	   
	   float alt2 = alt1/100;
	   
	   double peso_ideal;
	   
	   
	   if(sexo == 'm') {
		   
		 peso_ideal = (72.7 * alt2) - 58;  
		 System.out.println("Seu peso ideal é de: "+peso_ideal);  
		 
	   } else if (sexo == 'f'){
		   
		peso_ideal = (62.1 * alt2) - 44.7;
		System.out.println("Seu peso ideal é de: "+peso_ideal);
		   
	   }else {
		   
		peso_ideal = 0;
		System.out.println("Sexo não reconhecido");
	   }
	   
	   
   }
   }
   
   
