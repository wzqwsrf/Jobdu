
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
	
	/*
     * 1435 
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int c = (int) st.nval;
            for (int j = 0; j < c; j++) {
                st.nextToken();
                int n = (int) st.nval;
                st.nextToken();
                int v = (int) st.nval;
                st.nextToken();
                int w = (int) st.nval;
                int array[] = new int[n];
                for (int i = 0; i < n; i++) {
                    st.nextToken();
                    array[i] = (int) st.nval;
                }
                Arrays.sort(array);
                
                int p = 0;
                int allV = 0;
                for (int i = 0; i < n; i++) {
                	
					if ((p + array[i]) > (allV + 1) * w) {
						break;
					}
					p += array[i];
					allV ++;
				}
                
                if (allV == 0) {
					System.out.println("0 0.00");
				}else {
					System.out.printf("%d %.2f\n",allV*v, p*1.0/(100*allV));
				}
            }
        }
    }
}
/**************************************************************
	Problem: 1435
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:80 ms
	Memory:15184 kb
****************************************************************/


                        