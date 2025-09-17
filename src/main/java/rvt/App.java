package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ieraksti pirmo skiatli:");
        int pirm_sk = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Ieraksti pirmo skiatli:");
        int otr_sk = Integer.valueOf(scanner.nextLine());

        int atb = pirm_sk + otr_sk;

        System.out.println(pirm_sk + " + " + otr_sk + " = " + atb);
    }
}
