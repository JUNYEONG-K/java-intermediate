package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        // 코드의 중복, 타입마다 박스를 계 ~ 속 만들어주어야 함. => 다형성을 활용? 모든 타입의 부모, Object!!!
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10); // 오토 박싱
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println("str = " + str);
    }
}
