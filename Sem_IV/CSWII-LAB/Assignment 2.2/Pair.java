//Q1
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
class MainQ1 {
    public static void main(String[] args) {
        Pair<Integer,Integer> p1 = new Pair<Integer,Integer>(2, 3);
        Pair<String,String> p2 = new Pair<String,String>("Hello", "World");
        System.out.println(p1.getKey() + " " + p1.getValue());
        System.out.println(p2.getKey() + " " + p2.getValue());
    }
}