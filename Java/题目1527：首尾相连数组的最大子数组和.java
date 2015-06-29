
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
 
public class Main {
    /*
     * 1527
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                		new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n];
            int sum = 0;
            st.nextToken();
            array[0] = (int) st.nval;
            sum += array[0];
            int maxValue = array[0] > 0 ? array[0] : 0;
            int minValue = array[0] < 0 ? array[0] : 0;
            int max = maxValue;
            int min = minValue;
            for (int i = 1; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                if (maxValue > 0) {
					maxValue += array[i];
				}else {
					maxValue = array[i];
				}
                if (minValue < 0) {
					minValue += array[i];
				}else {
					minValue = array[i];
				}
                max = maxValue > max ? maxValue : max;
                min = minValue < min ? minValue : min;
                sum += array[i];
            }
            int temp = sum - min;
            System.out.println(max > temp ? max : temp);
        }
    }
}

/**************************************************************
	Problem: 1527
	User: wangzhenqing
	Language: Java
	Result: Accepted
	Time:860 ms
	Memory:28876 kb
****************************************************************/


                        