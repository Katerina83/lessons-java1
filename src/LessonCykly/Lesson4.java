package LessonCykly;

public class Lesson4 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task1() {
        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
    }

    private static void task2() {
        System.out.println();
        for (int friday = 6; friday < 31; friday = friday +=7) {
            System.out.println("Сегодня пятница, " + friday + "-ое число. Необходимо подготовить отчет.");
        }
    }

    private static void task3() {
        System.out.println();
        int thisYear = 2021;
        int lastCentury = thisYear - 200;
        int futureCentury = thisYear + 100;
        for (int i = lastCentury; i <= futureCentury; i++) {
            if (i % 79 ==0) {
                System.out.println(i);
            }
        }
    }
    private static void task4() {
        System.out.println();
        for (int n = 1; n <= 30; n++) {
            System.out.print(n + ":");
            if (n % 3 == 0) {
                System.out.print(" ping ");
            }
            if (n % 5 == 0) {
                System.out.print(" pong ");
            }
            System.out.println();
        }
    }
    private static void task5() {
        System.out.println();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= 8; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
