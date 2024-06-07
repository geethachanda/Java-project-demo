import java.util.Scanner;

public class Starwithspace {
        public static void main(String[] args) {
            System.out.println("Enter the n value");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int space = n - 1;
            int star = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= space; j++) { //when i=1 ->j =1 , when i=2 -> j=1 then j=2
                    System.out.print("  "); //prints based on J value as J represents column
                }
                for (int k = 1; k <= star; k++) {
                    System.out.print("* ");
                }
                System.out.println();
                space--;
                star += 2;

            }
        }

    }


