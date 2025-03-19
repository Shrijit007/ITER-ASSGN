//Q7

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Address {
    private int plotNo;
    private String at;
    private String post;

    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    public int getPlotNo() {
        return plotNo;
    }

    public String getAt() {
        return at;
    }

    public String getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
    }
}

class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Address> addressBook = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        addressBook.put("John Doe", new Address(101, "Main Street", "Springfield"));
        addressBook.put("Jane Smith", new Address(202, "Second Avenue", "Shelbyville"));
        addressBook.put("Emily Johnson", new Address(303, "Third Boulevard", "Capital City"));

        // Using an Iterator to display the entries
        Iterator<Map.Entry<String, Address>> iterator = addressBook.entrySet().iterator();
        System.out.println("Address Book Entries:");
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
        }
    }
}