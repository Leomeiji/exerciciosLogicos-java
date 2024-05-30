package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numero = scan.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.print(i + ", ");
        }

        System.out.print("FIM!");

        scan.close();
    }
}
