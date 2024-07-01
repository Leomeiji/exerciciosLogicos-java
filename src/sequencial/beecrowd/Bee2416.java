package sequencial.beecrowd;

import java.util.Scanner;

public class Bee2416 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int c = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(c % n);

        scan.close();
    }
}
