
// 题目1408：吃豆机器人

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1408
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {

    /*
     * 1408
     */
    private static long dp[][] = new long[1002][1002];

    private static int len = 1002;
    static {
        for (int i = 1; i < len; i++) {
            dp[i][1] = 1;
            dp[1][i] = 1;
        }

        for (int i = 2; i < len; i++) {
            for (int j = 2; j < len; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 10009;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            System.out.println(dp[n][m]);
        }
    }
}
/**************************************************************
 Problem: 1408
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:580 ms
 Memory:35848 kb
 ****************************************************************/




