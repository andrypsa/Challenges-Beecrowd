import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D;
        int DIFERENCA;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        DIFERENCA = ((A * B) - (C * D));
        System.out.println("DIFERENCA = " + DIFERENCA);

        teclado.close();
    }

}
