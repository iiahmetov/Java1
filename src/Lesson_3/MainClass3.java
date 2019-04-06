package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class MainClass3 {
    public static void main(String[] args) {
        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        ugadajka();

    }

    public static void ugadajka() {
        Random rand = new  Random();                                        //создал объект генератор случайных чисел
        Scanner sc = new Scanner(System.in);                                //создал объект сканер
        boolean flag = false;                                               //создал флаг (условие выхода из игры)
        do {                                                                //запустил цикл с постусловием
            int x = rand.nextInt(10);                               //сгенерировал случайное число от 0 до 9
            System.out.println("Угадайте число от 0 до 9.");
            int i = 0;                                                      //счётчик попыток
            while (i < 3) {
                System.out.println((i+1) + " попытка!");                    //вывел номер попытки
                int ans = sc.nextInt();                                     //сканирую ответ
                if (ans == x) {                                             //сравниваю ответ игрока со сгенерированным числом
                    System.out.println("Вы угадали!");
                    break;                                                  //в случае верного ответа прерываю цикл (не уверен что такое прерывание является красивым решением)
                } else if (ans > x) {
                    System.out.println("Загаданное число меньше.");
                } else {
                    System.out.println("Загаданное число больше.");
                }
                i++;
                if (i == 3) {                                               //проверка числа попыток и вывод сообщения о проигрыше в случае исчерпания попыток
                    System.out.println("Попытки закончились! Вы проиграли. ):");
                }
            }
            System.out.println("Another round? (0 - nope, 1 - hell yeah!)");//по завершении 3 попыток предлагаю сыграть ещё
            int again = sc.nextInt();
            if (again == 0) {
                flag = true;                                                //в случае отказа устанавливаю положение флага таковым, чтобы игра завершилась
            }
        } while (flag == false);                                            //проверяю условие продолжения игры
        sc.close();                                                         //закрываю сканер
    }

//    public static void
}

