package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1 = scanner.nextInt();
        int qtdPeca1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int qtdPeca2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();

        double total = (qtdPeca1*valorPeca1) + (qtdPeca2*valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

    }
}
