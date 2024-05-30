package loop.cursoEmVideo;

public class Exercicio24 {

    public static void main(String[] args) {

        int contador = 0;

        do {
            int resultado = 3 * contador;
            System.out.print(resultado + " ");
            contador++;
        } while (contador <= 10);
        System.out.println("Acabou!");

    }
}
