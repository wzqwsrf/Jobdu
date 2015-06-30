
// 题目1532：棋盘寻宝扩展

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1532
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1532
     */
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int limit = (int) st.nval;
            int value[][] = new int[9][9];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    st.nextToken();
                    value[i][j] = (int) st.nval;
                }
            }

            int dp[][][] = new int[9][9][1001];
            if (value[0][0] <= limit) {
                dp[0][0][value[0][0]] = 1;
            }

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (i > 0) {
                        for (int k = limit; k >= value[i][j]; k--) {
                            dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j][k
                                    - value[i][j]]);
                        }
                    }
                    if (j > 0) {
                        for (int k = limit; k >= value[i][j]; k--) {
                            dp[i][j][k] = Math.max(dp[i][j][k], dp[i][j - 1][k
                                    - value[i][j]]);
                        }
                    }
                }
            }

            int maxLimit = -1;
            for (int i = limit; i >= 0; i--) {
                if (dp[7][7][i] == 1) {
                    maxLimit = i;
                    break;
                }
            }
            System.out.println(maxLimit);
        }
    }
}
/**************************************************************
 Problem: 1532
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:700 ms
 Memory:19092 kb
 ****************************************************************/




