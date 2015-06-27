
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
	 * 1057
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = 20;
			int array[] = new int[n];
			int newArray[] = new int[11];
			for (int i = 0; i < array.length; i++) {
				array[i] = scanner.nextInt();
				newArray[array[i]]++;
			}
			int max = 0;
			for (int i = 0; i < 11 ; i++) {
				if (newArray[i]>newArray[max]) {
					max = i;
				}
			}
			System.out.println(max);
		}
	}
}

/**************************************************************
	Problem: 1057
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:120 ms
	Memory:18848 kb
****************************************************************/


                        