package main.java.rvt;

import java.util.Scanner;

public class Chapter44 {

    public static void main(String[] args) {
        ex4();
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
        Scanner scanner = new Scanner(System.in);
        String[] fem = { "Amy", "Buffy", "Cathy" };
        String[] mus = { "Elroy", "Fred", "Graham" };
        while (true) {
            System.out.println("Ievadiet vārdu: ");
            String vards = String.valueOf(scanner.nextLine());
            if (vards == "") {
                break;
            }
            for (int i = 0; i < fem.length; i++) {
                if (vards.startsWith(fem[i])) {
                    vards = "Ms. "+vards ;
                }
            }
            for (int j = 0; j < mus.length; j++) {
                if (vards.startsWith(mus[j])) {
                    vards = "Mr. "+vards;
                }
            }
            System.out.println(vards);

        }
        scanner.close();

    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet laiku: ");
        String vards = String.valueOf(scanner.nextLine());
        

        System.out.println(vards);
    }

    public static void ex5() {

    }

    public static void ex6() {

    }

    public static void ex7() {

    }
}
