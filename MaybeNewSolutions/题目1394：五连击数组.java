
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	/*
     * 1394
     */
    public static void main(String[] args) throws Exception {
    	StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n < 0) {
				break;
			}
            List<Integer> arrList = new ArrayList<Integer>();
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
				st.nextToken();
				array[i] = (int) st.nval;
				arrList.add(array[i]);
			}
            
            Arrays.sort(array);
            int min = 0;
            for (int i = 0; i < n; i++) {
            	int count = 0;
            	int k = 1;
            	for (int j = i + 1; k < 5; j++ ,k++) {
					if (arrList.contains(array[i]+k)) {
						continue;
					}else {
						count++;
					}
				}
				if (i == 0) {
					min = count;
				}else {
					min = min > count ? count : min;
				}
			}
            System.out.println(min);
        }
    }
}
	
/**************************************************************
	Problem: 1394
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:90 ms
	Memory:16180 kb
****************************************************************/


                        