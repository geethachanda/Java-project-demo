import java.util.Scanner;

/*A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number*/
public class Perfectnumber {
    /*First, we find the factors of 496 i.e. 1, 2, 4, 8, 16, 31, 62, 124, and 248.
    Let's find the sum of factors (1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496).
     */
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //ex: 145
        int sum = 0;
        int n = num / 2;
        for (int i = 1; i<=n; i++) {
            if (num % i == 0) {
                System.out.println(i + " is a factor");
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
