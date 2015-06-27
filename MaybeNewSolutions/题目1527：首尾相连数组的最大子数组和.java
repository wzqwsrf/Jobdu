
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
 
public class Main {
    /*
     * 1527
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int len = 2*n;
            int array[] = new int[len];
              
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                array[i+n] = array[i];
            }
            int sum = 0;
            for (int i = 0; i < (i + n) && (i + n) <= len; i++) {
                int tempSum = array[i];
                if (tempSum > sum) {
                    sum = tempSum;
                }
                for (int j = i+1; j < (i + n ); j++) {
                    if (tempSum < 0) {
                        break;
                    }else {
                        tempSum += array[j];
                    }
                    if (tempSum > sum) {
                        sum = tempSum;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
/**************************************************************
	Problem: 1527
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1110 ms
	Memory:26624 kb
****************************************************************/


                        