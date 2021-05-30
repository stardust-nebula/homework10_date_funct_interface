package dates;
import java.text.SimpleDateFormat;

/**
 * Программа реализует метод, который возвращает на консоль день недели по указанной дате.
 * Программа реализует метод, который возвращает на консоль дату ближайшего дня недели, который был указан.
 */

public class Runner {

    public static void main(String[] args) {

        String customDate = "05.30.2021";
        String datePattern = "MM.dd.yyyy";
        String nextDayOfWeek = "monday";
        SimpleDateFormat customDateFormat = new SimpleDateFormat(datePattern);

        System.out.println("День недели по заданной дате (" + customDate + "): ");
        DateMethodsExecution.getDatOfWeekByDate(customDate, customDateFormat);

        System.out.println("Дата ближайшего указанного дня недели (" + nextDayOfWeek + "): ");
        DateMethodsExecution.getNextDayOfWeek("monday", datePattern);
    }
}
