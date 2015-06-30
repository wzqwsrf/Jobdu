
// 题目1494：Dota

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1494
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/26989653
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1494
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            st.nextToken();
            int g = (int) st.nval;
            int size = n + 1 + m;
            int p[] = new int[size];
            int v[] = new int[size];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                p[i] = (int) st.nval;
                st.nextToken();
                v[i] = (int) st.nval;
            }
            for (int i = n + 1; i < size; i++) {
                st.nextToken();
                int t = (int) st.nval;
                for (int j = 1; j < t + 1; j++) {
                    st.nextToken();
                    int seq = (int) st.nval;
                    p[i] += p[seq];
                    v[i] += v[seq];
                }
                st.nextToken();
                int s = (int) st.nval;
                v[i] += s;
            }
            int dp[] = new int[g + 1];
            for (int i = 1; i < size; i++) {
                for (int j = p[i]; j <= g; j++) {
                    dp[j] = Math.max(dp[j], dp[j - p[i]] + v[i]);
                }
            }
            System.out.println(dp[g]);
        }
    }

}
/**************************************************************
 Problem: 1494
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:390 ms
 Memory:23732 kb
 ****************************************************************/




