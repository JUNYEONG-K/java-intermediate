package collection.array;

public class MyArrayListV3MainBad {
    public static void main(String[] args) {

        MyArrayListV3 numberList = new MyArrayListV3();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add("string");

        System.out.println(numberList);


        Integer first = (Integer) numberList.get(0);
        Integer second = (Integer) numberList.get(1);
        Integer third = (Integer) numberList.get(2);
        Integer fourth = (Integer) numberList.get(3); // ClassCastException 타입 캐스팅 오류 발생

    }
}
