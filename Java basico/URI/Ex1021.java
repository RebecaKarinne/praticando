package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        float N = scanner.nextFloat();
        int nota100, nota50, nota20, nota10, nota5, nota2;
        int moeda1, moeda50, moeda25, moeda10, moeda05, moeda01;
        double restoDiv;

        nota100 = (int) (N / 100);
        restoDiv = N % 100;

        nota50 = (int) (restoDiv / 50);
        restoDiv = restoDiv % 50;

        nota20 = (int) (restoDiv / 20);
        restoDiv = restoDiv % 20;

        nota10 = (int) (restoDiv / 10);
        restoDiv = restoDiv % 10;

        nota5 = (int) (restoDiv / 5);
        restoDiv = restoDiv % 5;

        nota2 = (int) (restoDiv / 2);
        restoDiv = restoDiv % 2;

        moeda1 = (int) (restoDiv / 1);
        restoDiv = restoDiv % 1;

        moeda50 = (int) (restoDiv / 0.50);
        restoDiv = restoDiv % 0.50;

        moeda25 = (int) (restoDiv / 0.25);
        restoDiv = restoDiv % 0.25;

        moeda10 = (int) (restoDiv / 0.10);
        restoDiv = restoDiv % 0.10;

        moeda05 = (int) (restoDiv / 0.05);
        restoDiv = restoDiv % 0.05;

        moeda01 = (int) (restoDiv / 0.01);

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda05 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");

    }
}
