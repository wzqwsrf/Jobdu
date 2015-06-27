
import java.io.StreamTokenizer;
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
	 * 
	 */
	public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(System.in);
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			long num = getErrorWay(n);
			System.out.println(num);
		}
	}

	private static long getErrorWay(int n) {
		if (n == 1) {
			return 0;
		}else if (n == 2) {
			return 1;
		}else {
			return (n-1)*(getErrorWay(n-1)+getErrorWay(n-2));
		}
	}
}
/**************************************************************
	Problem: 1451
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:80 ms
	Memory:15972 kb
****************************************************************/


                        