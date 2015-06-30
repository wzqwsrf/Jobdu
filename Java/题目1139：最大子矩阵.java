
// 题目1139：最大子矩阵

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1139
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1139
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    st.nextToken();
                    array[i][j] = (int) st.nval;
                }
            }
            int maxSum = array[0][0];
            for (int i = 0; i < n; i++) {
                int sum[] = new int[n];
                for (int j = i; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        sum[k] += array[j][k];
                    }
                    maxSum = Math.max(maxSum, getMaxSum(sum, n));
                }
            }
            System.out.println(maxSum);
        }
    }

    private static int getMaxSum(int[] sum, int n) {
        int maxSum = sum[0];
        int tempSum = sum[0];
        for (int i = 1; i < n; i++) {
            if (tempSum <= 0) {
                tempSum = sum[i];
            } else {
                tempSum += sum[i];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
        }
        return maxSum;
    }
}
/**************************************************************
 Problem: 1139
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:280 ms
 Memory:25264 kb
 ****************************************************************/




