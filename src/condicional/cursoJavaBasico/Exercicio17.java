package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.println("O ano de " + ano + " é bissexto!");
        }
        else {
            System.out.println("O ano de " + ano + " nao e bissexto!");
        }

        scan.close();
    }
}
