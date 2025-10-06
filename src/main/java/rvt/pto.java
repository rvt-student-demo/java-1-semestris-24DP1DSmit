package main.java.rvt;

import java.util.Scanner;

public class pto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi skaitli: ");
        int num = Integer.valueOf(scanner.nextLine());

        while(true){
            System.out.println(num);

            num = num-1;
            if(num == 0){
                break;
            }
        }

    }
}
