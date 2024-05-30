package sequencial.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int segundoNumero = scan.nextInt();

        int soma = primeiroNumero + segundoNumero;
        System.out.println("A soma entre os números é: " + soma);

        scan.close();
    }
}
