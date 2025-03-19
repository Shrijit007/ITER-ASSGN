//Q3
import java.util.ArrayList;

public class Car implements Comparable<Car> {
    private String name;
    private int modelNo;
    private int stock;

    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    public int getModelNo() {
        return modelNo;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }
}

class CarApp{
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1, "Toyota", 10));
        cars.add(new Car(2, "Honda", 5));
        cars.add(new Car(3, "Ford", 15));
        cars.sort(null);
        System.out.println("Cars:");
        for (Car car : cars) {
            System.out.println("Model No: " + car.getModelNo() + ", Name: " + car.getName() + ", Stock: " + car.getStock());
        }
    }
}