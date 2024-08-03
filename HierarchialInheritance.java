package inheritance;

//HierarchialInheritance
class Vechical {
    String brand = "Honda";
}

class Car extends Vechical {
    String colour = "White";

    void start() {
        System.out.println("Start the car");
    }
}

class Bike extends Vechical {
    double cost = 90000;

    void stop() {
        System.out.println("stop the car");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.colour);
        c.start();
        Bike b = new Bike();
        System.out.println(b.cost);
        b.stop();

    }
}
