
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
 
public class Main {
	/*
     * 1007
     */
    public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
				break;
			}
            int array[] = new int[n];
            int numArr[] = new int[102];
            for (int i = 0; i < n; i++) {
				st.nextToken();
				array[i] = (int)st.nval;
				numArr[array[i]]++;
			}
            st.nextToken();
            int score = (int)st.nval;
            System.out.println(numArr[score]);
        }
    }
}

/**************************************************************
	Problem: 1018
	User: wangzhenqing
	Language: Java
	Result: Accepted
	Time:150 ms
	Memory:22828 kb
****************************************************************/


                        