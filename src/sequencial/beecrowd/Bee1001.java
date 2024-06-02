package sequencial.beecrowd;

import java.util.Scanner;

public class Bee1001 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = a + b;
        System.out.print("X = " + x);

        scan.close();
    }
}
