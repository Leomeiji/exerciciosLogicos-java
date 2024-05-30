package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char resposta = 's';
        int homensCadastrados = 0;
        int idadeDosHomens = 0;
        int idadeMaisJovem = 999;
        int maiorIdade = 0;

        while (resposta == 's') {
            System.out.print("Informe o sexo [M/F]: ");
            char sexo = scan.next().charAt(0);
            sexo = Character.toLowerCase(sexo);

            System.out.print("Informe a idade: ");
            int idade = scan.nextInt();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (sexo == 'm') {
                homensCadastrados++;
                idadeDosHomens = idadeDosHomens + idade;
            }
            else if (sexo == 'f') {
                if (idadeMaisJovem > idade) {
                    idadeMaisJovem = idade;
                }
            }
            else {
                    System.out.println("Digito inválido!");
                }

            System.out.print("Você deseja continuar S/N: ");
            resposta = scan.next().toLowerCase().charAt(0);
        }

        System.out.println("A) Qual é maior idade lida: " + maiorIdade);
        System.out.println("B) Quantos homens foram cadastrados: " + homensCadastrados);
        System.out.println("C) Qual é a idade da mulher mais jovem: " + idadeMaisJovem);
        int media = idadeDosHomens / homensCadastrados;
        System.out.println("D) Qual é a média de idade entre os homens: " + media);

        scan.close();
    }
}
