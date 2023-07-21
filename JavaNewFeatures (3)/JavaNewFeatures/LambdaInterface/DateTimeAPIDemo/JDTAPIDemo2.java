package DateTimeAPIDemo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class JDTAPIDemo2 {
    public static void main(String[] args) {

        modifyDate();
        // differenceDate();
    }

    public static void modifyDate() {
        LocalDate myDate = LocalDate.now();

        System.out.println("2 Years after current date " + myDate.plusYears(2));
        System.out.println("2 Days after current date " + myDate.plusDays(2));
        System.out.println("2 Months after current date " + myDate.plusMonths(2));

    }

    public static void differenceDate() {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Asia/Kolkata");

        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());

        LocalTime z1time = LocalTime.now(zone1);
        LocalTime z2time = LocalTime.now(zone2);

        System.out.println(z1time);
        System.out.println(z2time);

        System.out.println(ChronoUnit.HOURS.between(z1time, z2time));
        System.out.println(ChronoUnit.MINUTES.between(z1time, z2time));

        if (z1time.isBefore(z2time)) {
            System.out.println("Before");
        } else {
            System.out.println("After");
        }
    }

}
