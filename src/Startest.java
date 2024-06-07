import java.util.Scanner;

public class Startest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the no of rows:");
        int n= sc.nextInt();
//star with space
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = n; j > i; j--) { //if i=1; then j will print space till 5, 4, 3, 2 is >i(i=1) true
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//           System.out.println();
//        }
//star with space reverse
        for (int i = n; i >=1; i--) {
            for (int j = n; j >=i; j--) { //if i=5; then j will print space when 5 and 5-1 =4>i=5 is false
                System.out.print(" ");
            }
           for (int k = i; k >=1; k--) {
                System.out.print("* ");
            }

            System.out.println();
        }

//        for (int i = 5; i >= 1; i--) {
//
//            for (int j = 5; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
   }
}

