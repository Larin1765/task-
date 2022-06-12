
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        System.out.println("Выберите опцию");
        printMenu();
        int userInput = scanner.nextInt();
        while (userInput != 0) {


            if (userInput == 1) {
                System.out.println("Введите месяц");
                String month = scanner.next();
                System.out.println("Введите дату");
                int monthDay = scanner.nextInt();
                System.out.println("Введите колличство шагов");
                int step = scanner.nextInt();
                stepTracker.putMothDate(month, monthDay, step);
                printMenu();
                userInput = scanner.nextInt();
            } else if (userInput == 2) {
                System.out.println("Статистику за какой месяц вы хотите");
                String month = scanner.next();
                stepTracker.printStepToDate(month);
                stepTracker.statisticMonth();
                printMenu();
                userInput = scanner.nextInt();
            } else if (userInput == 3) {
                System.out.println("Измените норму шагов в день");
                int dailyStepLimit = scanner.nextInt();
                stepTracker.dailyStepLimit(dailyStepLimit);
                printMenu();
                userInput = scanner.nextInt();
            } else {
                System.out.println("Такой команды нет");
                printMenu();
                userInput = scanner.nextInt();
                break;
            }

        }

        System.out.println("Программа завершенна");
    }

    private static void printMenu() {
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения.");
    }
}
