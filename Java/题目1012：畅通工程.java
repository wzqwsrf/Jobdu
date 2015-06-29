
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;
 
public class Main {
	/*
     * 1012
     */
	private static int parent[];
    public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			if (n == 0) {
				break;
			}
			parent = new int[n + 1];
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
				union(f, t);
			}

			for (int i = 1; i < n + 1; i++) {
				parent[i] = findParent(i);
			}
			Set<Integer> numSet = new HashSet<Integer>();
			for (int i = 1; i < n + 1; i++) {
				numSet.add(parent[i]);
			}
			System.out.println(numSet.size() - 1);
		}
	}
    private static void union(int f, int t) {
        int a = findParent(f);
        int b = findParent(t);
        if (a == b) return; 
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
	Problem: 1012
	User: wangzhenqing
	Language: Java
	Result: Accepted
	Time:180 ms
	Memory:23560 kb
****************************************************************/


                        