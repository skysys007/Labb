interface Base1 {
    void show1();
}

interface Base2 {
    void show2();
}

class Derived implements Base1, Base2 {
    @Override
    public void show1() {
        System.out.println("Method of first Base Class");
    }
    @Override
    public void show2() {
        System.out.println("Method of the Second class");
    }

    public void show() {
        System.out.println("This is the derived class and it is derived from two Base Classes");
    }
}

public class Main {
    public static void main(String[] args) {
        Derived d1 = new Derived();

        d1.show1();
        d1.show2();
        d1.show();
    }
}