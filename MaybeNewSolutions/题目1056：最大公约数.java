
import java.util.Scanner;

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
	 * 1056
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			for (long i = Math.min(a, b); i > 0; i--) {
				if (a%i==0&&b%i==0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
/**************************************************************
	Problem: 1056
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:80 ms
	Memory:15460 kb
****************************************************************/


                        