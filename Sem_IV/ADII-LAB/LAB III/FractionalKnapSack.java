class Item{
    int value;
    int weight;
    public Item(int value,int weight) {
        this.value=value;
        this.weight=weight;
    }
    public double valuePerWeight() {
        return (double) value/weight;
    }
}
public class FractionalKnapSack {
    public static double getMaxValue(Item[] items,int capacity) {
        bubbleSort(items);
        double totalValue=0.0;
        int currentWeight=0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                totalValue += item.value;
                currentWeight += item.weight;
            } else {
                int remainingCapacity = capacity - currentWeight;
                totalValue += item.valuePerWeight() * remainingCapacity;
                break;
            }
        }
        return totalValue;

    }
    public static void bubbleSort(Item[] items) {
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (items[j].valuePerWeight() < items[j + 1].valuePerWeight()) {
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Item[] items = {
                new Item(200, 10),
                new Item(50, 17),
                new Item(50, 6)
        };

        int capacity = 25;
        double maxValue = getMaxValue(items, capacity);

        System.out.println("Maximum value in the knapsack: " + maxValue);
    }
}