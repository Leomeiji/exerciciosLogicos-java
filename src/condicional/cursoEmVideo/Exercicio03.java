package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = scan.nextLine();

        System.out.print("Informe a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();

        System.out.print("Informe a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2.0;
        System.out.printf("A média do %s é %.1f\n",nome,media);

        if (media >= 7.0) {
            System.out.printf("O aluno %s teve um bom aproveitamento!\n",nome);
        }
        else {
            System.out.printf("O aluno %s nao teve um bom aproveitamento!\n",nome);
        }

        scan.close();
    }
}
