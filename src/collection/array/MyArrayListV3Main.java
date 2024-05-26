package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {

        MyArrayListV3 list = new MyArrayListV3();
        // 마지막에 추가 O(1)
        list.add("a");
        list.add("b");
        list.add(1);
        System.out.println(list);

        // 맨 앞에 추가 O(n)
        list.add(0, "first");
        System.out.println(list);

        // 마지막 삭제 O(1)
        Object removed = list.remove(3);
        System.out.println("removed = " + removed);
        System.out.println(list);

        // 맨 앞 삭제 O(n)
        Object removed1 = list.remove(0);
        System.out.println("removed1 = " + removed1);
        System.out.println(list);
    }
}
