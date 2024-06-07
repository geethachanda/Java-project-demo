public class DemoPrivateClass {
    public static void main(String[] args) {
       Test1 b= new Test1();
        b.a2();
    }
}
class Test1 {
    private void a1(){
        System.out.println("Private method");
    }
        public void a2(){
        a1();
    }

}

