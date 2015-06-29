
import java.util.Scanner;

public class Main {
	/*
	 * 1376
	 */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int array[] = new int[n];
			int result = -1;
			for (int i = 0; i < n; i++) {
				array[i] = scanner.nextInt();
				if (array[i] == 0) {
					result = 0;
				}
			}
			if (result == 0) {
				System.out.println(result);
				continue;
			}
			result = array[0];
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = i; j < n; j++) {
					sum += array[j];
					int tempSum1 = Math.abs(sum);
					int tempSum2 = Math.abs(result);
					if (tempSum1 < tempSum2
							|| (tempSum1 == tempSum2 && sum > result)) {
						result = sum;
						if (result == 0) {
							break;
						}
					}
				}
				if (result == 0) {
					break;
				}
			}
			System.out.println(result);
		}
	}
}

/**************************************************************
	Problem: 1376
	User: wangzhenqing
	Language: Java
	Result: Accepted
	Time:1730 ms
	Memory:105284 kb
****************************************************************/


                        