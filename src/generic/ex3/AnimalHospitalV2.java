package generic.ex3;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T 의 타입을, 메서드를 정의하는 시점에는 알 수 없다. 모든 객체의 부모인 Object 의 기만 사용 가능
        animal.toString();
        animal.equals(null);
//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
