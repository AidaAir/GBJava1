package com.company.Lesson7;

public class EatProcess {

    public static void main(String[] args) {
        CatEat[] cats = new CatEat[]{
                new CatEat("Васька", 40),
                new CatEat("Черныш", 10),
                new CatEat("Рыжик", 60)
        };

        Plate plate = new Plate(50);

        for (CatEat catEat : cats) {
            plate.info();
            catEat.eat(plate);
            System.out.printf("%s наелся? %s %n", catEat.getName(), catEat.isCatIsFull());
        }
    }
}
