import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D, dif;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        dif = (A * B - C * D);

        System.out.println("DIFERENCA = " + dif);

    }
}
