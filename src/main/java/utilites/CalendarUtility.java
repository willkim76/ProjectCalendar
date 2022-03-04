package utilites;

import org.apache.commons.text.RandomStringGenerator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class CalendarUtility {
    public static final DateTimeFormatter dateTimeFormatter =
            DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM);

    /**
     * Parses a String into a future LocalDateTime
     * @param datetime String to parse
     * @return LocalDateTime or null if String is non-parsable or null if the generated
     * LocalDateTime is before the current LocalDateTime.
     */
    public static LocalDateTime isValidFutureDateTime(String datetime) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime newDateTime = null;
        try {
            newDateTime = LocalDateTime.parse(datetime, dateTimeFormatter);
        } catch (Exception e) {
            return null;
        }

        if (newDateTime.isBefore(currentDateTime)) {
            return null;
        }
        return newDateTime;
    }

    /**
     * Crudely generates a unique random alphaNumeric String of length 8 characters
     * @return String a randomly generated string
     */
    public static String generateEventId() {
        RandomStringGenerator randomNumericGenerator =
                new RandomStringGenerator.Builder().withinRange('0', '9').build();
        RandomStringGenerator randomCapAlphaGenerator =
                new RandomStringGenerator.Builder().withinRange('A', 'Z').build();
        RandomStringGenerator randomAlphaGenerator =
                new RandomStringGenerator.Builder().withinRange('a', 'z').build();

        String scramble = randomAlphaGenerator.generate(3) +
                randomNumericGenerator.generate(3) +
                randomCapAlphaGenerator.generate(2);

        List<Character> scrambled = new ArrayList<>();
        for (int index = 0; index < scramble.length(); index++) {
            scrambled.add(scramble.charAt(index));
        }

        Collections.shuffle(scrambled);

        char[] scrambledArray = new char[scrambled.size()];
        for (int index = 0; index < scrambledArray.length; index++) {
            scrambledArray[index] = scrambled.get(index);
        }

        return new String(scrambledArray);
    }

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now().format(dateTimeFormatter));
        System.out.println(isValidFutureDateTime("March 4, 2022, 10:38:11 AM"));

    }
}
