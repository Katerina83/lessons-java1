package LessonStrings;

import java.util.Locale;

public class LessonStrings {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        String fullName = "Ivanov Ivan Ivanovich";
        String[] words = fullName.split(" ");
        String lastName = words[0];
        String firstName = words[1];
        String middleName = words[2];
        System.out.println("ФИО сотрудника – " + lastName + " " + firstName + " " + middleName);
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpperCase = fullName.toUpperCase(Locale.ROOT);
        String[] words = fullNameUpperCase.split(" ");
        String lastName = words[0];
        String firstName = words[1];
        String middleName = words[2];
        System.out.println("Данные ФИО сотрудника для заполнения отчета –  " + lastName + " " + firstName + " " + middleName);
    }

    private static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";
        String[] words = fullName.split(" ");
        String lastName = words[0];
        String firstName = words[1];
        String middleName = words[2];
        System.out.println("Данные ФИО сотрудника для административного отдела –  " + lastName + ";" + firstName + ";" + middleName);
    }
    private static void task4() {
        String fullName = "Иванов Семён Семёнович";
        String fullName2 = fullName.replace('ё', 'е');
        String[] words = fullName2.split(" ");
        String lastName = words[0];
        String firstName = words[1];
        String middleName = words[2];
        System.out.println("Данные ФИО сотрудника –  " + lastName + " " + firstName + " " + middleName);
    }
}
