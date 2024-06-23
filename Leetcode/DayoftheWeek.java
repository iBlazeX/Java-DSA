//1185. Day of the Week

public class DayoftheWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        int leap = 0;
        int n = year-1;
        while (n > 1971) {
            if (n%4 == 0) {
                leap++;
                n -= 4;
            }
            else{
                n--;
            }
        }
        if (year%4 == 0 && month>=3 && year%100 != 0) {
            leap++;
        }
        int monthday = 0;
        while (month > 0) {
            month--;
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> monthday += 31;
                case 4, 6, 9, 11 -> monthday += 30;
                case 2 -> monthday += 28;
                default -> {
                }
            }
        }

        int a = (int) (4 + (year - 1971)*(365) + monthday + day + leap);
        int b = a%7;
        switch (b) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            default -> {
            }
        }
        return "Sunday";
    }

    public static void main(String[] args) {
        int day = 15;
        int month = 8;
        int year = 1993;
        System.out.println(dayOfTheWeek(day, month, year));
    }
}
