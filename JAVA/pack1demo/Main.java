import mypackage.ClassA;
import mypackage.MyInterface;

class MyClass implements MyInterface {
    @Override
    public void display() {
        System.out.println("Interface method implemented");
    }
}

public class Main {
    public static void main(String[] args) {

        ClassA obj = new ClassA();
        obj.showA();

        MyClass m = new MyClass();
        m.display();
    }
}