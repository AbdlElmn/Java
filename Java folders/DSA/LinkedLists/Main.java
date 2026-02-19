package LinkedLists;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        linkedlist list = new linkedlist();

        System.out.println("How many numbers you want to insert?");
        int nums = input.nextInt();

        System.out.println("Insertion:");

        for (int i = 0; i < nums; i++) {
            System.out.print("Enter number: ");
            int value = input.nextInt();
            list.insertAtBegining(value);
        }
        System.out.println("List contents:");
        list.Display();

    }
}
