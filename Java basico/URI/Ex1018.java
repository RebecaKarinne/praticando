package URI;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double restoDiv;
        int nt100, nt50, nt20, nt10, nt5, nt2, nt1;

        nt100 = N / 100;
        restoDiv = N % 100;

        nt50 = (int) (restoDiv / 50);
        restoDiv = restoDiv % 50;

        nt20 = (int) (restoDiv / 20);
        restoDiv = restoDiv % 20;

        nt10 = (int) (restoDiv / 10);
        restoDiv = restoDiv % 10;

        nt5 = (int) (restoDiv / 5);
        restoDiv = restoDiv % 5;

        nt2 = (int) (restoDiv / 2);
        restoDiv = restoDiv % 2;

        nt1 = (int) (restoDiv / 1);

        System.out.println(N);
        System.out.println(nt100 + " nota(s) de R$ 100,00");
        System.out.println(nt50 + " nota(s) de R$ 50,00");
        System.out.println(nt20 + " nota(s) de R$ 20,00");
        System.out.println(nt10 + " nota(s) de R$ 10,00");
        System.out.println(nt5 + " nota(s) de R$ 5,00");
        System.out.println(nt2 + " nota(s) de R$ 2,00");
        System.out.println(nt1 + " nota(s) de R$ 1,00");

    }
}
