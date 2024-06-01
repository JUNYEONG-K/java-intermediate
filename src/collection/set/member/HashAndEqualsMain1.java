package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("First");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("First");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        // 증복 등록됨.
        set.add(m1);
        set.add(m2);

        System.out.println("set = " + set);

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("First");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
