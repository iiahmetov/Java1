package Lesson_2;

import java.util.Arrays;

public class MainClass2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 0, 1, 1, 0, 1, 1, 0};
        int[] arr2 = new int[8];
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] matr1 = new int[6][6];
        int[] arr4 = {3, 1, 1, 2, 1};
        int[] arr5 = {1, 2, 3, 4, 5, 6};


        //Задание 1
        System.out.println(Arrays.toString(arr1));              //вывожу исходный массив
        System.out.println(Arrays.toString(invertmass(arr1)));  //вывожу преобразованнвый массив

        //Задание 2
        System.out.println(Arrays.toString(zapolnenie(arr2)));

        //Задание 3
        System.out.println(Arrays.toString(arr3));              //вывожу исходный массив
        System.out.println(Arrays.toString(preobrazov(arr3)));  //вывожу преобразованный массив

        //Задание 4
        for (int i = 0; i < matr1.length; i++) {
            System.out.println(Arrays.toString(matr1[i]));
        }                                                       //вывожу исходную матрицу
        System.out.println();                                   //пропуск строки чтобы отделить от преобразованной матрицы
        diagonali(matr1);
        for (int i = 0; i < matr1.length; i++) {
            System.out.println(Arrays.toString(matr1[i]));
        }                                                       //вывод преобразованной матрицы

        //Задание 5
        System.out.println(Arrays.toString(arr3));              //вывожу исходный массив
        minmax(arr3);

        //Задание 6
        System.out.println(Arrays.toString(arr4));              //вывожу исходный массив
        checkBalance(arr4);

        //Задание 7
        System.out.println(Arrays.toString(arr5));              //вывожу исходный массив
        System.out.println(Arrays.toString(smeschenie(arr5, -2)));  //вывожу преобразованный массив

    }

    //Решение задания 1
    public static int [] invertmass(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {a[i] = 1;
            } else a[i] = 0;
        }
        return (a);
    }

    //Решение задания 2
    public static int [] zapolnenie(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 3;
        }
        return (a);
    }

    //Решение задания 3
    public static int [] preobrazov(int[] a) {
        for (int i = 0; i < a.length ; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }
        return (a);
    }

    //Решение задания 4
    public static int [][] diagonali(int[][] a){
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][a.length-1-i] = 1;
        }
        return (a);
    }

    //Решение задания 5
    public static void minmax(int[] a){
        int min = a[0], max = a[0];
        for (int i = 0; i < a.length ; i++) {
            if (a[i] < min){
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Минимальное значение в массиве равно " + min + ".");
        System.out.println("Минимальное значение в массиве равно " + max + ".");
    }

    //Решение задания 6
    public static void checkBalance(int[] a){
        double sum = 0;                                         //создан параметр суммы массива
        for (int i = 0; i < a.length; i++) {
            sum += a[i];                                        //просуммировал все элементы массива
        }
        double half = sum/2;                                    //вычислил половину суммы элементов массива
        boolean flag = false;                                   //создал переменную с ответом по-умолчанию "ложный"
        for (int i = 0; i < a.length; i++) {
            sum -= a[i];
            if (half == sum) flag = true;                       //проверяю выполнение условия и в случае успеха переменная с ответом = "истинная"
        }
        System.out.println(flag);
    }

    //Решение задания 7
    public static int[] smeschenie(int[] a, int n){
        if (n > 0) {
            for (int i = a.length-1; i >= n ; i--) {
                a[i] = a[i-n];
            }
            for (int i = 0; i < n ; i++) {
                a[i] = 0;
            }
        } else {
            for (int i = 0; i < a.length + n; i++) {
                a[i] = a[i-n];
            }
            for (int i = a.length - 1; i >= a.length + n ; i--) {
                a[i] = 0;
            }
        }
        return (a);
    }

}
