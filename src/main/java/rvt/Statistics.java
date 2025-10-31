package main.java.rvt;

import java.util.ArrayList;

public class Statistics {
    private int count;
    private int sum;
    private int average;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        count++;
        sum = sum + number;

    }

    public int getCount() {
        // write code here
            return count;
    }
}