package main.java.rvt;

import java.util.Scanner;

public class rbr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Ievadi skaitli: ");
        // int num = Integer.valueOf(scanner.nextLine());

        int numsum = 0;
        int summa = 0;
        int odd = 0;
        int even = 0;
        double average = 0;

        while (true) {
            System.out.println("Give a number (0 to stop): ");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num >= 0) {
                summa = summa + num;
                numsum = numsum + 1;
                if (num % 2 == 0){
                    even = even + 1;
                }else{
                    odd = odd + 1;
                }
            }

        }

        average = summa / numsum;

        System.out.println("Thx! Bye!" );
        System.out.println("Sum: " + summa);
        System.out.println("Numbers: " + numsum);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Od: " + odd);


    }
}
