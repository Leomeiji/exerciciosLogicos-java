package loop.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        double peso;
        double altura;
        int contador = 0;
        double somaAltura = 0;
        double peso90 = 0;
        double baixinho = 0;
        double alto = 0;

        while (contador < 7) {
            System.out.println("Entre com o peso: ");
            peso = scan.nextDouble();

            System.out.println("Entre com a altura: ");
            altura = scan.nextDouble();

            somaAltura = somaAltura + altura;

            if (peso > 90) {
                peso90++;
            }

            if (peso < 50 && altura < 1.60) {
                baixinho++;
            }

            if (peso > 100 && altura > 1.90) {
                alto++;
            }

            contador++;
        }

        double mediaAltura = somaAltura / 7.0;
        System.out.printf("A) Qual foi a media de altura do grupo: %.2f\n",mediaAltura);

        System.out.println("B) Quantas pessoas pesam mais de 90kg: " + peso90 + " pessoas!");

        System.out.println("C) Quantas pessoas que pesam menos de 50kg tem menos de 1.60m: " + baixinho + " pessoas!");

        System.out.println("C) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg: " + alto + " pessoas!");



        scan.close();
    }
}
