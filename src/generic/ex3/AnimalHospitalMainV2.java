package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        // Dog, Cat 뿐만 아니라 동물과 전혀 관계 없는 여러가지 타입들이 모두 들어갈 수 있다.
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<String> stringHospital = new AnimalHospitalV2<>();
    }
}
