
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
	/*
	 * 1063
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int N = scanner.nextInt();
			long result = 0;
			if (N>=0) {
				for (int i = N; i < 2*N+1; i++) {
					result += i;
				}
			}else {
				for (int i = 2*N; i < N+1; i++) {
					result += i;
				}
			}
			System.out.println(result);
		}
	}
}
/**************************************************************
	Problem: 1063
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:340 ms
	Memory:26320 kb
****************************************************************/


                        