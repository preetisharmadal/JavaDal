// Main class to test the Map class
// Test cases:
// 1. Add a key-value pair
// 2. Add key-value pair with duplicate key
// 3. Add key-value with wrong datatype
// 4. Read value using valid key
// 5. Read value using invalid keys (non-existent key,wrong datatype)
// 6. Remove value using invalid keys (non-existent key,wrong datatype)
// 7. Remove value using valid key



public class Lab1 {
    public static void main(String[] args) {
//        Instantiating map with <Integer,Integer> key-value pair
        Map mpIntInt = new Map(2, 3);
//        1. Add key-value pair
        try {
            mpIntInt.put(3, 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 2. Add key-value pair with duplicate key
        try {
            mpIntInt.put(3, 7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 3. Add key-value with wrong datatype

// 4. Read value using valid key
        try {
            System.out.println("key: 3, value: " + mpIntInt.get(3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 5. Read value using invalid keys (non-existent key,wrong datatype)
        try {
            System.out.println("key: 5, value: " + mpIntInt.get(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 6. Remove value using invalid keys (non-existent key,wrong datatype)
        try {
            mpIntInt.removePair(6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 7. Remove value using valid key
        try {
            mpIntInt.removePair(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            mpIntInt.get(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        Instantiating map with <String,String> key-value pair
        Map mpStringString = new Map("d", "default");
//        1. Add key-value pair
        try {
            mpStringString.put("a", "apple");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 2. Add key-value pair with duplicate key
        try {
            mpStringString.put("a", "banana");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 3. Add key-value with wrong datatype

// 4. Read value using valid key
        try {
            System.out.println("key: a, value: " + mpStringString.get("a"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 5. Read value using invalid keys (non-existent key,wrong datatype)
        try {
            System.out.println("key: c, value: " + mpStringString.get("c"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 6. Remove value using invalid keys (non-existent key,wrong datatype)
        try {
            mpStringString.removePair("d");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 7. Remove value using valid key
        try {
            mpStringString.removePair("a");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            mpStringString.get("a");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        Instantiating map with <Double,Double> key-value pair
        Map mpDoubleDouble = new Map(1.1, 3.3);
//        1. Add key-value pair
        try {
            mpDoubleDouble.put(3.3, 6.6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 2. Add key-value pair with duplicate key
        try {
            mpDoubleDouble.put(3.3, 7.7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 3. Add key-value with wrong datatype

// 4. Read value using valid key
        try {
            System.out.println("key: 3.3, value: " + mpDoubleDouble.get(3.3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 5. Read value using invalid keys (non-existent key,wrong datatype)
        try {
            System.out.println("key: 5.5, value: " + mpIntInt.get(5.5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        System.out.println("key: 3.3, value: " + mpIntInt.get(3.3));
// 6. Remove value using invalid keys (non-existent key,wrong datatype)
        try {
            mpDoubleDouble.removePair(6.6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 7. Remove value using valid key
        try {
            mpDoubleDouble.removePair(3.3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            mpDoubleDouble.get(3.3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}