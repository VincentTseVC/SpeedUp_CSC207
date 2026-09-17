package oopDemo;

// Access Modifier
//  default:    package only
//  public:     entire Project
//  private:    only this class
//  protected:  only this class and all its child classes + same package


// Abstract Class
//  - Same as Regular class (可以有 instance/static fields, instance/static methods)
//  - ONLY TWO DIFF:
//      (1)     Cannot be instantiated (不可被創建)
//              ex: Animal vc = new Animal()
//
//      (2)     Can have Abstract Methods


public abstract class Animal {

    // attributes / fields / instance variable
    private String name;
    private int age;

    // static member belong to the class itself.
    // all objects (instances) share the same static value
    public static int numberOfAnimals = 0;

    // Method Overload
    //  同一個class 裡 重複定義 一樣的 methods
    //  - Same function name
    //  - Same return Type
    //  - Diff param Types / number of params

    // constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfAnimals += 1;
    }

    // constructor
    public Animal(String name) {
        this(name, 1);
    }

    // Default constructor (No params)
    public Animal() {
        this("Noname", 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String eat(String food) {
        return food + "好好吃呀";
    }

    @Override
    public String toString() {
        return this.speak() + String.format(" 大家好 我叫 %s, 今年 %d歲", this.name, this.age);
    }

    public abstract String speak();

}
