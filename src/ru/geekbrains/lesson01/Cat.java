package ru.geekbrains.lesson01;

public class Cat extends Sportsman{

    public Cat(byte id, int run_limit, int jump_limit) {
        super(id, run_limit, jump_limit);
    }

    @Override
<<<<<<< HEAD
    public boolean run(int distance) {
        return super.run(distance);
    }

    @Override
    public boolean jump(int height) {
        return super.jump(height);
=======
    public void run(int distance) {
        super.run(distance);
    }

    @Override
    public void jump(int height) {
        super.jump(height);
>>>>>>> 4eff947... Исправлены вывод методов jun() и run()
    }
}
