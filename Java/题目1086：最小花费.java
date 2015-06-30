
// 题目1086：最小花费

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1086
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {

    /*
     * 1411
     */
    private static int l1, l2, l3;

    private static int c1, c2, c3;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {

            l1 = (int) st.nval;
            st.nextToken();
            l2 = (int) st.nval;
            st.nextToken();
            l3 = (int) st.nval;
            st.nextToken();
            c1 = (int) st.nval;
            st.nextToken();
            c2 = (int) st.nval;
            st.nextToken();
            c3 = (int) st.nval;

            st.nextToken();
            int a = (int) st.nval;
            st.nextToken();
            int b = (int) st.nval;

            st.nextToken();
            int n = (int) st.nval;

            long cost[][] = new long[n + 1][n + 1];
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    cost[i][j] = Long.MAX_VALUE;
                }
            }
            long allLen[] = new long[n + 1];
            for (int i = 2; i <= n; i++) {
                st.nextToken();
                allLen[i] = (long) st.nval;
            }

            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    long len = allLen[j] - allLen[i];
                    if (len <= l3) {
                        long needCost = getCost(len);
                        cost[i][j] = needCost;
                        cost[j][i] = needCost;
                    }
                }
            }

            long minCost[] = new long[n + 1];
            int visit[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                minCost[i] = cost[a][i];
            }
            dijkstra(cost, minCost, visit, n, a);
            System.out.println(minCost[b]);
        }
    }

    private static void dijkstra(long[][] cost, long[] minCost, int[] visit,
            int n, int s) {
        minCost[s] = 0;
        visit[s] = 1;
        for (int i = 1; i < n + 1; i++) {
            long min = Long.MAX_VALUE;
            int minj = s;
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
                        && minCost[minj] != Long.MAX_VALUE
                        && cost[minj][j] != Long.MAX_VALUE) {
                    minCost[j] = minCost[minj] + cost[minj][j];
                }
            }
        }
    }

    private static long getCost(long len) {
        if (len <= l1) {
            return c1;
        } else if (len <= l2) {
            return c2;
        } else {
            return c3;
        }
    }
}
/**************************************************************
 Problem: 1086
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:18912 kb
 ****************************************************************/




