
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	/*
	 * 1053
	 */
	public static void main(String[] args) throws IOException {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int a = (int) st.nval;
			st.nextToken();
			int b = (int) st.nval;
			int c = gcd(a, b);
			int num = 0;
			int i = 1;
			for(; i * i < c; i++){  
				 if(c % i == 0){  
					 num += 2;
				 }
			}
			if(c == i * i){  
				 num += 1;
			 }
	        System.out.println(num);
		}
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);  
	}
}
/**************************************************************
	Problem: 1493
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:290 ms
	Memory:15992 kb
****************************************************************/


                        