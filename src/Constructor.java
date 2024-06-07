public class Constructor {
    public static void main(String[] args) {
        new A1();
        new A1();
        System.out.println(A1.count);
    }
}
    class A1{
        static int count=0;
        public A1(){
            System.out.println("Constructor");
            count++;
        }
    }

