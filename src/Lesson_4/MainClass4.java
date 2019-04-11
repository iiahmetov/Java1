package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class MainClass4 {
    public static void main(String[] args) {
        InitField();
        BoardPrint();
        while (true) {
            PlayerTurn();
            BoardPrint();
            if (VictoryCondition(playerMark, pobeda_Ryad)) {
                System.out.println("Игрок победил!");
                break;
            }
            if (BoardFull()) {
                System.out.println("Ничья!");
                break;
            }
            AITurn();
            BoardPrint();
            if (VictoryCondition(aiMark, pobeda_Ryad)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (BoardFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static Random rand = new Random();
    public static Scanner scan = new Scanner(System.in);
    public static int size_X = 5;
    public static int size_Y = 5;
    public static int pobeda_Ryad = 4;
    public static char[][] field = new char[size_X][size_Y];
    public static char playerMark = 'X';
    public static char aiMark = 'O';
    public static char emptyMark = '.';

    public static void InitField (){                                    //модуль инициализации игрового поля
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = emptyMark;
            }
        }
    }

    public static void BoardPrint (){                                   //модуль прорисовки игровой доски
        System.out.println("-------------");
        for (int i = 0; i < field.length +1 ; i++) {
            if (i == 0) {
                System.out.print("| |");
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print((j+1) + "|");
                }
                System.out.println();
                System.out.println("-------------");
            } else {
                System.out.print("|" + i + "|");
                for (int j = 0; j < field[i-1].length; j++) {
                    System.out.print(field[i-1][j] + "|");
                }
                System.out.println();
                System.out.println("-------------");
            }
        }
    }

    public static boolean ValidCell(int x, int y) {                     //модуль проверки свободна ли ячейка
        if (field[x][y] == emptyMark) return true;
        return false;
    }

    public static void PlayerTurn (){                                   //модуль хода игрока
        int x, y;
        do {
            System.out.println("Введите координаты cтроки");
            x = scan.nextInt();
            System.out.println("Введите координаты столбца");
            y = scan.nextInt();
            if ((x-1) < 0 || (x-1) > size_X || (y-1) < 0 || (y-1) > size_Y || !ValidCell(x-1, y-1))
                System.out.println("Невозможен ход по данным координатам!");
            else break;
        } while (true);
        field[x-1][y-1] = playerMark;
    }

    public static boolean AIVictory (){                                     //модуль модуль, позволяющий ИИ сделать победный ход
        for (int i = 0; i < size_X ; i++) {
            for (int j = 0; j < size_Y ; j++) {
                if (ValidCell(i,j)) {
                    field[i][j] = aiMark;
                    if (VictoryCondition(aiMark, pobeda_Ryad)) {
                        return true;
                    } else {
                        field[i][j] = emptyMark;
                    }
                }
            }

        }
        return false;
    }

    public static boolean AIcounters1StepWin (){                            //модуль блокировки победного хода игрока
        for (int i = 0; i < size_X ; i++) {
            for (int j = 0; j < size_Y ; j++) {
                if (ValidCell(i,j)) {
                    field[i][j] = playerMark;
                    if (VictoryCondition(playerMark, pobeda_Ryad)) {
                        field[i][j] = aiMark;
                        return true;
                    } else {
                        field[i][j] = emptyMark;
                    }
                }
            }

        }
        return false;
    }

//    public static boolean PrioritetAI (){                                   //попытка заставить ИИ ходить ближе к центру игрового поля вместо рандомного хода
//        if (size_X%2 == 0 && size_Y%2 == 0){
//            for (int i = 0; i < size_X/2 || i < size_Y/2; i++) {
//                for (int j = size_X/2 - 1 - i; j < size_X/2 + i; j++) {
//                    for (int k = size_Y/2 - 1 - i; k < size_Y/2 + i; k++) {
//                        if (ValidCell(j,k)) {
//                            field[j][k] = aiMark;
//                            return true;
//                        }
//                    }
//                }
//            } return false;
//
//        } else if (size_X%2 != 0 && size_Y%2 != 0){
//            for (int i = 0; i < size_X/2 || i < size_Y/2; i++) {
//                for (int j = size_X/2 - i; j < size_X/2 + i; j++) {
//                    for (int k = size_Y/2 - i; k < size_Y/2 + i; k++) {
//                        if (ValidCell(j,k)) {
//                            field[j][k] = aiMark;
//                            return true;
//                        }
//                    }
//                }
//            } return false;
//
//        } else if (size_X%2 == 0 && size_Y%2 != 0) {
//            for (int i = 0; i < size_X / 2 || i < size_Y / 2; i++) {
//                for (int j = size_X / 2 - 1 - i; j < size_X / 2 + i; j++) {
//                    for (int k = size_Y / 2 - i; k < size_Y / 2 + i; k++) {
//                        if (ValidCell(j, k)) {
//                            field[j][k] = aiMark;
//                            return true;
//                        }
//                    }
//                }
//            } return false;
//
//        } else if (size_X%2 != 0 && size_Y%2 == 0) {
//            for (int i = 0; i < size_X / 2 || i < size_Y / 2; i++) {
//                for (int j = size_X / 2 - i; j < size_X / 2 + i; j++) {
//                    for (int k = size_Y / 2 - 1 - i; k < size_Y / 2 + i; k++) {
//                        if (ValidCell(j, k)) {
//                            field[j][k] = aiMark;
//                            return true;
//                        }
//                    }
//                }
//            }
//        } return false;
//    }

    private static void AIRandom (){                                    //ход ИИ в случайную свободную ячейку
        int x,y;
        do {
            x = rand.nextInt(size_X);
            y = rand.nextInt(size_Y);
            if (ValidCell(x,y)) break;
        } while (true);
        field[x][y] = aiMark;
    }

    public static boolean AIcounter2StepWin (){                         //ход ИИ, блокирующий группу меток игрока >= (условие победы -2)
        for (int i = 0; i < size_X; i++) {
            for (int j = 0; j < size_Y; j++) {
                if (ValidCell(i,j)){
                    field [i][j] = playerMark;
                    if (VictoryCondition(playerMark, pobeda_Ryad - 1)){
                        field [i][j] = aiMark;
                        return true;
                    } else field [i][j] = emptyMark;
                }
            }
        }
        return false;
    }

    public static void AITurn() {                                       //Модуль хода ИИ
        do {
            if (AIVictory()) break;                                     //1 приоритет: завершить матч победой, если это возможно в этот ход
            if (AIcounters1StepWin()) break;                            //2 приоритет: не дать игроку завершить матч, если для победы ему нужен 1 ход
            if (AIcounter2StepWin()) break;                             //3 приоритет: заблокировать потенциально опасную группу игрока
//            if (PrioritetAI()) break;                                 //4 приоритет: ставить свои фигуры ближе к центру и группой для возможной комбинации
            AIRandom();                                                 //4- приоритет: поставить фигуру в случайное свободное место
            break;
        } while (true);
    }

    public static boolean VictoryConditionHorizontal (int x, int y, char mark, int dlina){ //проверка выполнения условия победы по горизонтали
        for (int i = 0; i < dlina; i++) {
            if ((y+i) >= size_Y || field[x][y+i] != mark) return false;
        }
        return true;
    }

    public static boolean VictoryConditionVertical (int x, int y, char mark, int dlina){  //проверка выполнения условия победы по вертикали
        for (int i = 0; i < dlina; i++) {
            if ((x+i) >= size_X  || field[x+i][y] != mark) return false;
        }
        return true;
    }

    public static boolean VictoryConditionDiagonalDownward (int x, int y, char mark, int dlina){ //проверка выполнения условия победы по основной диагонали
        for (int i = 0; i < dlina; i++) {
            if ((x+i) >= size_X || (y+i) >= size_Y || field[x+i][y+i] != mark) return false;
        }
        return true;
    }

    public static boolean VictoryConditionDiagonalUpward (int x, int y, char mark, int dlina) {  //проверка выполнения условия победы по побочной диагонали
        for (int i = 0; i < dlina; i++) {
            if ((x - i) < 0 || (y + i) >= size_Y || field[x - i][y + i] != mark) return false;
        }
        return true;
    }

    public static boolean VictoryCondition (char mark, int dlina) {                                 //модуль проверки условия победы
        for (int i = 0; i < size_X; i++) {
            for (int j = 0; j < size_Y; j++) {
                if (VictoryConditionDiagonalDownward(i,j,mark,dlina) || VictoryConditionDiagonalUpward(i,j,mark,dlina) || VictoryConditionVertical(i,j,mark,dlina) || VictoryConditionHorizontal(i,j,mark,dlina))
                    return true;
            }
        }
        return false;
    }

    public static boolean BoardFull (){                                                             //проверка на наличие свободного места на доске
        for (int i = 0; i < size_X; i++) {
            for (int j = 0; j < size_Y; j++) {
                if (field[i][j] == emptyMark) return false;
            }
        }
        return true;
    }
}
