import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args){
      //  int a = 20;
        //int b= 10;
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc. nextInt();
        int c;
        c=a; a=b;b=c;
        System.out.println("The a and b is:" +a+" and "+b);
    }
}
