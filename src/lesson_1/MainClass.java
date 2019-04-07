package lesson_1;

public class MainClass {
    public static void main(String[] args) {
        byte b1 = 24;
        short s1 = -3965;
        int i1 = 5385687;
        long l1 = 364756768470L;

        float f1 = 9.8f;
        double d1 = 3.1415;

        char c1 = 'V';

        boolean bl1 = true;

        String st1 = "Hello, World!";

        System.out.println(calc(7,4,10,5));
        System.out.println(diapazon(11,7));
        posneg(i1);
        System.out.println(negnumb(s1));
        privet("Бобёр");
        visokos(2000);
    }

    public static int calc(int a, int b, int c, int d){
        return (a*(b+(c/d)));
    }

    public static boolean diapazon(int a, int b){
        if ((a+b) <= 20 && (a+b) > 10) {
            return (true);
        } else return (false);
    }

    public static void posneg(int a){
        if (a >= 0){
            System.out.println ("Передано положительное число");
        } else System.out.println ("Передано отрицательное число");
    }

    public static boolean negnumb(int a){
        if (a < 0) {
            return (true);
        } else return (false); /*необходимо прервать выполнение метода в случае не выполнения условия?*/
    }

    public static void privet(String a){
        System.out.println("Привет, " + a + "!");
    }

    public static void visokos(int a){
        if ((a % 400) == 0 || ((a % 4) == 0 && (a % 100) != 0)){
            System.out.println("Год " + a + " - високосный.");
        } else System.out.println("Год " + a + " - не високосный.");
    }
}
