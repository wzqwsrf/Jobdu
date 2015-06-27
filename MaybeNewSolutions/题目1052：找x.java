
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
	 * 1052
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			String[] array = new String[n];
			for (int i = 0; i < n; i++) {
				array[i] = scanner.next();
			}
			String x = scanner.next();
			boolean flag = false;
			for (int i = 0; i < n; i++) {
				if (array[i].equals(x)) {
					flag = true;
					System.out.println(i);
					break;
				}
			}
			if (!flag) {
				System.out.println(-1);
			}
		}
	}
}

/**************************************************************
	Problem: 1052
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:100 ms
	Memory:17304 kb
****************************************************************/


                        