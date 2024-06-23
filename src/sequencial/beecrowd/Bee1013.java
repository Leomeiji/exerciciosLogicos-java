package sequencial.beecrowd;

import java.util.Scanner;

public class Bee1013 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int maior = (a + b + Math.abs(a - b)) / 2;
        int maior2 = (maior + c + Math.abs(maior - c)) / 2;
        System.out.println(maior2 + " eh o maior");

        scan.close();
    }
}
