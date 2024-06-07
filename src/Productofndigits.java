import java.util.Scanner;

public class Productofndigits {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int product=1;
        for(int i=1; i<=n; i++) {
            product = product * i;

        }
        System.out.println("the product of " +n+ " numbers is " +product);
    }
}
