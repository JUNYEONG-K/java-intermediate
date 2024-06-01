package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("First");
        MemberOnlyHash m2 = new MemberOnlyHash("First");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        System.out.println("System.ref(m1) = " + System.identityHashCode(m1));
        System.out.println("System.ref(m2) = " + System.identityHashCode(m2));

        // 증복 등록됨.
        set.add(m1);
        set.add(m2);

        System.out.println("set = " + set);

        // 검색 실패, 버킷의 같은 인덱스에 저장될 뿐, equals 가 false 이기 때문에 중복 등록 되는 것은 물론 검색도 안된다.
        MemberOnlyHash searchValue = new MemberOnlyHash("First");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("System.ref(searchValue) = " + System.identityHashCode(searchValue));
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
