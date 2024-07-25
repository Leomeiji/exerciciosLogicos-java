package loop.alura;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            int tabuada = numero * i;
            System.out.println(tabuada);
        }

        scan.close();
    }
}
