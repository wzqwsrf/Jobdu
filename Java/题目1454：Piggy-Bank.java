
// 题目1454：Piggy-Bank

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1454
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1454
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int t = (int) st.nval;
            while (t > 0) {
                st.nextToken();
                int empty = (int) st.nval;
                st.nextToken();
                int full = (int) st.nval;

                int allWei = full - empty;

                int dp[] = new int[allWei + 1];

                for (int i = 1; i < allWei + 1; i++) {
                    dp[i] = Integer.MAX_VALUE;
                }
                st.nextToken();
                int n = (int) st.nval;
                for (int i = 0; i < n; i++) {
                    st.nextToken();
                    int p = (int) st.nval;
                    st.nextToken();
                    int w = (int) st.nval;

                    for (int j = w; j <= allWei; j++) {
                        if (dp[j] > dp[j - w] + p
                                && dp[j - w] != Integer.MAX_VALUE) {
                            dp[j] = Math.min(dp[j], dp[j - w] + p);
                        }
                    }
                }
                if (dp[allWei] == Integer.MAX_VALUE) {
                    System.out.println("This is impossible.");
                } else {
                    System.out
                            .println("The minimum amount of money in the piggy-bank is "
                                    + dp[allWei] + ".");
                }
                t--;
            }
        }
    }
}
/**************************************************************
 Problem: 1454
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:260 ms
 Memory:24412 kb
 ****************************************************************/




