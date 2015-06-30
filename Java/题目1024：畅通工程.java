
// 题目1024：畅通工程

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1024
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17166249
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1024
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

            int cost[][] = new int[m + 1][m + 1];

            for (int i = 1; i < m + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    cost[i][j] = Integer.MAX_VALUE;
                }
            }

            for (int i = 0; i < n; i++) {
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

            int minCost[] = new int[m + 1];
            int visit[] = new int[m + 1];

            for (int i = 1; i < m + 1; i++) {
                minCost[i] = cost[1][i];
            }

            prime(cost, minCost, visit, m);

        }
    }

    private static void prime(int[][] cost, int[] minCost, int[] visit, int m) {

        minCost[1] = 0;
        visit[1] = 1;
        int minj = 1;

        int resCost = 0;

        for (int i = 1; i < m; i++) {

            int min = Integer.MAX_VALUE;

            for (int j = 1; j < m + 1; j++) {
                if (visit[j] == 0 && minCost[j] < min) {
                    min = minCost[j];
                    minj = j;
                }
            }

            visit[minj] = 1;

            resCost += min;

            for (int j = 1; j < m + 1; j++) {
                if (visit[j] == 0 && minCost[j] > cost[minj][j]) {
                    minCost[j] = cost[minj][j];
                }
            }
        }

        int num = 0;
        for (int i = 1; i < m + 1; i++) {
            if (visit[i] == 1) {
                num++;
            }
        }
        System.out.println(num == m ? resCost : "?");
    }
}

/**************************************************************
 Problem: 1024
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:160 ms
 Memory:23512 kb
 ****************************************************************/




