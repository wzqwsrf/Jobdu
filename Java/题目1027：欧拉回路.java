
// 题目1027：欧拉回路

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1027
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
     * 1027
     */
public static void main(String[] args) throws Exception {
    	StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int n = (int) st.nval;
        	if (n == 0) {
				break;
			}
        	st.nextToken();
        	int m = (int) st.nval;
        	int node[] = new int[n+1];
        	int []parent = new int[n+1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        	while (m > 0) {
        		st.nextToken();
            	int a = (int) st.nval;
            	st.nextToken();
            	int b = (int) st.nval;
            	node[a] ++;
            	node[b] ++;
            	union(a ,b , parent );
        		m--;
			}
        	for (int i = 1; i < n+1; i++) {
                parent[i] = findParent(i, parent);
            }
            Set<Integer> numSet = new HashSet<Integer>();
            for (int i = 1; i < n+1; i++) {
                numSet.add(parent[i]);
            }
            if (numSet.size() != 1) {
				System.out.println(0);
			}else {
				boolean flag = true;
				for (int i = 1; i < n + 1; i++) {
					if (node[i] != 0 && node[i] % 2 != 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
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
 Problem: 1027
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:260 ms
 Memory:24644 kb
 ****************************************************************/




