package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of the employee: ");
        String name = scan.nextLine();

        System.out.print("Enter the employee's salary: ");
        double salary = scan.nextDouble();

        System.out.print("State how many years he has worked at the company: ");
        int years = scan.nextInt();

        double readjustment1 = salary * 1.03;
        double readjustment2 = salary * 1.125;
        double readjustment3 = salary * 1.20;

        if (years < 3) {
            System.out.printf("The adjustment to %s salary is R$%.2f\n",name,readjustment1);
        }
        else if (years < 10) {
            System.out.printf("The adjustment to %s salary is R$%.2f\n",name,readjustment2);
        }
        else {
            System.out.printf("The adjustment to %s salary is R$%.2f\n",name,readjustment3);

        }


        scan.close();
    }
}
