// Parent class
class Car {
    void startEngine() {
        System.out.println("Starting car");
    }
}i

// Child class - Petrol
class PetrolCar extends Car {
    @Override
    void startEngine() {
        System.out.println("Petrol Car");
    }
}

// Child class - Diesel
class DieselCar extends Car {
    @Override
    void startEngine([]) {
        System.out.println("Diesel Car");
    }
}

// Child class - Electric
class ElectricCar extends Car {
    @Override
    void startEngine() {
        System.out.println("Electric Car");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {

        Car car;

        car = new PetrolCar();
        car.startEngine();

        car = new DieselCar();
        car.startEngine();

        car = new ElectricCar();
        car.startEngine();
    }
}