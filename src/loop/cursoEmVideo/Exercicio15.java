package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        int media = 0;
        int soma = 0;
        int x = 0;
        int maior = 0;
        int menor = 0;
        int maiorIdade = 0;

        while (x < 10) {
            System.out.println("Informe a idade: ");
            idade = scan.nextInt();
            soma = soma + idade;

            x++;

            if (idade > 18) {
                maior++;
            }

            if (idade < 5) {
                menor++;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

        }
        media = soma / 10;
        System.out.println("A) Qual e a media de idade do grupo: " + media);
        System.out.println("B) Quantas pessoas tem mais de 18 anos: " + maior);
        System.out.println("C) Quantas pessoas tem menos de 5 anos: " + menor);
        System.out.println("D) Qual foi a maior idade lida: " + maiorIdade);

        scan.close();
    }
}
