package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro valor: ");
        int primeiroValor = scan.nextInt();

        System.out.print("Entre com o valor final: ");
        int valorFinal = scan.nextInt();

        System.out.print("Entre com o incremento: ");
        int incremento = scan.nextInt();

        if (primeiroValor < valorFinal) {
            while (primeiroValor <= valorFinal) {
                System.out.print(primeiroValor + " ");
                primeiroValor += incremento;
            }
        } else {
            while (primeiroValor >= valorFinal) {
                System.out.print(primeiroValor + " ");
                primeiroValor -= incremento;
            }
        }
        System.out.print("Acabou!");

        scan.close();
    }
}