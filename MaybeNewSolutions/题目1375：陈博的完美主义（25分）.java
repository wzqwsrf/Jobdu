
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	/*
     * 1375
     */
	public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n];
            int numCount[] = new int[n+1];
            int num = 0;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                if (array[i] == Integer.MAX_VALUE || array[i] > n || array[i] < 1) {
                	num ++;
                	continue;
				}
                if (numCount[array[i]] != 1) {
                	numCount[array[i]] = 1;
				}else {
					num ++;
				}
            } 
            System.out.println(num);
        }
    }
}
/**************************************************************
	Problem: 1375
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:560 ms
	Memory:27636 kb
****************************************************************/


                        