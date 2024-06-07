import java.sql.SQLOutput;

public class MethodOverload2 {
    public static void main(String[] args) {

        A a = new A();
        a.add();
        a.add(10, 20);
    }
}

class A{     //methods are created inside new class-nonstatic class
    void add(){               //default- visible inside package -didn't specify modifier like public, private, protected
        System.out.println(10+20);
    }
    void add(int a , int b){
        System.out.println(a+b);
    }
    void add(int a){
        System.out.println(a+a);
    }

}

