import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        numero = scanner.nextInt();
        horas = scanner.nextInt();
        valorHora = scanner.nextDouble();

        salario = horas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        scanner.close();
}
}