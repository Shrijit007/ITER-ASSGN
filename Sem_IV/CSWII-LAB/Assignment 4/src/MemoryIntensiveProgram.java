import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemoryIntensiveProgram {
    static class DataObject {
        private int[] data = new int[1024];
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        List<DataObject> obj = new ArrayList<>();

        System.out.println(new Date() + " - Initial Heap Memory:");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());

        try {
            for (int i = 0; i < 1_000_000; i++) {
                obj.add(new DataObject());

                if (i % 100_000 == 0) {
                    System.out.println(new Date() + " - After creating " + i + " objects:");
                    System.out.println("Total Memory: " + runtime.totalMemory());
                    System.out.println("Free Memory: " + runtime.freeMemory());
                }
            }

            System.out.println(new Date() + " - Finished creating objects.");
        } catch (OutOfMemoryError e) {
            System.err.println("OutOfMemoryError encountered!");
        }
        obj = null;
        System.gc();

        System.out.println(new Date() + " - After Garbage Collection:");
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());
    }
}
