package Aula05;
import java.util.Scanner;

public class Desafio02 {
   public static void main (String[] args) {
  
	   Scanner scanner = new Scanner(System.in);
 
	   System.out.println("Digite sua idade: ");
	   int idade = scanner.nextInt();
	   
       System.out.println("Digite seu batimento cardíaco: ");
	   int batCard = scanner.nextInt();
	   
	   
	   if (idade > 60 && batCard > 150) {
		   System.out.println("URGÊNTE");
	   
	   }else if(idade > 60 && batCard <= 150 ) {
		   
		   System.out.println("Urgência moderada");
	   
	   }else if(idade <= 60 && batCard > 150 ) {
		   
		   System.out.println("Urgência moderada");
		   
	   }else if (idade <= 60 && batCard <= 150 ) {
		   
		   System.out.println("Sem urgência ");
		   
	   }else {
		   
		   System.out.println("Ta tranquilo");
	   }
	   
	   
	   scanner.close();
	   
	   }
	   
   }
   
