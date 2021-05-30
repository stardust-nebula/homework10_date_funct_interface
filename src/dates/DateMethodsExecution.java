package dates;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.*;
import java.util.*;

public class DateMethodsExecution {

    public static void getDatOfWeekByDate(String date, SimpleDateFormat customDateFormat) {
        Date dayOfWeek = null;

        try {
            dayOfWeek = customDateFormat.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String result = new SimpleDateFormat("EEEE").format(dayOfWeek);
        System.out.println(result);
    }

    public static void getNextDayOfWeek(String requestedDateOfWeek, String datePattern) {
        LocalDate today = LocalDate.now();
        LocalDate nextDayOfWeek = today.with(TemporalAdjusters.next(DayOfWeek.valueOf(requestedDateOfWeek.toUpperCase(Locale.ROOT))));
        String result = nextDayOfWeek.format(DateTimeFormatter.ofPattern(datePattern));
        System.out.println(result);
    }
}
