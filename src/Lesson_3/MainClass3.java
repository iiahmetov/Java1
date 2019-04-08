package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class MainClass3 {
    public static void main(String[] args) {
        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        ugadajka();
        polechudes(words);
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
//        sc.close();                                                         //закрываю сканер
    }

    public static void polechudes(String[] arr) {
        Random rand = new Random();                                                                     //создаю объект генератора случайных чисел
        Scanner sc = new Scanner(System.in);                                                            //создаю объект сканер
        boolean flag = false;                                                                           //флаг выхода из цикла
        System.out.println("Отгадайте загаданное слово.");
        int p = 0;                                                                                      //счётчик попыток
        int x = rand.nextInt(arr.length);                                                               //случайный выбор слова из массива слов
//        char [] bukv = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};     //создаю массив символов для разгадывания слова по буквам с сохраненем букв от прердыдущихх попыток
        do {
            System.out.println("Попытка " + (p+1) + ".");                                               //вывожу номер попытки
            char [] bukv = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}; //создаю массив символов для разгадывания слова по буквам без сохранения результатов предыдущей попытки
            String ans = sc.nextLine();                                                                 //считываю вариант ответа из консоли
            if (ans.equals(arr[x])) {                                                                   //проверяю угадал ли игрок слово
                System.out.println("Вы угадали!");
                flag = true;                                                                            //в случае успеха создаю условия для выхода из цикла (использовать для этого break менее "красивое" решение или нормально?)
            } else {
                System.out.println("Не угадали, но давайте посмотрим по буквам!");                      //в случае если игрок не угадал вывожу соответствующее сообщение
                for (int i = 0; i < ans.length() && i < arr[x].length(); i++) {                         //создаю цикл с количеством итераций равным длине минимального из двух слов(загаданного/названного игроком)
                    if (ans.charAt(i) == arr[x].charAt(i)) {                                            //сравниваю посимвольно ответ игрока с загаданным словом
                        bukv[i] = arr[x].charAt(i);                                                     //в случае успеха "раскрываю" букву в массиве символов
                    }
                }
                System.out.println(bukv);                                                               //вывожу разгаданные буквы
                }
            p++;                                                                                        //увеличиваю счётчик попыток на 1
        } while (flag == false);
//        sc.close();                                                                                     //закрываю объект сканер
    }
}

