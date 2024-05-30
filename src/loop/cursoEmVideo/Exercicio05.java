package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um numero inteiro positivo: ");
        int numero = scan.nextInt();
        int contagem = 0;

        while (contagem <= numero) {
            System.out.print(contagem + " ");
            contagem++;
        }

        System.out.print("Acabou!");

        scan.close();
    }
}
