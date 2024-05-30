package condicional.cursoEmVideo;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira reta: ");
        int reta1 = scan.nextInt();

        System.out.print("Informe a segunda reta: ");
        int reta2 = scan.nextInt();

        System.out.print("Informe a terceira reta: ");
        int reta3 = scan.nextInt();


        if (reta1 <= reta2 && reta1 <= reta3) {
            System.out.println("As 3 retas formam um triangulo!");
        }
        else {
            System.out.println("As 3 retas nao formam um triangulo!");
        }

        scan.close();
    }
}
