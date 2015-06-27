
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main {
	/*
     * 1445
     */
    public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int num = (int) st.nval;
        	while (num > 0) {
        		st.nextToken() ;
        		int n = (int) st.nval;
                st.nextToken() ;
                int m = (int) st.nval;
                int []parent = new int[n+1];
                for (int i = 1; i <= n; i++) {
                    parent[i] = i;
                }
                if (m == 1) {
                    System.out.println(1);
                }else {
                    for (int i = 0; i < m; i++) {
                        st.nextToken() ;
                        int f = (int) st.nval;
                        st.nextToken() ;
                        int t = (int) st.nval;
                        union(f ,t , parent );
                    }
                     
                    for (int i = 1; i < n+1; i++) {
                        parent[i] = findParent(i, parent);
                    }
                    Set<Integer> numSet = new HashSet<Integer>();
                    for (int i = 1; i < n+1; i++) {
                        numSet.add(parent[i]);
                    }
                    System.out.println( numSet.size());
                }
        		num -- ;
			}
            
        }
    }
  
    private static void union(int f, int t, int[] parent ) {
          
        int a = findParent(f , parent);
        int b = findParent(t , parent);
        if (a == b) return; 
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
        return findParent(parent[f],parent );
    }
}
/**************************************************************
	Problem: 1445
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:140 ms
	Memory:19228 kb
****************************************************************/


                        