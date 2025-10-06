package main.java.rvt;

import java.util.Scanner;

public class dbt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi skaitli: ");
        int min = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi skaitli: ");
        int max = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(min, max);
    }

    public static void divisibleByThreeInRange(int min, int max) {

        while (min % 3 != 0) {
            min++;
        }

        while (max % 3 != 0) {
            max--;
        }

        int i = 0;

        System.out.println(min);
        while (true) {
            min = min + 3;
            System.out.println(min);
            if (min == max) {
                break;
            }
        }

    }

}
