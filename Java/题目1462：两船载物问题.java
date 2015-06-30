
// 题目1462：两船载物问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1462
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1462
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int c1 = (int) st.nval;
            st.nextToken();
            int c2 = (int) st.nval;
            int dp[] = new int[c1 + 1];
            int array[] = new int[n + 1];
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                sum += array[i];
            }
            for (int i = 1; i <= n; i++) {
                for (int j = c1; j >= array[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - array[i]] + array[i]);
                }
            }
            if (sum - dp[c1] <= c2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
/**************************************************************
 Problem: 1462
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:110 ms
 Memory:16880 kb
 ****************************************************************/




