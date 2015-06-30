
// 题目1109：连通图

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1109
 */

import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
     * 1109
     */
public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
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
            if (numSet.size() - 1 == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
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
 Problem: 1109
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:190 ms
 Memory:19772 kb
 ****************************************************************/




