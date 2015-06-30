
// 题目1414：旅游啦

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1414
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17576961
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1414
     */
    private static int n = 50;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int m = (int) st.nval;
            int cost[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    cost[i][j] = Integer.MAX_VALUE;
                }
            }
            int sum = 0;
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
                    sum += d;
                }
            }
            int minCost[] = new int[n];
            int visit[] = new int[n];

            for (int i = 0; i < n; i++) {
                minCost[i] = cost[0][i];
            }
            int maxLen = dijkstra(cost, minCost, visit);
            System.out.printf("%d\n", 2 * sum - maxLen);
        }
    }

    private static int dijkstra(int[][] cost, int[] minCost, int[] visit) {
        minCost[0] = 0;
        visit[0] = 1;
        int minj = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (visit[j] == 0 && minCost[j] < min) {
                    min = minCost[j];
                    minj = j;
                }
            }
            visit[minj] = 1;
            for (int j = 0; j < n; j++) {
                if (visit[j] == 0
                        && minCost[j] > (minCost[minj] + cost[minj][j])
                        && minCost[minj] != Integer.MAX_VALUE
                        && cost[minj][j] != Integer.MAX_VALUE) {
                    minCost[j] = minCost[minj] + cost[minj][j];
                }
            }
        }
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            if (maxLen < minCost[i] && minCost[i] != Integer.MAX_VALUE) {
                maxLen = minCost[i];
            }
        }
        return maxLen;
    }
}
/**************************************************************
 Problem: 1414
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:400 ms
 Memory:24856 kb
 ****************************************************************/




