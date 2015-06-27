
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	/*
     * 1356
     */
    public static void main(String[] args) throws Exception{
    	StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int n = (int) st.nval;
        	if (n == 0) {
				break;
			}
        	st.nextToken();
        	int m = (int) st.nval;
        	int finalChild = 0;
        	for (int i = 2; i <= n; i++) {
				finalChild = (finalChild + m) % i;
			}
        	System.out.println(finalChild+1);
        }
    }
}
/**************************************************************
	Problem: 1356
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:690 ms
	Memory:16100 kb
****************************************************************/


                        