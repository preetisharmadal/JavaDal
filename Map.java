import java.util.ArrayList;

public class Map {
    //    Using Arraylist to store keys and values paired by their index in Arraylist.
    private ArrayList<Integer> keys = new ArrayList<Integer>();
    private ArrayList<Integer> values = new ArrayList<Integer>();

    //    Constructor to accept <Integer, Integer>
    public Map(int key, int value) {
        keys.add(key);
        values.add(value);
    }

    //    add key-value for <Integer, Integer>
    public void addPair(int key, int value) throws Exception {
//        Adding pair with unique key validation
        if (keys.contains(key)) {
            throw new Exception("Cannot add: Duplicate key exists");
        } else {
            keys.add(key);
            values.add(value);
        }

    }

    //    Get value from key for <Integer,Integer>
    public int getValue(int key) throws Exception {
//        Fetching value with key not found validation
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            int value = values.get(index);
            return value;
        } else {
            throw new Exception("Cannot get value: Key does not exist");
        }
    }

    //    Remove key-value for <Integer,Integer>
    public void removePair(int key) throws Exception {
//        Deleting pair with key not found validation
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            keys.remove(index);
            values.remove(index);

        } else {
            throw new Exception("Cannot remove pair: Key does not exist");
        }

    }
}