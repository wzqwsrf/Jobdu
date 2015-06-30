
// 题目1445：How Many Tables

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1445
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17165045
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
     * 1445
     */
    private static int parent[];

public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int num = (int) st.nval;
			while (num > 0) {
				st.nextToken();
				int n = (int) st.nval;
				st.nextToken();
				int m = (int) st.nval;
				parent = new int[n + 1];
				for (int i = 1; i <= n; i++) {
					parent[i] = i;
				}
				for (int i = 0; i < m; i++) {
					st.nextToken();
					int f = (int) st.nval;
					st.nextToken();
					int t = (int) st.nval;
					union(f, t);
				}
				for (int i = 1; i < n + 1; i++) {
					parent[i] = findParent(i);
				}
				Set<Integer> numSet = new HashSet<Integer>();
				for (int i = 1; i < n + 1; i++) {
					numSet.add(parent[i]);
				}
				System.out.println(numSet.size());
				num--;
			}
			
		}
    }    private static void union(int f, int t) {
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
 Problem: 1445
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:210 ms
 Memory:25952 kb
 ****************************************************************/




