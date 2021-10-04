package LessonMetody;
import java.time.LocalDate;
import java.util.Arrays;

public class LessonMetody {
    public static void main(String[] args) {
        //task1
        int year = 2008;
        checkMonth(year);
        //task2
        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        outputVersion(clientOS, clientDeviceYear);
        //task3
        int deliveryDistance = 90;
        System.out.println("Необходимо подождать: " + considerDeliveryDistance(deliveryDistance) + " дня/дней.");
        //task4
        String alphabetOrder = "aabccddefgghiijjkk";
        checkingDuplicates(alphabetOrder);
        //task5
        int [] arr = {3, 2, 1, 6, 5};
        reverseOrderElements(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void checkMonth(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    public static void outputVersion(int clientOS, int liteNeed) {
        if (clientOS == 1) {
            if (liteNeed < 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        } else {
            if (liteNeed > 2019) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        }
    }

    public static int considerDeliveryDistance(int distance) {
        int daysForDelivery = 1;
        if (distance > 20) {
            daysForDelivery += 1;
            if (distance > 60) {
                daysForDelivery += 1;
            }
        }
        return daysForDelivery;
    }

    public static void checkingDuplicates(String s) {
        char [] n = s.toCharArray();
        for (int i = 0; i < (s.length() - 1); i++){
            if (n[i] == n[i + 1]) {
                System.out.println("Есть дубль символа - " + n[i] + " в строке! Цикл прерван.");
                return;
            }
        }
        System.out.println("Дубли не найдены. Цикл завершен!");
    }

    public static void reverseOrderElements(int[] ret) {
        int c;
        for (int i = 0; i < (ret.length / 2); i++) {
            c = ret[i];
            ret[i] = ret[ret.length - i - 1];
            ret[ret.length - i - 1] = c;
        }
    }
}
