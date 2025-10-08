package main.java.rvt;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.println("Give two indices to swap: ");
        int ind1 = Integer.valueOf(reader.nextLine());
        int ind2 = Integer.valueOf(reader.nextLine());

        int helper = numbers[ind1];
        numbers[ind1] = numbers[ind2];  
        numbers[ind2] = helper;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
