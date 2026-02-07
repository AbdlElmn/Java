package ArrayADT;

import java.util.Scanner;

public class ArrayADT {
    static Scanner input = new Scanner(System.in);

    int[] Array;
    int size;
    int length;

    static void display(ArrayADT array) {
        System.out.println("Elements in the Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " -> " + array.Array[i]);
        }
    }

    static void Append(ArrayADT array) {

        int emptySpace = array.size - array.length;

        if (emptySpace == 0) {
            System.out.println("The array is full.");
            return;
        }

        System.out.println("You can insert " + emptySpace + " more elements.");
        System.out.print("How many numbers you want to append? ");
        int n = input.nextInt();

        if (n < 0)
            n = 0;
        if (n > emptySpace) {
            System.out.println("Too many! Decreasing to " + emptySpace);
            n = emptySpace;
        }

        for (int k = 0; k < n; k++) {
            System.out.print("Number " + (array.length + 1) + ": ");
            array.Array[array.length] = input.nextInt();
            array.length++;
        }

    }
}
