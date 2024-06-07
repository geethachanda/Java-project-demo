import java.util.Scanner;

public class Starreversepattern {
        public static void main(String[] args){
            System.out.println("Enter the n value");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=1; i<=n; i++){
                for(int j=n; j>=i; j--){ //when i=1 ->j =1 , when i=2 -> j=1 then j=2
                    System.out.print("* "); //prints based on J value as J represents column
                }
                System.out.println();
            }

        }
    }


