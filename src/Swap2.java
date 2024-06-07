import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args){
      //  int a =20;
      //  int b= 10;
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc. nextInt();
        a = a+b; // a=30
        b = a-b; // b=30-10=20
        a= a-b;
        System.out.println("The current value of a and b is:" +a+ " and "+b);
    }
}
