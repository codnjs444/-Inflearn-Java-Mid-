package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("강아지1", 100);
        Cat cat = new Cat("길냥이1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();

        dogHospital.setAnimal(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("강아지2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
