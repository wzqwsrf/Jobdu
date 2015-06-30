
// 题目1529：棋盘寻宝

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1529
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/25304325
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 2014年5月8日 14:03:05
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int len = 8;
            int array[][] = new int[len][len];
            array[0][0] = (int) st.nval;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    st.nextToken();
                    array[i][j] = (int) st.nval;
                }
            }
            int dp[][] = new int[len][len];
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (i == 0 && j == 0) {
                        dp[i][j] = array[i][j];
                    } else if (i == 0) {
                        dp[i][j] = dp[i][j - 1] + array[i][j];
                    } else if (j == 0) {
                        dp[i][j] = dp[i - 1][j] + array[i][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1])
                                + array[i][j];
                    }
                }
            }
            System.out.println(dp[7][7]);
        }
    }
}
/**************************************************************
 Problem: 1529
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:340 ms
 Memory:14748 kb
 ****************************************************************/




