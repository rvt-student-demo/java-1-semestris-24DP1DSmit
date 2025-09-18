package rvt;

import java.util.Scanner;

public class atzim {

    public static void main(String[] args) {
        System.out.println("Ieraksti atzīmi: ");
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        int sk = Integer.valueOf(scanner.nextLine());

        if (sk > 100) {
            System.out.println("Incredible!");
        } else if (sk > 89) {
            System.out.println("5");
        } else if (sk > 79) {
            System.out.println("4");
        } else if (sk > 69) {
            System.out.println("3");
        } else if (sk > 59) {
            System.out.println("2");
        } else if (sk > 49) {
            System.out.println("1");
        } else if (sk > -1) {
            System.out.println("failed");
        } else if (sk < 0) {
            System.out.println("imposible!");
        } 
    }

}