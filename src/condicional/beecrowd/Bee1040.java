package condicional.beecrowd;

import java.util.Scanner;

public class Bee1040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float n1 = scan.nextFloat();
        float n2 = scan.nextFloat();
        float n3 = scan.nextFloat();
        float n4 = scan.nextFloat();

        float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10.0f;

        if(media >= 7.0){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }
        else if(media >= 5.0 && media <= 6.9){
            float notaDoExame = scan.nextFloat();
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n",notaDoExame);
            float novaMedia = (notaDoExame + media) / 2.0f;

            if(novaMedia >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",novaMedia);
            } else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n",novaMedia);
            }
        }

        scan.close();
    }
}
