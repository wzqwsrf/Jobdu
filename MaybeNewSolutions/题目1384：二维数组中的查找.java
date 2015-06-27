
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main{
	 /*
     * 1384
     */
    public static void main(String[] args) throws Exception{
    	StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int m = (int) st.nval;
        	st.nextToken();
        	int n = (int) st.nval;
        	st.nextToken();
        	int t = (int) st.nval;
        	int array[] = new int[m*n];
        	int k = 0;
        	for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					st.nextToken();
					array[k] = (int) st.nval;
					k++;
				}
			}
        	String result = findT(array , t , 0  ,m * n-1);
        	System.out.println(result);
        }
    }

	private static String findT(int[] array, int t, int low, int high) {
	    while (low <= high) {
	    	int mid = (low + high) >> 1;
			if (array[mid] > t) {
				high = mid - 1;
			}else if(array[mid] < t){
				low = mid + 1;
			}else {
				return "Yes";
			}
		}
		return "No";
	}
}
/**************************************************************
	Problem: 1384
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1730 ms
	Memory:31604 kb
****************************************************************/


                        