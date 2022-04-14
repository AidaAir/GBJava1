package com.company.Lesson6;

public abstract class Animal {

    protected String name;
    protected int runDistance;
    protected int swimDistance;

    private static int count;

    public Animal(int runDistance, int swimDistance, String name) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.name = name;
        count++;
    }

    public abstract boolean run(int distance);

    public abstract boolean swim(int distance);

    public static int getCount() {
        return count;
    }
}
