package sequencial.beecrowd;

import java.util.Scanner;

public class Bee1007 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int diferenca = (a * b - c * d);
        System.out.print("DIFERENCA = " + diferenca);

        scan.close();
    }
}
