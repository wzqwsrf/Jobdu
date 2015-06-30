
// 题目1209：最小邮票数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1209
 */

import java.util.Scanner;

public class Main {
    /*
     * 1209
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int array[] = new int[n];
            int dp[] = new int[1000];
            for (int i = 0; i < 1000; i++) {
                dp[i] = Integer.MAX_VALUE;
            }
            dp[0] = 0;
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = m; j >= array[i]; j--) {
                    if (dp[j - array[i]] == Integer.MAX_VALUE) {
                        continue;
                    } else {
                        dp[j] = Math.min(dp[j], dp[j - array[i]] + 1);
                    }
                }
            }
            if (dp[m] == Integer.MAX_VALUE) {
                System.out.println("0");
            } else {
                System.out.println(dp[m]);
            }
        }
    }
}

/**************************************************************
 Problem: 1209
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:970 ms
 Memory:94820 kb
 ****************************************************************/




