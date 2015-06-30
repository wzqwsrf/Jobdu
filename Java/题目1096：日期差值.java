
// 题目1096：日期差值

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1096
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int date1, date2;
        Scanner inScanner = new Scanner(System.in);
        while (inScanner.hasNext()) {
            date1 = inScanner.nextInt();
            date2 = inScanner.nextInt();
            int temp;
            if (date1 > date2) {
                temp = date1;
                date1 = date2;
                date2 = temp;
            }
            int year1, month1, day1, year2, month2, day2;
            year1 = date1 / 10000;
            month1 = (date1 / 100) % 100;
            day1 = date1 % 100;
            year2 = date2 / 10000;
            month2 = (date2 / 100) % 100;
            day2 = date2 % 100;
            System.out.println(diff(year1, month1, day1, year2, month2, day2));
        }
    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }

    public static int diff(int year1, int month1, int day1, int year2,
            int month2, int day2) {
        int farAwayfromYuanDanofYear1 = countDaysSinceNewYear(year1, month1,
                day1);
        int farAwayfromYuanDanofYear2 = countDaysSinceNewYear(year2, month2,
                day2);
        int count = 0;
        if (year1 == year2)
            return Math.abs(farAwayfromYuanDanofYear1
                    - farAwayfromYuanDanofYear2) + 1;
        else {
            for (int i = year1 + 1; i < year2; i++) {
                if (isLeap(i))
                    count += 366;
                else
                    count += 365;
            }
            if (isLeap(year1))
                return count + farAwayfromYuanDanofYear2 + 367
                        - farAwayfromYuanDanofYear1;
            else
                return count + farAwayfromYuanDanofYear2 + 366
                        - farAwayfromYuanDanofYear1;
        }
    }

    public static int countDaysSinceNewYear(int year, int month, int day) {
        int[] leapMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] commonMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int farAwayfromYuadan = 0;
        if (isLeap(year)) {
            for (int i = 0; i < month; i++)
                farAwayfromYuadan += leapMonth[i];
        } else {
            for (int i = 0; i < month; i++)
                farAwayfromYuadan += commonMonth[i];
        }
        return farAwayfromYuadan + day;
    }
}
/**************************************************************
 Problem: 1096
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15464 kb
 ****************************************************************/




