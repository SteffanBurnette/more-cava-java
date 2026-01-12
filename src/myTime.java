import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class myTime {

    public static void main(String [] args){

        //Working with Dates & Times in java
        // LocalDate, LocalTime, LocalDateTime, UTC timestamp

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();



        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        //Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        //Custom date
        LocalDate date2 = LocalDate.of(2024, 12, 25);
        System.out.println(date2);

        //Custom dateTime
        LocalDateTime date3 = LocalDateTime.of(2025, 1, 12, 2, 39, 35);
        System.out.println(date3);

        if(date.isBefore(date2)){
            System.out.println("Date is before date 2");
        }
        else if (date.isAfter(date2)){
            System.out.println("Date is after date 2");
        }
        else if(date.isEqual(date2)){
            System.out.println("Both dates are equal");
        }
    }
}
