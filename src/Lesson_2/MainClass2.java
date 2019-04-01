package Lesson_2;

import java.util.Arrays;

public class MainClass2 {
    public static void main(String[] args) {
    int [] arr1 = {1, 0, 0, 0, 1, 1, 0, 1, 1, 0};
    int [] arr2 = new int[8];
    int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(invertmass(arr1)));

    System.out.println(Arrays.toString(zapolnenie(arr2)));

    System.out.println(Arrays.toString(arr3));
    System.out.println(Arrays.toString(preobrazov(arr3)));

    }

    public static int [] invertmass(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {a[i] = 1;
            } else a[i] = 0;
        }
        return (a);
    }

    public static int [] zapolnenie(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 3;
        }
        return (a);
    }

    public static int [] preobrazov(int[] a) {
        for (int i = 0; i < a.length ; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }
        return (a);
    }


}
