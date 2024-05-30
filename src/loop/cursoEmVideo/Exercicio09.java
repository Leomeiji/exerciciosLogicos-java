package loop.cursoEmVideo;

public class Exercicio09 {

    public static void main(String[] args) {

        int numero = 6;
        int soma = 0;

        while (numero <= 100) {
            soma = soma + numero;
            numero = numero + 2;
            System.out.println(soma);

        }
        System.out.println("A sequência é: " + soma);


    }
}
