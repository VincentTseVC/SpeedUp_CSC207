package oopDemo;

public class Cat extends Mammal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public String eat(String food) {
        return "喵～" + super.eat(food);
    }

    @Override
    public String speak() {
        return "喵喵喵";
    }

    @Override
    public void nurse() {
        System.out.println("Shut up, just take my milk!");
    }
}
