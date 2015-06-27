
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
			String ss = scanner.nextLine();
			String c = scanner.nextLine();
			
			System.out.println(ss.replace(c, ""));
		}
	}
}	
/**************************************************************
	Problem: 1049
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:90 ms
	Memory:15440 kb
****************************************************************/


                        