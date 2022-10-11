import homeWork8.Weekdays;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class WeekdaysTest {

    @Test
    public void returnWeekday() {
        Weekdays weekdays = new Weekdays();
        assertEquals("Sunday", weekdays.getDay(1));
    }

    @Test
    public void negativeTestLessThanOne() {
        Weekdays weekdays = new Weekdays();
        assertEquals("The number should be equal or larger than 1", weekdays.getDay(-2));
    }

    @Test
    public void negativeTestMoreThanSeven() {
        Weekdays weekdays = new Weekdays();
        assertEquals("The number should be equal or smaller than 7", weekdays.getDay(10));
    }
    @Test
    public void nullPointer(){
        Weekdays weekdays = new Weekdays();
        assertThrows(NullPointerException.class, () -> {Weekdays.getDay(null);});
    }
}

