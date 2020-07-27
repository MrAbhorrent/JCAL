package ru.geekbrains;

import ru.geekbrains.lesson01.*;

import java.util.Calendar;

public class Main {


    protected static Sportsman[] sportsmens;
    private static  Object[] ObstacleCourse;

    public static void main(String[] args) {

        sportsmens = new Sportsman[] {new Human((byte) 1, 200, 2), new Cat((byte) 2, 50, 1), new Robot((byte) 3, 800, 3)};

        for (Sportsman sportsman: sportsmens) {
            sportsman.info();
        }

        // Может создать родительский класс для препядствий и  из него сделать массив?
        ObstacleCourse = new Object[]{new Wall(1), new Treadmill(50), new Wall(2), new Treadmill(150), new Wall(3), new Treadmill(500)};

        /*for (Sportsman sportsmen: sportsmens) {
            sportsmen.info();
            sportsmen.jump(ObstacleCourse[0]);
        }*/
    }
}
