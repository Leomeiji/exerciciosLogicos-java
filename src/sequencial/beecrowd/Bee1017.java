package sequencial.beecrowd;

import java.util.Scanner;

public class Bee1017 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tempoGasto = scan.nextInt();
        int velocidadeMedia = scan.nextInt();

        double combustivelGasto = (tempoGasto  * velocidadeMedia) / 12.0;
        System.out.printf("%.3f\n",combustivelGasto);

        scan.close();
    }
}
