import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class StepTracker {
    HashMap<String, ArrayList<Integer>> stepMonDays = new HashMap<>();
    Converter convert = new Converter();
    int goal = 10000;

    ArrayList<Integer> dayJan = new ArrayList<>();
    ArrayList<Integer> dayFeb = new ArrayList<>();
    ArrayList<Integer> dayMar = new ArrayList<>();
    ArrayList<Integer> dayApr = new ArrayList<>();
    ArrayList<Integer> dayMay = new ArrayList<>();
    ArrayList<Integer> dayJun = new ArrayList<>();
    ArrayList<Integer> dayJul = new ArrayList<>();
    ArrayList<Integer> dayAug = new ArrayList<>();
    ArrayList<Integer> daySep = new ArrayList<>();
    ArrayList<Integer> dayOct = new ArrayList<>();
    ArrayList<Integer> dayNov = new ArrayList<>();
    ArrayList<Integer> dayDec = new ArrayList<>();

    StepTracker() {


        stepMonDays.put("Январь", dayJan);
        stepMonDays.put("Февраль", dayFeb);
        stepMonDays.put("Март", dayMar);
        stepMonDays.put("Апрель", dayApr);
        stepMonDays.put("Май", dayMay);
        stepMonDays.put("Июнь", dayJun);
        stepMonDays.put("Июль", dayJul);
        stepMonDays.put("Август", dayAug);
        stepMonDays.put("Сентябрь", daySep);
        stepMonDays.put("Октябрь", dayOct);
        stepMonDays.put("Ноябрь", dayNov);
        stepMonDays.put("Декабр", dayDec);

        for (int i = 1; i <= 30; i++) {
            dayJan.add(0);
            dayFeb.add(0);
            dayMar.add(0);
            dayApr.add(0);
            dayMay.add(0);
            dayJun.add(0);
            dayJul.add(0);
            dayAug.add(0);
            daySep.add(0);
            dayOct.add(0);
            dayNov.add(0);
            dayDec.add(0);
        }
    }

    void newStatic() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            int mounth = scanner.nextInt();
            if (mounth == 0) {
                break;
            } else if (mounth < 0 || mounth > 12) {
                System.out.println("Неправильно указан месяц, попробуйте еще раз");
                break;
            }

            System.out.println("За какое число Вы хотите добавить статистику ?");
            int day = scanner.nextInt();

            System.out.println("Укажите количество пройденных шагов в день");
            int cntStepDay = scanner.nextInt();

            if (mounth > 0 && mounth <= 12) {
                if (mounth == 1) {
                    dayJan.set(day - 1, cntStepDay);
                } else if (mounth == 2) {
                    dayFeb.set(day - 1, cntStepDay);
                } else if (mounth == 3) {
                    dayMar.set(day - 1, cntStepDay);
                } else if (mounth == 4) {
                    dayApr.set(day - 1, cntStepDay);
                } else if (mounth == 5) {
                    dayMay.set(day - 1, cntStepDay);
                } else if (mounth == 6) {
                    dayJun.set(day - 1, cntStepDay);
                } else if (mounth == 7) {
                    dayJul.set(day - 1, cntStepDay);
                } else if (mounth == 8) {
                    dayAug.set(day - 1, cntStepDay);
                } else if (mounth == 9) {
                    daySep.set(day - 1, cntStepDay);
                } else if (mounth == 10) {
                    dayOct.set(day - 1, cntStepDay);
                } else if (mounth == 11) {
                    dayNov.set(day - 1, cntStepDay);
                } else if (mounth == 12) {
                    dayDec.set(day - 1, cntStepDay);
                }
                System.out.println("Информация добавлена");
            } else {
                System.out.println("Ошибка. Попробуйте указать снова");
            }

        }


    }

    /*количество шагов по дням*/
    void cntStepDays() {
        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int mounth = scanner.nextInt();
            if (mounth == 0) {
                break;
            } else if (mounth < 0 || mounth > 12) {
                System.out.println("Неправильно указан месяца, попробуйте еще раз");
                break;
            } else if (mounth > 0 && mounth <= 12) {
                for (int i = 0; i < 30; i++) {
                    if (mounth == 1) {

                        System.out.print(i + 1 + " день: " + dayJan.get(i));
                        if (i < 29) {
                            /*чтоб не было запятой для посл записи*/
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 2) {
                        System.out.print(i + 1 + " день: " + dayFeb.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 3) {

                        System.out.print(i + 1 + " день: " + dayMar.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 4) {

                        System.out.print(i + 1 + " день: " + dayApr.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 5) {

                        System.out.print(i + 1 + " день: " + dayMay.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 6) {

                        System.out.print(i + 1 + " день: " + dayJun.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 7) {

                        System.out.print(i + 1 + " день: " + dayJul.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 8) {

                        System.out.print(i + 1 + " день: " + daySep.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 9) {

                        System.out.print(i + 1 + " день: " + daySep.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 10) {

                        System.out.print(i + 1 + " день: " + dayOct.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 11) {

                        System.out.print(i + 1 + " день: " + dayNov.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    } else if (mounth == 12) {

                        System.out.print(i + 1 + " день: " + dayDec.get(i));
                        if (i < 29) {
                            System.out.print(" ,");
                        } else {
                            System.out.println("");
                        }
                    }
                }

            }
        }
    }

    /* общее количество шагов*/
    int totalSteps(int mounth) {
        int totalCnt = 0;
        for (int i = 0; i < 30; i++) {
            if (mounth == 1) {
                totalCnt = totalCnt + dayJan.get(i);
            } else if (mounth == 2) {
                totalCnt = totalCnt + dayFeb.get(i);
            } else if (mounth == 3) {
                totalCnt = totalCnt + dayMar.get(i);
            } else if (mounth == 4) {
                totalCnt = totalCnt + dayApr.get(i);
            } else if (mounth == 5) {
                totalCnt = totalCnt + dayMay.get(i);
            } else if (mounth == 6) {
                totalCnt = totalCnt + dayJun.get(i);
            } else if (mounth == 7) {
                totalCnt = totalCnt + dayJul.get(i);
            } else if (mounth == 8) {
                totalCnt = totalCnt + dayAug.get(i);
            } else if (mounth == 9) {
                totalCnt = totalCnt + daySep.get(i);
            } else if (mounth == 10) {
                totalCnt = totalCnt + dayOct.get(i);
            } else if (mounth == 11) {
                totalCnt = totalCnt + dayNov.get(i);
            } else if (mounth == 12) {
                totalCnt = totalCnt + dayDec.get(i);
            }
        }
        return totalCnt;
    }

    /* метод для вызова соотвуствующих методов из категории*/
    void printStatic() {
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Количество шагов по дням;");
            System.out.println("2. Общее количество шагов за месяц;");
            System.out.println("3. Максимальное пройденное количество шагов в месяце;");
            System.out.println("4. Среднее количество шагов пройденных в месяце;");
            System.out.println("5. Количество пройденных КМ за месяц");
            System.out.println("6. Количество сожжённых килокалорий за месяц");
            System.out.println("7. Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было выше целевого");
            System.out.println("0. Для возврата в предыдущее меню;");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();

            if (select == 0) {
                break;
            } else if (select == 1) {
                cntStepDays();
            } else if (select == 2) {
                printMenu();
                int mounth = scanner.nextInt();
                if (mounth == 0) {
                    break;
                }
                System.out.println("Общее количество шагов за указанный месяц = " + totalSteps(mounth));

            } else if (select == 3) {
                maxStepMount();
            } else if (select == 4) {
                printMenu();
                int mounth = scanner.nextInt();
                if (mounth == 0) {
                    break;
                }
                System.out.println("Среднее количество шагов за указанный месяц = " + avgStepMount(mounth));
            } else if (select == 5) {
                printMenu();
                int mounth = scanner.nextInt();
                int totalSteps = totalSteps(mounth);
                if (mounth == 0) {
                    break;
                }
                System.out.println("Количество пройденных КМ за указанный месяц = " + convert.convertToKm(totalSteps));
            } else if (select == 6) {
                printMenu();
                int mounth = scanner.nextInt();
                int totalSteps = totalSteps(mounth);
                if (mounth == 0) {
                    break;
                }
                System.out.println("Количество сожжённых килокалорий за указанный месяц = " + convert.convertToKl(totalSteps));
            } else if (select == 7) {
                printMenu();
                int mounth = scanner.nextInt();
                if (mounth == 0) {
                    break;
                }
                System.out.println("Лучшая серия за указанный месяц = " + bestSeries(mounth));
            }
        }
    }

    void maxStepMount() {
        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int maxCnt = 0;
            int mounth = scanner.nextInt();
            if (mounth == 0) {
                break;
            } else if (mounth > 0 && mounth <= 12) {
                for (int i = 0; i < 30; i++) {
                    if ((mounth == 1) && (dayJan.get(i) > maxCnt)) {
                        maxCnt = dayJan.get(i);
                    } else if ((mounth == 2) && (dayFeb.get(i) > maxCnt)) {
                        maxCnt = dayFeb.get(i);
                    } else if ((mounth == 3) && (dayMar.get(i) > maxCnt)) {
                        maxCnt = dayMar.get(i);
                    } else if ((mounth == 4) && (dayApr.get(i) > maxCnt)) {
                        maxCnt = dayApr.get(i);
                    } else if ((mounth == 5) && (dayMay.get(i) > maxCnt)) {
                        maxCnt = dayMay.get(i);
                    } else if ((mounth == 6) && (dayJun.get(i) > maxCnt)) {
                        maxCnt = dayJun.get(i);
                    } else if ((mounth == 7) && (dayJul.get(i) > maxCnt)) {
                        maxCnt = dayJul.get(i);
                    } else if ((mounth == 8) && (dayAug.get(i) > maxCnt)) {
                        maxCnt = dayAug.get(i);
                    } else if ((mounth == 9) && (daySep.get(i) > maxCnt)) {
                        maxCnt = daySep.get(i);
                    } else if ((mounth == 10) && (dayOct.get(i) > maxCnt)) {
                        maxCnt = dayOct.get(i);
                    } else if ((mounth == 11) && (dayNov.get(i) > maxCnt)) {
                        maxCnt = dayNov.get(i);
                    } else if ((mounth == 12) && (dayDec.get(i) > maxCnt)) {
                        maxCnt = dayDec.get(i);
                    }
                }
                System.out.println(maxCnt);
            }
        }
    }

    double avgStepMount(int mounth) {
        double avgCnt = 0;
        printMenu();
        avgCnt = totalSteps(mounth) / 30;
        return avgCnt;
    }


    int bestSeries(int mounth) {

        int best = 0;
        int current = 0;
        if (mounth == 1) {
            for (int i = 0; i < 30; i++) {
                if (dayJan.get(i) >= goal) {
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
        }
        if (mounth == 2) {
            for (int i = 0; i < 30; i++) {
                if (dayFeb.get(i) >= goal) {
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
        }
        if (mounth == 3) {
            for (int i = 0; i < 30; i++) {
                if (dayMar.get(i) >= goal) {
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
        }
        if (mounth == 4) {
            for (int i = 0; i < 30; i++) {
                if (dayApr.get(i) >= goal) {
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
        }
        if (mounth == 5) {
            for (int i = 0; i < 30; i++) {
                if (dayMay.get(i) >= goal) {
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
        }
        if (mounth == 6) {
            for (int i = 0; i < 30; i++) {
                if (dayJun.get(i) >= goal) {
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
        }
        if (mounth == 7) {
            for (int i = 0; i < 30; i++) {
                if (dayJul.get(i) >= goal) {
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
        }
        if (mounth == 8) {
            for (int i = 0; i < 30; i++) {
                if (dayAug.get(i) >= goal) {
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
        }
        if (mounth == 9) {
            for (int i = 0; i < 30; i++) {
                if (daySep.get(i) >= goal) {
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
        }
        if (mounth == 10) {
            for (int i = 0; i < 30; i++) {
                if (dayOct.get(i) >= goal) {
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
        }
        if (mounth == 11) {
            for (int i = 0; i < 30; i++) {
                if (dayNov.get(i) >= goal) {
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
        }
        if (mounth == 12) {
            for (int i = 0; i < 30; i++) {
                if (dayDec.get(i) >= goal) {
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
        }
        return best;

    }

    void newGoal(int newGoal) {
        goal = newGoal;
        System.out.println("Количество шагов для цели изменено");

    }
    void printMenu() {
        System.out.println("Выберите месяц:");
        System.out.println("1. Янаварь");
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


}


