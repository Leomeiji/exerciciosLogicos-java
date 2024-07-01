package sequencial.beecrowd;

import java.util.Scanner;

public class Bee1019 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int segundos = scan.nextInt();

        int horas = segundos / 3600;
        segundos = segundos % 3600;

        int minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        scan.close();
    }
}
