package URI;

import java.util.Scanner;

public class Ex1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Dia:");
        int dia1 = scanner.nextInt();
        int hora1 = scanner.nextInt();
        String doisPontos = scanner.next();
        int minuto1 = scanner.nextInt();
        doisPontos = scanner.next();
        int segundos1 = scanner.nextInt();

        System.out.print("Dia:");
        int dia2 = scanner.nextInt();
        int hora2 = scanner.nextInt();
        doisPontos = scanner.next();
        int minuto2 = scanner.nextInt();
        doisPontos = scanner.next();
        int segundos2 = scanner.nextInt();

        int duracaoDias = dia2 - dia1;
        int duracaoHoras = hora2 - hora1;
        int duracaoMinutos = minuto2 - minuto1;
        int duracaoSegundos = segundos2 - segundos2;

        if (duracaoDias < 24){
            duracaoDias = duracaoDias - 1;
        }

        if (hora2 < hora1){
            duracaoHoras = duracaoHoras + 24;
        }

        if (minuto2 < minuto1){
            duracaoMinutos = duracaoMinutos + 60;
        }

        if (segundos2 < segundos1){
            duracaoSegundos = duracaoSegundos + 60;
        }

        System.out.println(duracaoDias + " dia(s)");
        System.out.println(duracaoHoras + " hora(s)");
        System.out.println(duracaoMinutos + " minuto(s)");
        System.out.println(duracaoSegundos + " segundo(s)");

    }
}
