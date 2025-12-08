package main.java.rvt;

import java.io.File;
import java.util.Scanner;

public class Chapter44 {

    public static void main(String[] args) {
        ex6();
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
                    vards = "Ms. " + vards;
                }
            }
            for (int j = 0; j < mus.length; j++) {
                if (vards.startsWith(mus[j])) {
                    vards = "Mr. " + vards;
                }
            }
            System.out.println(vards);

        }
        scanner.close();

    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet laiku: ");
        String laiks = String.valueOf(scanner.nextLine());
        scanner.close();
        if (laiks.length() == 2) {
            System.out.println("0:" + laiks);
        } else {
            Integer more = laiks.length() - 2;
            String minutes = laiks.substring(0, more);
            String sekundes = laiks.substring(more);
            System.out.println(minutes + ":" + sekundes);
        }
    }

    public static void ex5() {
        File fails = new File("Hello.txt");
        Scanner scanner = new Scanner(fails);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        String[] nums = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        System.out.println("Ievadiet paroli: ");
        while (true) {
            Boolean con1 = false;
            Boolean con2 = false;
            Boolean con3 = false;
            Boolean con4 = false;
            String parole = String.valueOf(scanner.nextLine());
            Integer len = parole.length();
            String simb = "";
            String simb2 = "";
            if (len >= 7) {
                con1 = true;
                System.out.println("Ir garums");
            }

            for (int j = 0; j < len; j++) {
                simb = parole.substring(j, j + 1);
                for (int i = 0; i < nums.length; i++) {
                    if (simb.equals(nums[i])) {
                        System.out.println("Ir cipars");
                        con2 = true;
                        j = len;
                    }
                }
            }

            for (int i = 0; i < len; i++) {
                simb = parole.substring(i, 1 + i);
                simb2 = simb.toUpperCase();
                if (simb.equals(simb2)) {
                    System.out.println("Ir liels burts");
                    con3 = true;
                    i = len;
                }
            }

            for (int i = 0; i < len; i++) {
                simb = parole.substring(i, 1 + i);
                simb2 = simb.toLowerCase();
                if (simb.equals(simb2)) {
                    System.out.println("Ir mazs burts");
                    con4 = true;
                    i = len;
                }
            }
            if (con1 && con2 && con3 && con4) {
                System.out.println("Parole derīga");
                break;

            } else {
                System.out.println("Parole nederīga, mēģiniet vēlreiz");
            }
        }
        scanner.close();
    }

    public static void ex7() {

    }
}
