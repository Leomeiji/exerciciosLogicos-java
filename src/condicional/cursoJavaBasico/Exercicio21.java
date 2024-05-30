package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Telefonou para a vitima? S/N: ");
        String telefonou = scan.next();

        System.out.print("Esteve no local do crime? S/N: ");
        String local = scan.next();

        System.out.print("Mora perto da vitima? S/N: ");
        String mora = scan.next();

        System.out.print("Devida para a vitima? S/N: ");
        String devia = scan.next();

        System.out.print("Já trabalhou com a vitima? S/N: ");
        String trabalhou = scan.next();

        int cont = 0;

        if (telefonou.equalsIgnoreCase("S")){
            cont++;
        }

        if (local.equalsIgnoreCase("S")) {
            cont++;
        }

        if (mora.equalsIgnoreCase("S")) {
            cont++;
        }

        if (devia.equalsIgnoreCase("S")) {
            cont++;
        }

        if(trabalhou.equalsIgnoreCase("S")) {
            cont++;
        }

        System.out.println("Total de respostas S: " + cont);

        if (cont == 2) {
            System.out.println("Suspeita!");
        }
        else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice!");
        }
        else if (cont == 5) {
            System.out.println("Assasino!");
        }
        else {
            System.out.println("Inocente");
        }

        scan.close();
    }
}
