package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o turno que você estuda " +
                "M - matutino V - vespetino N - noturno: ");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("m")) {
            System.out.println("Bom Dia!");
        }
        else if (turno.equalsIgnoreCase("v")) {
            System.out.println("Boa Tarde!");
        }
        else if (turno.equalsIgnoreCase("n")) {
            System.out.println("Boa Noite!");
        }
        else {
            System.out.println("Valor Inválido!");
        }

        scan.close();
    }
}
