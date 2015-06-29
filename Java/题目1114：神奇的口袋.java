
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1114
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int []dp = new int[41];
            dp[0] = 1;
            for (int i = 0; i < n; i++) {
            	st.nextToken();
            	int num = (int) st.nval;
            	for (int j = 40; j >= num; j--) {
					dp[j] += dp[j - num];
				}
            }
            System.out.println(dp[40]);
        }
    }
}
/**************************************************************
	Problem: 1114
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:60 ms
	Memory:14564 kb
****************************************************************/


                        