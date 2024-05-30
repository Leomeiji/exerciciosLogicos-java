package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        String sexo;
        int contador = 1;
        int homem = 0;
        int mulher = 0;
        int soma = 0;
        int idadeDosHomens = 0;
        int mulheresMaiores = 0;

        while (contador <= 5) {
            System.out.println("Informe o sexo M- masculino e F- femenino: ");
            sexo = scan.next();

            System.out.println("Informe a idade da pessoa: ");
            idade = scan.nextInt();
            soma = soma + idade;

            contador++;

            if (sexo.equalsIgnoreCase("m")) {
                idadeDosHomens = idadeDosHomens + idade;
                homem++;
            }
            else {
                mulher++;

                if (idade > 20) {
                    mulheresMaiores++;
                }
            }

        }

        System.out.println("A) Quantos homens foram cadastrados: " + homem);
        System.out.println("B) Quantas mulheres foram cadastradas: " + mulher);

        int mediaDoGrupo = soma / 5;
        System.out.println("C) A media da idade do grupo: " + mediaDoGrupo);

        int mediaDosHomens = idadeDosHomens / homem;
        System.out.println("D) A media das idades dos homens: " + mediaDosHomens);

        System.out.println("E) Quantas mulheres tem mais de 20 anos: " + mulheresMaiores);


        scan.close();
    }
}
