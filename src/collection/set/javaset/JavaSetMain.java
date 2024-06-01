package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>()); // 입력 순서 보장 X, hashCode 기반으로 hashIndex 에 삽입 => O(1)
        run(new LinkedHashSet<>()); // 입력 순서 보장 O, LinkedList 의 개념을 합침 => O(1)
        run(new TreeSet<>()); // 데이터의 순서 보장 O (입력 순서 보장 X) - Tree 구조 활용 (레드-블랙 트리) => O(log n)
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        System.out.println("set = " + set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
