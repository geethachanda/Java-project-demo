public class ParameterizedConstructor {
    public static void main(String[] args){
        new A2();
        new A2(10);
    }
}
class A2{
    public A2(){
        System.out.println("Constructor");

    }
    public A2(int a){
        System.out.println("Parameterized");
    }
}