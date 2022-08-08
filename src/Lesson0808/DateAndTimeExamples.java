package Lesson0808;

import java.time.*;
import java.time.temporal.IsoFields;

public class DateAndTimeExamples {
    public static void main(String[] args) {

        //Local time
        //with nano rasom reiksme 0, kad nebutu rodomos mili sekundes
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Now is: " + localTime);
        System.out.println(localTime.getHour() + "/" + localTime.getMinute() + "/" + localTime.getSecond());
        System.out.printf("%d/%d/%d \n", localTime.getHour(),localTime.getMinute(),localTime.getSecond());

        LocalTime localTime1 = LocalTime.now().withNano(0).withNano(0);
        System.out.println(localTime1);

        //pridedam pavyzdziui 15 minuciu
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until: " + localTime1);

        //local date
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is " + localDate);
        //only year
        System.out.println("Year is: " + localDate.getYear());
        //day of the week
        System.out.println("Day of the week " + localDate.getDayOfWeek());
        //day of the year
        System.out.println("Day of the year " + localDate.getDayOfYear());
        //week of the year
        System.out.println("Week of the year " + (localDate.getDayOfYear()/7 + 1));
        System.out.println("Week of the year " + localDate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));

        //create our date
        LocalDate localDate1 = LocalDate.of(2019, Month.DECEMBER, 11);
        System.out.println("Covid first case date was: " + localDate1);

        //combination time and date
        //LocalTimeDate
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time now: " + localDateTime);

        //sukurti savo data ir laika LocalDateTime.of
        LocalDateTime firstInternationalCatsDay = LocalDateTime.of(1997, 11, 20, 10, 45, 25, 0);
        System.out.println("International Cat's day was started on: " + firstInternationalCatsDay);
        //gets numeric value
        int currentMonth = firstInternationalCatsDay.getMonth().getValue();

        //norim parasyti menesius savo kalba
        switch (currentMonth){
            case 11:
                System.out.println("Lapkritis");
                break;
            default:
                System.out.println("November");
                break;
        }

        //Duration - naudojam su laiku kai norim gauti laika tam tikru formatu
        //patogu naudoti kai reikia  kiek valandoje yra minuciu
        System.out.println(Duration.ofHours(10).toMinutes());
        //apskaiciuojam tam tikra laiko tarpa
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes());
        //kiek minuciu praejo nuo tam tikros datos iki tam tikros datos
        System.out.println(Duration.between(firstInternationalCatsDay, LocalDateTime.now()).toMinutes());

        //Period - didesniai laiko apimciai
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(160)).getMonths());

    }
}
