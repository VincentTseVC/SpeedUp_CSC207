package oopDemo;

public abstract class Mammal extends Animal {

    public Mammal() {

    }

    public Mammal(String name, int age) {
        super(name, age);
    }

    public abstract void nurse();

}
