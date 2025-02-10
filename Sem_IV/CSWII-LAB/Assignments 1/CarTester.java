
class Car {
    private String make;
    private String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getMake() {
        return make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
}

public class CarTester{
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Corolla");
        Car myCar2 = new Car(null,null);
        System.out.println( myCar1.getMake() + " " + myCar1.getModel() );
        System.out.println( myCar2.getMake() + " " + myCar2.getModel() );
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");
        System.out.println( myCar2.getMake() + " " + myCar2.getModel() );
    }
}