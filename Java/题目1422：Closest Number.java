
// 题目1422：Closest Number

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1422
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/22306907
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 2014年3月26日 17:06:27
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int T = (int) st.nval;
            while (T > 0) {
                st.nextToken();
                int n = (int) st.nval;
                int array[] = new int[n + 2];
                int dp1[] = new int[n + 1];
                int dp2[] = new int[n + 1];
                for (int i = 1; i <= n; i++) {
                    st.nextToken();
                    array[i] = (int) st.nval;
                    dp1[i] = i - 1;
                    dp2[i] = i + 1;
                }
                array[0] = array[n + 1] = Integer.MIN_VALUE;
                startToEnd(array, dp1, n);
                endToStart(array, dp2, n);

                StringBuffer sb = new StringBuffer();
                for (int i = 1; i <= n; i++) {
                    if (dp1[i] == 0 && dp2[i] == n + 1) {
                        sb.append(0 + " ");
                    } else if (dp1[i] == 0) {
                        sb.append(array[dp2[i]] + " ");
                    } else if (dp2[i] == n + 1) {
                        sb.append(array[dp1[i]] + " ");
                    } else {
                        int temp = (i - dp1[i]) == (dp2[i] - i) ? dp1[i]
                                : ((i - dp1[i]) < (dp2[i] - i) ? dp1[i]
                                        : dp2[i]);
                        sb.append(array[temp] + " ");
                    }

                }
                System.out.println(sb.toString().trim());
                T--;
            }
        }
    }

    private static void endToStart(int[] array, int[] dp, int n) {
        for (int i = n; i > 0; i--) {
            int temp = dp[i];
            while (temp != n + 1 && array[i] <= array[temp]) {
                temp = dp[temp];
            }
            dp[i] = temp;
        }
    }

    private static void startToEnd(int[] array, int[] dp, int n) {
        for (int i = 1; i <= n; i++) {
            int temp = dp[i];
            while (temp != 0 && array[i] <= array[temp]) {
                temp = dp[temp];
            }
            dp[i] = temp;
        }
    }
}
/**************************************************************
 Problem: 1422
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:2320 ms
 Memory:190836 kb
 ****************************************************************/




