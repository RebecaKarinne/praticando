package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double renda = scanner.nextDouble();
        double impostoRenda;

        if (renda >= 0.00 && renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda > 2000.00 && renda <= 3000.00) {
            impostoRenda = (renda - 2000.00) * 0.08;
            System.out.printf("R$ %.2f", impostoRenda);
        } else if (renda > 3000.00 && renda <= 4500.00){
            impostoRenda = 1000 * 0.08;
            impostoRenda = impostoRenda + (renda - 3000.00) * 0.18;
            System.out.printf("R$ %.2f", impostoRenda);
        } else if (renda > 4500.00){
            impostoRenda = 1000 * 0.08;
            impostoRenda = impostoRenda + 1500 * 0.18;
            impostoRenda = impostoRenda + (renda - 4500.00) * 0.28;
            System.out.printf("R$ %.2f", impostoRenda);
        }

    }
}
