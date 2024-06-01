package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A"); // 65 -> 5, buckets[5] = ["A"]
        set.add("B"); // 66 -> 6, buckets[6] = ["B"]
        set.add("C"); // 67 -> 7, buckets[7] = ["C"=
        set.add("AB");
        set.add("CASE");
        set.add("SET");
        System.out.println("set = " + set);

        System.out.println("A.hashCode() = " + "A".hashCode());
        System.out.println("B.hashCode() = " + "B".hashCode());
        System.out.println("AB.hashCode() = " + "AB".hashCode());
        System.out.println("SET.hashCode() = " + "SET".hashCode());

        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}
