public class ParameterizedConstructor2 {
    public static void main(String[] args) {
              new B(10, 20);
    }
}
    class B{
    int i;
    int j;
    public B(int i, int j){
        this.i=i;
        this.j=j;
        display();
    }
        public void display(){
            System.out.println(i+ " " +j);
        }
    }

