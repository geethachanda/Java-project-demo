import java.util.Scanner;

public class Tables {
    public static void main(String[] args){
        System.out.println("Enter the number for tables");
        Scanner sc= new Scanner(System.in);
        int table=sc.nextInt();
        System.out.println("Enter the end multiplier");
        int n= sc.nextInt();

        for(int i=1; i<=n; i++){
           int m= table*i;
           System.out.println( +table+ " * " +i+ " = " +m);


        }

    }
}
