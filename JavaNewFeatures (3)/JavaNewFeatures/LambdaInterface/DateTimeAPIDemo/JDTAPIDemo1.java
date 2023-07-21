package DateTimeAPIDemo;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class JDTAPIDemo1 {

    public static void main(String[] args) {

        Clock myClock = Clock.systemDefaultZone();

        long milisec = myClock.millis();

        System.out.println(milisec);

        LocalDateTime curretTime = LocalDateTime.now();
        System.out.println(curretTime);

        LocalDate curretDate = curretTime.toLocalDate();
        System.out.println(curretDate);

        System.out.println("Current Date and Time  :: " + curretTime);
        System.out.println("YEAR : " + curretTime.getYear());
        System.out.println("MONTH : " + curretTime.getMonth());
        System.out.println("DAY : " + curretTime.getDayOfMonth());
        System.out.println("HOUR : " + curretTime.getHour());
        System.out.println("MINUTE : " + curretTime.getMinute());
        System.out.println("Second : " + curretTime.getSecond());
    }
}
