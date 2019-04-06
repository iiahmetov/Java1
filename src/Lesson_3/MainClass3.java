package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class MainClass3 {
    public static void main(String[] args) {
        
        ugadajka();

    }

    public static void ugadajka() {
        Random rand = new  Random();                                        //создал объект генератор случайных чисел
        boolean flag = false;                                               //создал флаг (условие выхода из игры)
        do {                                                                //запустил цикл с постусловием
            int x = rand.nextInt(10);                               //сгенерировал случайное число от 0 до 9
            System.out.println("Угадайте число от 0 до 9.");
            Scanner sc = new Scanner(System.in);                            //создал объект сканер
            for (int i = 0; i < 3; i++) {                                   //запустил цикл на 3 попытки
                System.out.println((i+1) + " попытка!");                    //вывел номер попытки
                int ans = sc.nextInt();                                     //сканирую ответ
                if (ans == x) {                                             //сравниваю ответ игрока с сгенерированным числом
                    System.out.println("Вы угадали!");
                    i = 3;                                                  //в случае верного ответа устанавливаю счётчик цикла попыток на 3 (не уверен, что прямое влияние на счётчик в цикле for является правильным/красивым действием)
                } else if (ans > x) {
                    System.out.println("Загаданное число меньше.");
                } else {
                    System.out.println("Загаданное число больше.");
                }
            }
            System.out.println("Another round? (0 - nope, 1 - hell yeah!)");//по завершении 3 попыток предлагаю сыграть ещё
            int again = sc.nextInt();
            if (again == 0) {
                flag = true;                                                //в случае отказа устанавливаю положение флага таковым, чтобы игра завершилась
                sc.close();
            }
        } while (flag == false);                                            //проверяю условие продолжения игры

    }


}
