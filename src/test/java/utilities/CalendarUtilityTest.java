package utilities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilites.CalendarUtility;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class CalendarUtilityTest {
    private DateTimeFormatter dateTimeFormatter;

    @BeforeEach
    void setup() {
        dateTimeFormatter = CalendarUtility.dateTimeFormatter;
    }

    @Test
    void isValidFutureLocalDateTime_validStringFutureDate_returnsLocalDateTime() {
        // GIVEN
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime expectedDateTime =
                currentDateTime.plus(Period.ofDays(1));

        // WHEN
        LocalDateTime actualDateTime =
                CalendarUtility.isValidFutureDateTime(expectedDateTime.format(dateTimeFormatter));

        // THEN
        assertEquals(expectedDateTime.format(dateTimeFormatter), actualDateTime.format(dateTimeFormatter),
                String.format(
                        "Expected LocalDateTime to be %s but was actually: %s",
                        expectedDateTime,
                        actualDateTime
                )
        );
    }

    @Test
    void isValidCyLocalDateTime_validStringFutureTime_returnsLocalDateTime() {
        // GIVEN
        LocalDateTime expectedDateTime = LocalDateTime.now().plusMinutes(1);

        // WHEN
        LocalDateTime actualDateTime =
                CalendarUtility.isValidFutureDateTime(expectedDateTime.format(dateTimeFormatter));

        // THEN
        assertEquals(expectedDateTime.format(dateTimeFormatter), actualDateTime.format(dateTimeFormatter),
                String.format(
                        "Expected LocalDateTime to be %s but was actually: %s",
                        expectedDateTime,
                        actualDateTime
                )
        );
    }

    @Test
    void isValidCyLocalDateTime_validStringCurrentDateTime_returnsNull() {
        // GIVEN
        LocalDateTime expectedDateTime = LocalDateTime.now();

        // WHEN
        LocalDateTime actualDateTime =
                CalendarUtility.isValidFutureDateTime(expectedDateTime.format(dateTimeFormatter));

        // THEN
        assertNull(actualDateTime,
                String.format("Expected null but was actually: %s",
                        actualDateTime
                )
        );
    }

    @Test
    void isValidFutureLocalDateTime_validStringInvalidDateTime_returnsNull() {
        // GIVEN
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime invalidDateTime = currentDateTime.minus(Period.ofDays(1));

        // WHEN
        LocalDateTime actualDateTime =
                CalendarUtility.isValidFutureDateTime(invalidDateTime.toString());

        // THEN
        assertNull(actualDateTime,
                String.format("Expected null but was actually: %s",
                        actualDateTime
                )
        );
    }

    @Test
    void isValidFutureLocalDateTime_invalidStringToParse_returnsNull() {
        // GIVEN
        String invalidString = "12023T12";

        // WHEN
        LocalDateTime actualDateTime =
                CalendarUtility.isValidFutureDateTime(invalidString);

        // THEN
        assertNull(actualDateTime,
                String.format("Expected null but was actually: %s",
                        actualDateTime
                )
        );
    }

    @Test
    void isValidFutureLocalDateTime_nullIsPassedIn_returnsNull() {
        // GIVEN - WHEN
        LocalDateTime actualDateTime = CalendarUtility.isValidFutureDateTime(null);

        // THEN
        assertNull(actualDateTime,
                String.format("Expected null but was actually: %s",
                        actualDateTime
                )
        );
    }
}
