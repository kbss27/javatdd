package pattern5.instance;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
    private final Date birthDate = null;

    private static final Date BOOM_START_DATE;
    private static final Date BOOM_END_DATE;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1,0,0,0);
        BOOM_START_DATE = gmtCal.getTime();
        gmtCal.set(1964, Calendar.JANUARY, 1,0,0,0);
        BOOM_END_DATE = gmtCal.getTime();
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START_DATE) >= 0 &&
                birthDate.compareTo(BOOM_END_DATE) < 0;
    }
}
