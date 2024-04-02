package Exercicios;

public class Exercicio2Aula9{

    public static void main(String[] arg){
    String nomeCompleto = "Seu nome";
    String primeiroNome = "";
    int i = 0;
    boolean fim = false;
    while ((i < nomeCompleto.length()) && !fim) {
        if (nomeCompleto.charAt(i) != ' ') {
            primeiroNome += nomeCompleto.charAt(i);
            i++;
        } else {
            fim = true;
        }
    }
    System.out.println(primeiroNome.toUpperCase());
}
