
// 题目1492：最小子矩阵

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1492
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1492
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int m = (int) st.nval;
            st.nextToken();
            int n = (int) st.nval;
            int array[][] = new int[m][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    st.nextToken();
                    array[i][j] = (int) st.nval;
                }
            }
            int minValue = Integer.MAX_VALUE;
            for (int i = 0; i <= m - n; i++) {
                for (int j = 0; j <= m - n; j++) {
                    int tempMin = 0;
                    for (int k = i; k < i + n; k++) {
                        for (int t = j; t < j + n; t++) {
                            tempMin += array[k][t];
                        }
                    }
                    if (minValue > tempMin) {
                        minValue = tempMin;
                    }
                }
            }
            System.out.println(minValue);
        }
    }
}
/**************************************************************
 Problem: 1492
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:590 ms
 Memory:24660 kb
 ****************************************************************/




