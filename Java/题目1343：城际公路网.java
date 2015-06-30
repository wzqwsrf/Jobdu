
// 题目1343：城际公路网

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1343
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1343
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int path[][] = new int[n + 1][n + 1];
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    st.nextToken();
                    path[i][j] = (int) st.nval;
                }
            }
            st.nextToken();
            int k = (int) st.nval;
            while (k > 0) {
                st.nextToken();
                int a = (int) st.nval;
                st.nextToken();
                int b = (int) st.nval;
                st.nextToken();
                int w = (int) st.nval;
                disPath(path, a, b, w, n);
                printMinLen(path, n);
                k--;
            }

        }
    }

    private static void disPath(int[][] path, int a, int b, int w, int n) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                int tempLen = path[i][a] + w + path[b][j];
                if (path[i][j] > tempLen) {
                    path[i][j] = tempLen;
                    path[j][i] = tempLen;
                }
            }
        }
    }

    private static void printMinLen(int[][] path, int n) {
        int minLen = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                minLen += path[i][j];
            }
        }
        System.out.println(minLen);
    }

}
/**************************************************************
 Problem: 1343
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:890 ms
 Memory:25368 kb
 ****************************************************************/




