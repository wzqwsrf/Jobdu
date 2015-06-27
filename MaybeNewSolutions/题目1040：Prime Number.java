
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
	 * 1040
	 */
	public static void main(String[] args) {
		int array[] = getPrimeArray();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int K = scanner.nextInt();
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i]!=0) {
					count++;
				}
				if (count == K) {
					System.out.println(i);
					break;
				}
			}
		}
	}

	private static int[] getPrimeArray() {
		int length = 200000;
		int array[] = new int[length];
		for (int i = 0; i < length; i++) {
			if (i%2!=0) {
				array[i] = 1;
			}else {
				array[i] = 0;
			}
		}
		array[0] = 0;
		array[1] = 0;
		array[2] = 1;
		for (int i = 2; i*i < length; i++) {
			if (array[i]!=0) {
				for (int j = 2*i; j < length; j+=i) {
					array[j] = 0;
				}
			}
		}
		return array;
	}
}

/**************************************************************
	Problem: 1040
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:120 ms
	Memory:18200 kb
****************************************************************/


                        