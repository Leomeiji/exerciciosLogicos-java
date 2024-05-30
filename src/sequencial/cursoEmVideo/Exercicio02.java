package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = scan.nextLine();

        String boasVindas = String.format("Olá %s, é um prazer te conhecer!",nome);
        System.out.println(boasVindas);

        scan.close();
    }
}
