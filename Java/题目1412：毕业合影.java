
// 题目1412：毕业合影

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1412
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1412
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            long dp[][] = new long[n + 1][n + 1];
            for (int i = 0; i < n + 1; i++) {
                dp[i][0] = 1;
            }
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j <= i; j++) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
            System.out.println(dp[n][n / 2] / (n / 2 + 1));
        }
    }
}

/**************************************************************
 Problem: 1412
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14668 kb
 ****************************************************************/




