package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object 의 기본 hashCode 는 객체의 참조값을 기반으로 생성 => 따라서 각각 다른 값이 나옴.
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println("obj2 = " + obj2);

        // 각 클래스마다 hashCode 를 이미 오버라이 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("A.hashCode() = " + strA.hashCode());
        System.out.println("AB.hashCode() = " + strAB.hashCode());

        // Member 객체 비교
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");
        System.out.println("(member1 == member2) = " + (member1 == member2)); // false, 인스턴스 참조값이 다르기 때문
        System.out.println("(member1 equals member2) = " + (member1.equals(member2))); // true, id 필드로 비교하도록 오버라이딩 해두었기 때문
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
