
// 题目1364：v字仇杀队

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1364
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1364
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int s = (int) st.nval;
            st.nextToken();
            int c = (int) st.nval;
            int v[] = new int[102];
            int w[] = new int[102];
            int dp[] = new int[1002];
            for (int i = 1; i <= c; i++) {
                st.nextToken();
                v[i] = (int) st.nval;
                st.nextToken();
                w[i] = (int) st.nval;
            }

            for (int i = 1; i <= c; i++) {
                for (int j = s; j >= v[i]; j--) {
                    dp[j] = Math.max(dp[j - v[i]] + w[i], dp[j]);
                }
            }
            System.out.println(dp[s]);
        }
    }
}
/**************************************************************
 Problem: 1364
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1590 ms
 Memory:19764 kb
 ****************************************************************/




