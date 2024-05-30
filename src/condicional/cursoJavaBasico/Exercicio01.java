package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.print("Informe o segundo numero: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O MAIOR = " + num1);
        }
        else {
            System.out.println("O MAIOR = " + num2);

        }

        scan.close();
    }
}
