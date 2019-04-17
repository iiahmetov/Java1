package Lesson_5;

public class Employee {             //создаю класс сотрудников
    private String fio;                     //прописываю параметры сотрудников
    private String position;
    private String email;
    private String phonenumber;
    private int wage;
    private int age;

public void info(){                                             //написан метод, выводящий информацию об объекте в консоль
    System.out.println("ФИО сотрудника: " + this.fio);
    System.out.println("Должность: " + this.position);
    System.out.println("Электронная почта: " + this.email);
    System.out.println("Номер телефона: " + this.phonenumber);
    System.out.println("Заработная плата: " + this.wage);
    System.out.println("Возраст: " + this.age);
}

    public Employee(String fio, String position, String email, String phonenumber, int wage, int age) {   //сгенерировал конструктор класса
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.wage = wage;
        this.age = age;
    }
public int getAge(){
    return this.age;
}

}
