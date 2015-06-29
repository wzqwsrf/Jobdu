
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
	 * 1169
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int array[] = new int[n];
			int evenNum = 0;
			int oddNum = 0;
			for (int i = 0; i < n; i++) {
				array[i] = scanner.nextInt();
				if (array[i]%2==0) {
					evenNum++;
				}else {
					oddNum++;
				}
			}
			if (evenNum>oddNum) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}
	
}

/**************************************************************
	Problem: 1169
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:200 ms
	Memory:22888 kb
****************************************************************/


                        