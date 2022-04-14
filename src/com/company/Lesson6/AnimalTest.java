package com.company.Lesson6;

public class AnimalTest {

    public static void main(String[] args) {
        Cat cat = new Cat(300, 50, "Васька");
        cat.run(cat.runDistance);
        cat.swim(cat.swimDistance);

        Dog dog = new Dog(500, 10, "Жак");
        dog.run(dog.runDistance);
        dog.swim(dog.swimDistance);

        System.out.println();
        System.out.println("Количество животных:" + Animal.getCount());
        System.out.println("Количество котов:" + Cat.getCount());
        System.out.println("Количество собак:" + Dog.getCount());
    }
}
