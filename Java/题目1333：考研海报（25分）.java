
// 题目1333：考研海报（25分）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1333
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1333
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            int array[][] = new int[n + 1][n + 1];
            int res = 0;
            for (int i = 0; i < m; i++) {
                st.nextToken();
                int x1 = (int) st.nval;
                st.nextToken();
                int y1 = (int) st.nval;
                st.nextToken();
                int x2 = (int) st.nval;
                st.nextToken();
                int y2 = (int) st.nval;
                x1 = handleBorder(x1, n);
                y1 = handleBorder(y1, n);
                x2 = handleBorder(x2, n);
                y2 = handleBorder(y2, n);
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        if (array[j][k] == 0) {
                            array[j][k] = 1;
                            res++;
                        }
                    }
                }
            }
            System.out.println(n * n - res);
        }
    }

    private static int handleBorder(int x, int n) {
        if (x > n) {
            return n;
        }
        if (x < 0) {
            return 0;
        }
        return x;
    }
}

/**************************************************************
 Problem: 1333
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:650 ms
 Memory:19796 kb
 ****************************************************************/




