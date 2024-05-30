package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro numero: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Entre com o segundo numero: ");
        int segundoNumero = scan.nextInt();

        System.out.print("Entre com o terceiro numero: ");
        int terceiroNumero = scan.nextInt();

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println(primeiroNumero);

            if (segundoNumero > terceiroNumero) {
                System.out.println(segundoNumero);
                System.out.println(terceiroNumero);
            }
            else {
                System.out.println(terceiroNumero);
                System.out.println(segundoNumero);
            }
        }
        else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println(segundoNumero);

            if (primeiroNumero > terceiroNumero) {
                System.out.println(primeiroNumero);
                System.out.println(terceiroNumero);
            }
            else {
                System.out.println(terceiroNumero);
                System.out.println(primeiroNumero);
            }
        }
        else {
            System.out.println(terceiroNumero);

            if (primeiroNumero > segundoNumero) {
                System.out.println(primeiroNumero);
                System.out.println(segundoNumero);
            }
            else {
                System.out.println(segundoNumero);
                System.out.println(primeiroNumero);
            }
        }

        scan.close();
    }
}
