package URI;

import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String p1 = scanner.next();
        String p2 = scanner.next();
        String p3 = scanner.next();

        if (p1.equals("Vertebrado")){
            if (p2.equals("ave")){
                if (p3.equals("carnívoro")){
                    System.out.println("Águia");
                } else if (p3.equals("onívoro")){
                    System.out.println("Pomba");
                }
            } else if (p2.equals("mamífero")){
                if (p3.equals("onívoro")){
                    System.out.println("Homem");
                } else if (p3.equals("herbírovo")){
                    System.out.println("Vaca");
                }
            }
        }

        if (p1.equals("Invertebradp")){
            if (p2.equals("inseto")){
                if (p3.equals("hematófago")){
                    System.out.println("Pulga");
                } else if (p3.equals("herbírovo")){
                    System.out.println("Lagarta");
                }
            } else if (p2.equals("anelídeo")){
                if (p3.equals("hematófago")){
                    System.out.println("Sanguessuga");
                } else if (p3.equals("onívoro")){
                    System.out.println("Minhoca");
                }
            }
        }

    }
}
