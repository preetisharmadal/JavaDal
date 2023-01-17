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

    enum DataTypes{
        intInt, 
        stringString,
        doubleDouble,
        intString,
        intDouble,
        stringInt,
        stringDouble,
        doubleInt,
        doubleString
    }    

    DataTypes dataType;

    //    Constructor to accept <Integer, Integer>
    public Map(int key, int value) {
        dataType = DataTypes.intInt;
        intKeys.add(key);
        intValues.add(value);
    }

    //    Constructor to accept <String, String>
    public Map(String key, String value) {
        dataType = DataTypes.stringString;
        stringKeys.add(key);
        stringValues.add(value);
    }
    
    //    Constructor to accept <Double, Double>

    public Map(double key, double value) {
        dataType = DataTypes.doubleDouble;
        doubleKeys.add(key);
        doubleValues.add(value);
    }   
    
    //    Constructor to accept <Integer, String>
    public Map(int key, String value) {
        dataType = DataTypes.intString;
        intKeys.add(key);
        stringValues.add(value);
    }  

    //    Constructor to accept <Integer, Double>
    public Map(int key, double value) {
        dataType = DataTypes.intDouble;
        intKeys.add(key);
        doubleValues.add(value);
    }  

    //    Constructor to accept <String, Integer>

    public Map(String key, int value) {
        dataType = DataTypes.stringInt;
        stringKeys.add(key);
        intValues.add(value);
    }

    //    Constructor to accept <String, Double>

    public Map(String key, double value) {
        dataType = DataTypes.stringDouble;
        stringKeys.add(key);
        doubleValues.add(value);
    }

    //    Constructor to accept <Double, Integer>

    public Map(double key, int value) {
        dataType = DataTypes.doubleInt;
        doubleKeys.add(key);
        intValues.add(value);
    }

    //    Constructor to accept <Double, String>

    public Map(double key, String value) {
        dataType = DataTypes.doubleString;
        doubleKeys.add(key);
        stringValues.add(value);
    }

    //    add key-value for <Integer, Integer>
    public void put(int key, int value) throws Exception {
//        Adding pair with unique key validation
        if (intKeys.contains(key)) {
            throw new Exception("Cannot add: Duplicate key exists");
        } else {
            intKeys.add(key);
            intValues.add(value);
        }

    }

    //    add key-value for <String, String>
    public void put(String key, String value) throws Exception {
        //        Adding pair with unique key validation
                if (stringKeys.contains(key)) {
                    throw new Exception("Cannot add: Duplicate key exists");
                } else {
                    stringKeys.add(key);
                    stringValues.add(value);
                }
        
            }
    //    add key-value for <Double, Double>
    public void put(double key, double value) throws Exception {
        //        Adding pair with unique key validation
                if (doubleKeys.contains(key)) {
                    throw new Exception("Cannot add: Duplicate key exists");
                } else {
                    doubleKeys.add(key);
                    doubleValues.add(value);
                }
        
            }

    //    add key-value for <Integer, String>
    public void put(int key, String value) throws Exception {
        //        Adding pair with unique key validation
                if (intKeys.contains(key)) {
                    throw new Exception("Cannot add: Duplicate key exists");
                } else {
                    intKeys.add(key);
                    stringValues.add(value);
                }
        
            }

    //    add key-value for <Integer, Double>
    public void put(int key, double value) throws Exception {
        //        Adding pair with unique key validation
                if (intKeys.contains(key)) {
                    throw new Exception("Cannot add: Duplicate key exists");
                } else {
                    intKeys.add(key);
                    doubleValues.add(value);
                }
        
            }

    //    add key-value for <String, Integer>
    public void put(String key, int value) throws Exception {
        //        Adding pair with unique key validation
                if (stringKeys.contains(key)) {
                    throw new Exception("Cannot add: Duplicate key exists");
                } else {
                    stringKeys.add(key);
                    intValues.add(value);
                }
        
            }

    //    add key-value for <String, Double>
    public void put(String key, double value) throws Exception {
        //        Adding pair with unique key validation
                if (stringKeys.contains(key)) {
                    throw new Exception("Cannot add: Duplicate key exists");
                } else {
                    stringKeys.add(key);
                    doubleValues.add(value);
                }
        
            }

    //    add key-value for <Double, Integer>
    public void put(double key, int value) throws Exception {
        //        Adding pair with unique key validation
                if (doubleKeys.contains(key)) {
                    throw new Exception("Cannot add: Duplicate key exists");
                } else {
                    doubleKeys.add(key);
                    intValues.add(value);
                }
        
            }

    //    add key-value for <Double, String>
    public void put(double key, String value) throws Exception {
        //        Adding pair with unique key validation
                if (doubleKeys.contains(key)) {
                    throw new Exception("Cannot add: Duplicate key exists");
                } else {
                    doubleKeys.add(key);
                    stringValues.add(value);
                }
        
            }


    //    Get value from key for <Integer,Integer>
    public int get(int key) throws Exception {
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
    public String get(String key) throws Exception {
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
    public double get(double key) throws Exception {
        //        Fetching value with key not found validation
                if (doubleKeys.contains(key)) {
                    int index = doubleKeys.indexOf(key);
                    double value = doubleValues.get(index);
                    return value;
                } else {
                    throw new Exception("Cannot get value: Key does not exist");
                }
            }

    //    Get value from key for <Integer,String>

    public String get(int key) throws Exception {
        //        Fetching value with key not found validation
                if (intKeys.contains(key)) {
                    int index = intKeys.indexOf(key);
                    String value = stringValues.get(index);
                    return value;
                } else {
                    throw new Exception("Cannot get value: Key does not exist");
                }
            }

    //    Get value from key for <Integer,Double>
    public double get(int key) throws Exception {
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
                    int index = doubleKeys.indexOf(key);
                    doubleKeys.remove(index);
                    doubleValues.remove(index);
        
                } else {
                    throw new Exception("Cannot remove pair: Key does not exist");
                }
        
            }            
            
    //    Remove key-value for <Integer,String>
    public void removePair(int key) throws Exception {
        //        Deleting pair with key not found validation
                if (intKeys.contains(key)) {
                    int index = doubleKeys.indexOf(key);
                    intKeys.remove(index);
                    stringValues.remove(index);
        
                } else {
                    throw new Exception("Cannot remove pair: Key does not exist");
                }
        
            } 

    //    Remove key-value for <Integer,Double>
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