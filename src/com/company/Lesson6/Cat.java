package com.company.Lesson6;

public class Cat extends Animal {

    public static int count;

    public Cat(int runDistance, int swimDistance, String name) {
        super(runDistance, swimDistance, name);
        count++;
    }

    @Override
    public boolean run(int distance) {
        if (runDistance <= 200) {
            System.out.printf(this.name + " пробежал %d метров%n", distance);
            return true;
        }
        System.out.println(this.name + " не может пробежать больше 200 метров");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println(this.name + " не умеет плавать");
        return false;
    }

    public static int getCount() {
        return count;
    }
}

