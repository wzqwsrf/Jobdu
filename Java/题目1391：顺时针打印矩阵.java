
// 题目1391：顺时针打印矩阵

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1391
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1391
     */
    private static int array[][];

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int m = (int) st.nval;
            st.nextToken();
            int n = (int) st.nval;
            array = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    st.nextToken();
                    array[i][j] = (int) st.nval;
                }
            }
            printfMatrix(m, n);
        }
    }

    private static void printfMatrix(int m, int n) {
        int rowUp = 0;
        int rowDown = m - 1;
        int colLeft = 0;
        int colRight = n - 1;
        int i = 0;
        StringBuffer sb = new StringBuffer();
        while (rowUp <= rowDown || colLeft <= colRight) {
            if (rowUp > rowDown || colLeft > colRight) {
                System.out.println(sb);
                return;
            }
            if (rowUp == rowDown) {
                while (colLeft <= colRight) {
                    sb.append(array[rowUp][colLeft] + " ");
                    colLeft++;
                }
                System.out.println(sb);
                return;
            }

            if (colLeft == colRight) {
                while (rowUp <= rowDown) {
                    sb.append(array[rowUp][colLeft] + " ");
                    rowUp++;
                }
                System.out.println(sb);
                return;
            }

            for (i = colLeft; i <= colRight; i++) {
                sb.append(array[rowUp][i] + " ");
            }

            for (i = rowUp + 1; i <= rowDown; i++) {
                sb.append(array[i][colRight] + " ");
            }

            for (i = colRight - 1; i >= colLeft; i--) {
                sb.append(array[rowDown][i] + " ");
            }

            for (i = rowDown - 1; i > rowUp; i--) {
                sb.append(array[i][colLeft] + " ");
            }

            rowUp++;
            colLeft++;
            colRight--;
            rowDown--;
        }
        System.out.println(sb);
    }
}

/**************************************************************
 Problem: 1391
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2090 ms
 Memory:99188 kb
 ****************************************************************/




