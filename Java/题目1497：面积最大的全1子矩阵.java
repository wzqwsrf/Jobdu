
// 题目1497：面积最大的全1子矩阵

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1497
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1497
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int m = (int) st.nval;
            st.nextToken();
            int n = (int) st.nval;
            int array[][] = new int[m + 1][n + 1];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    st.nextToken();
                    array[i][j] = (int) st.nval;
                }
            }
            int result = 0;
            int high[] = new int[1002];
            int left[] = new int[1002];
            int right[] = new int[1002];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (array[i][j] == 1) {
                        high[j]++;
                    } else {
                        high[j] = 0;
                    }
                }
                high[0] = -1;
                high[n + 1] = -1;
                for (int j = 1; j <= n; j++) {
                    int k = j;
                    while (high[j] <= high[k - 1]) {
                        k = left[k - 1];
                    }
                    left[j] = k;
                }

                for (int j = n; j >= 1; j--) {
                    int k = j;
                    while (high[j] <= high[k + 1]) {
                        k = right[k + 1];
                    }
                    right[j] = k;
                }
                for (int j = 1; j <= n; j++) {
                    result = Math.max(result, high[j]
                            * (right[j] - left[j] + 1));
                }
            }
            System.out.println(result);
        }
    }
}
/**************************************************************
 Problem: 1497
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1280 ms
 Memory:31084 kb
 ****************************************************************/




