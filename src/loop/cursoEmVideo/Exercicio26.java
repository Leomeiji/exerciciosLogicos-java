package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int menorValor = 999;
        int par = 0;
        char resposta;
        int numeroDigitados = 0;

        do {
            System.out.print("Informe um numero inteiro: ");
            numero = scan.nextInt();

            soma = soma + numero;
            numeroDigitados++;

            if (numero < menorValor) {
                menorValor = numero;
            }

            if (numero % 2 == 0) {
                par++;
            }

            System.out.print("Você deseja continuar s/n: ");
            resposta = scan.next().charAt(0);
        } while (resposta != 'n');

        System.out.println("A) O somatorio entre todos os valores: " + soma);
        System.out.println("B) Qual foi o menor valor digitado: " + menorValor);

        int media = soma / numeroDigitados;
        System.out.println("C) A média entre todos os valores: " + media);
        System.out.println("D) Quantos valores são pares: " + par);

        scan.close();

    }
}
