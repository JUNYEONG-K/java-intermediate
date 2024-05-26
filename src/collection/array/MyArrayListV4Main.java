package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {

        MyArrayListV4<Integer> numberList = new MyArrayListV4<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);

        System.out.println(numberList);


        Integer first = numberList.get(0); // 타입 캐스팅 필요 X
        Integer second = numberList.get(1);
        Integer third = numberList.get(2);
        Integer fourth = numberList.get(3);
    }
}
