package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        } else if (x < 0 && y > 0){
            System.out.println("Q2");
        } else if (x < 0 && y < 0){
            System.out.println("Q3");
        } else if (x > 0 && y < 0){
            System.out.println("Q4");
        } else if (x == 0 && y == 0){
            System.out.println("Origem.");
        } else if (x != 0 && y == 0){
            System.out.println("Eixo X");
        } else if (x == 0 && y != 0){
            System.out.println("Eixo Y");
        }

    }
}
