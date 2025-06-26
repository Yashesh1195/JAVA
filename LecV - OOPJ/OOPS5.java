//Abstraction

//Abstract class
// abstract class Animal {
//     abstract void walk();
//     Animal() {
//         System.out.println("You are creating a new animal");
//     }
//     public void eat() {
//         System.out.println("Animal eats");
//     }
// }

// class Horse extends Animal {
//     Horse() {
//         System.out.println("Created a horse");
//     }
//     public void walk() {
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Chicken extends Animal {
//     public void walk() {
//         System.out.println("Walks on 2 legs");
//     }
// }

// public class OOPS5 {
//     public static void main(String args[]) {
//         Horse horse = new Horse();
//         // horse.walk();
//         // horse.eat();
//         //Runtime error
//         // Animal animal = new Animal();
//         // animal.walk();
//     }
// }


//Interfaces
interface Animal {
    int eyes = 2;
    void walk();
}

interface Herbivorous {
    void eats();
}

class Horse implements Animal, Herbivorous {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
    public void eats() {
        System.out.println("Eats grass");
    }
}

public class OOPS5 {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();
    }
}