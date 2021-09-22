package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double salarioTotal = (totalVendas * 0.15) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f", salarioTotal);

    }
}
