package Lesson_7;

public class Cat {                  //создал класс Кот
    private String name;            //праметр имени
    private int appetite;           //параметр аппетита
    private boolean satiety;        //параметр сытости

    public Cat(String name, int appetite) {     //билдер объекта Кот
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;                   //новый объект Кот всегда голоден
    }

    public String getName() {
        return name;
    }                               //геттер имени

    public int getAppetite() {
        return appetite;
    }                           //геттер аппетита

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }            //сеттер аппетита (не применяется, но может пригодиться)

    public boolean getSatiety() {
        return satiety;
    }       //геттер сытости

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }   //сеттер сытости

    public void eat (Plate plate) {                                 //метод Поедания
        if (this.getAppetite() <= plate.getFood()){                 //сравниваем аппетит с количеством еды в тарелке
            plate.consumption(this);                            //запускаем метод Опустошения тарелки класса Тарелка
            this.setSatiety(true);                                  //устанавливаем сытость кота на true
        }                                                           //иначе ничего не делаем, т.к. объект Кот изначально создаётся голодным
    }

    public void info () {                                       //метод, выводящий информацию о сытости кота
        if (this.getSatiety() == true) {                        //проверяется параметр сытости кота
            System.out.println("Кот " + this.getName() + " поел и чувствует себя сытым и довольным!");
        } else {
            System.out.println("Кот " + this.getName() + " не смог поесть, т.к. не достаточно еды в тарелке. " + this.getName() + " голоден и печален. ):");
        }
    }
}
