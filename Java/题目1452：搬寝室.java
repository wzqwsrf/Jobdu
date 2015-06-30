
// 题目1452：搬寝室

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1452
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1452
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int k = (int) st.nval;
            int dp[][] = new int[k + 1][n + 1];
            int array[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            for (int i = 0; i < k + 1; i++) {
                for (int j = 0; j < n + 1; j++) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = Integer.MAX_VALUE;
                    }
                }
            }
            Arrays.sort(array);
            for (int i = 1; i < k + 1; i++) {
                for (int j = i * 2; j < n + 1; j++) {
                    int num = (array[j] - array[j - 1])
                            * (array[j] - array[j - 1]);
                    dp[i][j] = Math.min(dp[i][j - 1], (dp[i - 1][j - 2] + num));
                }
            }
            System.out.println(dp[k][n]);
        }
    }
}
/**************************************************************
 Problem: 1452
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:270 ms
 Memory:46272 kb
 ****************************************************************/




