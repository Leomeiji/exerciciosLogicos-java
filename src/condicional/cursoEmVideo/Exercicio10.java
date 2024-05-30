package condicional.cursoEmVideo;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.print("Informe o segundo numero: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro valor e o maior");
        }
        else if (num2 > num1) {
            System.out.println("O segundo valor e o maior");
        }
        else {
            System.out.println("Não existe valor maior, os dois sao iguais");
        }


        scan.close();
    }
}
