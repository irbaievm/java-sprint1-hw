import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class StepTracker {
    HashMap<Integer, int[][]> stepMonDays = new HashMap<>();
    Converter convert = new Converter();
    int[][] daysStep = new int[12][30];
    int goal = 10000;

    StepTracker() {
        for (int i = 0; i < 12; i++) {
            for (int z = 0; z < 30; z++) {
                daysStep[i][z] = 0;
            }
            stepMonDays.put(i, daysStep);
        }
    }

    void printStatic() {
        while (true) {
            printStaticMenu();
            Scanner scanner = new Scanner(System.in);
            String select = scanner.next();
            if (select.equals("0")) {
                break;
            } else if (select.equals("1")) {
                cntStepDays();
            } else if (select.equals("2")) {
                printMenu();
                String month = scanner.next();
                if (month.equals("0")) {
                    break;
                } else if (month.matches("[0-9]+")) {
                    System.out.println("Общее количество шагов за указанный месяц = " +
                            totalSteps(Integer.parseInt(month)));
                } else {
                    System.out.println("Ошибка, попробуйте еще раз");
                }
            } else if (select.equals("3")) {
                maxStepMount();
            } else if (select.equals("4")) {
                printMenu();
                String month = scanner.next();
                if (month.equals("0")) {
                    break;
                } else if (month.matches("[0-9]+")) {
                    System.out.println("Среднее количество шагов за указанный месяц = " +
                            avgStepMount(Integer.parseInt(month)));
                } else {
                    System.out.println("Ошибка, попробуйте снова");
                }
            } else if (select.equals("5")) {
                printMenu();
                String month = scanner.next();
                if (month.equals("0")) {
                    break;
                } else if (month.matches("[0-9]+")) {
                    int totalSteps = totalSteps(Integer.parseInt(month));
                    System.out.println("Количество пройденных км за указанный месяц = "
                            + convert.convertToKm(totalSteps));
                } else {
                    System.out.println("Ошибка, попробуйте снова");
                }
            } else if (select.equals("6")) {
                printMenu();
                String month = scanner.next();
                if (month.equals("0")) {
                    break;
                } else if (month.matches("[0-9]+")) {
                    int totalSteps = totalSteps(Integer.parseInt(month));
                    System.out.println("Количество сожжённых килокалорий за указанный месяц = "
                            + convert.convertToKl(totalSteps));
                } else {
                    System.out.println("Ошибка, попробуйте снова");
                }
            } else if (select.equals("7")) {
                printMenu();
                String month = scanner.next();
                if (month.equals("0")) {
                    break;
                } else if (month.matches("[0-9]+")) {
                    System.out.println("Лучшая серия за указанный месяц = "
                            + bestSeries(Integer.parseInt(month)));
                } else {
                    System.out.println("Ошибка, попробуйте снова");
                }
            }
        }
    }

    void newStatic() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            String month = scanner.next();
            if (month.equals("0")) {
                break;

            } else if (month.matches("[0-9]+")) {
                System.out.println("За какое число Вы хотите добавить статистику ?");
                String day = scanner.next();
                if (day.matches("[0-9]+")) {
                    System.out.println("Укажите количество пройденных шагов в день");
                    String cntStepDay = scanner.next();
                    if (cntStepDay.matches("[0-9]+")) {
                        daysStep[Integer.parseInt(month) - 1][Integer.parseInt(day) - 1] =
                                Integer.parseInt(cntStepDay);
                        System.out.println("Информация добавлена");
                    } else {
                        System.out.println("Ошибка, неправильно указано число. Попробуйте снова");
                    }
                } else {
                    System.out.println("Ошибка, неправильно указан день. Попробуйте снова");
                }
            } else {
                System.out.println("Ошибка, неправильно указан месяц. Попробуйте снова");
            }
        }
    }

    /*количество шагов по дням*/
    void cntStepDays() {
        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            String month = scanner.next();
            if (month.equals("0")) {
                break;
            } else if (month.matches("[0-9]+")) {
                for (int i = 0; i < 30; i++) {
                    System.out.print(i + 1 + " день: " + daysStep[Integer.parseInt(month) - 1][i]);
                    if (i < 30) {
                        /*чтоб не было запятой для посл записи*/
                        System.out.print(" ,");
                    } else {
                        System.out.println("");
                    }
                }
            } else {
                System.out.println("Ошибка, попробуйте снова");
            }
        }
    }

    int totalSteps(int month) {
        int totalCnt = 0;
        for (int i = 0; i < 30; i++) {
            totalCnt = totalCnt + daysStep[month - 1][i];
        }
        return totalCnt;
    }

    void maxStepMount() {
        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            String month = scanner.next();
            int maxCnt = 0;
            if (month.equals("0")) {
                break;
            } else if (month.matches("[0-9]+")) {
                for (int i = 0; i < 30; i++) {
                    if (daysStep[Integer.parseInt(month) - 1][i] > maxCnt) {
                        maxCnt = daysStep[Integer.parseInt(month) - 1][i];
                    }
                }
                System.out.println("Максимальное количество шагов за пройденный месяц " + maxCnt);
            } else {
                System.out.println("Ошибка, попробуйте снова");
            }
        }
    }

    double avgStepMount(int month) {
        double avgCnt = 0;
        printMenu();
        avgCnt = totalSteps(month) / 30;
        return avgCnt;
    }

    int bestSeries(int month) {
        int best = 0;
        int current = 0;
        for (int i = 0; i < 30; i++) {
            if (daysStep[month - 1][i] >= goal) {
                current++;
            } else {
                if (current > best) {
                    best = current;
                }
                current = 0;
            }
            if (current > best) {
                best = current;
            }
        }
        return best;
    }

    void newGoal(int newGoal) {
        goal = newGoal;
        System.out.println("Количество шагов для цели изменено");

    }

    void printMenu() {
        System.out.println("Выберите месяц:");
        System.out.println("1. Январь");
        System.out.println("2. Февраль");
        System.out.println("3. Март");
        System.out.println("4. Апрель");
        System.out.println("5. Май");
        System.out.println("6. Июнь");
        System.out.println("7. Июль");
        System.out.println("8. Август");
        System.out.println("9. Сентябрь");
        System.out.println("10. Октябрь");
        System.out.println("11. Ноябрь");
        System.out.println("12. Декабь");
        System.out.println("Для возврата в предыдущее меню:");
        System.out.println("Нажмите 0");
    }

    void printStaticMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1. Количество шагов по дням;");
        System.out.println("2. Общее количество шагов за месяц;");
        System.out.println("3. Максимальное пройденное количество шагов в месяце;");
        System.out.println("4. Среднее количество шагов пройденных в месяце;");
        System.out.println("5. Количество пройденных КМ за месяц");
        System.out.println("6. Количество сожжённых килокалорий за месяц");
        System.out.println("7. Лучшая серия: максимальное количество подряд идущих дней, " +
                "в течении которых количество шагов за день было выше целевого");
        System.out.println("0. Для возврата в предыдущее меню;");
    }
}


