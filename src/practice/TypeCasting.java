package practice;

public class TypeCasting {
    public static void main(String[] args) {

        // 1. Primitive Type Casting

        // Widening (Implicit) Casting: Automatically done by the compiler when converting a smaller type to a larger type.
        double doubleVal = 10;
        System.out.println("DoubleValue: " + doubleVal);

        // Narrowing (Explicit) Casting: Requires explicit casting by the developer when converting a larger type to a smaller type.
        int intVal = (int) 15.7;
        System.out.println("IntValue: " + intVal);


        // 2. Reference Type Casting

        // Upcasting (Implicit): Converting a subclass reference to a superclass reference. It is done automatically.
        Animal animal = new Dog(); // Dog is upcasted to Animal
        animal.sound(); // Output: Dog barks

        // Downcasting (Explicit): Converting a superclass reference to a subclass reference. This requires explicit casting and is done manually. It can throw a ClassCastException if the object is not of the target subclass type.
        if (animal instanceof Dog) { // Always check with instanceof to avoid ClassCastException
            Dog dog = (Dog) animal; // Explicit casting
            dog.fetch(); // Output: Dog fetches a ball
        }


        // 3. Special Cases of Casting

    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches a ball");
    }
}