package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double metros = scan.nextDouble();
        System.out.printf("A distância de %.1f corresponde a: ",metros);

        double km = metros / 1000;
        System.out.println(km + "Km");

        double hm = metros / 100;
        System.out.println(hm + "Hm");

        double dam = metros / 10;
        System.out.println(dam + "Dam");

        double dm = metros * 10;
        System.out.println(dm + "dm");

        double cm = metros * 100;
        System.out.println(cm + "cm");

        double mm = metros * 1000;
        System.out.println(mm + "mm");

        scan.close();
    }
}
