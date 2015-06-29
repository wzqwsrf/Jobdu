
import java.util.Scanner;

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			if (n == 0) {
				break;
			}
			int num = chanegN(n);
			System.out.println(num);
		}
	}

	/**
	 * @Description: TODO
	 *
	 * @date 2013-8-11,下午04:25:14
	 * @author wangzq
	 * @version 3.0.0
	 *
	 * @param n
	 * @param num 
	 */
	private static int chanegN(int n) {
		int num = 0;
		while (n>1) {
			if (n%2==0) {
				n = n/2;
				num++;
			}else {
				n = (3*n+1)/2;
				num++;
			}
		}
		return num;
	}
}

/**************************************************************
	Problem: 1031
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:120 ms
	Memory:18616 kb
****************************************************************/


                        