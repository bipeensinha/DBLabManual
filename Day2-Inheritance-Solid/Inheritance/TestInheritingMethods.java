class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

public class TestInheritingMethods {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();  // Inherited
        car.drive();        // Own
    }
}
