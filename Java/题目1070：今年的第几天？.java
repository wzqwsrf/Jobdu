
// 题目1070：今年的第几天？

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1070
 */

import java.util.Scanner;

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    /*
     * 1070
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        while (cin.hasNext()) {
            int y = cin.nextInt();
            int m = cin.nextInt();
            int d = cin.nextInt();

            int sum = 0;
            if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
                a[2] = 29;
            } else {
                a[2] = 28;
            }
            for (int i = 1; i < m; i++) {
                sum += a[i];
            }
            sum += d;
            System.out.println(sum);
        }
    }
}
/**************************************************************
 Problem: 1070
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:800 ms
 Memory:54052 kb
 ****************************************************************/




