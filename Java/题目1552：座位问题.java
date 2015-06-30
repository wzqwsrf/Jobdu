
// 题目1552：座位问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1552
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 2014年3月9日 21:05:41
     */
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            long dp[] = new long[1002];
            int mod = 1000000007;
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            dp[4] = 7;
            for (int i = 5; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 4]) % mod;
            }
            System.out.println(dp[n]);
        }
    }
}

/**************************************************************
 Problem: 1552
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:440 ms
 Memory:17796 kb
 ****************************************************************/




