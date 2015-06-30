
// 题目1028：继续畅通工程

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1028
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17166819
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1028
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            int cost[][] = new int[n + 1][n + 1];

            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    cost[i][j] = Integer.MAX_VALUE;
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
                st.nextToken();
                int state = (int) st.nval;
                if (state == 1) {
                    cost[a][b] = 0;
                    cost[b][a] = 0;
                } else {
                    if (cost[a][b] > d) {
                        cost[a][b] = d;
                        cost[b][a] = d;
                    }
                }
            }

            int minCost[] = new int[n + 1];
            int visit[] = new int[n + 1];

            for (int i = 1; i < n + 1; i++) {
                minCost[i] = cost[1][i];
            }

            prime(cost, minCost, visit, n);

        }
    }

    private static void prime(int[][] cost, int[] minCost, int[] visit, int n) {

        minCost[1] = 0;
        visit[1] = 1;
        int minj = 1;

        int resLen = 0;

        for (int i = 1; i < n; i++) {

            int min = Integer.MAX_VALUE;

            for (int j = 1; j < n + 1; j++) {
                if (visit[j] == 0 && minCost[j] < min) {
                    min = minCost[j];
                    minj = j;
                }
            }

            visit[minj] = 1;

            resLen += min;

            for (int j = 1; j < n + 1; j++) {
                if (visit[j] == 0 && minCost[j] > cost[minj][j]) {
                    minCost[j] = cost[minj][j];
                }
            }
        }
        System.out.println(resLen);
    }
}
/**************************************************************
 Problem: 1028
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:210 ms
 Memory:23232 kb
 ****************************************************************/




