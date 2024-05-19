package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        // 다형성 (다형적 참조) 을 활용한 해결, 모든 타입의 부모 Object!!
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue(); // Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String str = (String) stringBox.getValue(); // // Object -> String 캐스팅
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달 => ClassCastException
        integerBox.setValue("100");
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);
    }
}
