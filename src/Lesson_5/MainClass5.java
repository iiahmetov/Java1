package Lesson_5;

public class MainClass5 {
    public static void main(String[] args) {
        //Создал массив объектов класса Employee
        Employee[] Squad = new Employee[5];
        //Прописал каждого сотрудника
        Squad[0] = new Employee("Пупкин Иннокентий Иванович", "Начальник отдела", "pupkin@mail.ru", "+79051234567", 70000, 55);
        Squad[1] = new Employee("Петров Пётр Петрович", "Инженер 2к", "petrov@mail.ru", "+79061234567", 45000, 27);
        Squad[2] = new Employee("Сидоров Сидор Сидорович", "Инженер 3к", "sidorov@mail.ru", "+79151234567", 40000, 25);
        Squad[3] = new Employee("Иванов Василий Фёдорович", "Инженер 1к", "ivanov@mail.ru", "+79161234567", 50000, 41);
        Squad[4] = new Employee("Пупкин Александр Иннокентиевич", "Инженер 1к", "pupkin1992@mail.ru", "+79251234567", 55000, 22);
    //запустил проверку по параметру возраст
    AgeTest(Squad, 40);
    }

    public static void AgeTest(Employee[] dude, int age) {
        for (int i = 0; i < dude.length; i++) {              //цикл по всему массиву
            if (dude[i].getAge() > age) {                    //проверка по параметру возраста через геттер
                dude[i].info();                              //обращение к встроенному методу класса
                System.out.println();                        //пропуск строки для разделения работников, удовлетворяющих параметру поиска
            }
        }
    }

}