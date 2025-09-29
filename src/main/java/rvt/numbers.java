package main.java.rvt;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Ievadi skaitli: ");
        // int num = Integer.valueOf(scanner.nextLine());

        int numsum = 0;
        int summa = 0;

while (true) {
    System.out.println("Give a number (0 to stop): ");
     int num = Integer.valueOf(scanner.nextLine());

    if (num == 0) {
        break;
    }

    summa = summa + num;

    numsum = numsum + 1;

  

}

System.out.println("Total numbers: " + numsum );
System.out.println("Summa: " + summa );


    }
}
