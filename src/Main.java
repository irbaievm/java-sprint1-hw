import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker();


        while (true) {
            printMenu();
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
            ArrayList<Integer> array = new ArrayList<>();

            int command = scanner.nextInt();

            if (command == 1) {
                tracker.newStatic();
            } else if (command == 2) {
                tracker.printStatic();
            } else if (command == 3) {
                System.out.println("Введите количество шагов для новой цели: ");
                int newGoal = scanner.nextInt();
                tracker.newGoal(newGoal);

            } else if (command == 0) {
                break;
            } else {
                System.out.println("Такой команды не существует");
            }
        }

    }

    public static void printMenu() {
        System.out.println("1. Введите количество шагов за определённый день");
        System.out.println("2. Показать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("0. Выход из приложения");
    }
}
