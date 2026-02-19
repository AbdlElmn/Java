package LinkedLists;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        linkedlist list = new linkedlist();

        System.out.println("How many numbers you want to insert?");
        int nums = input.nextInt();

        // insert at begining
        System.out.println("Insertion at begininng:");
        for (int i = 0; i < nums; i++) {
            System.out.print("Enter number: ");
            int value = input.nextInt();
            list.insertAtBegining(value);
        }
        System.out.println("List:");
        list.Display();

        // insert at end
        System.out.println("");
        System.out.println("Insertion at end:");
        System.out.println("Enter the number you want to insert: ");
        int num = input.nextInt();
        list.insertAtEnd(num);
        list.Display();

        // insert at index
        System.out.println("");
        System.out.println("Insertion at index:");
        System.out.println("Enter the number you want to insert: ");
        int n = input.nextInt();
        System.out.println("Enter the index: ");
        int index = input.nextInt();
        list.insertAtindex(n, index);
        list.Display();

        //Number elements in the list

        System.out.println("Number of elements in the list: ");
        list.count();

        


    }
}
