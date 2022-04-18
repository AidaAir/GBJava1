package com.company.Lesson7;

public class CatEat {

    private final String name;
    private final int appetite;
    private boolean catIsFull;

    public CatEat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isCatIsFull() {
        return catIsFull;
    }

    public void hungryCat() {
        System.out.println(name + " голодный");
    }

    public void eat(Plate plate) {
        if (isCatFull(plate)) {
            System.out.println(name + " поел столько: " + appetite);
            plate.minusFood(appetite);
            catIsFull = true;
        } else {
            System.out.println(name + " хотел съесть " + appetite + " ,но в тарелке недостаточно еды, добавьте корм");
        }
    }

    public boolean isCatFull(Plate plate) {
        return plate.isFoodEnough(appetite);
    }
}

