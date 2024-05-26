package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        System.out.println("stringList.get(0) = " + stringList.get(0));

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println("integerList.get(0) = " + integerList.get(0));
    }
}
