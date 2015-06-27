
import java.io.StreamTokenizer;
import java.util.Arrays;
/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
	/*
     * 1371
     */
    public static void main(String[] args) throws Exception{
    	StreamTokenizer st = new StreamTokenizer(System.in);
    	 while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int k = (int) st.nval;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
            	st.nextToken();
                array[i] = (int) st.nval;
            }
            Arrays.sort(array);
            if(k<0){
                k = 0;
            }else if (k>n) {
                k = n;
            }
            StringBuffer sb = new StringBuffer();
            if (k == 1) {
            	sb.append(array[0]);
            } else {
                for (int i = 0; i < k-1; i++) {
                	sb.append(array[i]);
                	sb.append(" ");
                }
                sb.append(array[k-1]);
            }
            System.out.println(sb.toString());
             
        }
    }
	
}

/**************************************************************
	Problem: 1371
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1690 ms
	Memory:58432 kb
****************************************************************/


                        