
// 题目1453：Greedy Tino

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1453
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1453
     */
    private static int maxi = 102;

    private static int maxj = 2002;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int t = (int) st.nval;
            for (int k = 1; k < t + 1; k++) {
                st.nextToken();
                int n = (int) st.nval;
                int array[] = new int[n];
                for (int i = 0; i < n; i++) {
                    st.nextToken();
                    array[i] = (int) st.nval;
                }
                int dp[][] = initDp();

                for (int i = 0; i < n; i++) {
                    dp[i][array[i]] = 0;
                }

                for (int i = 1; i < n; i++) {
                    for (int j = 0; j < maxj; j++) {
                        if (dp[i - 1][j] >= 0) {
                            if (dp[i][array[i] + j] < dp[i - 1][j]) {
                                dp[i][array[i] + j] = dp[i - 1][j];
                            }
                            if (array[i] >= j) {
                                if (dp[i][array[i] - j] < dp[i - 1][j] + j) {
                                    dp[i][array[i] - j] = dp[i - 1][j] + j;
                                }
                            } else if (array[i] < j) {
                                if (dp[i][j - array[i]] < dp[i - 1][j]
                                        + array[i]) {
                                    dp[i][j - array[i]] = dp[i - 1][j]
                                            + array[i];
                                }
                            }
                        }
                    }
                    for (int j = 0; j < maxj; j++) {
                        if (dp[i][j] < dp[i - 1][j]) {
                            dp[i][j] = dp[i - 1][j];
                        }
                    }
                }
                System.out.printf("Case " + k + ": " + dp[n - 1][0] + "\n");
            }
        }
    }

    private static int[][] initDp() {
        int dp[][] = new int[102][2002];
        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {
                dp[i][j] = -1;
            }
        }
        return dp;
    }
}
/**************************************************************
 Problem: 1453
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:160 ms
 Memory:35836 kb
 ****************************************************************/




