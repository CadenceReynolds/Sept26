
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class convertYourBirthday {


    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(3333, 3, 3, 13, 33, 3);
        ZoneId USA = ZoneId.of("America/New_York");
        System.out.println(birthdayInParis(birthday, USA));
    }

    public static ZonedDateTime birthdayInParis(LocalDateTime date, ZoneId timeZone){
        ZonedDateTime normalDate = ZonedDateTime.of(date, timeZone);
        ZoneId paris = ZoneId.of("Europe/Paris");

        return(normalDate.withZoneSameInstant(paris));
    }
}


