package sequencial.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int segundoNumero = scan.nextInt();

        System.out.print("Digite um terceiro numero que é real: ");
        double terceiroNumero = scan.nextDouble();

        int primeiraConta = primeiroNumero * 2 * (segundoNumero / 2);
        System.out.println("A = " + primeiraConta);

        double segundaConta = primeiroNumero * 3 + terceiroNumero;
        System.out.println("B = " + segundaConta);

        double terceiraConta = Math.pow(terceiroNumero, 3);
        System.out.println("C = " + terceiraConta);

        scan.close();
    }
}
