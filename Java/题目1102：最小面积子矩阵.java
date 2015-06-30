
// 题目1102：最小面积子矩阵

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1102
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1102
     */
    private static int array[][];

    private static int sumArr[][];

    private static int n, m, k;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) st.nval;
            st.nextToken();
            m = (int) st.nval;
            st.nextToken();
            k = (int) st.nval;
            array = new int[n + 1][m + 1];
            sumArr = new int[n + 1][m + 1];
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    st.nextToken();
                    array[i][j] = (int) st.nval;
                }
            }
            sumArr[1][1] = array[1][1];
            for (int i = 2; i < n + 1; i++) {
                sumArr[i][1] = sumArr[i - 1][1] + array[i][1];
            }
            for (int j = 2; j < m + 1; j++) {
                sumArr[1][j] = sumArr[1][j - 1] + array[1][j];
            }

            for (int i = 2; i < n + 1; i++) {
                for (int j = 2; j < m + 1; j++) {
                    sumArr[i][j] = sumArr[i - 1][j] + sumArr[i][j - 1]
                            - sumArr[i - 1][j - 1] + array[i][j];
                }
            }
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    for (int s = i; s < n + 1; s++) {
                        for (int t = j; t < m + 1; t++) {
                            if ((sumArr[s][t] - sumArr[i - 1][t]
                                    - sumArr[s][j - 1] + sumArr[i - 1][j - 1]) >= k) {
                                int tempArea = caculateArea(i, j, s, t);
                                if (tempArea < min) {
                                    min = tempArea;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(min == Integer.MAX_VALUE ? -1 : min);
        }
    }

    private static int caculateArea(int i, int j, int s, int t) {
        return (s - i + 1) * (t - j + 1);
    }
}

/**************************************************************
 Problem: 1102
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:410 ms
 Memory:24416 kb
 ****************************************************************/




