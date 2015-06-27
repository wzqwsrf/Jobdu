
import java.util.Arrays;
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
	 * 1202
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int array[] = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scanner.nextInt();
			}
			Arrays.sort(array);
			String result = "";
			for (int i = 0; i < array.length; i++) {
				result += array[i]+" ";
			}
			System.out.println(result);
		}
	}
}

/**************************************************************
	Problem: 1202
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:720 ms
	Memory:95060 kb
****************************************************************/


                        