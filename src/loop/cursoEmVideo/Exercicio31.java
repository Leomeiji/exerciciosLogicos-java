package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mulheresCadastradas = 0;
        int homemMaisDe100 = 0;
        double somaPesoMulheres = 0;
        double maiorPesoHomem = 0;
        double peso;

        for(int i = 0; i <= 8; i++) {
            System.out.print("Informe o sexo m/f: ");
            char sexo = scan.next().charAt(0);
            sexo = Character.toLowerCase(sexo);

            System.out.print("Informe o peso: ");
            peso = scan.nextDouble();

            if (sexo == 'f') {
                mulheresCadastradas++;

                somaPesoMulheres = somaPesoMulheres + peso;
            }
            else if (sexo == 'm') {

                if (peso > 100) {
                    homemMaisDe100++;
                }

                if (peso > maiorPesoHomem) {
                    maiorPesoHomem = peso;
                }
            }
            else {
                System.out.print("Valor inválido!");
            }

        }

        System.out.println("A) Quantas mulheres foram cadastradas: " + mulheresCadastradas);
        System.out.println("B) Quantos homens pesam mais de 100kg: " + homemMaisDe100);

        double media = somaPesoMulheres / mulheresCadastradas;
        System.out.println("C) A média de peso entre as mulheres: " + media);
        System.out.println("D) O maior peso entre os homens: " + maiorPesoHomem);

        scan.close();
    }
}
