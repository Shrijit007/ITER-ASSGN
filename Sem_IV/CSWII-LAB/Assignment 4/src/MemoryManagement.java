public class MemoryManagement {
    private int intData;
    private double doubleData;

public  MemoryManagement(int i, double d) {
        this.intData = i;
        this.doubleData = d;
    }

    public void initialize(int intData, double doubleData) {
        this.intData = intData;
        this.doubleData = doubleData;
    }

    public void setValues(int intData, double doubleData) {
        this.intData = intData;
        this.doubleData = doubleData;
    }

    public void updateValues(int intIncrement, double doubleIncrement) {
        this.intData += intIncrement;
        this.doubleData += doubleIncrement;
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Initial Total Memory: " + runtime.totalMemory());
        System.out.println("Initial Free Memory: " + runtime.freeMemory());

        MemoryManagement obj1 = new MemoryManagement(10, 20.5);
        MemoryManagement obj2 = new MemoryManagement(30, 40.5);

        obj2.updateValues(5, 10.5);

        System.out.println("Memory after creating objects: ");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());

        obj1 = null;
        obj2 = null;
        System.gc();
        System.out.println("Memory after garbage collection: ");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());
    }
}
