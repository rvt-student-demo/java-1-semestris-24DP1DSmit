package main.java.rvt;

import java.util.Scanner;

public class Chapter44 {

    public static void main(String[] args) {

        ex2();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet vārdu: ");
        String name = String.valueOf(scanner.nextLine());
        scanner.close();
        name = name.trim();
        Integer prob = name.indexOf(" ", 1);
        String vards = name.substring(0, prob);
        String uzvards = name.substring(prob);
        uzvards = uzvards.toUpperCase();
        System.out.println(vards.concat(uzvards));
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet vārdu: ");
        String word = String.valueOf(scanner.nextLine());
        scanner.close();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

    public static void ex3() {

    }

    public static void ex4() {

    }

    public static void ex5() {

    }

    public static void ex6() {

    }

    public static void ex7() {

    }
}
