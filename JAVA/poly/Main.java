class Animal{
    public void eats(){
        System.out.println("An animal eats");
    }
    public void eats(String food){
        System.out.println("Animal is eating " + food);
    }
}

class Dog extends Animal{
    @Override
    public void eats(){
        System.out.println("Dog eats");
    }
}

public class Main{
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eats();
        a1.eats("apple");

        Dog d1 = new Dog();
        d1.eats();
    }
}