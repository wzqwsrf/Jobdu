
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1112
     */
	public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			int array[] = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				array[i] = (int) st.nval;
			}
			int maxLen = 0;
			int dp[] = new int[n];
			for (int i = 0; i < n; i++) {
				int tempLen = 0;
				for (int j = 0; j < i; j++) {
					if (array[j] >= array[i] && dp[j] >= tempLen) {
						tempLen = dp[j];
					}
				}
				dp[i] = tempLen + 1;
				if (dp[i] >= maxLen) {
					maxLen = dp[i];
				}
			}
			System.out.println(maxLen);
		}
    }
}
/**************************************************************
	Problem: 1112
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:70 ms
	Memory:14552 kb
****************************************************************/


                        