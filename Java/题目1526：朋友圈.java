
// 题目1526：朋友圈

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1526
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17102025
 */

import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
     * 1526
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            if (n == 1) {
                System.out.println(1);
            } else {
                int[] parent = new int[n + 1];
                for (int i = 1; i <= n; i++) {
                    parent[i] = i;
                }
                st.nextToken();
                int m = (int) st.nval;
                for (int i = 0; i < m; i++) {
                    st.nextToken();
                    int f = (int) st.nval;
                    st.nextToken();
                    int t = (int) st.nval;
                    union(f, t, parent);
                }

                for (int i = 1; i < n + 1; i++) {
                    parent[i] = findParent(i, parent);
                }
                Set<Integer> numSet = new HashSet<Integer>();
                for (int i = 1; i < n + 1; i++) {
                    numSet.add(parent[i]);
                }
                System.out.println(numSet.size());
            }
        }
    }

    private static void union(int f, int t, int[] parent) {

        int a = findParent(f, parent);
        int b = findParent(t, parent);
        if (a == b)
            return;
        if (a > b) {
            parent[a] = b;
        } else {
            parent[b] = a;
        }
    }

    private static int findParent(int f, int[] parent) {
        if (parent[f] == f) {
            return f;
        }
        return findParent(parent[f], parent);
    }
}

/**************************************************************
 Problem: 1526
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:970 ms
 Memory:41748 kb
 ****************************************************************/




