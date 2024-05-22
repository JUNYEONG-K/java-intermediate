package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 200);

        AnimalMethod.checkup(dog);
        Dog biggerDog = AnimalMethod.bigger(dog, new Dog("멍멍이2", 200)); // 알아서 Dog 타입 추론
        System.out.println("biggerDog = " + biggerDog);

        AnimalMethod.checkup(cat);
        Cat biggerCat = AnimalMethod.bigger(cat, new Cat("야옹이2", 300)); // 알아서 Cat 타입 추론
        System.out.println("biggerCat = " + biggerCat);

        Animal biggerAnimal = AnimalMethod.bigger(dog, cat); // Animal , 상위 타입 추론
        System.out.println("biggerAnimal = " + biggerAnimal);
    }
}
