
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
	/*
     * 1386
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
            Arrays.sort(array);
            System.out.println(array[0]);
        }
    }
}
/**************************************************************
	Problem: 1386
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:2200 ms
	Memory:30364 kb
****************************************************************/


                        