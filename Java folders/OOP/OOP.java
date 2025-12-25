import java.util.Scanner;

class BankAcc{
    private double bal;
    BankAcc(){
        bal = 1000;
    }
    public void deposite(double amount){
        bal += amount;
    }
    public void withdraw(double amount){
        bal-= amount;
    }
    public void printBal(){
        System.out.println(this.bal);
    }
}

class student extends BankAcc{
    private int ID;
    private int grade;
    private String name;
    student(){
        ID = -1;
        grade = -1;
        name = "NULL";
    }
    student(int id, int g, String n){
        ID = id;
        grade = g;
        name = n;
    }

    public void setGrade(int g){
        grade = g;
    }
    public void printGrade(){
        System.out.println("Grade: "+ this.grade);
    }
    public void printName(){
        System.out.println(this.name);
    }
}


public class OOP{
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the grade: ");
        int grade = input.nextInt();

        BankAcc a1 = new BankAcc();
        a1.printBal();

        student s1 = new student();
        s1.printBal();
        s1.printGrade();
        s1.printName();


        BankAcc a = new BankAcc();
        a.deposite(585);
        a.printBal();

        student s = new student();
        s.setGrade(grade);
        s.deposite(1000);
        s.printBal();
        s.printGrade();
        s.printName();










    }
}