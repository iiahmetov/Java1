package Lesson_7;

public class MainClass7 {
    public static void main(String[] args) {
    Cat [] cats = {                                                 //создаю массив объектов коты
            new Cat ("Барсик", 12),                  //задаю параметры трёх котов
            new Cat ("Гав", 15),
            new Cat ("Мурзик", 10)
    };
    Plate plate = new Plate("Небольшая миска", 23);     //создаю объект Тарелка
    plate.info();                                                   //вывожу информацию о количестве еды в тарелке
    for (int i = 0; i < cats.length ; i++) {                        //цикл для комления котов
            cats[i].eat(plate);                                     //кот пытается поесть
            cats[i].info();                                         //информация о сытости кота
            plate.info();                                           //информация о наполненности тарелки
    }
    plate.fillPlate(15);                                        //пополняем тарелку едой
    }

}
