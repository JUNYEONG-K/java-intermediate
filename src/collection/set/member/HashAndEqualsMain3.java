package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("First");
        Member m2 = new Member("First");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        System.out.println("System.ref(m1) = " + System.identityHashCode(m1));
        System.out.println("System.ref(m2) = " + System.identityHashCode(m2));

        // 중복 등록 안됨.
        set.add(m1);
        set.add(m2);

        System.out.println("set = " + set);

        // 검색도 잘 됨.
        Member searchValue = new Member("First");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("System.ref(searchValue) = " + System.identityHashCode(searchValue));
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
