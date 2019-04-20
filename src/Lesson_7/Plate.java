package Lesson_7;

public class Plate {
    private String name;
    private int food;

    public Plate(String name, int food) {
        this.name = name;
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void consumption (Cat cat){
        this.food -= cat.getAppetite();
    }

}
