package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();
        dogHospital.setAnimal(dog);
        catHospital.setAnimal(cat);

        dogHospital.checkup();
        catHospital.checkup();

        Animal biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        Dog bigger = (Dog) biggerDog; // 타입 캐스팅 필요
        System.out.println("biggerDog = " + biggerDog);
        System.out.println("bigger = " + bigger);

        // 문제: 타입 안정성 X
        // 장점: 코드 재사용성 O
    }
}
