package main.java.rvt;

import java.util.Scanner;

public class dalas {
    static final int skPr = 5;
    static final int uzPr = 3;
    static final int paPr = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi skrūvju  skaitu: ");
        int skruv = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi uzgriežņu  skaitu: ");
        int uzgr = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi paplakšņu skaitu: ");
        int papl = Integer.valueOf(scanner.nextLine());

        System.out.println("Skrūvju skaits: " + skruv);
        System.out.println("Uzgriežņu skaits: " + uzgr);
        System.out.println("Paplakšņu skaits skaits: " + papl);

        if (uzgr != skruv && uzgr < skruv) {
            System.out.println("Parbaudi pasutījumu: par maz uzgriežņu");
        } else if (papl < skruv * 2) {
            System.out.println("Parbaudi pasutījumu: par maz paplākšņu");
        } else {
            System.out.println("Pasutījums ir kartibā");
        }

        int sum = skruv * skPr + uzgr * uzPr + papl * paPr;
        System.out.println(sum);

    }
}
