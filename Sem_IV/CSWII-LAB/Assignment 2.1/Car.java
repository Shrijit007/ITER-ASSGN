//Q3

public class Car implements Comparable<Car> {
    private String color;
    private String model;
    private double speed;

    public Car(String color, String model, double speed) {
        this.color = color;
        this.model = model;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car car) {
        return Double.compare(this.speed, car.speed);
    }

    @Override
    public String toString() {
        return "Car: " + model + ", Color: " + color + ", Speed: " + speed;
    }
}

class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Model X", 150.0);
        Car car2 = new Car("Blue", "Model Y", 180.0);
        Car fasterCar = (car1.compareTo(car2) > 0) ? car1 : car2;
        System.out.println(fasterCar + " is faster");
    }
}