import java.util.ArrayList;

public class Map {
    private ArrayList<Integer> keys = new ArrayList<Integer>();
    private ArrayList<Integer> values = new ArrayList<Integer>();

    public Map(int key, int value) {
        keys.add(key);
        values.add(value);
    }

    public void addPair(int key, int value) {
        if (keys.contains(key)) {
            System.out.println("The key already exists!");
        } else {
            keys.add(key);
            values.add(value);

        }

    }

    public int getValue(int key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            int value = values.get(index);
            return value;
        }

        else {
            System.out.println("The key does not exist!");
            return Integer.MAX_VALUE;
        }
    }

    public void removePair(int key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            keys.remove(index);
            values.remove(index);

        } else {
            System.out.println("The key does not exist!");
        }

    }
}