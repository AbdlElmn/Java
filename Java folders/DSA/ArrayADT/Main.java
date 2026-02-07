package ArrayADT;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of the array: ");
        int SIZE = input.nextInt();

        ArrayADT array = new ArrayADT();

        array.size = SIZE;
        array.Array = new int[array.size];
        array.length = 0;

        System.out.println("How many numbers you want to insert in the Array? ");
        int n = input.nextInt();

        if (n > array.size) {
            System.out.println("Cannot insert more than array size! Truncating to array size.");
            n = array.size;
            System.out.println("Length now: " + (n));

        } else if (n < 0) {
            System.out.println("Number of elements cannot be negative. Nothing to insert.");
            n = 0;
        }

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println("Number " + (i + 1) + ": ");
            array.Array[i] = input.nextInt();
            array.length++;
        }

        ArrayADT.display(array);

        System.out.println("Do you want to append a number to the array? (yes/no)");
        char choiceForAppend = input.next().toLowerCase().charAt(0);
        if (choiceForAppend == 'y') {
            ArrayADT.Append(array);
            ArrayADT.display(array);
        } else
            System.out.println("Done. BYE!");

        System.out.println("Array size: " + array.size);
        System.out.println("Array length: " + array.length);
        System.out.println("Do you want to insert a number to the array? (yes/no)");
        char choiceForInsert = input.next().toLowerCase().charAt(0);
        if (choiceForInsert == 'y') {
            ArrayADT.insert(array);
            ArrayADT.display(array);
        } else
            System.out.println("Done. BYE!");
        input.close();
    }

}
