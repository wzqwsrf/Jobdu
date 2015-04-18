
// 题目1043：Day of Week

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月18日22:43:17
 * @url:http://ac.jobdu.com/problem.php?pid=1043
 */

import java.util.Scanner;

public class Prob1043 {

    /*
     * 1043
     */
    private static String[] month = {"", "January", "February", "March",
            "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};
    private static String[] week = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int d = cin.nextInt();
            String sm = cin.next();
            int y = cin.nextInt();
            int m;
            for (m = 1; m < month.length; m++) {
                if (month[m].equals(sm))
                    break;
            }
            if (m == 1 || m == 2) {
                m += 12;
                y--;
            }
            int c = y / 100;
            int ty = y % 100;

            int w = ty + ty / 4 + c / 4 - 2 * c + 26 * (m + 1) / 10 + d - 1;
            while (w < 0)
                w += 7;
            System.out.println(week[w % 7]);
        }
    }

}


/**
 * ***********************************************************
 * Problem: 1043
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:80 ms
 * Memory:15468 kb
 * **************************************************************
 */