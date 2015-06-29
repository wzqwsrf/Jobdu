
import java.io.StreamTokenizer;

public class Main {
	/*
     * 1123
     */
	public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int t = (int) st.nval;
        	st.nextToken();
        	int m = (int) st.nval;
        	int dp[] = new int[t+1];
        	int needTime[] = new int[101];
        	int value[] = new int[101];
        	for (int i = 1; i <= m; i++) {
        		st.nextToken();
				needTime[i] = (int) st.nval;
				st.nextToken();
				value[i] = (int) st.nval;
			}
			for (int i = 1; i <= m; i++) {
				for (int j = t; j >= needTime[i]; j--) {
					dp[j] = Math.max(dp[j - needTime[i]] + value[i] , dp[j]);
				}
			}
        	System.out.println(dp[t]);
        }
    }
}
/**************************************************************
	Problem: 1123
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:290 ms
	Memory:21572 kb
****************************************************************/


                        