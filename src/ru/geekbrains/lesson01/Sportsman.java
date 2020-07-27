package ru.geekbrains.lesson01;

public class Sportsman {
    private byte id; // номер участника соревнований
    protected int run_limit;
    protected int jump_limit;

    public int getRun_limit() {
        return run_limit;
    }

    public void setRun_limit(int run_limit) {
        this.run_limit = run_limit;
    }

    public int getJump_limit() {
        return jump_limit;
    }

    public void setJump_limit(int jump_limit) {
        this.jump_limit = jump_limit;
    }

    public Sportsman(byte id) {
        this.id = id;

    }

    public Sportsman(byte id, int run_limit, int jump_limit) {
        this.id = id;
        setRun_limit(run_limit);
        setJump_limit(jump_limit);
    }

<<<<<<< HEAD
    public boolean run(int distance) {
        if (distance < run_limit) return true;
        return false;
    }

    public boolean jump(int height) {
        if (height < jump_limit) return true;
        return false;
=======
    public void run(int distance) {
        if (distance < run_limit) {
            System.out.println("Дистанция пройдена");
        } else {
            System.out.println("Дистанция не пройдена");
        }
    }

    public void jump(int height) {
        if (height < jump_limit) {
            System.out.println("Высота покорена");
        } else {
            System.out.println("Высота не взята");
        }
>>>>>>> 4eff947... Исправлены вывод методов jun() и run()
    }

    /*public void execute(Object someObject) {
        switch (someObject) {
            case Treadmill.class:
                System.out.println();
                this.run(treadmill.getDistance())
                break;
            case Wall.class:

            default:
                throw new IllegalStateException("Unexpected value: " + someObject);
        }
    }*/

    public void info() {

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "id=" + id +
                ", run_limit=" + run_limit +
                ", jump_limit=" + jump_limit +
                '}';
    }
}
