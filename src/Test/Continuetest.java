package Test;

public class Continuetest {

    public static void main(String[] args) {

        for(int i=1; i<=5; i++) {

            if(i==3) {
                continue; //skips the current iteration i=3 and will execute the next iteration in the loop that i=4
            }

            //i =1 ->system will print hello 1
            //i =2 ->system will print hello 2
            //i=3 -> if condition will be true and as continue is there it will skip the 3rd iteration and control will go to the next iteration
            //i =4 ->system will print hello 4
            //i =5 ->system will print hello 5
            System.out.println("hello" +i);

        }

    }

}
