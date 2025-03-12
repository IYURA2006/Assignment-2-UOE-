import java.util.Scanner;

/**
 * @author  Yurii Ilnytskyi
 * @version TODO date in 2025-03-12 format
 * <p>
 * This class calculates the day number of the year for a given date.
 * <p>
 * It takes the year, month, and day as input and computes the total number of days.
 */
public class Design {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date (YYYY/MM/DD): ");
        String inputDate = scanner.nextLine();

        scanner.close();

        // Split the input date into year, month, and day
        String[] dateParts = inputDate.split("/");

        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        DateCalculator dayCalculator = new DateCalculator(year, month, day);
        int dayNumber = dayCalculator.getDaysOfYear();
        System.out.println("Day number: " + dayNumber);
    }
}

class DateCalculator {
    private final int year;
    private final int month;
    private final int day;

    public DateCalculator(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear() {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public int getDaysOfYear(){
        int[] eachMonthLengths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayOfYear = 0;

        if(isLeapYear()) {
            eachMonthLengths[1] = 29;
        }

        for(int i = 0; i < month - 1; i++) {
            dayOfYear += eachMonthLengths[i];
        }

        dayOfYear += day;

        return dayOfYear;
    }
}