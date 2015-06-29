
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
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int n = scanner.nextInt();
			int[] array = new int[n+1];
			for (int i = n; i > 0 ; i--) {
				array[i] += i*a;
				if (array[i]>=10) {
					array[i-1] += array[i]/10;
					array[i] = array[i]%10;
				}
			}
			if (array[0] == 0) {
				for (int i = 1; i < array.length; i++) {
					System.out.print(array[i]);
				}
			}else {
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i]);
				}
			}
			System.out.println();
			
		}
	}
}
/**************************************************************
	Problem: 1051
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:90 ms
	Memory:15464 kb
****************************************************************/


                        