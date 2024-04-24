/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NextDate;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NextDateProgram {
    public static String nextDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            int nextDay = day;
            int nextMonth = month;
            int nextYear = year;

            if (day < 31) {
                nextDay++;
            } else {
                if (month < 12) {
                    nextDay = 1;
                    nextMonth++;
                } else {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear++;
                }
            }

            return nextDay + "/" + nextMonth + "/" + nextYear;
        } else {
            return "Invalid date";
        }
    }

    private static boolean isValidDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2012) {
            return false;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 31) {
            return false;
        }

        if (month == 2) {
            if (day > 29) {
                return false;
            }

            if (day == 29 && !isLeapYear(year)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
