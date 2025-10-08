package main.java.rvt;
import java.util.Random;

import java.util.Scanner;

public class spele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int nxt = r.nextInt(10)+1;
        System.out.println("Generated Random number is : " + nxt);
        System.out.println("Es domāu par skaitli no 1 līdz 10");
        System.out.println("Tev tas jāuzmin 3 mēģinājumos.");
        System.out.println("Ievadi minējumu: ");

        int trys = 3;

        while (true) {
            int sk = Integer.valueOf(scanner.nextLine());
            if (sk == nxt) {
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarējis spēli.");
                break;
            }

            if (sk != nxt) {
                System.out.println("nepareizi");
                trys--;
            }
            if (trys == 0) {
                System.out.println("Tu esi zaudējis spēli.");
                break;
            }

        }
       
        


    }
}
