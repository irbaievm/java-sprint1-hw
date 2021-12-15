import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker();

        while (true) {
            printMenu();
            String command = scanner.next();

            if (command.equals("1")) {
                tracker.newStatic();
            } else if (command.equals("2")) {
                tracker.printStatic();
            } else if (command.equals("3")) {
                System.out.println("Введите количество шагов для новой цели: ");

                String newGoal = scanner.next();
                if (newGoal.matches("[0-9]+")) {
                    tracker.newGoal(Integer.parseInt(newGoal));
                } else {
                    System.out.println("Неправильно указано число, попробуйте снова");
                }

            } else if (command.equals("0")) {
                break;
            } else {
                System.out.println("Ошибка, такой команды не существует");
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
