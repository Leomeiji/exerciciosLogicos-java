package loop.cursoEmVideo;

public class Exercicio06 {

    public static void main(String[] args) {

        int contagem = 30;

        while (contagem >= 0) {
            if (contagem % 4 == 0) {
                System.out.print("[" + contagem + "] ");
                contagem--;
            }
            else {
                System.out.print(contagem + " ");
                contagem--;
            }
        }
    }
}
