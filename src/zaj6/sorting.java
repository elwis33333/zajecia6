package zaj6;

import java.util.Random;

import static zaj6.zaj6.printTab;

public class sorting {
    public static final int SIZE = 10000;

    public static void main(String[] args) {
        Random random = new Random();
        int[] table = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = random.nextInt();
        }
        int[] table2 = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table2[i] = random.nextInt();
        }
        printTab(table);
        long t1 = System.currentTimeMillis();
        Bubblesort(table);
        long t2 = System.currentTimeMillis();
        System.out.println();
        printTab(table);
        System.out.println("sortowanie trwało: " + (t2 - t1) + "ms");


        printTab(table2);
        t1 = System.currentTimeMillis();
        SelectionSort(table2);
        t2 = System.currentTimeMillis();
        System.out.println();
        printTab(table2);
        System.out.println("sortowanie trwało: " + (t2 - t1) + "ms");
    }

    public static void Bubblesort(int[] tab) {
        int temp;
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] tab) {
        int pmin, temp;
        for (int i = 0; i < tab.length - 1; i++) {
            pmin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[pmin]) pmin = j;
            }
            temp = tab[pmin];
            tab[pmin] = tab[i];
            tab[i] = pmin;
        }
    }


}
