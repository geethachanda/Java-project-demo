public class MethodOverloading
{
    public static void main(String[] args){
       MethodOverloading a= new MethodOverloading();
       add(); //static method so need not create object to call the method
       a.add(15); //non static method so need to create object to call the method
       a.add(10, 50);

    }
//methods are created within same class
    static void add() {
            System.out.println(10+20);

        }
    public void add(int a) {
        System.out.println(a+a);

    }
        public void add(int a, int b) {
            System.out.println(a + b);

        }
    }

