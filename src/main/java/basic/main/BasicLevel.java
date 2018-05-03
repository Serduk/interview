package basic.main;

import basic.classes.animal.Animal;
import basic.classes.cat.Cat;
import basic.classes.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class BasicLevel {
    public static void main(String... args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals) {
            animal.sound();
            // expected: I'am a [Doc,Cat]. My name is [Tuzik,Vasya]. [Gav,Mew]
        }
    }
}
