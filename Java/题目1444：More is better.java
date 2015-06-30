
// 题目1444：More is better

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1444
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17174509
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1444
     */
    private static int[] parent = new int[10000001];

    private static int[] num = new int[10000001];

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 1) {
                System.out.println(2);
            } else {
                for (int i = 1; i < 10000000; i++) {
                    parent[i] = i;
                    num[i] = 1;
                }

                for (int i = 0; i < n; i++) {
                    st.nextToken();
                    int f = (int) st.nval;
                    st.nextToken();
                    int t = (int) st.nval;
                    union(f, t);
                }
                int max = 1;
                for (int i = 1; i < 10000000; i++) {
                    max = Math.max(++num[findParent(i)], max);
                }

                System.out.println(max - 1);
            }
        }
    }

    private static void union(int f, int t) {

        int a = findParent(f);
        int b = findParent(t);
        if (a == b)
            return;
        if (a > b) {
            parent[a] = b;
        } else {
            parent[b] = a;
        }
    }

    private static int findParent(int f) {

        while (parent[f] != f) {
            f = parent[f];
        }
        return f;
    }
}
/**************************************************************
 Problem: 1444
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:2140 ms
 Memory:105024 kb
 ****************************************************************/




