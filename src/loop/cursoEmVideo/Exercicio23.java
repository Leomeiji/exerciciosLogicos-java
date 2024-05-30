package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char resposta = 's';

        String nomeMaisVelha = null;
        String nomeMulherMaisJovem = null;

        int umaPessoaCadastrada = 0;
        int idadeDoGrupo = 0;
        int idadeMaisJovem = 999;
        int idadeMaisVelha = 0;
        int homemMaisDe30 = 0;
        int  mulherMenos18 = 0;

        while (resposta == 's') {
            System.out.print("Informe o nome: ");
            String nome = scan.next();

            System.out.print("Informe o sexo [M/F]: ");
            char sexo = scan.next().charAt(0);
            sexo = Character.toLowerCase(sexo);

            System.out.print("Informe a idade: ");
            int idade = scan.nextInt();

            idadeDoGrupo = idadeDoGrupo + idade;
            umaPessoaCadastrada++;

            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
                nomeMaisVelha = nome;
            }

            if (sexo == 'm') {

                if (idade > 30) {
                    homemMaisDe30++;
                }
            }
            else if (sexo == 'f') {
                if (idadeMaisJovem > idade) {
                    idadeMaisJovem = idade;
                    nomeMulherMaisJovem = nome;
                }

                if (idade < 18) {
                    mulherMenos18++;
                }
            }
            else {
                System.out.println("Digito inválido!");
            }

            System.out.print("Você deseja continuar S/N: ");
            resposta = scan.next().toLowerCase().charAt(0);
        }

        System.out.println("A) O nome da pessoa mais velha: " + nomeMaisVelha);

        System.out.println("B) O nome da mulher mais jovem: " + nomeMulherMaisJovem);

        int media = idadeDoGrupo / umaPessoaCadastrada;
        System.out.println("C) A media de idade do grupo: " + media);

        System.out.println("D) Quantos homens tem mais de 30 anos: " + homemMaisDe30);

        System.out.println("E) Quantas mulheres tem menos de 18 anos: " + mulherMenos18);

        scan.close();
    }
}
