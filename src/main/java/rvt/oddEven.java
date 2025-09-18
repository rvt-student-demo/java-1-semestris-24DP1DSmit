package rvt;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        System.out.println("Ieraksti skaitli: ");
        Scanner scanner = new Scanner(System.in);
        int sk = Integer.valueOf(scanner.nextLine());
        scanner.close();

        if (sk%2 == 0){
        System.out.println("even");
        } else{
        System.out.println("odd");
        }
    }
}
