interface Vehicle{
    abstract void accelarate();
    abstract void brake();
}

class Car implements Vehicle{
    public void accelarate(){
        System.out.println("Car is accelarating");
    }
    public void accelarate(int sec){
        System.out.println("Car is accelarating for "+sec+" seconds");
    }
    public void accelarate(int sec, int speed){
        System.out.println("Car is accelarating for "+sec+" seconds at "+speed+" km/hr");
    }
    public void brake(){
        System.out.println("Car is braking");
    }
}

class Bike implements Vehicle{
    public void accelarate(){
        System.out.println("Bike is accelarating");
    }
    public void accelarate(int sec){
        System.out.println("Bike is accelarating for "+sec+" seconds");
    }
    public void accelarate(double speed){
        System.out.println("Bike is accelarating to "+speed+" km/hr");
    }
    public void brake(){
        System.out.println("Bike is braking");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Car c = new Car();
        c.accelarate();
        c.accelarate(10);
        c.accelarate(10, 60);
        c.brake();
        System.out.println();
        Bike b = new Bike();
        b.accelarate();
        b.accelarate(10);
        b.accelarate(60.5);
        b.brake();
    }
}
