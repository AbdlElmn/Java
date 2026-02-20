package LinkedLists;

import java.util.Scanner;

public class CircularMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        // Insert at beginning
        System.out.print("How many numbers you want to insert? ");
        int nums = sc.nextInt();

        for (int i = 0; i < nums; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int num = sc.nextInt();
            list.insertAtBegining(num);
        }
        System.out.println("\nCurrent List:");
        list.display();

        // Insert at end
        System.out.print("\nDo you want to insert at end? (1 = yes / 0 = no): ");
        int choiceEnd = sc.nextInt();

        if (choiceEnd == 1) {
            System.out.print("Enter number to insert at end: ");
            int value = sc.nextInt();
            list.insertAtEnd(value);
            System.out.println("After inserting at end:");
            list.display();
        }

        // Insert at index
        System.out.print("\nDo you want to insert at index? (1 = yes / 0 = no): ");
        int choiceIndex = sc.nextInt();

        if (choiceIndex == 1) {
            System.out.print("Enter number: ");
            int value = sc.nextInt();
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            list.insertAtIndex(value, index);
            System.out.println("After inserting at index:");
            list.display();
        }

        sc.close();
    }
}