
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
	 * 1018
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int N = scanner.nextInt();
			if (N == 0) {
				break;
			}
			int array[] = new int[N];
			for (int i = 0; i < array.length; i++) {
				array[i] = scanner.nextInt();
			}
			int M = scanner.nextInt();
			int num = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == M) {
					num++;
				}
			}
			System.out.println(num);
		}
	}
}

/**************************************************************
	Problem: 1018
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:360 ms
	Memory:29160 kb
****************************************************************/


                        