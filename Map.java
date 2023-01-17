import java.util.ArrayList;

public class Map {
    //    Using Arraylist to store intKeys and intValues paired by their index in Arraylist.
    private ArrayList<Integer> intKeys = new ArrayList<Integer>();
    private ArrayList<Integer> intValues = new ArrayList<Integer>();

    //      Using ArrayList to store stringKeys and stringValues paired by their index in ArrayList.
    private ArrayList<String> stringKeys = new ArrayList<String>();
    private ArrayList<String> stringValues = new ArrayList<String>();

    //      Using ArrayList to store doubleKeys and doubleValues paired by their index in ArrayList.
    private ArrayList<Double> doubleKeys = new ArrayList<Double>();
    private ArrayList<Double> doubleValues = new ArrayList<Double>();

        

    //    Constructor to accept <Integer, Integer>
    public Map(int key, int value) {
        intKeys.add(key);
        intValues.add(value);
    }

    //    Constructor to accept <String, String>

    public Map(String key, String value) {
        stringKeys.add(key);
        stringValues.add(value);
    }
    
    //    Constructor to accept <Double, Double>

    public Map(double key, double value) {
        doubleKeys.add(key);
        doubleValues.add(value);
    }    

    //    add key-value for <Integer, Integer>
    public void addPair(int key, int value) throws Exception {
//        Adding pair with unique key validation
        if (intKeys.contains(key)) {
            throw new Exception("Cannot add: Duplicate key exists");
        } else {
            intKeys.add(key);
            intValues.add(value);
        }

    }

    //    add key-value for <String, String>
    public void addPair(String key, String value) throws Exception {
        //        Adding pair with unique key validation
                if (stringKeys.contains(key)) {
                    throw new Exception("Cannot add: Duplicate key exists");
                } else {
                    stringKeys.add(key);
                    stringValues.add(value);
                }
        
            }
    //    add key-value for <Double, Double>
    public void addPair(double key, double value) throws Exception {
        //        Adding pair with unique key validation
                if (doubleKeys.contains(key)) {
                    throw new Exception("Cannot add: Duplicate key exists");
                } else {
                    doubleKeys.add(key);
                    doubleValues.add(value);
                }
        
            }


    //    Get value from key for <Integer,Integer>
    public int getValue(int key) throws Exception {
//        Fetching value with key not found validation
        if (intKeys.contains(key)) {
            int index = intKeys.indexOf(key);
            int value = intValues.get(index);
            return value;
        } else {
            throw new Exception("Cannot get value: Key does not exist");
        }
    }

    //    Get value from key for <String,String>
    public String getValue(String key) throws Exception {
        //        Fetching value with key not found validation
                if (stringKeys.contains(key)) {
                    int index = stringKeys.indexOf(key);
                    String value = stringValues.get(index);
                    return value;
                } else {
                    throw new Exception("Cannot get value: Key does not exist");
                }
            }

    //    Get value from key for <Double,Double>
    public double getValue(double key) throws Exception {
        //        Fetching value with key not found validation
                if (doubleKeys.contains(key)) {
                    int index = doubleKeys.indexOf(key);
                    double value = doubleValues.get(index);
                    return value;
                } else {
                    throw new Exception("Cannot get value: Key does not exist");
                }
            }

    //    Remove key-value for <Integer,Integer>
    public void removePair(int key) throws Exception {
//        Deleting pair with key not found validation
        if (intKeys.contains(key)) {
            int index = intKeys.indexOf(key);
            intKeys.remove(index);
            intValues.remove(index);

        } else {
            throw new Exception("Cannot remove pair: Key does not exist");
        }

    }

    //    Remove key-value for <String,String>
    public void removePair(String key) throws Exception {
        //        Deleting pair with key not found validation
                if (stringKeys.contains(key)) {
                    int index = stringKeys.indexOf(key);
                    stringKeys.remove(index);
                    stringValues.remove(index);
        
                } else {
                    throw new Exception("Cannot remove pair: Key does not exist");
                }
        
            }
            
    //    Remove key-value for <Double,Double>
    public void removePair(double key) throws Exception {
        //        Deleting pair with key not found validation
                if (doubleKeys.contains(key)) {
                    double index = doubleKeys.indexOf(key);
                    doubleKeys.remove(index);
                    doubleValues.remove(index);
        
                } else {
                    throw new Exception("Cannot remove pair: Key does not exist");
                }
        
            }            
            
}