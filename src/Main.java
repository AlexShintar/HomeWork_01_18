public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray(int arrayLength, int arrayMin, int arrayMax) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[arrayLength];
        arrayMax = arrayMax - arrayMin;
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = random.nextInt(arrayMax) + arrayMin;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray(30, 100_000, 200_000);
        int totalMonth = 0;
        for (int current : arr) {
            totalMonth += current;
        }
        System.out.println("Сумма трат за месяц составила " + totalMonth + " рублей");
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int[] arr = generateRandomArray(30, 100_000, 200_000);
        int minimumSpending = arr[0], maximumSpending = 0;
        for (int current : arr) {
            if (minimumSpending > current) {
                minimumSpending = current;
            }
            if (maximumSpending < current) {
                maximumSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumSpending + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maximumSpending + " рублей.");
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int[] arr = generateRandomArray(30, 100_000, 200_000);
        int totalMonth = 0;
        for (int current : arr) {
            totalMonth += current;
        }
        float averageSpending = (float) totalMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int arrLength = reverseFullName.length;
        for (int i = 0; i < (arrLength + 1) / 2; i++) {
            char current = reverseFullName[i];
            reverseFullName[i] = reverseFullName[arrLength - i - 1];
            reverseFullName[arrLength - i - 1] = current;
        }
        for (char current : reverseFullName) {
            System.out.print(current);
        }
    }
}