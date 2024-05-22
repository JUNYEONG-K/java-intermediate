package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;

        Object object = GenericMethod.objMethod(10); // Object 타입으로 반환됨.
        Integer result1 = (Integer) object; // 캐스팅 필요

        // 타입 인자 (Type Argument) 명시적 전달
        Integer result2 = GenericMethod.<Integer>genericMethod(i); // 타입 캐스팅 필요 없이 잘 나옴.

        Integer result3 = GenericMethod.<Integer>numberMethod(i); // 타입 제한
        Double result4 = GenericMethod.<Double>numberMethod(20.0);

        Integer result5 = GenericMethod.genericMethod(i); // 타입 추론 가능
        Double result6 = GenericMethod.numberMethod(20.0);
    }
}
