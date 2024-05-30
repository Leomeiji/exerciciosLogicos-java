package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scan.nextInt();

        if (numero < 1000) {
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = ((numero % 100) % 10);

            System.out.println("Centena " + centena);
            System.out.println("Dezena " + dezena);
            System.out.println("Unidade " + unidade);
        }
        else {
            System.out.println("O numero é maior que 1000");
        }


        scan.close();
    }
}
