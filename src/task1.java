// Базовий клас - Транспортний засіб
class Vehicle {
    private final String brand;
    private final int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void show() {
        System.out.println("Transport Vehicle:");
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Похідний клас - Автомобіль
class Car extends Vehicle {
    private final int numDoors;

    public Car(String brand, int maxSpeed, int numDoors) {
        super(brand, maxSpeed);
        this.numDoors = numDoors;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Type: Car");
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Похідний клас - Поїзд
class Train extends Vehicle {
    private final int numCarriages;

    public Train(String brand, int maxSpeed, int numCarriages) {
        super(brand, maxSpeed);
        this.numCarriages = numCarriages;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Type: Train");
        System.out.println("Number of Carriages: " + numCarriages);
    }
}

// Похідний клас - Експрес
class Express extends Train {
    private final boolean hasDiningCar;

    public Express(String brand, int maxSpeed, int numCarriages, boolean hasDiningCar) {
        super(brand, maxSpeed, numCarriages);
        this.hasDiningCar = hasDiningCar;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Type: Express");
        System.out.println("Has Dining Car: " + (hasDiningCar ? "Yes" : "No"));
    }
}

// Головний клас програми
public class task1 {
    public static void main(String[] args) {
        // Масив об'єктів типу базового класу
        Vehicle[] vehicles = new Vehicle[3];

        // Ініціалізація об'єктів
        vehicles[0] = new Car("Toyota", 180, 4);
        vehicles[1] = new Train("Siemens", 200, 10);
        vehicles[2] = new Express("Hyundai", 300, 8, true);

        // Виведення інформації про кожен об'єкт
        for (Vehicle vehicle : vehicles) {
            vehicle.show();
            System.out.println("--------------------------");
        }
    }
}
