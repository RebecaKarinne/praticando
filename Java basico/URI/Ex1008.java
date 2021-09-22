package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numeroFunc = scanner.nextInt();
        double horasTrab = scanner.nextDouble();
        double valorHora = scanner.nextDouble();

        double salario = valorHora * horasTrab;

        System.out.println("NUMBER = " + numeroFunc);
        System.out.printf("SALARY = U$ %.2f", salario);

    }
}
