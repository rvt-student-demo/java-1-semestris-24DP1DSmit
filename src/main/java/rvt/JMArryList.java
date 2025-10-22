package main.java.rvt;

import java.util.*;

public class JMArryList {
    public static void main(String[] args){

    }

    public static void onlyTWheseNumbers(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        System.out.print("From where? ");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.print("To where? ");
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }

        scanner.close();
    }
    public static void listSize(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }

        System.out.println();
        System.out.println("In total: " + list.size());
    }

    public static void onTheList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }

        System.out.println();
        System.out.print("Search for? ");
        String nameToFind = scanner.nextLine();

        if (names.contains(nameToFind)) {
            System.out.println(nameToFind + " was found!");
        } else {
            System.out.println(nameToFind + " was not found!");
        }

        scanner.close();
    }
    public static void removeLast(ArrayList<String> strings){
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
    }
}
}
