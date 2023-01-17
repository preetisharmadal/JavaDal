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
            mpIntInt.addPair(3, 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 2. Add key-value pair with duplicate key
        try {
            mpIntInt.addPair(3, 7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 3. Add key-value with wrong datatype

// 4. Read value using valid key
        try {
            System.out.println("key: 3, value: " + mpIntInt.getValue(3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 5. Read value using invalid keys (non-existent key,wrong datatype)
        try {
            System.out.println("key: 5, value: " + mpIntInt.getValue(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        System.out.println("key: 3, value: " + mpIntInt.getValue(3));
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
            mpIntInt.getValue(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}