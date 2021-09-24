package URI;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idadeEmDias = scanner.nextInt();
        int anos, meses, dias;
        int restoDiv;

        anos = idadeEmDias / 365;
        restoDiv = idadeEmDias % 365;

        meses = restoDiv / 30;
        restoDiv = restoDiv % 30;

        dias = restoDiv / 1;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mese(s)");
        System.out.println(dias + " dia(s)");

    }
}
