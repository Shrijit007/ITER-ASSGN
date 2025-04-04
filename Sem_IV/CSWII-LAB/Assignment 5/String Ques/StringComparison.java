//Q1

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello", s2 = "Hello";
        String ns1 = new String("Hello"), ns2 = new String("Hello");
        
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1.equals(s2) " + s1.equals(s2));
        
        System.out.println("ns1 == ns2 " + (ns1 == ns2));
        System.out.println("ns1.equals(ns2) " + ns1.equals(ns2));

        System.out.println("s1 == ns1 " + (s1 == ns1));
        System.out.println("s1.equals(ns1): " + s1.equals(ns1));

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Heap Memory: " + runtime.totalMemory());
        System.out.println("Free Heap Memory: " + runtime.freeMemory());
    }
}
