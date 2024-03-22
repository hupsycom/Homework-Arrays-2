public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        System.out.println("Задача №1");

        int[] total = new int[5];
        total[0] = 12765;
        total[1] = 44555;
        total[2] = 25700;
        total[3] = 39555;
        total[4] = 13100;
        int sum = 0;
        for (int expense : total) {
            sum += expense;
        }
        System.out.println(sum);

    }

    public static void task2() {

        System.out.println("Задача №2");
        int[] total = new int[5];
        total[0] = 12765;
        total[1] = 44555;
        total[2] = 38247;
        total[3] = 59555;
        total[4] = 8824;
        int maxExpense = Integer.MIN_VALUE;
        int minExpense = Integer.MAX_VALUE;
        for (int i = 0; i < total.length; i++) {
            if (total[i] < minExpense) {
                minExpense = total[i];
            }
            if (total[i] > maxExpense) {
                maxExpense = total[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила: " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила: " + maxExpense + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача №3");

        int[] total = new int[5];
        total[0] = 127650;
        total[1] = 44555;
        total[2] = 382478;
        total[3] = 59555;
        total[4] = 88246;
        float sum = 0;
        for (int expense : total) {
            sum += expense;
        }
        float averageWeeklyExpense = (float) sum / total.length;
        System.out.println("Средняя сумма трат за месяц составила: " + averageWeeklyExpense + " рублей.");
    }

    public static void task4() {
        System.out.println("Задача №4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        boolean space = false;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (reverseFullName[i] == ' ') {
                space = true;
            } else {
                if (space) {
                    System.out.print(" ");
                    space = false;
                }
                System.out.print(reverseFullName[i]);
            }
        }
    }


}