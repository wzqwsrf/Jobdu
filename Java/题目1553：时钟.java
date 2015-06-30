
// 题目1553：时钟

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1553
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    /*
     * 2014年3月16日21:18:33
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String time = scanner.next();
            String timeMsg[] = time.split(Pattern.quote(":"));
            int hour = Integer.parseInt(timeMsg[0]);
            int minute = Integer.parseInt(timeMsg[1]);
            if (hour > 12) {
                hour -= 12;
            }
            double degree1 = (double) hour / 12 * 360 + (double) minute / 60
                    * 30;
            double degree2 = (double) minute / 60 * 360;
            double max = Math.max(degree1, degree2);
            double min = Math.min(degree1, degree2);
            double result = max - min;
            if (result > 180) {
                result = 360 - result;
            }
            System.out.printf("%.2f\n", result);
        }
    }
}

/**************************************************************
 Problem: 1553
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:450 ms
 Memory:15852 kb
 ****************************************************************/




