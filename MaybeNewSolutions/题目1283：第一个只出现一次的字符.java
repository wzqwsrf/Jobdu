
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
		while(scanner.hasNext()){
			String aa = scanner.nextLine();
			boolean flag = false;
			for (int i = 1; i < aa.length(); i++) {
				String c = aa.substring(i-1,i);
				String bb = aa.substring(aa.indexOf(c)+1, aa.length());
				if (!bb.contains(c)) {
					System.out.println(i-1);
					flag = true;
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
	Problem: 1283
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:530 ms
	Memory:92384 kb
****************************************************************/


                        