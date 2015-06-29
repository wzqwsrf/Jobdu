
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
public class Main{
	/*
	 * 1034
	 */
	public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(System.in);
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			if (n == 0 && m == 0) {
				break;
			}
			int array[] = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				array[i] = (int) st.nval;
			}
			Arrays.sort(array);
			if (m>n) {
				m = n;
			}
			StringBuffer sb = new StringBuffer();
			int k = 1;
			int i = n-1;
			while (k <= m && i >= 0) {
				sb.append(array[i]+" ");
				k++;
				i--;
			}
			System.out.println(sb.toString().trim());
		}
	}
}
/**************************************************************
	Problem: 1034
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:180 ms
	Memory:20728 kb
****************************************************************/


                        