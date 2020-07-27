package ru.geekbrains.lesson01;

public class Treadmill {
    protected int distance_track;

    public Treadmill(int distance_track) {
        setDistance_track(distance_track);
    }

    public int getDistance_track() {
        return distance_track;
    }

    public void setDistance_track(int distance_track) {
        this.distance_track = distance_track;
    }
}
