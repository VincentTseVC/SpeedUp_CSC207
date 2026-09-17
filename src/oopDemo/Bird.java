package oopDemo;

public class Bird extends Animal implements Flyable {
    @Override
    public String speak() {
        return "嘰嘰嘰";
    }

    @Override
    public int numWings() {
        return 2;
    }
}
