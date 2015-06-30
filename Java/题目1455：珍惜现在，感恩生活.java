
// 题目1455：珍惜现在，感恩生活

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1455
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1455
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int c = (int) st.nval;
            while (c > 0) {
                st.nextToken();
                int n = (int) st.nval;
                st.nextToken();
                int m = (int) st.nval;
                int priceArr[] = new int[m];
                int weightArr[] = new int[m];
                int countArr[] = new int[m];
                for (int i = 0; i < m; i++) {
                    st.nextToken();
                    priceArr[i] = (int) st.nval;
                    st.nextToken();
                    weightArr[i] = (int) st.nval;
                    st.nextToken();
                    countArr[i] = (int) st.nval;
                }
                int dp[] = new int[n + 1];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < countArr[i]; j++) {
                        for (int k = n; k >= priceArr[i]; k--) {
                            dp[k] = Math.max(dp[k], dp[k - priceArr[i]]
                                    + weightArr[i]);
                        }
                    }
                }
                c--;
                System.out.println(dp[n]);
            }
        }
    }
}

/**************************************************************
 Problem: 1455
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:160 ms
 Memory:23764 kb
 ****************************************************************/




