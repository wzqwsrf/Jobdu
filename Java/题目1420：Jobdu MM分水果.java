
// 题目1420：Jobdu MM分水果

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1420
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1420
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n + 1];
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                sum += array[i];
            }
            int dp[] = new int[sum];
            int midSum = sum / 2;
            for (int i = 1; i <= n; i++) {
                for (int j = midSum; j >= array[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - array[i]] + array[i]);
                }
            }
            System.out.println(Math.abs(sum - 2 * dp[midSum]));
        }
    }
}
/**************************************************************
 Problem: 1420
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2440 ms
 Memory:35424 kb
 ****************************************************************/




