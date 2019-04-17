package Lesson_6;

public class Obstacle {                             //Создаю класс Препятствие
    String name;                                    //объявляю параметры объекта
    private int track;
    private double wall;
    private int swimmingPool;

    public Obstacle(String name, int track, double wall, int swimmingPool) {    //Создаю конструктор объекта Препятствие
        this.name = name;
        this.track = track;
        this.wall = wall;
        this.swimmingPool = swimmingPool;
    }

    public int getTrack() {                         //Создаю геттеры параметров
        return track;
    }

    public double getWall() {
        return wall;
    }

    public int getSwimmingPool() {
        return swimmingPool;
    }
}
