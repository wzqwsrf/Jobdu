
// 题目1152：点菜问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1152
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1152
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int c = (int) st.nval;
            st.nextToken();
            int n = (int) st.nval;
            int w[] = new int[101];
            int v[] = new int[101];
            int dp[] = new int[1002];
            for (int i = 1; i <= n; i++) {
                st.nextToken();
                w[i] = (int) st.nval;
                st.nextToken();
                v[i] = (int) st.nval;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = c; j >= w[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
                }
            }
            System.out.println(dp[c]);
        }
    }
}
/**************************************************************
 Problem: 1152
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:16460 kb
 ****************************************************************/




