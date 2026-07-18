// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class to run the code
public class TestSingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Inherited method
        dog.bark();   // Own method
    }
}
