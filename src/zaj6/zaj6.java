package zaj6;

import java.util.Random;
import java.util.Scanner;

public class zaj6 {

    public static final int SIZE = 40;

    public static void main(String[] args) {
        Random random = new Random();
        int[] table = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = random.nextInt(100);
        }
        printTab(table);
        printTab_reverse(table);
        printOddIndex(table);
        printDividedBy3(table);
        System.out.println(sumOfArray(table));
        System.out.println("Suma:"+sumOfElements(table,4));
        System.out.println("Suma:"+sumOfLastNElementsBiggerThan(table,4, 10));
        System.out.println("Ile pierwszych wyrazów tablicy daje sumę => niż 100 to " + fun6(table,100)+" wyrazów");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę:");
        int n = scanner.nextInt();
        printDividedByChosenNumber(table, n);
    }

    public static void printTab(int[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + "\t");
        }
        System.out.println();
    }

    public static void printTab_reverse(int[] table) {
        for (int i = table.length - 1; i >= 0; i--) {
            System.out.print(table[i] + "\t");
        }
        System.out.println();
    }

    private static void printOddIndex(int[] table) {
        for (int i = 0; i < table.length; i += 2) {
            System.out.print(table[i] + "\t");
        }
        System.out.println();
    }

    private static void printDividedBy3(int[] table) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] % 3 == 0) System.out.print(table[i] + "\t");
        }
        System.out.println();
    }
    private static int sumOfArray(int[] table) {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            sum += table[i];
        }
        return sum;
    }
    private static int sumOfElements(int[] table, int ile) {
        int sum = 0;
        for (int i = 0; i < ile; i++) {
            sum+=table[i];
        }
        return sum;
    }
    private static int sumOfLastNElementsBiggerThan(int[] table, int ile, int wiekszeod) {
        int sum = 0;
        for (int i = table.length-1; i > table.length-ile-1; i--) {
            if(table[i]>wiekszeod) {sum+=table[i];}
        }
        return sum;
    }
    private static int fun6(int[] table, int ile) { //ilość liczb od początku tablicy by ich suma przekroczyła podaną wartość
        int sum = 0;
        int i;
        for (i=0; sum <= ile; i++) {
            sum += table[i];
        }
        return i;
    }
    private static void printDividedByChosenNumber(int[] table, int n) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] % n == 0) System.out.print(table[i] + "\t");
        }
        System.out.println();
    }
}
