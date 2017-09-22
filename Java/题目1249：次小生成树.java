
// 题目1249：次小生成树

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2017-09-22 13:38:18
 * @url:http://ac.jobdu.com/problem.php?pid=1249
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1249
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        st.nextToken();
        int t = (int) st.nval;
        while (t > 0) {
            st.nextToken();
            int n = (int) st.nval;
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
                int s = (int) st.nval;
                st.nextToken();
                int e = (int) st.nval;
                st.nextToken();
                int w = (int) st.nval;

                if (cost[s][e] > w) {
                    cost[s][e] = w;
                    cost[e][s] = w;
                }
            }

            int ans = prime(cost, n);
            System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
            t--;
        }
    }

    private static int prime(int[][] cost, int n) {
        int visit[] = new int[n + 1];
        int prev[] = new int[n + 1];
        int use[][] = new int[n + 1][n + 1];
        int maxv[][] = new int[n + 1][n + 1];
        int minCost[] = new int[n + 1];
        int s = 1;
        for (int i = 1; i <= n; i++) {
            minCost[i] = cost[s][i];
            prev[i] = 1;
        }
        visit[s] = 1;
        int minj = 1;
        int resCost = 0;
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= n; j++) {
                if (visit[j] == 0 && minCost[j] < min) {
                    min = minCost[j];
                    minj = j;
                }
            }
            visit[minj] = 1;
            resCost += min;
            use[prev[minj]][minj] = 1;
            use[minj][prev[minj]] = 1;
            for (int j = 1; j < n + 1; j++) {
                if (j == minj) {
                    continue;
                }
                if (visit[j] == 1) {
                    int max = Math.max(maxv[prev[minj]][j], minCost[minj]);
                    maxv[minj][j] = max;
                    maxv[j][minj] = max;
                }
                if (visit[j] == 0 && minCost[j] > cost[minj][j]) {
                    minCost[j] = cost[minj][j];
                    prev[j] = minj;
                }
            }
        }
        int num = 0;
        for (int i = 1; i < n + 1; i++) {
            if (visit[i] == 1) {
                num++;
            }
        }
        if (num != n) {
            return -1;

        }
//        System.out.println(resCost);
        int weight = Integer.MAX_VALUE;
        for (int i = 1; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                if (use[i][j] == 0 && cost[i][j] != Integer.MAX_VALUE) {
                    weight = Math.min(weight, resCost + cost[i][j] - maxv[i][j]);
                }
            }
        }
        return weight;
    }
}
/**************************************************************
 Problem: 1249
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:230 ms
 Memory:25788 kb
 ****************************************************************/
