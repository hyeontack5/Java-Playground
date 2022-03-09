package calendar;

public class Calendar {

    private static final int[] MAX_DAYS = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0))) {
            return true;
        } else
            return false;
    }

    public int getMaxDaysOfMonth(int year, int month) {
        if (isLeapYear(year)) {
            return LEAP_MAX_DAYS[month];
        } else {
            return MAX_DAYS[month];
        }
    }

    public void printCalendar(int year, int month) {
        System.out.printf("     <<%3d년 %3d월>>\n", year, month);
        System.out.println("SUN MON TUE WED THU FRI SAT");
        System.out.println("---------------------------");

        // get weekday automatically
        int weekday = getWeekDay(year, month, 1);

        // print blank space
        for (int i = 0; i < weekday; i++) {
            System.out.print("    ");
        }

        int maxDay = getMaxDaysOfMonth(year, month);
        int count = 7 - weekday;
        int delim = count;

        // print first line
        for (int i = 1; i <= count; i++) {
            System.out.printf("%-4d", i);
        }

        System.out.println();

        // print from second to last line
        for (int i = (count + 1); i <= maxDay; i++) {
            System.out.printf("%-4d", i);
            if (i % 7 == delim) {
                System.out.println();
            }
        }

        System.out.println();
        System.out.println();
    }

    private int getWeekDay(int year, int month, int i) {
        int syear = 1970;
        final int STANDARD_WEEKDAY = 3; // 1970/Jan/1st = Thursday

        int count = 0;

        for (int i = syear; i < year; i++) {
            int delta = isLeapYear(year) ? 366 : 365;
            count += delta;
        }

        // System.out.println(count);
        for (int i = 1; i < month; i++) {
            int delta = getMaxDaysOfMonth(year, i);
            count += delta;
        }

        count += day;

        int weekday = (count + STANDARD_WEEKDAY) % 7;
        return weekday;
    }

    // simple test code here
    public static void main(String[] args) {
        Calendar cal = new Calendar();
        System.out.println(cal.getWeekDay(1970, 1, 1) == 0);
    }
}
