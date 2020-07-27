package ru.geekbrains.lesson01;

public class Cat extends Sportsman{

    public Cat(byte id, int run_limit, int jump_limit) {
        super(id, run_limit, jump_limit);
    }

    @Override
    public boolean run(int distance) {
        return super.run(distance);
    }

    @Override
    public boolean jump(int height) {
        return super.jump(height);
    }
}
