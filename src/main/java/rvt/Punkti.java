package main.java.rvt;

import java.util.Scanner;

public class Punkti {
    public static void main(String[] args){
        int[] myNum = new int [5];
        int even = 0;
        int greater = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= myNum.length-1; i++) {
            System.out.println("Ievadiet massīva skaitli: ");
            int number = Integer.valueOf(scanner.nextLine());
            myNum[i] = number;
        }

        for (int i = 0; i <= myNum.length-1; i++) {
            if (myNum[i] >10) {
                    greater++;
                }
            if (myNum[i] %2 == 0){
                even++;
            }
        }

        System.out.println("Skaitļu skaits kuri ir lielāk par 10: " + greater);
        System.out.print("Skaitļu skaits kuri dalas ar 2 bez atlikuma: " + even);
    }

}