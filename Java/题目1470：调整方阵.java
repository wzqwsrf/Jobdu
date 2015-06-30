
// 题目1470：调整方阵

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1470
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1053
     */
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int matrix[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    st.nextToken();
                    matrix[i][j] = (int) st.nval;
                }
            }
            for (int j = 0; j < n; j++) {
                int maxValue = matrix[j][j];
                int maxCol = j;
                for (int i = j + 1; i < n; i++) {
                    if (matrix[i][j] > maxValue) {
                        maxValue = matrix[i][j];
                        maxCol = i;
                    }
                }
                for (int i = 0; i < n; i++) {
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[maxCol][i];
                    matrix[maxCol][i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print(matrix[i][n - 1]);
                System.out.println();
            }
        }
    }

}
/**************************************************************
 Problem: 1470
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:100 ms
 Memory:14868 kb
 ****************************************************************/




