
// 题目1406：上班啦

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1406
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1406
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
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
                    path[b][a] = d;
                }
            }

            int minLen[] = new int[n + 1];
            int visit[] = new int[n + 1];
            int pathNum[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                minLen[i] = path[1][i];
                if (minLen[i] != Integer.MAX_VALUE) {
                    pathNum[i] = 1;
                }
            }
            dijkstra(path, minLen, pathNum, visit, n);
            System.out.println(minLen[n] == Integer.MAX_VALUE ? "-1 -1"
                    : minLen[n] + " " + pathNum[n]);
        }
    }

    private static void dijkstra(int[][] path, int[] minLen, int pathNum[],
            int[] visit, int n) {
        minLen[1] = 0;
        visit[1] = 1;
        int minj = 1;
        for (int i = 0; i < n + 1; i++) {
            int min = Integer.MAX_VALUE;
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
                    pathNum[j] = pathNum[minj];
                } else if (visit[j] == 0
                        && minLen[j] == (minLen[minj] + path[minj][j])
                        && minLen[minj] != Integer.MAX_VALUE
                        && path[minj][j] != Integer.MAX_VALUE) {
                    pathNum[j] += pathNum[minj];
                }
            }
        }
    }
}

/**************************************************************
 Problem: 1406
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:610 ms
 Memory:28988 kb
 ****************************************************************/




