
// 题目1017：还是畅通工程

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1017
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17165733
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1017
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            int path[][] = new int[n + 1][n + 1];

            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    path[i][j] = Integer.MAX_VALUE;
                }
            }

            int m = ((n - 1) * n) / 2;

            for (int i = 0; i < m; i++) {
                st.nextToken();
                int a = (int) st.nval;
                st.nextToken();
                int b = (int) st.nval;
                st.nextToken();
                int d = (int) st.nval;

                if (path[a][b] > d) {
                    path[a][b] = d;
                    path[b][a] = d;
                }
            }

            int minLen[] = new int[n + 1];
            int visit[] = new int[n + 1];

            for (int i = 1; i < n + 1; i++) {
                minLen[i] = path[1][i];
            }

            prime(path, minLen, visit, n);

        }
    }

    private static void prime(int[][] path, int[] minLen, int[] visit, int n) {

        minLen[1] = 0;
        visit[1] = 1;
        int minj = 1;

        int resLen = 0;

        for (int i = 1; i < n; i++) {

            int min = Integer.MAX_VALUE;

            for (int j = 1; j < n + 1; j++) {
                if (visit[j] == 0 && minLen[j] < min) {
                    min = minLen[j];
                    minj = j;
                }
            }

            visit[minj] = 1;

            resLen += min;

            for (int j = 1; j < n + 1; j++) {
                if (visit[j] == 0 && minLen[j] > path[minj][j]) {
                    minLen[j] = path[minj][j];
                }
            }
        }
        System.out.println(resLen);
    }
}
/**************************************************************
 Problem: 1017
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:240 ms
 Memory:23540 kb
 ****************************************************************/




