
// 题目1008：最短路径问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:51
 * @url:http://ac.jobdu.com/problem.php?pid=1008
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1008
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            if (n == 0 && m == 0) {
                break;
            }

            int path[][] = new int[n + 1][n + 1];
            int cost[][] = new int[n + 1][n + 1];

            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    path[i][j] = Integer.MAX_VALUE;
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
                st.nextToken();
                int p = (int) st.nval;

                if (path[a][b] > d || path[a][b] == 0) {
                    path[a][b] = d;
                    path[b][a] = d;
                }
                if (cost[a][b] > p || cost[a][b] == 0) {
                    cost[a][b] = p;
                    cost[b][a] = p;
                }
            }

            st.nextToken();
            int s = (int) st.nval;
            st.nextToken();
            int t = (int) st.nval;

            int minLen[] = new int[n + 1];
            int minCost[] = new int[n + 1];
            int visit[] = new int[n + 1];

            for (int i = 1; i < n + 1; i++) {
                minLen[i] = path[s][i];
                minCost[i] = cost[s][i];
            }

            minLen[s] = 0;
            minCost[s] = 0;
            visit[s] = 1;
            int minj = s;
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
                    if (visit[j] == 0
                            && minLen[j] > (minLen[minj] + path[minj][j])
                            && minLen[minj] != Integer.MAX_VALUE
                            && path[minj][j] != Integer.MAX_VALUE) {
                        minLen[j] = minLen[minj] + path[minj][j];
                        minCost[j] = minCost[minj] + cost[minj][j];
                    } else if (visit[j] == 0
                            && minLen[j] == (minLen[minj] + path[minj][j])
                            && minLen[minj] != Integer.MAX_VALUE
                            && path[minj][j] != Integer.MAX_VALUE) {
                        if (minCost[j] > (minCost[minj] + cost[minj][j])) {
                            minCost[j] = minCost[minj] + cost[minj][j];
                        }
                    }
                }
            }

            System.out.println(minLen[t] + " " + minCost[t]);
        }
    }
}

/**************************************************************
 Problem: 1008
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:240 ms
 Memory:31672 kb
 ****************************************************************/




