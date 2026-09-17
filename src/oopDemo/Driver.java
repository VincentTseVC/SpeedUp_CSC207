package oopDemo;

public class Driver {

    public static void main(String[] args) {
        Dog eddy = new Dog("Eddy", 3);
        eddy.setName("Eddie");

        System.out.println(eddy.numberOfAnimals); // 1
        System.out.println(Animal.numberOfAnimals); // 1

        Cat alice = new Cat("Alice", 3);

        System.out.println(eddy.numberOfAnimals);    // 2
        System.out.println(alice.numberOfAnimals);   // 2
        System.out.println(Animal.numberOfAnimals);  // 2

        System.out.println(eddy.eat("💩"));
        System.out.println(alice.eat("🐟"));

        System.out.println(eddy);
        System.out.println(alice);

        // --------------------
        // reference Type = actual Object
        Dragonfly d1 = new Dragonfly();
        d1.numWings();

        Insect d2 = new Dragonfly();
        // d2.numWings();               // Compile Time Error
        ((Dragonfly) d2).numWings();
        ((Flyable) d2).numWings();

        Flyable d3 = new Dragonfly();
        // d3.numLegs();                // Compile Time Error
        ((Insect) d3).numLegs();
        ((Dragonfly) d3).numLegs();


        // ((Flyable) eddy).numWings();     // Runtime Error


        /// ////////////
        Owner vc = new Owner();
        vc.addPet(eddy);
        vc.addPet(alice);

        vc.whatIHave();


        System.out.println(eddy.equals(alice)); // false
        System.out.println(eddy.equals(new Dog("Eddy", 3))); // true
    }

}
