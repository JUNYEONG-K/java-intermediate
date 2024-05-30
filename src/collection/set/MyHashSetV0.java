package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elements = new int[10];
    private int size = 0;

    public boolean add(int value) {
        if (contains(value)) return false;
        elements[size] = value;
        size++;
        return true;
    }

    // O(n)
    public boolean contains(int value) {
        for (int element : elements) {
            if (element == value) return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elements=" + Arrays.toString(Arrays.copyOf(elements, size)) +
                ", size=" + size +
                '}';
    }
}
