
// 题目1162：I Wanna Go Home

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1162
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1162
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }

            st.nextToken();
            int m = (int) st.nval;
            int cost[][] = new int[n + 1][n + 1];
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    cost[i][j] = Integer.MAX_VALUE;
                }
            }

            for (int i = 0; i < m; i++) {
                st.nextToken();
                int a = (int) st.nval;
                st.nextToken();
                int b = (int) st.nval;
                st.nextToken();
                int d = (int) st.nval;

                if (cost[a][b] > d) {
                    cost[a][b] = d;
                    cost[b][a] = d;
                }
            }

            int leader[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                leader[i] = (int) st.nval;
            }

            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    if (leader[i] == 1 && leader[j] == 2) {
                        cost[j][i] = Integer.MAX_VALUE;
                    } else if (leader[i] == 2 && leader[j] == 1) {
                        cost[i][j] = Integer.MAX_VALUE;
                    }
                }
            }

            int minCost[] = new int[n + 1];
            int visit[] = new int[n + 1];

            for (int i = 1; i < n + 1; i++) {
                minCost[i] = cost[1][i];
            }

            dijkstra(cost, minCost, visit, n);
            System.out.println(minCost[2] == Integer.MAX_VALUE ? -1
                    : minCost[2]);
        }
    }

    private static void dijkstra(int[][] cost, int[] minCost, int[] visit, int n) {
        minCost[1] = 0;
        visit[1] = 1;
        int minj = 1;
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
 Problem: 1162
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:260 ms
 Memory:25452 kb
 ****************************************************************/




