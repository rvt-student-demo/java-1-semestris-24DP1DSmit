package rvt;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ieraksti pirmo skiatli: ");
        int pirm_sk = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Ieraksti pirmo skiatli: ");
        int otr_sk = Integer.valueOf(scanner.nextLine());

        System.out.println("Ieraksti pirmo skiatli: ");
        int tre_sk = Integer.valueOf(scanner.nextLine());


        double atb = (pirm_sk + otr_sk + tre_sk) /3.0;

        System.out.println("The average is: " + atb);
    }
}