package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double N1 = scanner.nextDouble();
        double N2 = scanner.nextDouble();
        double N3 = scanner.nextDouble();
        double N4 = scanner.nextDouble();

        double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / (2 + 3 + 4 + 1);

        System.out.printf("Média: %.1f %n", media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaExame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f %n", notaExame);
            media = (notaExame + media) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Média final: %.1f", media);
            } else if (media < 5){
                System.out.println("Aluno reprovado.");
                System.out.printf("Média final: %.1f", media);
            }
        }


    }
}
