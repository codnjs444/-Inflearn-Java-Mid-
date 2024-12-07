package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("강아지", 100);
        Cat cat = new Cat("길냥이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        animalBox.setValue(dog);
        animalBox.setValue(cat);

        Animal value = animalBox.getValue();
        System.out.println("value = " + value);
    }
}
