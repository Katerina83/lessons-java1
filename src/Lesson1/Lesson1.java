package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    private static void task1() {
        int clientOS = 1;//задача 1
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }

    private static void task2() {
        int clientOS = 1;//задача 2
        int clientDeviceYear = 2015;
        boolean liteNeed = clientDeviceYear < 2019;
        if (clientOS == 1) {
            if (liteNeed) {
                System.out.println("Установите lite-версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        } else {
            if (liteNeed) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        }
    }
    private static void task3() {
        int year = 2008; //задача 3
        if ((year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не является високосным годом.");
        }
    }
        private static void task4(){
        int deliveryDistance = 95;
        int numberOfDaysForDelivery = 1;
        if (deliveryDistance > 20) {
            numberOfDaysForDelivery++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            numberOfDaysForDelivery++;
            System.out.println("Потребуется дней: " + numberOfDaysForDelivery);
        }
    }

    private static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
             default:
                System.out.println("Такого сезона не существует");
        }
    }
    private static void task6() {
        int age = 19;
        int salary = 58_000;
        double limit;
        if (age < 23) {
            limit = salary * 2;
        } else {
            limit = salary * 3;
        }
        if (salary >= 50_000) {
            limit = salary * 1.2;
        } else if (salary > 80_000) {
            limit = salary * 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }
    private static void task7() {
        int borrowerAge = 25;//задача 7
        int borrowerSalary = 60_000;
        int wantedSum = 330_000;
        int maxMonthlyPayment = borrowerSalary / 2;
        int date = 12;
        float baseRate = 10;
        if (borrowerAge < 23) {
            baseRate++;
        } else if (borrowerAge < 30) {
            baseRate += 0.5;
        }
        if (borrowerSalary >80_000) {
            baseRate-=0.7;
        }
        float creditSum = wantedSum * (1+(baseRate / 100));
        float payment = creditSum / date;
        System.out.println("Ваш максимальный платеж: " + maxMonthlyPayment + " Платеж по кредиту:" + payment);
        if (payment > maxMonthlyPayment) {
            System.out.println("Отказано.");
        } else {
            System.out.println("Ообрено");
        }
    }

}

