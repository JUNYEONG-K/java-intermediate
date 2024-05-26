package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();

        System.out.println("마지막에 추가: O(n)");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        System.out.println("첫 번째 항목 추가: O(1)");
        list.add(0, "first");
        System.out.println(list);

        System.out.println("첫 번째 항목 삭제: O(1)");
        list.remove(0);
        System.out.println(list);

        System.out.println("중간 항목 추가: O(n)");
        list.add(1, "e");
        System.out.println(list);

        System.out.println("중간 항목 삭제: O(n)");
        list.remove(1);
        System.out.println(list);
    }
}
