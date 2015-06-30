
// 题目1448：Legal or Not

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1448
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1448
     */
    private static int array[][];

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            if (n == 0 && m == 0) {
                break;
            }
            array = new int[n][n];
            while (m > 0) {
                m--;
                st.nextToken();
                int x = (int) st.nval;
                st.nextToken();
                int y = (int) st.nval;
                array[x][y] = 1;
            }
            boolean flag = floyd(n);
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean floyd(int n) {
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                if (i == k || array[i][k] == 0) {
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    if (j == k || j == i) {
                        continue;
                    }
                    if (array[k][j] == 1) {
                        array[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] == 1 && array[j][i] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

/**************************************************************
 Problem: 1448
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:170 ms
 Memory:25908 kb
 ****************************************************************/




