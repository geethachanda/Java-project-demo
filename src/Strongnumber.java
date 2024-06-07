import java.util.Scanner;

public class Strongnumber {
    /*The number whose sum of factorial of digits is equal to the number itself
   number 145 ->1!+4!+5!=1+24+120 =145*/

        public static void main(String[] args) {
            System.out.println("Enter the number");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt(); //ex: 145
            int temp = num;
            int fact=0;
            while(num>0){
                    int rem = num % 10; // 5, 4
                    int n=rem-1; //4 , 3
                    for(int i=n; i>=1; i--){
                       rem=rem * i; // ex: 5*4, 20*3, 60*2, 120*1 , 24
                    }
                    fact=fact+rem; //0+120=120, 24,
                    num = num / 10;//removes last digit of the variable num
                }
            if(fact == temp) {
                System.out.println(temp + " is a Strong number");
            } else {
                System.out.println(temp + " is not a Strong number");
            }


        }
    }



