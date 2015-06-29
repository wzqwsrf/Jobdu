
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	/*
     * 1402
     */
    public static void main(String[] args) throws Exception{
    	StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int numArray[] = new int[1000001];
			int n = (int) st.nval;
			int array[] = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				array[i] = (int) st.nval;
				numArray[array[i]]++;
				if (array[i] > max) {
					max = array[i];
				}
			}
			int count = 0;
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < max + 1; i++) {
				if (numArray[i] == 1) {
					count++;
					sb.append(i+" ");
				}
			}
			if (count == 0) {
				System.out.println(0);
			}else {
				String result = sb.toString().trim();
				System.out.println(count);
				System.out.println(result);
			}
        }
    }
}

/**************************************************************
	Problem: 1402
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:2930 ms
	Memory:155668 kb
****************************************************************/


                        