import java.util.Scanner;
public class teststrong {
    /*The number whose sum of factorial of digits is equal to the number itself
   number 145 ->1!+4!+5!=1+24+120 =145*/
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();//ex: 145
        int temp=num;
        int sum=0;
        int fact=0;
        while(num>0) {
            int rem = num % 10; //5, 4, 1
            int n=rem-1;
            for(int i=n;i>=1;i--) {
                  rem = rem * i; //5*4*3*2*1
            }
            sum=sum+rem; //0+120 =120
            num = num / 10;
       
        }
        if(temp==sum){
            System.out.println("the given number is strong number");
        }
        else
            System.out.println("the given number is not strong number");

    }

}
