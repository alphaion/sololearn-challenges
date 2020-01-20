import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import static java.time.temporal.ChronoUnit.DAYS;

public class DaysBetweenDates {
                                  
    public static void main(String[] args) {
        final var formatter = DateTimeFormatter
                                  .ofLocalizedDate(FormatStyle.LONG)
                                  .withLocale(Locale.US);
        final var input = new Scanner(System.in);
        final var firstDate = LocalDate.parse(input.nextLine(), formatter);
        final var secondDate = LocalDate.parse(input.nextLine(), formatter);
        input.close();
        
        long days = firstDate.until(secondDate, DAYS);
        
        System.out.println(days);
    }
}