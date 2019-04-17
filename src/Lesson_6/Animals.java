package Lesson_6;

import java.util.Random;

abstract class Animals {                                    //Объявляю абстрактный класс Животное

    String name;                                            //объявляю параметры
    private int runDistance;
    private double jumpHeight;
    private int swimDistance;

    public Animals(String name) {this.name = name;}         //Создаю конструктор с единственным параметром (Имя)

    public void setRunDistance(int runDistance) {           //Создаю сеттеры для 3 оставшихся параметров
        this.runDistance = runDistance;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    public int getRunDistance() {return runDistance;}       //Создаю геттеры для 3 оставшихся параметров

    public double getJumpHeight() {return jumpHeight;}

    public int getSwimDistance() {return swimDistance;}

    public void info(){                                      //Создаю метод, выводящий информацию об объекте в консоль
        System.out.println("Характеристики участника " + this.name);
        System.out.println("Дистанция бега: " + this.getRunDistance() + "м");
        System.out.println("Высота прыжка: " + this.getJumpHeight() + "м");
        System.out.println("Дистанция заплыва: " + this.getSwimDistance() + "м");
    }

    public void run (Obstacle obstacle){                         //Создаю метод по параметру бег, с привязкой к объекту Препятствие
        if (this.runDistance >= obstacle.getTrack()) {
            System.out.println(this.name + ", участник в забеге на " + obstacle.getTrack() + " метров, успешно финишировал!");
        } else System.out.println(this.name + ", участник в забеге на " + obstacle.getTrack() + " метров, словил МакКонахи и сошёл с дистанции!");
    }

    public void jump (Obstacle obstacle){                       //Создаю метод по параметру прыжок,  с привязкой к объекту Препятствие
        if (this.jumpHeight >= obstacle.getWall()) {
            System.out.println(this.name + ", подошёл к " + obstacle.getWall() + " метровому препятствию и с лёгкостью его преодолел!");
        } else System.out.println(this.name + ", подошёл к " + obstacle.getWall() + " метровому препятствию...умный гору обойдёт. Препятствие не взято!");
    }

    public void swim (Obstacle obstacle){                        //Создаю метод по параметру заплыв, с привязкой к объекту Препятствие
        if (this.swimDistance >= obstacle.getSwimmingPool()) {
            System.out.println(this.name + ", участник заплыва на " + obstacle.getSwimmingPool() + " метров, справился и вышел сухим из воды!");
        } else System.out.println(this.name + ", участник заплыва на " + obstacle.getSwimmingPool() + " метров, нырнул, но где он? Зовите спасателей, он не справился!");
    }

}

class Cat extends Animals {                                 //Создаю класс Кот, наследник класса Животное
    public Cat(String name) {
        super(name);
    }

    public void setCatsSPECIAL (){                          //Создаю метод, определяющий характеристики объекта класса Кот
        Random rand = new Random();
        this.setRunDistance((rand.nextInt(11)+15)*10);  //бег 150-250 метров сшагом в 10 метров
        this.setJumpHeight((rand.nextInt(11)+15.0)/10); //прыжок 1,5-2,5 метра с шагом в 0,1 метра
        this.setSwimDistance(0);                                //плавать не умеет - 0 метров
    }

    @Override
    public void info() {                                    //Переопределил метод info для класса Кот, т.к. коты не умеют плавать
        System.out.println("Характеристики участника " + this.name);
        System.out.println("Дистанция бега: " + this.getRunDistance() + "м");
        System.out.println("Высота прыжка: " + this.getJumpHeight() + "м");
        System.out.println("Дистанция заплыва: коты не умеют плавать ):");
    }

    @Override
    public void swim(Obstacle obstacle) {                        //Переопределил метод swim для класса Кот, т.к. коты не умеют плавать
        System.out.println("Кто бросил кота в " + obstacle.getSwimmingPool() +" метровый бассейн?! Коты не умеют плавать! Бедняга " + this.name + "!");
    }
}

class Dog extends Animals{                                   //Создаю класс Пёс, наследник класса Животное
    public Dog(String name) {
        super(name);
    }

    public void setDogsSPECIAL (){                          //Создаю метод, определяющий характеристики объекта класса Пёс
        Random rand = new Random();
        this.setRunDistance((rand.nextInt(21)+40)*10);  //бег 400-600 метров сшагом в 10 метров
        this.setJumpHeight((rand.nextInt(6)+5.0)/10);   //прыжок 0,5-1 метр с шагом в 0,1 метра
        this.setSwimDistance(rand.nextInt(11)+5);       //плаванье 5-15 метров с шагом в 1 метр
    }
}