
// 题目1547：出入栈

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1547
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/19915653
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1547
     */
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if ((n & 1) == 1 || n == 0) {
                System.out.println(0);
                continue;
            }
            int dp[][] = new int[n][n];
            for (int j = 0; j < n; j++) {
                dp[0][j] = 1;
            }
            for (int i = 1; i < n / 2 + 1; i++) {
                for (int j = i; j < n / 2 + 1; j++) {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
                }
            }
            System.out.println(dp[n / 2][n / 2]);
        }
    }
}

/**************************************************************
 Problem: 1547
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:440 ms
 Memory:26932 kb
 ****************************************************************/




