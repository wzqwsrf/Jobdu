
// 题目1325：Battle Over Cities

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1325
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
     * 1325
     */
public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int)st.nval;
            st.nextToken();
            int m = (int)st.nval;
            st.nextToken();
            int k = (int)st.nval;
            int connectArr[][] = new int[m][2];
            for (int i = 0; i < m; i++) {
				int array[] = new int[2];
				st.nextToken();
				array[0] = (int)st.nval;
				st.nextToken();
				array[1] = (int)st.nval;
				connectArr[i] = array;
			}
            
            int[] parent = new int[n + 1];
            
            for (int i = 0; i < k; i++) {
            	for (int j = 1; j <= n; j++) {
                    parent[j] = j;
                }
				st.nextToken();
				int city = (int)st.nval;
				for (int j = 0; j < m; j++) {
					int array[] = connectArr[j];
					if (array[0] != city && array[1] != city) {
						union(array[0], array[1], parent);
					}
				}
				
				for (int j = 1; j < n + 1; j++) {
	                parent[j] = findParent(j, parent);
	            }
	            Set<Integer> numSet = new HashSet<Integer>();
	            for (int j = 1; j < n + 1; j++) {
	                numSet.add(parent[j]);
	            }
	            System.out.println(numSet.size() - 2);
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
        while (parent[f] != f) {
            f = parent[f];
        }
        return f;
    }
}
/**************************************************************
 Problem: 1325
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:800 ms
 Memory:59056 kb
 ****************************************************************/




