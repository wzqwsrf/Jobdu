
// 题目1443：Tr A

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1443
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1443
     */
    private static int mod = 9973;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int T = (int) st.nval;
            for (int i = 0; i < T; i++) {
                st.nextToken();
                int n = (int) st.nval;
                st.nextToken();
                int k = (int) st.nval;
                int array[][] = new int[n][n];
                for (int j = 0; j < n; j++) {
                    for (int m = 0; m < array.length; m++) {
                        st.nextToken();
                        array[j][m] = (int) st.nval;
                    }
                }
                System.out.println(matrix(k, n, array));
            }
        }
    }

    static int matrix(int k, int n, int array[][]) {
        int sum[][] = new int[n][n];
        for (int i = 0; i < n; ++i) {
            sum[i][i] = 1;
        }
        while (k != 0) {
            if ((k & 1) != 0) {
                matrixMulti(sum, array, n);
            }
            matrixMulti(array, array, n);
            k >>= 1;
        }
        int ans = 0;
        for (int i = 0; i < n; ++i)
            ans = (ans + sum[i][i]) % mod;
        return ans;
    }

    static void matrixMulti(int arrarA[][], int arrayB[][], int n) {
        int[][] arrayC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    arrayC[i][j] += arrarA[i][k] * arrayB[k][j];
                }
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arrarA[i][j] = arrayC[i][j] % mod;
            }
        }
    }
}

/**************************************************************
 Problem: 1443
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:18680 kb
 ****************************************************************/




