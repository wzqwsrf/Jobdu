
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
			int num = scanner.nextInt();
			if (num <=1) {
				System.out.println("no");
			}else {
				boolean result = false;
				for (int i = 2; i < num; i++) {
					if (num%i == 0) {
						result = true;
						break;
					}
				}
				if (result) {
					System.out.println("no");
				}else {
					System.out.println("yes");
				}
			}
			
		}
	}
}	

/**************************************************************
	Problem: 1047
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:80 ms
	Memory:15456 kb
****************************************************************/


                        