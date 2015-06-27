
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
	 * 1077
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int N = scanner.nextInt();
			if (N == 0) {
				break;
			}
			long array[] = new long[N];
			array[0] = scanner.nextLong();
			long sum = array[0];
			long currentSum = array[0];
			for (int i = 1; i < N; i++) {
				array[i] = scanner.nextLong();
				if (currentSum < 0) {
					currentSum = array[i];
				}else {
					currentSum += array[i];
				}
				if (currentSum > sum) {
					sum = currentSum;
				} 
			}
			System.out.println(sum);
		}
	}
}
	
/**************************************************************
	Problem: 1077
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1440 ms
	Memory:164352 kb
****************************************************************/


                        