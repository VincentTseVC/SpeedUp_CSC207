package exceptionDemo;

public class Owner {
    Cat cat = new Cat();

    public void killCat() throws CatUnkillableException {
        cat.killCat();
    }
}
