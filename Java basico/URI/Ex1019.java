package URI;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // O valor de entrada é em segundos
        int tempo = scanner.nextInt();

        int hora, minuto, segundo;
        int restoDiv;

        // 3600 segundos = 1 hora
        hora = tempo / 3600;
        restoDiv = tempo % 3600;

        // 60 segundos = 1 minuto
        minuto = restoDiv / 60;
        restoDiv = restoDiv % 60;

        segundo = restoDiv / 1;

        System.out.println(hora + ":" + minuto + ":" + segundo);

    }
}
