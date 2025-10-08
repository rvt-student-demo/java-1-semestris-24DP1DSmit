package main.java.rvt;

import java.util.Scanner;

public class soa {
    public static void main(String[] args){
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
    }

    public static void sumOfNumbersInArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }
        System.out.println(sum);
    }
}
