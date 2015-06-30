
// 题目1537：买卖股票

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1537
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1537
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int k = (int) st.nval;
            int array[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            int size = 1002;
            int dp[][] = new int[size][size];
            int result = 0;
            int tempValue = Integer.MIN_VALUE;
            for (int i = 1; i < k + 1; i++) {
                tempValue = dp[i - 1][1] - array[1];
                for (int j = 2; j < n + 1; j++) {
                    dp[i][j] = Math.max(tempValue + array[j], dp[i][j - 1]);
                    result = Math.max(dp[i][j], result);
                    tempValue = Math.max(tempValue, dp[i - 1][j] - array[j]);
                }
            }
            System.out.println(result);
        }
    }
}
/**************************************************************
 Problem: 1537
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:600 ms
 Memory:71720 kb
 ****************************************************************/




