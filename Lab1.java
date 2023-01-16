public class Lab1 {
    public static void main(String[] args) {
        Map mp = new Map(2, 3);
        mp.addPair(3, 6);

        System.out.println("key: 3, value: " + mp.getValue(3));
        mp.addPair(3, 7);

    }
}