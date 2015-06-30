
// 题目1539：师弟

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1539
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17581157
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    /*
     * 1539
     */
    private static int n, k;

    private static int path[][], visit[];

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            st.nextToken();
            k = (int) st.nval;
            //			初始化路径，都为最大值。
            path = new int[n + 1][n + 1];
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

            int minLen1[] = new int[n + 1];
            int minLen2[] = new int[n + 1];
            //			visit初始为0，防止回溯
            visit = new int[n + 1];
            //			初始化1到其他点的距离。
            for (int i = 1; i < n + 1; i++) {
                minLen1[i] = path[1][i];
                minLen2[i] = path[n][i];
            }
            dijkstra(path, minLen1, visit, 1);
            Arrays.fill(visit, 0);
            dijkstra(path, minLen2, visit, n);
            Arrays.fill(visit, 0);
            int allNum = bfs(minLen1, minLen2, minLen1[n]);
            System.out.println(allNum);
        }
    }

private static int bfs(int[] minLen1, int[] minLen2, int len) {
		int allNum = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        visit[1] = 1;
        int num = 0;
        while (!queue.isEmpty()) {
        	if (num > k) {
        		return allNum; 
			}
        	num++;
        	int size = queue.size();
        	while (size > 0) {
        		int s = queue.poll();
                if (minLen1[s] + minLen2[s] == len) {
                	allNum++;
    			}
                for (int i = 1; i < n+1; i++) {
                	if (visit[i] == 0 && path[s][i] != Integer.MAX_VALUE) {
    					queue.add(i);
    					visit[i] = 1;
    				}
    			}
				size--;
			}
        }
        return allNum;   
	}    private static void dijkstra(int[][] path, int[] minLen, int[] visit, int s) {
        minLen[s] = 0;
        visit[s] = 1;
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
 Problem: 1539
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:1980 ms
 Memory:44684 kb
 ****************************************************************/




