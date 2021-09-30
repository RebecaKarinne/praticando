package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double salario = scanner.nextDouble();
        double reajuste = 0;
        String percentual = null;
        
        if (salario > 0 && salario <= 400.00){
            percentual = "15%";
            reajuste = salario * 0.15;
            salario = salario + reajuste;
        } else if (salario > 400.00 && salario <= 800.00){
            percentual = "12%";
            reajuste = salario * 0.12;
            salario += reajuste;
        } else if (salario > 800.00 && salario <= 1200.00){
            percentual = "10%";
            reajuste = salario * 0.10;
            salario += reajuste;
        } else if (salario > 1200.00 && salario <= 2000.00){
            percentual = "7%";
            reajuste = salario * 0.07;
            salario += reajuste;
        } else if (salario > 2000.00){
            percentual = "4%";
            reajuste = salario * 0.04;
            salario += reajuste;
        }

        System.out.printf("Novo salário: %.2f %nReajuste ganho: %.2f %nEm percentual: %s", salario, reajuste, percentual);
        
    }
}
