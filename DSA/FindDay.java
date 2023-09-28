import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
public class Months {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        Calendar calendar = Calendar.getInstance();

        calendar.set(year, month - 1, day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // System.out.println(dayOfWeek);

        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        System.out.println(daysOfWeek[dayOfWeek - 1]);

    }

}
