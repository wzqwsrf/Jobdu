
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
			int p = (int) st.nval;
			int num = 0;
			int array[] = {100,50,20,10,5,2,1};
			for (int i = 0; i < 7; i++) {
				if (p >= array[i]) {
					num += p / array[i];
					p = p % array[i];
				}
			}
			System.out.println(num);
		}
	}
}

/**************************************************************
	Problem: 1549
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:430 ms
	Memory:14872 kb
****************************************************************/


                        