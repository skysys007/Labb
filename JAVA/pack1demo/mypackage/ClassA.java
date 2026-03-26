package mypackage;

public class ClassA {
    public void showA() {
        System.out.println("ClassA");

        ClassB b = new ClassB();
        b.showB();
    }
}

class ClassB {
    public void showB() {
        System.out.println("ClassB");
    }
}