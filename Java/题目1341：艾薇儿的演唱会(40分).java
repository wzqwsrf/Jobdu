
// 题目1341：艾薇儿的演唱会(40分)

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1341
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1341
     */

    private static int cost[][] = new int[102][102];

    private static int minCost[] = new int[102];

    private static int visit[] = new int[102];

    public static void main(String[] args) throws Exception {

        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));

        while (st.nextToken() != StreamTokenizer.TT_EOF) {

            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;

            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    cost[i][j] = Integer.MAX_VALUE;
                }
            }

            st.nextToken();
            int a = (int) st.nval;
            st.nextToken();
            int b = (int) st.nval;

            for (int i = 0; i < m; i++) {
                st.nextToken();
                int x = (int) st.nval;
                st.nextToken();
                int y = (int) st.nval;
                st.nextToken();
                int t = (int) st.nval;

                if (cost[x][y] > t) {
                    cost[x][y] = t;
                    cost[y][x] = t;
                }
            }

            for (int i = 1; i < n + 1; i++) {
                minCost[i] = cost[a][i];
            }

            dijkstra(cost, minCost, visit, a, n);

            System.out.println(minCost[b]);
        }
    }

    private static void dijkstra(int[][] cost, int[] minCost, int[] visit,
            int s, int n) {

        minCost[s] = 0;
        visit[s] = 1;
        int minj = s;
        for (int i = 0; i < n + 1; i++) {

            int min = Integer.MAX_VALUE;

            for (int j = 1; j < n + 1; j++) {
                if (visit[j] == 0 && minCost[j] < min) {
                    min = minCost[j];
                    minj = j;
                }
            }

            visit[minj] = 1;

            for (int j = 1; j < n + 1; j++) {
                if (visit[j] == 0
                        && minCost[j] > (minCost[minj] + cost[minj][j])
                        && minCost[minj] != Integer.MAX_VALUE
                        && cost[minj][j] != Integer.MAX_VALUE) {
                    minCost[j] = minCost[minj] + cost[minj][j];
                }
            }
        }
    }
}

/**************************************************************
 Problem: 1341
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:820 ms
 Memory:24940 kb
 ****************************************************************/




