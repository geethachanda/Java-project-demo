import java.util.Scanner;

public class Sumofndigits {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++) {
            sum = sum + i;

        }
        System.out.println("the sum of " +n+ " digits is " +sum);
    }

}
