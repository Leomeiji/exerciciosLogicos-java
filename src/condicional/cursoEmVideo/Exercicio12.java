package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a largura do terreno: ");
        int largura = scan.nextInt();

        System.out.print("Informe o comprimento do terreno: ");
        int comprimento = scan.nextInt();

        int area = largura * comprimento;
        System.out.println("AREA = " + area);

        if (area < 100) {
            System.out.println("TERRENO POPULAR");
        }
        else if (area < 500) {
            System.out.println("TERRENO MASTER");
        }
        else {
            System.out.println("TERRENO VIP");
        }

        scan.close();
    }
}
