
// 题目1160：放苹果

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1160
 */

import java.util.Scanner;

public class Main {
    /*
     * 1160
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                int m = scanner.nextInt();
                int n = scanner.nextInt();
                System.out.println(dp(m, n));
            }
        }
    }

    public static int dp(int m, int n) {
        if (m == 0 || n == 1) {
            return 1;
        }
        if (m < n) {
            return dp(m, m);
        } else {
            return dp(m - n, n) + dp(m, n - 1);
        }
    }
}

/**************************************************************
 Problem: 1160
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15472 kb
 ****************************************************************/




