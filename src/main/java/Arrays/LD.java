package Arrays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LD {
    public static void main(String[] args) {
        LocalDate myObect = LocalDate.now();
        System.out.println(myObect);

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(myDateTime.format(myFormat));
    }
}
