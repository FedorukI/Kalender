import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Switch case
        System.out.println("Введите день текущий день недели: ");
        String dayOfWeek = scanner.nextLine().toLowerCase(Locale.ROOT);

        switch (dayOfWeek) {
            case "monday":
                System.out.println("Сегодня понедельник");
                break;
            case "tuesday":
                System.out.println("Сегодня вторник");
                break;
            case "wednesday":
                System.out.println("Сегодня среда");
                break;
            case "thursday":
                System.out.println("Сегодня четверг");
                break;
            case "friday":
                System.out.println("Сегодня пятнца");
                break;
            case "saturday":
                System.out.println("Сегодня суббота.");
                break;
            case "sunday":
                System.out.println("Сегодня воскресенье.");
                break;
            default:
                System.out.println("Некорректный ввод. Введите день недели на английском.");

        }


                // Часть 2: Использование if-else
                System.out.print("Введите день недели: ");
                dayOfWeek = scanner.nextLine().toLowerCase(Locale.ROOT);

                if (dayOfWeek.equals("monday")) {
                    System.out.println("Сегодня понедельник.");

                } else if (dayOfWeek.equals("tuesday")) {
                    System.out.println("Сегодня вторник.");

                } else if (dayOfWeek.equals("wednesday")) {
                    System.out.println("Сегодня среда.");

                } else if (dayOfWeek.equals("thursday")) {
                    System.out.println("Сегодня четверг.");

                } else if (dayOfWeek.equals("friday")) {
                    System.out.println("Сегодня пятница.");

                } else if (dayOfWeek.equals("saturday")) {
                    System.out.println("Сегодня суббота.");

                } else if (dayOfWeek.equals("sunday")) {
                    System.out.println("Сегодня воскресенье.");

                } else {
                    System.out.println("Некорректный ввод. Введите день недели на английском.");
                }


        }


    }
