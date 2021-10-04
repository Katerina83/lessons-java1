package Massivy;
import java.util.Arrays;
public class Massivy {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        int[] costs = generateRandomArray();
        int sum = 0;
        for (int element : costs) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    private static void task2() {
        Arrays.sort(generateRandomArray());
        int[] costs = generateRandomArray();
        System.out.println("Минимальная сумма трат за день составила " + costs[0] + " рублей. Максимальная сумма трат за день составила " + costs[costs.length - 1] + " рублей.");
    }

    private static void task3() {
        int[] costs = generateRandomArray();
        int sum = 0;
        for (int element : costs) {
            sum += element;
        }
        double averageMonthlyAmount = sum / costs.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonthlyAmount + " рублей.");
    }

    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    private static void task5() {
        System.out.println();
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((i == j) || (j == matrix[0].length - i - 1)) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}