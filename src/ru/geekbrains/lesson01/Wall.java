package ru.geekbrains.lesson01;

public class Wall {
    protected int height;

    public Wall(int height) {
        setHeight(height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
