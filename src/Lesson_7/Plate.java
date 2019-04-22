package Lesson_7;

public class Plate {                                //класс Тарелка
    private String name;                            //параметр Имя
    private int food;                               //параметр количество еды

    public Plate(String name, int food) {           //билдер объекта Тарелка
        this.name = name;
        this.food = food;
    }

    public String getName() {                       //геттер имени
        return name;
    }

    public int getFood() {                          //геттер количества еды
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }   //сеттер количества еды

    public void consumption (Cat cat){                      //метод Поедания
        this.food -= cat.getAppetite();                     //вычитает из параметра Количество еды параметр Аппетит кота
    }

    public void info (){                                    //метод информации о количестве еды в тарелке
        System.out.println("В " + this.getName() + " " + this.getFood() + " у.е. еды.");
    }

    public void fillPlate (int food){                       //метод наполнения тарелки едой
        int x = this.getFood();
        x += food;
        this.setFood(x);
        System.out.println("Вы положили в " + this.getName() + " " + food + " у.е. еды и теперь в ней " + this.getFood() + " у.е. еды.");
    }

}
