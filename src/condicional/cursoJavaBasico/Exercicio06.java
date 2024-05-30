package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro numero: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Entre com o segundo numero: ");
        int segundoNumero = scan.nextInt();

        System.out.print("Entre com o terceiro numero: ");
        int terceiroNumero = scan.nextInt();

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("Primeiro numero é maior: " + primeiroNumero);
        }
        else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("Segundo numero é maior: " + segundoNumero);
        }
        else {
            System.out.println("Terceiro numero é maior: " + terceiroNumero);
        }

        scan.close();
    }
}
