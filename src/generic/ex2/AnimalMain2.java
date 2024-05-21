package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 200);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        animalBox.setValue(dog); // Animal 의 하위 타입 가능
        animalBox.setValue(cat); // Animal 의 하위 타입 가능

        Animal findAnimal = animalBox.getValue(); // 출력은 Animal 타입
        System.out.println("findAnimal = " + findAnimal);
    }
}
