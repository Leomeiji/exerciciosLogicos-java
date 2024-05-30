package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro numero: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Entre com o segundo numero: ");
        int segundoNumero = scan.nextInt();

        System.out.print("Entre com o terceiro numero: ");
        int terceiroNumero = scan.nextInt();

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("O numero " + primeiroNumero + " e o maior.");

            if (segundoNumero < terceiroNumero) {
                System.out.println("O numero " + segundoNumero + " e o menor.");
            }
            else {
                System.out.println("O numero " + terceiroNumero + " e o menor.");
            }
        }
        else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("O numero " + segundoNumero + " e o maior.");

            if (primeiroNumero < terceiroNumero) {
                System.out.println("O numero " + primeiroNumero + " e o menor.");
            }
            else {
                System.out.println("O numero " + terceiroNumero + " e o menor.");
            }
        }
        else {
            System.out.println("O numero " + terceiroNumero + " e o maior.");

            if (primeiroNumero < segundoNumero) {
                System.out.println("O numero " + primeiroNumero + " e o menor.");
            }
            else {
                System.out.println("O numero " + segundoNumero + " e o menor.");
            }
        }

        scan.close();
    }
}
