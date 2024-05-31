package collection.set;

public class StringHashMain {
    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + charA);
        System.out.println("charB = " + charB);
        System.out.println("(int) charA = " + (int) charA);
        System.out.println("(int) charB = " + (int) charB);

        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));
        System.out.println("hashCode('CASE') = " + hashCode("CASE"));

        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
        System.out.println("hashIndex(CASE) = " + hashIndex(hashCode("CASE")));
    }

    static int hashCode(String value) {
        char[] charArray = value.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
