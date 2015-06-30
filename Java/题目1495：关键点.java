
// 题目1495：关键点

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1495
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    /*
     * 1495
     */
    private static int n, m, s, t;
    private static List<Integer> arrList[];
    private static Queue<Integer> queue;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(
                new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) st.nval;
            st.nextToken();
            m = (int) st.nval;
            st.nextToken();
            s = (int) st.nval;
            st.nextToken();
            t = (int) st.nval;
            arrList = new ArrayList[n + 1];
            for (int i = 1; i < n + 1; i++) {
                arrList[i] = new ArrayList<Integer>();
            }

            for (int i = 0; i < m; i++) {
                st.nextToken();
                int a = (int) st.nval;
                st.nextToken();
                int b = (int) st.nval;
                arrList[a].add(b);
                arrList[b].add(a);
            }
            int ds[] = new int[n + 1];
            int dt[] = new int[n + 1];
            int cs[] = new int[n + 1];
            Arrays.fill(ds, 1, n + 1, -1);
            Arrays.fill(dt, 1, n + 1, -1);
            Arrays.fill(cs, 0, n, 0);
            queue = new LinkedList<Integer>();
            bfs(s, t, ds);
            bfs(t, s, dt);

            if (ds[t] != -1) {
                for (int i = 1; i <= n; i++) {
                    if (ds[i] + dt[i] == ds[t]) {
                        cs[ds[i]]++;
                    }
                }
            }
            int num = 0;
            for (int i = 1; i <= ds[t] - 1; i++) {
                if (cs[i] == 1) {
                    num++;
                }
            }
            System.out.println(num);
        }
    }

    private static void bfs(int start, int end, int array[]) {
        array[start] = 0;
        queue.add(start);
        while (!queue.isEmpty()) {
            int a = queue.poll();
            for (int i = 0; i < arrList[a].size(); i++) {
                int b = arrList[a].get(i);
                if (array[b] == -1) {
                    array[b] = array[a] + 1;
                    queue.add(b);
                }
            }
        }
    }
}

/**************************************************************
 * Problem: 1495
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1280 ms
 * Memory:58444 kb
 ****************************************************************/


                        


