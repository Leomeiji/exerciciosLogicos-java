package loop.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int contador = 1;
        double preco = 0;
        double maior = 0;
        double menor = 10000;

        while (contador <= 8) {
            System.out.println("Entre com o preco do produto: ");
            preco = scan.nextDouble();
            contador++;

            if (preco > maior) {
                maior = preco;
            }

            if (preco < menor) {
                menor = preco;
            }
        }

        System.out.printf("O maior preco: R$ %.2f\n",maior);
        System.out.printf("O menor preco: R$ %.2f\n",menor);

        scan.close();
    }
}
