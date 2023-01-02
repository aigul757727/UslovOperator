import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        if (age == 18) {
            System.out.println("Человеку 18 лет");
        }
        if (age > 18) {
            System.out.println("Человеку больше 18 лет");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен "
                    + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + "км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 2;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageChild = 10;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься " +
                    "на аттракционе в сопровождении взрослого");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься " +
                    "без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int place = 65;
        if (place <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else
        if (place > 60 && place <= 102) {
            System.out.println("В вагоне есть стоящие места");
        } else {
            System.out.println("В вагоне нет свободных мест");
        }

    }
    public static void task7() {
        System.out.println("Задача 7");
        int one =1;
        int two =2;
        int three =3;
        if (two>=1) {
            System.out.println("Число three больше чисел one, two и равно " + three);}
        else { System.out.println("Число three больше чисел one, two и равно " + three);}
}
}