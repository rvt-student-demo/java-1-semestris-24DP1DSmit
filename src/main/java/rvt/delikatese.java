package main.java.rvt;

import java.util.Scanner;

public class delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     System.out.println("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.println("Ievadi cenu: ");
        double cena = Integer.parseInt(scanner.nextLine());

        System.out.println("Ekspress piegāde (0 == nē, 1 == jā): ");
        double pr = Integer.parseInt(scanner.nextLine());

        double pieg = 0;

        if (cena < 10) {
            if (pr == 1) {
                pieg = 5;
            } else {
                pieg = 2;
            }
        } else {
            if (pr == 1) {
                pieg = 3;
            } else {
                pieg = 0;
            }
        }

        double summa = pieg + cena;


        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Rēķins: ");
        System.out.println(" " + prece + " " + cena);
        System.out.println(" piegāde" + "    " + pieg);
        System.out.println(" kopā      " + summa);
    }
}
