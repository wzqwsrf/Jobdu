
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
 
public class Main{
     /*
     * 1384
     */
    public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int m = (int) st.nval;
            st.nextToken();
            int n = (int) st.nval;
            st.nextToken();
            int t = (int) st.nval;
            int array[] = new int[m*n];
            int k = 0;
            boolean flag = false;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    st.nextToken();
                    array[k] = (int) st.nval;
                    if (array[k] == t) {
						flag = true;
					}
                    k++;
                }
            }
            System.out.println(flag == true ? "Yes" : "No");
        }
    }
}
/**************************************************************
	Problem: 1384
	User: wangzhenqing
	Language: Java
	Result: Accepted
	Time:1840 ms
	Memory:31240 kb
****************************************************************/


                        