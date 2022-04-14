package com.company.Lesson6;

public class Dog extends Animal {

    public static int count;

    public Dog(int runDistance, int swimDistance, String name) {
        super(runDistance, swimDistance, name);
        count++;
    }

    @Override
    public boolean run(int distance) {
        if (runDistance <= 500) {
            System.out.printf(this.name + " пробежал %d метров%n", distance);
            return true;
        }
        System.out.println(this.name + " не может пробежать больше 500 метров");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (swimDistance <= 10) {
            System.out.printf(this.name + " проплыл %d метров%n", distance);
            return true;
        }
        System.out.println(this.name + " не может проплыть больше 10 метров");
        return false;
    }

    public static int getCount() {
        return count;
    }
}
