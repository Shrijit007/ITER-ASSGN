import java.util.Objects;

public class Animal {
    private String name;
    private String color;
    private String type; 

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public int hashCode() {
        return Objects.hash(name, color, type);
    }

    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Type: " + type;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Lion", "Golden", "wild");
        Animal animal2 = new Animal("Dog", "Brown", "pet");
        Animal animal3 = new Animal("Cat", "White", "pet");
        System.out.println(animal1 + " --> hash code: " + animal1.hashCode());
        System.out.println(animal2 + " --> hash code: " + animal2.hashCode());
        System.out.println(animal3 + " --> hash code: " + animal3.hashCode());
    }
}