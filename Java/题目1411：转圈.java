
// 题目1411：转圈

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1411
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1411
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;

            st.nextToken();
            int s = (int) st.nval;
            int path[][] = new int[n + 1][n + 1];
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    path[i][j] = Integer.MAX_VALUE;
                }
            }
            for (int i = 0; i < m; i++) {
                st.nextToken();
                int a = (int) st.nval;
                st.nextToken();
                int b = (int) st.nval;
                st.nextToken();
                int d = (int) st.nval;

                if (path[a][b] > d) {
                    path[a][b] = d;
                }
            }

            int minLen[] = new int[n + 1];
            int visit[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                minLen[i] = path[s][i];
            }
            dijkstra(path, minLen, visit, n, s);
            System.out.println(minLen[s] == Integer.MAX_VALUE ? "help!"
                    : minLen[s]);
        }
    }

    private static void dijkstra(int[][] path, int[] minLen, int[] visit,
            int n, int s) {
        //		minLen[s] = 0;
        //		visit[s] = 1;
        for (int i = 1; i < n + 1; i++) {
            int min = Integer.MAX_VALUE;
            int minj = s;
            for (int j = 1; j < n + 1; j++) {
                if (visit[j] == 0 && minLen[j] < min) {
                    min = minLen[j];
                    minj = j;
                }
            }
            visit[minj] = 1;
            for (int j = 1; j < n + 1; j++) {
                if (visit[j] == 0 && minLen[j] > (minLen[minj] + path[minj][j])
                        && minLen[minj] != Integer.MAX_VALUE
                        && path[minj][j] != Integer.MAX_VALUE) {
                    minLen[j] = minLen[minj] + path[minj][j];
                }
            }
        }
    }
}
/**************************************************************
 Problem: 1411
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1060 ms
 Memory:32288 kb
 ****************************************************************/




