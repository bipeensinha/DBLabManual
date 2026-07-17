// Without Constrtcoiur 
class Car {
    String color;
    String model;
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.color = "Red";
        c1.model = "BMW";

        System.out.println(c1.color);
        System.out.println(c1.model);
    }
}

// With Constrctutor

class Car {

    String color;
    String model;

    Car() {
        color = "Red";
        model = "BMW";
    }
}

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();

        System.out.println(c1.color);
        System.out.println(c1.model);
    }
}

===================================

  //Multiple Constructor example

  class Car {

    // Instance variables
    String brand;
    String color;
    int year;

    // Parameterized Constructor
    Car(String carBrand, String carColor, int carYear) {
        brand = carBrand;
        color = carColor;
        year = carYear;
    }

    // Method to display car details
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Year  : " + year);
        System.out.println("------------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating Car objects
        Car car1 = new Car("BMW", "Black", 2024);
        Car car2 = new Car("Audi", "White", 2023);
        Car car3 = new Car("Tesla", "Red", 2025);

        // Displaying details
        car1.display();
        car2.display();
        car3.display();
    }
}
