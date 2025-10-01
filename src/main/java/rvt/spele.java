package main.java.rvt;
import java.util.Random;

import java.util.Scanner;

public class spele {
    public static void main(String[] args) {
        Random r = new Random();
        int nxt = r.nextInt(10);
        System.out.println("Generated Random number is : " + nxt);

        


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi skaitli: ");
        int sk = Integer.valueOf(scanner.nextLine());


    }
}
