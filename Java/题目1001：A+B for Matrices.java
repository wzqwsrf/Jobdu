
// 题目1001：A+B for Matrices

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:50
 * @url:http://ac.jobdu.com/problem.php?pid=1001
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/37882211
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1002 2014年07月16日16:20:45
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int m = (int) st.nval;
            if (m == 0) {
                break;
            }
            st.nextToken();
            int n = (int) st.nval;
            int matrix[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    st.nextToken();
                    matrix[i][j] = (int) st.nval;
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    st.nextToken();
                    matrix[i][j] += (int) st.nval;
                }
            }
            int zeroNum = 0;
            for (int i = 0; i < m; i++) {
                boolean isZero = true;
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] != 0) {
                        isZero = false;
                        break;
                    }
                }
                if (isZero) {
                    zeroNum++;
                }
            }
            for (int j = 0; j < n; j++) {
                boolean isZero = true;
                for (int i = 0; i < m; i++) {
                    if (matrix[i][j] != 0) {
                        isZero = false;
                        break;
                    }
                }
                if (isZero) {
                    zeroNum++;
                }
            }
            System.out.println(zeroNum);
        }
    }
}
/**************************************************************
 Problem: 1001
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:690 ms
 Memory:14584 kb
 ****************************************************************/




