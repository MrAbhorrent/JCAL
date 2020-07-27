package ru.geekbrains.lesson01;

public class Human extends Sportsman{

    public Human(byte id, int limit_run, int limit_jump) {
        super(id, limit_run, limit_jump);

    }
<<<<<<< HEAD
=======

    @Override
    public void run(int distance) {
        super.run(distance);
    }

    @Override
    public void jump(int height) {
        super.jump(height);
    }

    @Override
    public void info() {
        super.info();
    }
>>>>>>> 4eff947... Исправлены вывод методов jun() и run()
}
