package loop.cursoEmVideo;

import java.util.Random;

public class Exercicio13 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        int x = 0;
        int numero = 0;
        int numeroMaior = 0;
        int divisivel = 0;

        System.out.print("A) Numero Sorteados: ");

        while (x < 20) {
            numero = aleatorio.nextInt(11);
            System.out.print(numero + " ");
            x++;

            if (numero > 5) {
                numeroMaior++;
            }

            if (numero % 3 == 0) {
                divisivel++;
            }
        }

        System.out.println("\nB) Quantos numeros estao acima de 5: " + numeroMaior);
        System.out.println("C) Quantos numeros sao divisiveis por 3: " + divisivel);

    }
}
