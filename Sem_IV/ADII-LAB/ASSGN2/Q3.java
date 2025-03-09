package ASSGN3;

import java.util.Arrays;

public class LinearProbingHashTable {
    private int[] hashTable;
    private int size;
    private static final int EMPTY = -1;

    public LinearProbingHashTable(int size) {
        this.size = size;
        this.hashTable = new int[size];
        Arrays.fill(hashTable, EMPTY);
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void insert(int[] keys) {
        for (int key : keys) {
            int hv = hashFunction(key);
            if (hashTable[hv] == EMPTY) {
                hashTable[hv] = key;
            } else {
                int j = 1;
                int newHV;
                do {
                    newHV = (hv + j) % size;
                    j++;
                } while (hashTable[newHV] != EMPTY);
                
                hashTable[newHV] = key;
            }
        }
    }

    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + (hashTable[i] == EMPTY ? "NULL" : hashTable[i]));
        }
    }

    public static void main(String[] args) {
        int[] keys = {10, 20, 30, 40, 50, 25}; // Example keys
        int tableSize = 7; // Example size

        LinearProbingHashTable hashTable = new LinearProbingHashTable(tableSize);
        hashTable.insert(keys);
        hashTable.display();
    }
}
