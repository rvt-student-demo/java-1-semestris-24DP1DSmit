package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter password: ");
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        String atb = String.valueOf(scanner.nextLine());


        String password = "Caput Draconis";

        if (password = atb) {
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
