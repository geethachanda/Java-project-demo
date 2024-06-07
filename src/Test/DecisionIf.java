package Test;

import java.util.Scanner;

public class DecisionIf {

    public static void main(String[] args) {
        DecisionIf x= new DecisionIf();
        x.test1();
        x.test2();

    }

    // if statement
    public void test1() {
        int a = 5;
        int b = 6;
        if(a==b-1) {
            System.out.println("a is equal to b-1"); //will be executed
        }
        System.out.println("Test executed"); //will be executed
    }

    //if else statement
    public void test2() {
        int Age;
        String citizen;
        System.out.println("Please enter your age in numbers:");
        Scanner sc = new Scanner(System.in);
        Age=sc.nextInt();
        System.out.println("Please enter if you are a citizen in Y/N):");
        Scanner sc1 = new Scanner(System.in);
        citizen=sc1.next();
        if(Age>=18){
            if(citizen=="Y")
            {
                System.out.println("You are eligible to vote");
            }
            else {
                System.out.println("You are not eligible to vote"); //will be executed
            }
        }
    }
}

