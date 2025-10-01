package main.java.rvt;

import java.util.*;

public class chapter19 {
    public static void main(String[] args) {
        ex5();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start: ");
        int start = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter end: ");
        int end = Integer.valueOf(scanner.nextLine());

        System.out.println("");

        Integer sk = start;
        System.out.println(sk);

        while (true) {

            sk = sk + 1;
            System.out.println(sk);

            if (sk == end) {
                break;
            }

        }
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = Integer.valueOf(scanner.nextLine());

        Integer sum = (n * (n + 1)) / 2;

        Integer lsum = 0;
        int i = 1;

        while (true) {

            lsum = lsum + i;

            if (i == n) {
                break;
            }
            i = i + 1;

        }

        System.out.println("Loop Sum = " + lsum);
        System.out.println("Formula Sum = " + sum);

    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = Integer.valueOf(scanner.nextLine());

        Integer sum = (n * (n + 1) * (2 * n + 1)) / 6;
        Integer csum = ((n * (n + 1)) / 2);
        csum = csum * csum;

        Integer lsum = 0;
        int i = 1;

        while (true) {

            lsum = lsum + i * i;

            if (i == n) {
                break;
            }
            i = i + 1;

        }

        System.out.println("Loop Sum = " + lsum);
        System.out.println("Formula Sum = " + sum);
        System.out.println("Sum of cubes = " + csum);

    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter low: ");
        int low = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter high: ");
        int high = Integer.valueOf(scanner.nextLine());

        Integer lsum = (low * (low - 1)) / 2;
        Integer hsum = (high * (high + 1)) / 2;

        Integer sum = hsum - lsum;

        System.out.println("Sum of cubes = " + sum);
    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        int times = word.length();

        int i = 0;
        System.out.println("");

        while (true) {
            System.out.println(word);
            i++;

            if (i == times) {
                break;
            }
        }

    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word1 = scanner.nextLine();

        System.out.println("Enter a word: ");
        String word2 = scanner.nextLine();

        int len1 = word1.length();
        int len2 = word2.length();
        int lensum = len1 + len2;

        
    }
}
