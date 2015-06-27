
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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int array[] = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scanner.nextInt();
			}
			if (n==0) {
				break;
			}
			Arrays.sort(array);
			if (n%2==0) {
				System.out.println((array[n/2-1]+array[n/2])/2);
			}else {
				System.out.println(array[(n-1)/2]);
			}
		}
	}
	
}
/**************************************************************
	Problem: 1157
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:520 ms
	Memory:54936 kb
****************************************************************/


                        